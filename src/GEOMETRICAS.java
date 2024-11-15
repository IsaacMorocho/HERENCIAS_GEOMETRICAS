public class GEOMETRICAS {
    String tipo;

    //Constructor
    public GEOMETRICAS(String tipo){
        this.tipo = tipo;
    }
    public GEOMETRICAS(){
    }
    //GETTERS Y SETTERS
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //Personalizado
    public void Datos(){
        System.out.println("El tipo de figura es: "+tipo);
    }


}
