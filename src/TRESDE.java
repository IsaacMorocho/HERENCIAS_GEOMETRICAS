public class TRESDE extends GEOMETRICAS{
    double lado;
    int nLados;
    int nCaras;

    //Constructor
    public TRESDE(String tipo, double lado, int nLados, int nCaras){
        super(tipo);
        this.lado = lado;
        this.nLados = nLados;
        this.nCaras = nCaras;
    }
    public TRESDE(){
    }

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

    public int getnCaras() {
        return nCaras;
    }

    public void setnCaras(int nCaras) {
        this.nCaras = nCaras;
    }
    //Personalizado
    public void area(){
        System.out.println("El area de la figura es: ");
    }
    public void perimetro(){
        System.out.println("El perimetro de la figura es: ");
    }
    @Override
    public void Datos(){
        System.out.println("Datos");
    }

}
