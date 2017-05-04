
package co.ims.nue.tienda;


public class Factura {
   private int id;
   private String nombreCli;
   private String apellidoCli;
   private int idCli;
   
   public Factura (){
   }
   
   public Factura (int id, String nc, String ac,int ic){
       this.id=id;
       this.nombreCli=nc;
       this.apellidoCli=ac;
       this.idCli=ic;
  
   }
       public String MostrarFactura(){
        return "Id: "+id+"  "+"nombreCli: "+nombreCli+"  "+"apellidoCli: "+apellidoCli+" "+"idCli: "+idCli+" " ;                                      

        }
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCli() {
        return nombreCli;
    }

    public void setNombreCli(String nombreCli) {
        this.nombreCli = nombreCli;
    }

    public String getApellidoCli() {
        return apellidoCli;
    }

    public void setApellidoCli(String apellidoCli) {
        this.apellidoCli = apellidoCli;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }
   
}
