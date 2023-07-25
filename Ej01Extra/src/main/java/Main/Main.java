package Main;

import Services.RandomNumberGeneratorService;

public class Main {
    public static void main(String[] args) {
        RandomNumberGeneratorService service = new RandomNumberGeneratorService();
        service.createRandomNumber();
    }
}
