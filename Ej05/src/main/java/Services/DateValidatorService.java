package Services;
import Entities.DateValidator;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateValidatorService {
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    DateTimeFormatter DMY = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public DateValidator createDate(){
        System.out.println("Ingrese fecha (DD / MM / AAAA).");
        String inputDate = input.next();
        LocalDate dv = LocalDate.parse(inputDate,DMY);
        System.out.println(dv);
        return new DateValidator(dv);

        //Revisar: Cuando 29/02 no bisiesto, LocalDate cambia la fecha inválida a 28/02.
        //Cuando 32 o más en día, 13 o má en mes, más de 4 dígitos en año... retorna excepción.
        //Debería hacerse sin localDate o rever consigna.
    }

}
