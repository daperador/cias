package co.com.runt.cias.logica;

import co.com.runt.cias.dto.*;
import co.com.runt.cias.persistencia.*;
import co.com.runt.cias.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @generated
 */
@Stateless
public class CentroFormacionLogica {

    @EJB
    private CentroFormacionDAO persistencia;

    private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * @generated
     */
    public List<CentroFormacionDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @generated
     */
    public CentroFormacionDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * @generated
     */
    public CentroFormacionDTO guardar(CentroFormacionDTO dto) {
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
    public void actualizar(CentroFormacionDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    private CentroFormacion convertirDTO(CentroFormacionDTO dto) {
        if (dto == null) {
            return null;
        }
        CentroFormacion entidad = new CentroFormacion();
        entidad.setId(dto.getId());
        entidad.setNumeroResolucion(dto.getNumeroResolucion());
        if (dto.getFechaResolucion() != null) {
            try {
                entidad.setFechaResolucion(fecha.parse(dto.getFechaResolucion()));
            } catch (ParseException ex) {
                throw new RuntimeException("Error al convertir la fecha FechaResolucion " + dto.getFechaResolucion());
            }
        }

        if (dto.getEntidadAutorizadora() != null) {
            entidad.setEntidadAutorizadora(new EntidadAutorizadora());
            entidad.getEntidadAutorizadora().setId(dto.getEntidadAutorizadora().getId());
        }
        if (dto.getEmpresa() != null) {
            entidad.setEmpresa(new Empresa());
            entidad.getEmpresa().setId(dto.getEmpresa().getId());
        }

        return entidad;
    }

    /**
     * @generated
     */
    private List<CentroFormacion> convertirDTO(List<CentroFormacionDTO> dtos) {
        List<CentroFormacion> entidades = new ArrayList<CentroFormacion>();
        for (CentroFormacionDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    private CentroFormacionDTO convertirEntidad(CentroFormacion entidad) {
        CentroFormacionDTO dto = new CentroFormacionDTO();
        dto.setId(entidad.getId());
        dto.setNumeroResolucion(entidad.getNumeroResolucion());
        if (entidad.getFechaResolucion() != null) {
            dto.setFechaResolucion(fecha.format(entidad.getFechaResolucion()));
        }

        if (entidad.getEntidadAutorizadora() != null) {
            dto.setEntidadAutorizadora(
                    new EntidadAutorizadoraDTO(
                            entidad.getEntidadAutorizadora().getId()));
            dto.getEntidadAutorizadora().setNombre(entidad.getEntidadAutorizadora().getNombre());
        }
        if (entidad.getEmpresa() != null) {
            dto.setEmpresa(
                    new EmpresaDTO(
                            entidad.getEmpresa().getId()));
        }

        return dto;
    }

    /**
     * @generated
     */
    private List<CentroFormacionDTO> convertirEntidad(List<CentroFormacion> entidades) {
        List<CentroFormacionDTO> dtos = new ArrayList<CentroFormacionDTO>();
        for (CentroFormacion entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
