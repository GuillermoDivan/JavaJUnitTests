package Services;

import Entities.PalindromeChecker;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeCheckerService {
    Scanner input = new Scanner(System.in);

    public PalindromeChecker addWord(){
        System.out.println("Ingrese una palabra o frase para comprobar si es palíndromo.");
        String inputWord = input.next();
        inputWord = inputWord.toLowerCase();
        PalindromeChecker pc = new PalindromeChecker();
        ArrayList<String> aux = new ArrayList<>();
        String inputCharacter = "";

        for (int i = 0; i < inputWord.length(); i++){
            aux.add(inputWord.substring(i,i+1));
        }
        pc.setWord(aux);
    }
}
