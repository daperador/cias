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
public class EmpresaLogica {

    @EJB
    private EmpresaDAO persistencia;

    /**
     * @generated
     */
    public List<EmpresaDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @generated
     */
    public EmpresaDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * @generated
     */
    public EmpresaDTO guardar(EmpresaDTO dto) {
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
    public void actualizar(EmpresaDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    private Empresa convertirDTO(EmpresaDTO dto) {
        if (dto == null) {
            return null;
        }
        Empresa entidad = new Empresa();
        entidad.setId(dto.getId());
        entidad.setRazonSocial(dto.getRazonSocial());
        entidad.setEstado(dto.getEstado());

        if (dto.getMunicipio() != null) {
            entidad.setMunicipio(new Municipio());
            entidad.getMunicipio().setId(dto.getMunicipio().getId());
        }
        if (dto.getPersona() != null) {
            entidad.setPersona(new Persona());
            entidad.getPersona().setId(dto.getPersona().getId());
        }

        return entidad;
    }

    /**
     * @generated
     */
    private List<Empresa> convertirDTO(List<EmpresaDTO> dtos) {
        List<Empresa> entidades = new ArrayList<Empresa>();
        for (EmpresaDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    private EmpresaDTO convertirEntidad(Empresa entidad) {
        EmpresaDTO dto = new EmpresaDTO();
        dto.setId(entidad.getId());
        dto.setRazonSocial(entidad.getRazonSocial());
        dto.setEstado(entidad.getEstado());

        if (entidad.getMunicipio() != null) {
            dto.setMunicipio(
                    new MunicipioDTO(
                            entidad.getMunicipio().getId()));
            dto.getMunicipio().setNombre(entidad.getMunicipio().getNombre());
        }
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
    private List<EmpresaDTO> convertirEntidad(List<Empresa> entidades) {
        List<EmpresaDTO> dtos = new ArrayList<EmpresaDTO>();
        for (Empresa entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
