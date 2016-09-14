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
public class TipoCertificacionLogica {

    @EJB
    private TipoCertificacionDAO persistencia;

    /**
     * @generated
     */
    public List<TipoCertificacionDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @generated
     */
    public TipoCertificacionDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * @generated
     */
    public TipoCertificacionDTO guardar(TipoCertificacionDTO dto) {
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
    public void actualizar(TipoCertificacionDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    private TipoCertificacion convertirDTO(TipoCertificacionDTO dto) {
        if (dto == null) {
            return null;
        }
        TipoCertificacion entidad = new TipoCertificacion();
        entidad.setId(dto.getId());
        entidad.setNombre(dto.getNombre());
        entidad.setEstado(dto.getEstado());

        return entidad;
    }

    /**
     * @generated
     */
    private List<TipoCertificacion> convertirDTO(List<TipoCertificacionDTO> dtos) {
        List<TipoCertificacion> entidades = new ArrayList<TipoCertificacion>();
        for (TipoCertificacionDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    private TipoCertificacionDTO convertirEntidad(TipoCertificacion entidad) {
        TipoCertificacionDTO dto = new TipoCertificacionDTO();
        dto.setId(entidad.getId());
        dto.setNombre(entidad.getNombre());
        dto.setEstado(entidad.getEstado());

        return dto;
    }

    /**
     * @generated
     */
    private List<TipoCertificacionDTO> convertirEntidad(List<TipoCertificacion> entidades) {
        List<TipoCertificacionDTO> dtos = new ArrayList<TipoCertificacionDTO>();
        for (TipoCertificacion entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
