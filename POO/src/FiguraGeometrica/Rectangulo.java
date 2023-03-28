package FiguraGeometrica;

public class Rectangulo extends Figura{
    //Atributos
    private float base;
    private float altura;


    public Rectangulo(float base, float altura) {
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
    areaFigura=base*altura;

    System.out.println("La Base Del Rectangulo Es: "+base+" Y La Altura Es: "+altura+" Alfinal Su Area Es: "+areaFigura);
}

}
