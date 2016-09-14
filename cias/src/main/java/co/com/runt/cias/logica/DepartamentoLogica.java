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
public class DepartamentoLogica {

    @EJB
    private DepartamentoDAO persistencia;

    /**
     * @generated
     */
    public List<DepartamentoDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @generated
     */
    public DepartamentoDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * @generated
     */
    public DepartamentoDTO guardar(DepartamentoDTO dto) {
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
    public void actualizar(DepartamentoDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    private Departamento convertirDTO(DepartamentoDTO dto) {
        if (dto == null) {
            return null;
        }
        Departamento entidad = new Departamento();
        entidad.setId(dto.getId());
        entidad.setNombre(dto.getNombre());

        return entidad;
    }

    /**
     * @generated
     */
    private List<Departamento> convertirDTO(List<DepartamentoDTO> dtos) {
        List<Departamento> entidades = new ArrayList<Departamento>();
        for (DepartamentoDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    private DepartamentoDTO convertirEntidad(Departamento entidad) {
        DepartamentoDTO dto = new DepartamentoDTO();
        dto.setId(entidad.getId());
        dto.setNombre(entidad.getNombre());

        return dto;
    }

    /**
     * @generated
     */
    private List<DepartamentoDTO> convertirEntidad(List<Departamento> entidades) {
        List<DepartamentoDTO> dtos = new ArrayList<DepartamentoDTO>();
        for (Departamento entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
