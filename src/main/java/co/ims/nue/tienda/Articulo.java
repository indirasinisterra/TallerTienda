
package co.ims.nue.tienda;

/**
 *
 * @author FERNANDA
 */
public class Articulo {
    private int id;
    private String nombre;
    private int valor;
    private String marca;
    
    public Articulo (){
}
    
    public Articulo (int id, String m, int v, String r){
        this.id=id;
        this.nombre=m;
        this.valor=v;
        this.marca=r;
    }
    
    public String MostrarArticulo(){
        return "Id: "+id+"  "+"nombre: "+nombre+"  "+"valor: "+valor+"   "+"marca: "+marca+" " ;                                      

        }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
