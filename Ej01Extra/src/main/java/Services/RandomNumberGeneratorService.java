package Services;
import Entities.RandomNumberGenerator;

import java.util.Scanner;

public class RandomNumberGeneratorService {
    Scanner input = new Scanner(System.in);

    public RandomNumberGenerator createRandomNumber(){
        System.out.println("Ingrese el valor menor para el rango aleatorio");
        int bottomNumber = input.nextInt();
        System.out.println("Ingrese el valor mayor para el rango aleatorio");
        int topNumber = input.nextInt();
        int randomNumber = randomizeWithParameters(bottomNumber, topNumber);
        RandomNumberGenerator rn = new RandomNumberGenerator(topNumber, bottomNumber);
        rn.setRandomNumber(randomNumber);
        return rn;
    }

    public int randomizeWithParameters(int bottomNumber, int topNumber){
        int randomNumber = 0;
        do {
            randomNumber = (int) (Math.random() * (topNumber-bottomNumber)+bottomNumber);
            System.out.println(randomNumber);
        } while (randomNumber < bottomNumber || randomNumber > topNumber);
        return randomNumber;
    }

}
