/*MORENO YERAY */
package MorenoYeray;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int op;
        String Nombre, Apellido1, Apellido2, titulo;
        char Sexo;
        int Edad;
        Curso curso  = new Curso();
        do{
            System.out.println();
            System.out.println("1.	Nuevo alumno.");
            System.out.println("2.	Nuevo Profesor.");
            System.out.println("3.	Insertar nombre del Curso.");
            System.out.println("4.	Listado de alumnos");
            System.out.println("5.	Listado de miembros de un Curso");
            System.out.println("6.	Salir");
            System.out.println("Introduzca una opción\n");
            op= sc.nextInt();
            switch(op){
                case 1:
                    if (curso.getAlumnos().size()==5)
                        System.out.println("El curso ha alcanzado el maximo de alumnos");
                    else{
                        System.out.println("Inroduzca Nombre");
                        Nombre = sc.next();
                        System.out.println("Inroduzca Apellido1");
                        Apellido1 = sc.next();
                        System.out.println("Inroduzca Apellido2");
                        Apellido2 = sc.next();
                        System.out.println("Inroduzca Sexo");
                        Sexo = sc.next().charAt(0);                     
                        System.out.println("Inroduzca Edad");
                        Edad = sc.nextInt();
                        curso.nuevoalumno(Edad, Nombre, Apellido1, Apellido2, Sexo);
                    }
                    break;
                case 2:                
                    System.out.println("Inroduzca Nombre");
                    Nombre = sc.next();
                    System.out.println("Inroduzca Apellido1");
                    Apellido1 = sc.next();
                    System.out.println("Inroduzca Apellido2");
                    Apellido2 = sc.next();
                    System.out.println("Inroduzca Sexo");
                    Sexo = sc.next().charAt(0);                     
                    System.out.println("Inroduzca titulo");
                    titulo = sc.next();
                    curso.setProfe(new Profesor(Nombre, Apellido1, Apellido2, Sexo,titulo)); 
                    break;
                case 3:
                    System.out.println("Inroduzca Nombre del curso");
                    Nombre = sc.next();
                    curso.setNomcur(Nombre);
                    break;
                case 4:
                    System.out.println("Listado");
                    curso.listaralum();
                    break;
                case 5:
                    //Información del Curso
                    System.out.print("CURSO: ");
                    if (curso.getNomcur()==null)System.out.println("No se ha asignado nombre al curso");
                    else System.out.println(curso.getNomcur());
                    //Información del Profesor
                    System.out.println("PROFESOR: ");
                    try {5
                            
                        curso.getProfe().escribirprofesor();
                    }catch(NullPointerException e) {
                        System.out.println("No se ha asignado Profesor al curso ");
                    }
                    //Información de los alumnos
                    System.out.println("Alumnos: ");
                    if(curso.getAlumnos().isEmpty())System.out.println("No existen alumnos matriculados");
                    else curso.listaralum();
                    break;
                case 6: break;
                default:
                    System.out.println("Opción incorrecta");
            }    
        }while(op!=6);
    }
}
