package FiguraGeometrica;

public class Circulo extends Figura{
    //Atributos
    private double pi = 3.1416;
    private double radio;

    //creamos el metodo contructor de la clase circulo 
    
    public Circulo(double radio) {
        this.radio=radio;
    }

    //metodos accesores getters y setters


        public double getRadio() {
            return radio;
        }

        public void setRadio(double radio) {
            this.radio = radio;
        }



    public void calcularArea(){
    double areaFigura;
    areaFigura=(pi*(radio*radio));

    System.out.println("El Pí Es De: "+pi+" Y El Radio Es De: "+radio+" Alfinal Su Area Es: "+areaFigura);
}

  
}
