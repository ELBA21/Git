public class Camara {
    protected int id;
    protected String nombre;
    protected String resolucion;


    public Camara(int id, String nombre, String resolucion){
        this.id= id;
        this.nombre = nombre;
        this.resolucion = resolucion;
    }

    void transmitir(){
        System.out.println(this.nombre + "esta transmitiendo");
    }
}
