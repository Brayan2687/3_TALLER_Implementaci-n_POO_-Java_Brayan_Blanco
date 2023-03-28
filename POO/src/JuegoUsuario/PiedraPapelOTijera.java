package JuegoUsuario;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelOTijera implements Juego {

//Atributos 
private int numJugador;
private String nombreJu;
private int numMaq;

Scanner lectura=new Scanner(System.in);

public void iniciar(){

    System.out.println("Ingrese El Nombre Del Jugador");
    nombreJu=lectura.next();

}
public void Jugar(){
System.out.println(nombreJu+" Elija \n1 = piedra \n2 = papel \n3 = tijera");
numJugador=lectura.nextInt();

Random alazar=new Random();
numMaq=alazar.nextInt(3)+1;
System.out.println();
System.out.println();
System.out.println();
System.out.println("1");
System.out.println();
System.out.println();
System.out.println();
System.out.println("2");
System.out.println();
System.out.println();
System.out.println();
System.out.println("3");
System.out.println();
System.out.println();
System.out.println();
System.out.println("Piedra, Papel o Tijera");
System.out.println();
System.out.println();
System.out.println();

}
public void finalzar(){


    if(numMaq==3 && numJugador==3){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Ambos Sacaron Piedra, Han Empatado");
        System.out.println();
        System.out.println();
    

    }
    else if(numMaq==2 && numJugador==2){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Ambos Sacaron Papel, Han Empatado");
        System.out.println();
        System.out.println();

    }
    else if(numMaq==1 && numJugador==1){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Ambos Sacaron Tijera, Han Empatado");
        System.out.println();
        System.out.println();
  
        
    }
    else if(numMaq==1 && numJugador==2){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("La Maquina Saco Tijeras Y "+nombreJu+" Ha sacado Papel Asi Que, Ha Perdido ;(");
        System.out.println();
        System.out.println();
        System.out.println();


    }
    else if(numMaq==3 && numJugador==1){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("La Maquina Saco Piedra Y "+nombreJu+" Ha Sacado Tijeras Asi Que, Ha Perdido ;(");
        System.out.println();
        System.out.println();
        System.out.println();


    }
    else if(numMaq==2 && numJugador==3){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("La Maquina Saco Papel Y "+nombreJu+" Ha Sacado Piedra Asi Que, Ha Perdido ;(");
        System.out.println();
        System.out.println();
        System.out.println();


    }
    else if(numMaq==3 && numJugador==2){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("La Maquina Saco Piedra Y "+nombreJu+" Ha Sacado Papel Asi Que, Ha !!Ganado¡¡");
        System.out.println();
        System.out.println();
        System.out.println();


    }
    else if(numMaq==2 && numJugador==1){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("La Maquina Saco Papel Y "+nombreJu+" Ha Sacado Tijeras Asi Que, Ha !!Ganado¡¡");
        System.out.println();
        System.out.println();
        System.out.println();

        

    }
    else if(numMaq==1 && numJugador==3){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("La Maquina Saco Tijeras Y "+nombreJu+" Ha Sacado Piedra Asi Que, Ha !!Ganado¡¡");
        System.out.println();
        System.out.println();
        System.out.println();


}


}
}
