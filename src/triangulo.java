public class triangulo extends DOSDE{
    double base;
    double altura;

    //Constructores
    public triangulo(){

    }
    public triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    //GETTERS Y SETTERS
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    //Personalizado
    @Override
    public void area(){
        System.out.println("El area del triangulo es: "+base*altura);
    }
    @Override
    public void perimetro(){
        System.out.println("El perimetro del triangulo es: "+2*base+2*altura);
    }
    @Override
    public void Datos(){
        System.out.println("Datos");
    }
}
