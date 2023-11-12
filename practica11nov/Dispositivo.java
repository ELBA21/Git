public class Dispositivo extends Camara{
    protected String marca;
    protected String modelo;


    public Dispositivo(int id, String nombre, String resolucion, String marca, String modelo){
        super(id, nombre, resolucion);
        this.marca = marca;
        this.modelo = modelo;
    }

    void t2(){
        System.out.println(this.nombre);
    }
}
