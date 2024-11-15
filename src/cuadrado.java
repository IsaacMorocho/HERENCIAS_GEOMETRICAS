public class cuadrado extends DOSDE{
    double lado;

    //Constructores
    public cuadrado(){

    }
    public cuadrado(double lado){
        this.lado = lado;
    }
    //GETTERS Y SETTERS
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    //Personalizado
    @Override
    public void area(){
        System.out.println("El area del cuadrado es: "+lado*lado);
    }
    @Override
    public void perimetro(){
        System.out.println("El perimetro del cuadrado es: "+lado*2);
    }
    @Override
    public void Datos(){
        System.out.println("Datos");
    }
}
