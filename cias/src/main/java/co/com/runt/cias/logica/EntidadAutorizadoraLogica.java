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
public class EntidadAutorizadoraLogica {

    @EJB
    private EntidadAutorizadoraDAO persistencia;

    /**
     * @generated
     */
    public List<EntidadAutorizadoraDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @generated
     */
    public EntidadAutorizadoraDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * @generated
     */
    public EntidadAutorizadoraDTO guardar(EntidadAutorizadoraDTO dto) {
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
    public void actualizar(EntidadAutorizadoraDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    private EntidadAutorizadora convertirDTO(EntidadAutorizadoraDTO dto) {
        if (dto == null) {
            return null;
        }
        EntidadAutorizadora entidad = new EntidadAutorizadora();
        entidad.setId(dto.getId());
        entidad.setNombre(dto.getNombre());
        entidad.setEstado(dto.getEstado());

        return entidad;
    }

    /**
     * @generated
     */
    private List<EntidadAutorizadora> convertirDTO(List<EntidadAutorizadoraDTO> dtos) {
        List<EntidadAutorizadora> entidades = new ArrayList<EntidadAutorizadora>();
        for (EntidadAutorizadoraDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    private EntidadAutorizadoraDTO convertirEntidad(EntidadAutorizadora entidad) {
        EntidadAutorizadoraDTO dto = new EntidadAutorizadoraDTO();
        dto.setId(entidad.getId());
        dto.setNombre(entidad.getNombre());
        dto.setEstado(entidad.getEstado());

        return dto;
    }

    /**
     * @generated
     */
    private List<EntidadAutorizadoraDTO> convertirEntidad(List<EntidadAutorizadora> entidades) {
        List<EntidadAutorizadoraDTO> dtos = new ArrayList<EntidadAutorizadoraDTO>();
        for (EntidadAutorizadora entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
