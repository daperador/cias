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
public class MunicipioLogica {

    @EJB
    private MunicipioDAO persistencia;

    /**
     * @generated
     */
    public List<MunicipioDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @generated
     */
    public MunicipioDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * @generated
     */
    public MunicipioDTO guardar(MunicipioDTO dto) {
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
    public void actualizar(MunicipioDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    private Municipio convertirDTO(MunicipioDTO dto) {
        if (dto == null) {
            return null;
        }
        Municipio entidad = new Municipio();
        entidad.setId(dto.getId());
        entidad.setNombre(dto.getNombre());

        if (dto.getDepartamento() != null) {
            entidad.setDepartamento(new Departamento());
            entidad.getDepartamento().setId(dto.getDepartamento().getId());
        }

        return entidad;
    }

    /**
     * @generated
     */
    private List<Municipio> convertirDTO(List<MunicipioDTO> dtos) {
        List<Municipio> entidades = new ArrayList<Municipio>();
        for (MunicipioDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    private MunicipioDTO convertirEntidad(Municipio entidad) {
        MunicipioDTO dto = new MunicipioDTO();
        dto.setId(entidad.getId());
        dto.setNombre(entidad.getNombre());

        if (entidad.getDepartamento() != null) {
            dto.setDepartamento(
                    new DepartamentoDTO(
                            entidad.getDepartamento().getId()));
            dto.getDepartamento().setNombre(entidad.getDepartamento().getNombre());
        }

        return dto;
    }

    /**
     * @generated
     */
    private List<MunicipioDTO> convertirEntidad(List<Municipio> entidades) {
        List<MunicipioDTO> dtos = new ArrayList<MunicipioDTO>();
        for (Municipio entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
