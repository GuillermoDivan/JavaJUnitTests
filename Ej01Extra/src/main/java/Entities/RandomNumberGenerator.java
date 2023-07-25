/*Generador de Números Aleatorios:
Crea una clase RandomNumberGenerator que genere números aleatorios dentro de un rango
específico.
Escribe pruebas unitarias para asegurarte de que el generador de números aleatorios produce
resultados dentro del rango esperado y cumple con las propiedades de aleatoriedad.*/

package Entities;

public class RandomNumberGenerator {
    int topNumber;
    int bottomNumber;
    int randomNumber;

    public RandomNumberGenerator(int topNumber, int bottomNumber) {
        this.topNumber = topNumber;
        this.bottomNumber = bottomNumber;
    }

    public int getTopNumber() {
        return topNumber;
    }

    public void setTopNumber(int topNumber) {
        this.topNumber = topNumber;
    }

    public int getBottomNumber() {
        return bottomNumber;
    }

    public void setBottomNumber(int bottomNumber) {
        this.bottomNumber = bottomNumber;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }
}
