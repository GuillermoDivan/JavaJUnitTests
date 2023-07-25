package Services;
import Entities.TemperatureConverter;
import java.util.Scanner;

public class TemperatureConverterService {
Scanner input = new Scanner(System.in);
TemperatureConverter tc;

    /*public TemperatureConverter createTC(){
        String option = "";
        do {
            System.out.println("Ingrese la escala en grados: celsius, kelvin o fahrenheit. " +
                    "¡Escríbalo bien!");
            option = input.next();
        } while(!option.equalsIgnoreCase("celsius") &&
                !option.equalsIgnoreCase("kelvin") &&
                !option.equalsIgnoreCase("fahrenheit"));

        System.out.println("Ingrese el valor decimal a convertir");
        double degrees = input.nextDouble();
        switch(option){
            case "celsius": tc.setCelsius(degrees); break;
            case "fahrenheit": tc.setFahrenheit(degrees); break;
            case "kelvin": tc.setKelvin(degrees); break;
    }*/

    public double convertCelsiusToK(TemperatureConverter tc){
        double kelvin = tc.getCelsius() +  273.15;
        tc.setKelvin(kelvin);
        System.out.println(tc.getCelsius() + "°C equivalen a "+ tc.getKelvin()+ "°K.");
        return kelvin;
    }

    public double convertCelsiusToF(TemperatureConverter tc){
        double fahrenheit = tc.getCelsius() * 1.8 + 32;
        tc.setFahrenheit(fahrenheit);
        System.out.println(tc.getCelsius() + "°C equivalen a "+ tc.getFahrenheit()+ "°F.");
        return fahrenheit;
    }

    public double convertKelvinToC(TemperatureConverter tc){
        double celsius = tc.getKelvin() -  273.15;
        tc.setCelsius(celsius);
        System.out.println(tc.getKelvin() + "°K equivalen a "+ tc.getCelsius()+ "°C.");
        return celsius;
    }

    public double convertKelvinToF(TemperatureConverter tc){
        double fahrenheit = (1.8) * (tc.getKelvin() - 273.15) + 32;
        tc.setFahrenheit(fahrenheit);
        System.out.println(tc.getKelvin() + "°K equivalen a "+ tc.getFahrenheit()+ "°F.");
        return fahrenheit;
    }

    public double convertFahrenheitToC(TemperatureConverter tc){
        double celsius = (tc.getFahrenheit()  -32) / 1.8;
        tc.setCelsius(celsius);
        System.out.println(tc.getFahrenheit() + "°F equivalen a "+  tc.getCelsius()+ "°C.");
        return celsius;
    }

    public double convertFahrenheitToK(TemperatureConverter tc){
        double kelvin =   (tc.getFahrenheit() - 32) * (5/9) + 273.15;
        tc.setKelvin(kelvin);
        System.out.println(tc.getFahrenheit() + "°F equivalen a "+ tc.getKelvin()+ "°K.");
        return kelvin;
    }


}
