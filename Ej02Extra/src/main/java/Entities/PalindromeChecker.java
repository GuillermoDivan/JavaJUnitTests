/*Verificador de Palíndromos:
Crea una clase PalindromeChecker que verifique si una cadena es un palíndromo (se lee
igual de adelante hacia atrás y viceversa).
Escribe pruebas unitarias para asegurarte de que el verificador de palíndromos detecte
correctamente las cadenas que son palíndromos y las que no lo son.*/

package Entities;

import java.util.ArrayList;

public class PalindromeChecker {
    ArrayList<String> word = new ArrayList<>();
    boolean palindrome;

    public PalindromeChecker() {
    }

    public PalindromeChecker(ArrayList<String> word, boolean palindrome) {
        this.word = word;
        this.palindrome = palindrome;
    }

    public ArrayList<String> getWord() {
        return word;
    }

    public void setWord(ArrayList<String> word) {
        this.word = word;
    }

    public boolean isPalindrome() {
        return palindrome;
    }

    public void setPalindrome(boolean palindrome) {
        this.palindrome = palindrome;
    }
}
