package Entities;/*Validador de Fechas:
Crea una clase Entities.DateValidator que valide la corrección de una fecha (por ejemplo, si es una
fecha válida en el calendario gregoriano).
Escribe pruebas unitarias para asegurarte de que el validador de fechas detecte correctamente
fechas válidas e inválidas, teniendo en cuenta diferentes casos, como años bisiestos.
*/

import java.time.LocalDate;

public class DateValidator {
    LocalDate fecha;

    public DateValidator(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
