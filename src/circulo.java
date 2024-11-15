public class circulo extends DOSDE{
    double radio;

    //Constructores
    public circulo(){

    }
    public circulo(double radio){
        this.radio = radio;
    }

    //GETTERS Y SETTERS
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    //Personalizado
    @Override
    public void area(){
        System.out.println("El area del circulo es: "+Math.PI*Math.pow(radio,2));
    }
    @Override
    public void perimetro(){
        System.out.println("El perimetro del circulo es: ");
    }
    @Override
    public void Datos(){
        System.out.println("Datos");
    }
}
