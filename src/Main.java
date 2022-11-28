import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Alumno p = new Alumno("Pedro Castroseiros", new Date(2002, Calendar.JULY, 28));
        System.out.println(p);

        p.nombre = "0tro nombre"; // TODO: el nombre del alumno no debería poderse cambiar (inmutable)
    }
}