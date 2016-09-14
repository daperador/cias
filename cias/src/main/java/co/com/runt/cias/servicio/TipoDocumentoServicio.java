package co.com.runt.cias.servicio;

import co.com.runt.cias.dto.*;
import co.com.runt.cias.logica.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 * @generated
 */
@Stateless
@Path("/TipoDocumento")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TipoDocumentoServicio {

    @EJB
    private TipoDocumentoLogica logica;

    /**
     * @generated
     */
    @GET
    public List<TipoDocumentoDTO> obtenerTodosTipoDocumentos() {
        return logica.obtenerTodos();
    }

    /**
     * @generated
     */
    @GET
    @Path("/{id}")
    public TipoDocumentoDTO obtenerTipoDocumento(@PathParam("id") Long id) {
        return logica.obtener(id);
    }

    /**
     * @generated
     */
    @POST
    public TipoDocumentoDTO guardarTipoDocumento(TipoDocumentoDTO dto) {
        if (dto.getId() != null) {
            logica.actualizar(dto);
            return dto;
        } else {
            return logica.guardar(dto);
        }
    }

    /**
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarTipoDocumento(@PathParam("id") Long id) {
        logica.borrar(id);
    }

}
