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
public class PersonaNaturalLogica {

    @EJB
    private PersonaNaturalDAO persistencia;

    /**
     * @generated
     */
    public List<PersonaNaturalDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @generated
     */
    public PersonaNaturalDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * @generated
     */
    public PersonaNaturalDTO guardar(PersonaNaturalDTO dto) {
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
    public void actualizar(PersonaNaturalDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    private PersonaNatural convertirDTO(PersonaNaturalDTO dto) {
        if (dto == null) {
            return null;
        }
        PersonaNatural entidad = new PersonaNatural();
        entidad.setId(dto.getId());
        entidad.setPrimerNombre(dto.getPrimerNombre());
        entidad.setSegundoNombre(dto.getSegundoNombre());
        entidad.setPrimerApellido(dto.getPrimerApellido());
        entidad.setSegundoApellido(dto.getSegundoApellido());

        if (dto.getPersona() != null) {
            entidad.setPersona(new Persona());
            entidad.getPersona().setId(dto.getPersona().getId());
        }

        return entidad;
    }

    /**
     * @generated
     */
    private List<PersonaNatural> convertirDTO(List<PersonaNaturalDTO> dtos) {
        List<PersonaNatural> entidades = new ArrayList<PersonaNatural>();
        for (PersonaNaturalDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    private PersonaNaturalDTO convertirEntidad(PersonaNatural entidad) {
        PersonaNaturalDTO dto = new PersonaNaturalDTO();
        dto.setId(entidad.getId());
        dto.setPrimerNombre(entidad.getPrimerNombre());
        dto.setSegundoNombre(entidad.getSegundoNombre());
        dto.setPrimerApellido(entidad.getPrimerApellido());
        dto.setSegundoApellido(entidad.getSegundoApellido());

        if (entidad.getPersona() != null) {
            dto.setPersona(
                    new PersonaDTO(
                            entidad.getPersona().getId()));
        }

        return dto;
    }

    /**
     * @generated
     */
    private List<PersonaNaturalDTO> convertirEntidad(List<PersonaNatural> entidades) {
        List<PersonaNaturalDTO> dtos = new ArrayList<PersonaNaturalDTO>();
        for (PersonaNatural entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
