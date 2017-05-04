/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ims.servicios.res;

import co.ims.nue.tienda.Articulo;



import java.util.Collection;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 *
 * @author indira s
 */
@Path("/articulo")
@Produces("application/json")
public class ArticuloRest {
      @PersistenceContext(unitName = "tiendaPU")
    protected EntityManager em;
    @GET
     @Path("{id}")
    @Produces("application/json")
    public Articulo buscar(@PathParam("id") Integer pId) {		
        return em.find(Articulo.class, pId);
   
    }


      @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public Articulo agregar(Articulo entity){
        em.persist(entity);
        em.flush();
        return entity;
    }

  

//    
    
}
