package Salud;

import java.util.Scanner;

public class Persona {

    //Atributos
    
private String tipoDoc;
private int numDoc;
private String nombre;
private String apellido;
private double peso;
private double estatura;
private int edad;
private String sexo;
//private double pesoActual;


    
 //Metodo Constructor
public Persona(String tipoDoc2, int numDoc2, String nombre2, String apellido2, double peso2, double estatura2,
        int edad2, String sexo2) {

            this.tipoDoc=tipoDoc2;
            this.numDoc=numDoc2;
            this.nombre=nombre2;
            this.apellido=apellido2;
            this.peso=peso2;
            this.estatura=estatura2;
            this.edad=edad2;
            this.sexo=sexo2;

    
}
//Metodos
public void pedirDatos(){
    Scanner lectura=new Scanner(System.in);

    /*System.out.println("Digite El Tipó Del Documento De La Persona");
    tipoDoc=lectura.next();
    System.out.println("Digite El Número De Documento De La Persona");
    numDoc=lectura.nextInt();*/
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


    lectura.close();
}


public void mostrarDatos(){
        Scanner lectura=new Scanner(System.in);
        System.out.println("El Tipo De Documento Es: "+tipoDoc);
        System.out.println();
        System.out.println("El Numero De Documento Es: "+numDoc);
        System.out.println();
        System.out.println("El Nombre De La Persona Es: "+nombre);
        System.out.println();
        System.out.println("El Apellido De "+nombre+" Es: "+apellido);
        System.out.println();
        System.out.println("El Peso De "+nombre+" Es: "+peso);
        System.out.println();
        System.out.println("La Estatura De "+nombre+" Es: "+estatura);
        System.out.println();
        System.out.println("La Edad De "+nombre+" Es: "+edad);
        System.out.println();
        System.out.println("El Genero De "+nombre+" Es: "+sexo);
        System.out.println();
        lectura.close();
}


public void calcularImc(){
    Scanner lectura=new Scanner(System.in);

    double pesoActual = ((peso)/(estatura*estatura));

    if (pesoActual < 20) {

        System.out.println();
        System.out.println("El Peso Esta Debajo De Lo Ideal: "+pesoActual);
        System.out.println();

    } else if (pesoActual >= 20 && pesoActual <= 25) {
        
        System.out.println();
        System.out.println("El Peso Esta En Lo Ideal: "+pesoActual);
        System.out.println();



    } else if (pesoActual > 25) {
        
        System.out.println();
        System.out.println("Tiene Sobre Peso: "+pesoActual);
        System.out.println();

    }
    lectura.close();
}

/*public double calcularImc(double peso, double estatura){


    pesoActual = ((peso) / (estatura*estatura));


    return pesoActual;
}*/




public void mayorEdad(){
    Scanner lectura=new Scanner(System.in);

    if (edad > 18) {
        
        System.out.println();
        System.out.println("Usted Es Mayor De Edad, Su Edad Es: "+edad);
        System.out.println();

    } else {
        
        System.out.println();
        System.out.println("Usted No Es Mayor De Edad, Su Edad Es: "+edad);
        System.out.println();

    }


    lectura.close();
}




public String getTipoDoc() {
    return tipoDoc;
}




public void setTipoDoc(String tipoDoc) {
    this.tipoDoc = tipoDoc;
}




public int getNumDoc() {
    return numDoc;
}




public void setNumDoc(int numDoc) {
    this.numDoc = numDoc;
}




public String getNombre() {
    return nombre;
}




public void setNombre(String nombre) {
    this.nombre = nombre;
}




public String getApellido() {
    return apellido;
}




public void setApellido(String apellido) {
    this.apellido = apellido;
}




public double getPeso() {
    return peso;
}




public void setPeso(double peso) {
    this.peso = peso;
}




public double getEstatura() {
    return estatura;
}




public void setEstatura(double estatura) {
    this.estatura = estatura;
}




public int getEdad() {
    return edad;
}




public void setEdad(int edad) {
    this.edad = edad;
}




public String getSexo() {
    return sexo;
}




public void setSexo(String sexo) {
    this.sexo = sexo;
}




}

