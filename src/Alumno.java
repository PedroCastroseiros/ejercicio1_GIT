import java.util.Date;

 class Alumno {
    String nombre;
    Date fechaCumple;

    Alumno(String nombre, Date fechaCumple) {
        this.nombre = nombre;
        this.fechaCumple = fechaCumple;
    }


    @Override
    public String toString() {
        return "Empleado: "+ nombre +" (nacido en 28, "+ fechaCumple.getYear() + ")";
    }
}
