public class Main {
    public static void main(String[] args) {
        GEOMETRICAS geo1= new GEOMETRICAS();
        geo1.Datos();
        DOSDE dosde1= new DOSDE();
        dosde1.Datos();
        TRESDE tresde1= new TRESDE();
        tresde1.Datos();

        // CLASE CIRCULO
        circulo circulo1= new circulo(5);
        circulo1.area();
        circulo1.Datos();

        // CLASE CUADRADO
        cuadrado cuadrado1= new cuadrado(5);
        cuadrado1.area();
        cuadrado1.Datos();

        // CLASE TRIANGULO
        triangulo triangulo1= new triangulo(5,10);
        triangulo1.area();
        triangulo1.Datos();

        // CLASE CUBO
        
    }
}