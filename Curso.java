/*MORENO YERAY  */
package MorenoYeray;
import java.util.ArrayList;

public class Curso {
    private final ArrayList<Alumno> alumnos = new ArrayList(5);
    private Profesor profe;
    private String nomcur;

    Curso() {}

    public void setNomcur(String nomcur) {
        this.nomcur = nomcur;
    }

    public String getNomcur() {
        return nomcur;
    }

    public Profesor getProfe() {
        return profe;
    }

    public void setProfe(Profesor profe) {
        this.profe = profe;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }
    
    public void nuevoalumno(int edad, String Nombre, String Apellido1, String Apellido2, char Sexo){
        alumnos.add(new Alumno(edad,Nombre,Apellido1, Apellido2, Sexo));
    }
    
    public void listaralum(){
        for( int i = 0 ; i < alumnos.size() ; i++ ){
            System.out.println( alumnos.get( i ).Nombre+"     "+
                                alumnos.get( i ).Apellido1 +"     "+
                                alumnos.get( i ).Apellido2 +"     "+
                                alumnos.get( i ).getEdad() +"     "+
                                alumnos.get( i ).Sexo  );
        }  
    }
}
