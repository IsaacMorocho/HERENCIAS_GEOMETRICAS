public class DOSDE extends GEOMETRICAS{
    double lado;
    int nLados;

    //Constructor
    public DOSDE(String tipo,double lado, int nLados){
        super(tipo);
        this.lado = lado;
        this.nLados = nLados;
    }
    public DOSDE(){

    }
    //GETTERS Y SETTERS

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public int getnLados() {
        return nLados;
    }

    public void setnLados(int nLados) {
        this.nLados = nLados;
    }

    // Personalizado
    public void area(){
        System.out.println("El area de la figura es: ");
    }
    public void perimetro(){
        System.out.println("El perimetro de la figura es: ");
    }
    @Override
    public void Datos(){
        System.out.println("El lado de la figura es: "+lado+" y el número de lados es: "+nLados);
    }
}
