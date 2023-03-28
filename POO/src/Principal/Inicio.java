package Principal;


import java.util.Scanner;

import Salud.Empleado;
/*import Salud.Persona;*/

public class Inicio {
    public static void main(String[] args) {
        /*double result;
        double peso;
        double estatura;*/
        String cargo; 
        double valorHora; 
        int horasTrabajadas; 
        String departamento;
        String tipoDoc;
        int numDoc;
        String nombre;
        String apellido;
        double peso;
        double estatura;
        int edad;
        String sexo;

     //Crear Un Objeto -> Instancia De Una Clase

     //Persona brayan=new Persona();


     Scanner lectura=new Scanner(System.in);


     System.out.println("Digite El Tipó Del Documento De La Persona");
    tipoDoc=lectura.next();
    System.out.println("Digite El Número De Documento De La Persona");
    numDoc=lectura.nextInt();
    System.out.println("Digite El Nombre De La Persona");
    nombre=lectura.next(); 
    System.out.println("Digite El Apellido De La Persona");
    apellido=lectura.next();
    System.out.println("Digite El Peso De La Persona En kg");
    peso=lectura.nextDouble();
    System.out.println("Digite La Estatura De La Persona En cm");
    estatura=lectura.nextDouble();
    System.out.println("Digite La Edad De La Persona");
    edad=lectura.nextInt();
    System.out.println("Digite El Genero De La Persona");
    sexo=lectura.next();
    System.out.println();
    System.out.println("Digite El Cargo Del Empleado");
    cargo=lectura.next();
    System.out.println();
    System.out.println("Digite El Valor A Pagar Por Hora");
    valorHora=lectura.nextInt();
    System.out.println();
    System.out.println("Digite El Total De Horas Trabajadas Por El Empleado");
    horasTrabajadas=lectura.nextInt();
    System.out.println();
    System.out.println("Digite El Departamento Del Empleado");
    departamento=lectura.next();
    
    Empleado brayan=new Empleado(tipoDoc, numDoc, nombre, apellido, peso, estatura, edad, sexo, cargo, valorHora, horasTrabajadas, departamento);
    brayan.mostrarDatos();    
    brayan.calcularHonorarios();
   

   
   
    /*System.out.println("Digite El Peso De La Persona En kg");
     peso=lectura.nextDouble();
     System.out.println("Digite La Estatura De La Persona En cm");
     estatura=lectura.nextDouble();*/
    //Invocando Metodo
     //brayan.pedirDatos();
    /*brayan.mostrarDatos();
     brayan.calcularImc();*/

     /*result=brayan.calcularImc(peso, estatura);
     
     if (result < 20) {

        System.out.println();
        System.out.println("PESOBAJO: "+result);
        System.out.println();

    } else if (result >= 20 && result <= 25) {
        
        System.out.println();
        System.out.println("PESOIDEAL: "+result);
        System.out.println();



    } else if (result > 25) {
        
        System.out.println();
        System.out.println("SOBREPESO: "+result);
        System.out.println();

    }
    */

    /*brayan.setTipoDoc("T.I");
    brayan.setNumDoc(1028783118);

    
    System.out.println("El Tipo De Documento Es: "+brayan.getTipoDoc());
    System.out.println();
    System.out.println("El Numero De Documento Es: "+brayan.getNumDoc());
    System.out.println();
    System.out.println("El Nombre De La Persona Es: "+brayan.getNombre());
    System.out.println();
    System.out.println("El Apellido De "+brayan.getNombre()+" Es: "+brayan.getApellido());
    System.out.println();
    System.out.println("El Peso De "+brayan.getNombre()+" Es: "+brayan.getPeso());
    System.out.println();
    System.out.println("La Estatura De "+brayan.getNombre()+" Es: "+brayan.getEstatura());
    System.out.println();
    System.out.println("La Edad De "+brayan.getNombre()+" Es: "+brayan.getEdad());
    System.out.println();
    System.out.println("El Genero De "+brayan.getNombre()+" Es: "+brayan.getSexo());
    System.out.println();
    
    brayan.calcularImc();

    brayan.mayorEdad();*/


     lectura.close();
    }    

}
