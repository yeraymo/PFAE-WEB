/* MORENO YERAY */
package MorenoYeray;


public class Persona {
    protected String Nombre, Apellido1, Apellido2; 
    protected char Sexo;

    public Persona() {}

    public Persona(String Nombre, String Apellido1, String Apellido2, char Sexo) {
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
        this.Sexo = Sexo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public char getSexo() {
        return Sexo;
    }
    
    
}
