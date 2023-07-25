/*Conversión de Temperatura:
Crea una clase TemperatureConverter que convierta entre diferentes unidades de temperatura
(por ejemplo, Celsius, Fahrenheit, Kelvin).
Escribe pruebas unitarias para asegurarte de que la conversión entre las diferentes unidades
se realiza correctamente y produce los resultados esperados.*/
package Entities;
import java.util.Scanner;

public class TemperatureConverter {
    double celsius;
    double fahrenheit;
    double kelvin;

    //public TemperatureConverter() {}

    public TemperatureConverter(String option, double degrees) {
        switch (option) {
            case "celsius":
                this.celsius = degrees; break;
            case "kelvin":
                this.kelvin = degrees; break;
            case "fahrenheit":
                this.fahrenheit = degrees; break;
        }
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }
}
