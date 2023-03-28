package FiguraGeometrica;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        int n = 1;
        int numUsuario;
        int NY;
        float base,altura;
        double radio;

    Scanner lectura=new Scanner(System.in);
    System.out.println("Bienvenido A La MAquina Que Deduce El Area De Tu Figura Seleccionada");
    System.out.println();


    for(int i=0;i < n;i++){
    System.out.println("Digite El Numero Dependiendo De Que Figura Quiere \n1 = Triangulo \n2 = Rectangulo \n3 = Circulo");
    numUsuario=lectura.nextInt();
    System.out.println();

   



        if(numUsuario == 1){

            System.out.println("Digite La Base De Su Triangulo");
        base=lectura.nextFloat();
        System.out.println();

        System.out.println("Digite La Altura De Su Triangulo");
        altura=lectura.nextFloat();

        //instancia de la Subclase Triangulo
        
        Triangulo T1=new Triangulo(base, altura);
        
        T1.calcularArea();
        

        }else if(numUsuario == 2){


        System.out.print("Digite La Base De Su Rectangulo: ");
        base=lectura.nextFloat();
        System.out.println();
        
        System.out.print("Digite La Altura De Su Rectangulo: ");
        altura=lectura.nextFloat();
        //instancia de la Subclase Rectangulo

        Rectangulo R1=new Rectangulo(base, altura);

        R1.calcularArea();


        }else if(numUsuario == 3){

            
        System.out.print("Digite El Radio De Su Circulo: ");
        radio=lectura.nextDouble();
        //instancia de la Subclase Circulo

        Circulo C1=new Circulo(radio);

        C1.calcularArea();


        }else{

            System.out.println("Digitaste Un Numero Que No Estaba En La Lista");

        }
    
        System.out.println("Desea Volver A Intentar, Si Su Respuesta Es Que Si Digite '1' Y Si Su Respuesta Es Que No Digite '2'");
        NY=lectura.nextInt();

        if (NY == 1) {
            
            n = n+1; 

        } else if (NY == 2) {

            n = n-1;
            
        }else{

        System.out.println("Digitaste Una Letra Que No Estaba En Este Listado");

        }
            
        
        }
        lectura.close();
    }
    
}
