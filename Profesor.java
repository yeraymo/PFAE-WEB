/* MORENO YERAY  */
package MorenoYeray;

public class Profesor extends Persona{
    private String titulo ;

    public Profesor() { }

    public Profesor( String Nombre, String Apellido1, String Apellido2, char Sexo,String titulo) {
        super(Nombre, Apellido1, Apellido2, Sexo);
        this.titulo = titulo;
    }

    public void escribirprofesor (){
        System.out.println( Nombre+"     "+
                            Apellido1 +"     "+
                            Apellido2 +"     "+
                            titulo+"     "+
                            Sexo);
    
    }    
}
