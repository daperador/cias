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
public class TipoDocumentoLogica {

    @EJB
    private TipoDocumentoDAO persistencia;

    /**
     * @generated
     */
    public List<TipoDocumentoDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @generated
     */
    public TipoDocumentoDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * @generated
     */
    public TipoDocumentoDTO guardar(TipoDocumentoDTO dto) {
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
    public void actualizar(TipoDocumentoDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    private TipoDocumento convertirDTO(TipoDocumentoDTO dto) {
        if (dto == null) {
            return null;
        }
        TipoDocumento entidad = new TipoDocumento();
        entidad.setId(dto.getId());
        entidad.setNombre(dto.getNombre());
        entidad.setAbreviatura(dto.getAbreviatura());

        return entidad;
    }

    /**
     * @generated
     */
    private List<TipoDocumento> convertirDTO(List<TipoDocumentoDTO> dtos) {
        List<TipoDocumento> entidades = new ArrayList<TipoDocumento>();
        for (TipoDocumentoDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    private TipoDocumentoDTO convertirEntidad(TipoDocumento entidad) {
        TipoDocumentoDTO dto = new TipoDocumentoDTO();
        dto.setId(entidad.getId());
        dto.setNombre(entidad.getNombre());
        dto.setAbreviatura(entidad.getAbreviatura());

        return dto;
    }

    /**
     * @generated
     */
    private List<TipoDocumentoDTO> convertirEntidad(List<TipoDocumento> entidades) {
        List<TipoDocumentoDTO> dtos = new ArrayList<TipoDocumentoDTO>();
        for (TipoDocumento entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
