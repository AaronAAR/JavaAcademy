import java.util.*;

public class Problema3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String word = scan.nextLine();

        word=word.replace(" ", "");
        word=word.replace(",", "");
        word=word.replace(".", "");
        System.out.print(word);
        int wordEnd = word.length()-1;
        int wordBegin = 0;
        boolean palindromo = true;

        while(wordBegin < wordEnd){
            if(word.charAt(wordBegin)!=word.charAt(wordEnd)){
                palindromo = false;
            }
            wordBegin++;
            wordEnd--;
        }
        if(palindromo)
            System.out.print("\nSi.");
        else
            System.out.print("\nNo.");

    }
}