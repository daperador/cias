package co.com.runt.cias.logica;

import co.com.runt.cias.dto.*;
import co.com.runt.cias.persistencia.*;
import co.com.runt.cias.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * @generated
 */
@Stateless
public class InstructorLogica {

    @EJB
    private InstructorDAO persistencia;

    /**
     * @generated
     */
    public List<InstructorDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }
    
    /**
     * Obtiene la lista de instructores por CIA
     * @param idCia identificador del cia
     * @return lista de instructores que tiene el CIA
     */
    public List<InstructorDTO> obtenerPorCIA(Long idCia) {
        return convertirEntidad(persistencia.obtenerPorCIA(idCia));
    }

    /**
     * @generated
     */
    public InstructorDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * @generated
     */
    public InstructorDTO guardar(InstructorDTO dto) {
        return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
    }

    /**
     * @generated
     */
    public void borrar(Long id) {
        persistencia.borrar(id);
    }

    /**
     * @generated
     */
    public void actualizar(InstructorDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    private Instructor convertirDTO(InstructorDTO dto) {
        if (dto == null) {
            return null;
        }
        Instructor entidad = new Instructor();
        entidad.setId(dto.getId());

        if (dto.getPersonaNatural() != null) {
            entidad.setPersonaNatural(new PersonaNatural());
            entidad.getPersonaNatural().setId(dto.getPersonaNatural().getId());
        }

        return entidad;
    }

    /**
     * @generated
     */
    private List<Instructor> convertirDTO(List<InstructorDTO> dtos) {
        List<Instructor> entidades = new ArrayList<Instructor>();
        for (InstructorDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    private InstructorDTO convertirEntidad(Instructor entidad) {
        InstructorDTO dto = new InstructorDTO();
        dto.setId(entidad.getId());

        if (entidad.getPersonaNatural() != null) {
            dto.setPersonaNatural(
                    new PersonaNaturalDTO(
                            entidad.getPersonaNatural().getId()));
        }

        return dto;
    }

    /**
     * @generated
     */
    private List<InstructorDTO> convertirEntidad(List<Instructor> entidades) {
        List<InstructorDTO> dtos = new ArrayList<InstructorDTO>();
        for (Instructor entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
