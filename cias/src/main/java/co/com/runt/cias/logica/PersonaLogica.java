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
public class PersonaLogica {

    @EJB
    private PersonaDAO persistencia;

    /**
     * @generated
     */
    public List<PersonaDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @generated
     */
    public PersonaDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * @generated
     */
    public PersonaDTO guardar(PersonaDTO dto) {
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
    public void actualizar(PersonaDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    private Persona convertirDTO(PersonaDTO dto) {
        if (dto == null) {
            return null;
        }
        Persona entidad = new Persona();
        entidad.setId(dto.getId());
        entidad.setNumeroDocumento(dto.getNumeroDocumento());
        entidad.setEstado(dto.getEstado());

        if (dto.getTipoDocumento() != null) {
            entidad.setTipoDocumento(new TipoDocumento());
            entidad.getTipoDocumento().setId(dto.getTipoDocumento().getId());
        }

        return entidad;
    }

    /**
     * @generated
     */
    private List<Persona> convertirDTO(List<PersonaDTO> dtos) {
        List<Persona> entidades = new ArrayList<Persona>();
        for (PersonaDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    private PersonaDTO convertirEntidad(Persona entidad) {
        PersonaDTO dto = new PersonaDTO();
        dto.setId(entidad.getId());
        dto.setNumeroDocumento(entidad.getNumeroDocumento());
        dto.setEstado(entidad.getEstado());

        if (entidad.getTipoDocumento() != null) {
            dto.setTipoDocumento(
                    new TipoDocumentoDTO(
                            entidad.getTipoDocumento().getId()));
            dto.getTipoDocumento().setNombre(entidad.getTipoDocumento().getNombre());
        }

        return dto;
    }

    /**
     * @generated
     */
    private List<PersonaDTO> convertirEntidad(List<Persona> entidades) {
        List<PersonaDTO> dtos = new ArrayList<PersonaDTO>();
        for (Persona entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
