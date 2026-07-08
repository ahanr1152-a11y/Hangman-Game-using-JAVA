import java.util.Scanner;
public class HangmanGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String secretWord="JAVA";
        char[] guessedWord = {'_','_','_','_'};
        int attempts = 6;
        boolean wordGuessed = false;
        System.out.println("=======================");
        System.out.println("HANGMAN GAME");
        System.out.println("========================");
        while(attempts>0 && !wordGuessed){
            System.out.print("\nWord: ");
            for(char c: guessedWord){
                System.out.print(c+ " ");
            }
            System.out.println("\nAttempts Left: "+ attempts);
            System.out.print("Enter a letter: ");
            char guess=Character.toUpperCase(sc.next().charAt(0));
            boolean found = false;
            for(int i=0;i<secretWord.length();i++){
                if(secretWord.charAt(i)== guess){
                    guessedWord[i]=guess;
                    found=true;
                }
            }
            if(found){
                System.out.println("Correct Guess!");
            } else{
                System.out.println("Wrong Guess!");
                attempts--;
            }
            wordGuessed=true;
            for(int i=0;i<guessedWord.length;i++){
                if (guessedWord[i]=='_'){
                    wordGuessed=false;
                    break;
                }
            }
        }
        if(wordGuessed){
            System.out.println("Congratulations!");
            System.out.println("You guessed the word: "+ secretWord);
        }
        sc.close();
    }
}
