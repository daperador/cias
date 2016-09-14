package co.com.runt.cias.servicio;

import co.com.runt.cias.dto.*;
import co.com.runt.cias.logica.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 * @generated
 */
@Stateless
@Path("/Instructor")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class InstructorServicio {

    @EJB
    private InstructorLogica logica;

    @Context
    private HttpServletRequest request;
    
    /**
     * @return retorna la lista de instructores de acuerdo al rol
     * @generated
     */
    @GET
    public List<InstructorDTO> obtenerTodosInstructors() {
        String idCia=(String) request.getSession().getAttribute("id_cia");
        //validar rol de superadminstrador runt
        return logica.obtenerPorCIA(new Long(idCia));
    }

    /**
     * @generated
     */
    @GET
    @Path("/{id}")
    public InstructorDTO obtenerInstructor(@PathParam("id") Long id) {
        //validar que solo puede ver los instructores que tiene acceso
        return logica.obtener(id);
    }

    /**
     * @generated
     */
    @POST
    public InstructorDTO guardarInstructor(InstructorDTO dto) {
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
    public void borrarInstructor(@PathParam("id") Long id) {
        logica.borrar(id);
    }

}
