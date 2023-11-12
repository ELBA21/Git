public class Sesion {
    protected int id;
    protected String nAsig;
    protected String nProf;
    protected String sala;
    protected String fechaClase;
    protected String horaInic;
    protected Camara usedCamara;
    protected Camara[] listCam;


    public Sesion(int id, String nAsing, String nProf, String sala, String fechaClase, String horaInic, Camara usedCamara, Camara[] listCam){
        this.id = id;
        this.nAsig = nAsing;
        this.nProf = nProf;
        this.sala = sala;
        this.fechaClase = fechaClase;
        this.horaInic = horaInic;
        this.usedCamara = usedCamara;
        this.listCam = listCam;


    }//id nombre resolujcion
    void crearCam(int n, int Iid, String Iname, String irest){
        for(int i = 0; i<=n; i++){
            System.out.println("Inserte un nombre para su camara");

            Camara[] listCam  = new Camara[n];
        }
    }
}
/*
 * # id: Int
# nAsig: String
# nProf: String
# sala: String
# fechaClase: String
# horaInic: String
# horaFin: String
# usedCamara: Camara
# listCamara[]: Camara
 */