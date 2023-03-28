package Salud;

public class Empleado extends Persona{

    //Creamos los atributos  propios de la subclase

private String cargo; 
private double valorHora; 
private int horasTrabajadas; 
private String departamento;

    //creamos el metodo constructor de la subclase y trajimos los atributos de la superclase
public Empleado( String tipoDoc, int numDoc,String nombre,String apellido,double peso,double estatura,int edad,
                 String sexo,String cargo,double valorHora,int horasTrabajadas,String departamento){

super(tipoDoc,numDoc,nombre,apellido,peso,estatura,edad,sexo);

this.cargo=cargo;
this.valorHora=valorHora;
this.horasTrabajadas=horasTrabajadas;
this.departamento=departamento;
}

//Creamos los metodos propios de la subclase

public void calcularHonorarios(){
double totalApagar;

totalApagar = valorHora*horasTrabajadas;

totalApagar = ((totalApagar) - (0.966/100));


    System.out.println("El Cargo De "+getNombre()+" Es "+cargo);
    System.out.println();
    System.out.println("El Total De Horas Trabajadas De "+getNombre()+" Es: "+horasTrabajadas);
    System.out.println();
    System.out.println("El Valor A Pagar Por Horas Es "+valorHora);
    System.out.println();
    System.out.println("El Total A Pagar Para "+getNombre()+" Es De: "+totalApagar);
    System.out.println();
    System.out.println("El Departamento De "+getNombre()+" Es: "+departamento);
    System.out.println();

}



}
