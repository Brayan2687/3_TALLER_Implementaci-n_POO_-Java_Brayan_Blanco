package FiguraGeometrica;

public class Triangulo extends Figura{
    //Atributos
    private float base;
    private float altura;


    public Triangulo(float base, float altura) {
        this.base=base;
        this.altura=altura;
    }
    //metodos accesores getters y setters
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }


    public void calcularArea(){

    float areaFigura;
    areaFigura=((base*altura)/2);

    System.out.println("La Base Del Triangulo Es: "+base+" Y La Altura Es: "+altura+" Alfinal Su Area Es: "+areaFigura);
}

}
