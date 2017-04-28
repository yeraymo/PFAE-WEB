/* MORENO YERAY  */
package MorenoYeray;

public class Alumno extends Persona{
    private int edad;

    public Alumno() {}

    public Alumno(int edad, String Nombre, String Apellido1, String Apellido2, char Sexo) {
        super(Nombre, Apellido1, Apellido2, Sexo);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    
    
}
