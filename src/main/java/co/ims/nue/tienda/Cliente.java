
package co.ims.nue.tienda;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import static jdk.nashorn.internal.runtime.Debug.id;


/**
 *
 * @author FERNANDA
 */

@Entity
public class Cliente implements Serializable{
//    private static final long SerialVersionUID=5678L;
   @Id  
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private long idCliente;
    private String nombre;
    private String apellido;
    private int identificacion;
    
    
    
     
  
   
    
    public Cliente (){
    }
     
    public Cliente (long ic,String n,String a,int i){
    this.idCliente=ic;
    this.nombre=n;
    this.apellido=a;
    this.identificacion=i;
    
    }
 public String MostrarCliente(){
        return "IdCliente: "+idCliente+"  "+"nombre: "+nombre+"  "+"apellido: "+apellido+"    "+"identificacion: "+identificacion+" " ;                                      

        }
    public int getIdCiente() {
        return (int) idCliente;
    }

    public void setIdCiente(int idCiente) {
        this.idCliente = idCiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

}

