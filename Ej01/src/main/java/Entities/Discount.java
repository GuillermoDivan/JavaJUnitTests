/*Calculadora de Descuentos:
Crea una clase DiscountCalculator que calcule el descuento aplicado a un producto.
Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo,
sin descuento, etc.).
*/

package Entities;

public class Discount {
    double price;
    double discount;

    public Discount() {}

    public Discount(double price, double discount) {
        this.price = price;
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
