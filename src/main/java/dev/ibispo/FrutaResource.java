package dev.ibispo;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/frutas")
public class FrutaResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fruta> list() {
        return Fruta.listAll();
    }

    @POST
    @Transactional
    public void novaFruta() {
    	
    	Fruta fruta = new Fruta();
    	fruta.nome = "Apple";
    	fruta.qtd = 6;
    	
    	fruta.persist();
    	
    }



}