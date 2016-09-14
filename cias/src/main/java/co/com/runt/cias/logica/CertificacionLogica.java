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
public class CertificacionLogica {

    @EJB
    private CertificacionDAO persistencia;

    private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * @generated
     */
    public List<CertificacionDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @generated
     */
    public CertificacionDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * @generated
     */
    public CertificacionDTO guardar(CertificacionDTO dto) {
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
    public void actualizar(CertificacionDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    private Certificacion convertirDTO(CertificacionDTO dto) {
        if (dto == null) {
            return null;
        }
        Certificacion entidad = new Certificacion();
        entidad.setId(dto.getId());
        entidad.setNumero(dto.getNumero());
        if (dto.getFecha() != null) {
            try {
                entidad.setFecha(fecha.parse(dto.getFecha()));
            } catch (ParseException ex) {
                throw new RuntimeException("Error al convertir la fecha Fecha " + dto.getFecha());
            }
        }
        entidad.setFolio(dto.getFolio());
        entidad.setLibro(dto.getLibro());
        entidad.setTitulo(dto.getTitulo());

        if (dto.getTipoCertificacion() != null) {
            entidad.setTipoCertificacion(new TipoCertificacion());
            entidad.getTipoCertificacion().setId(dto.getTipoCertificacion().getId());
        }
        if (dto.getCentroFormacion() != null) {
            entidad.setCentroFormacion(new CentroFormacion());
            entidad.getCentroFormacion().setId(dto.getCentroFormacion().getId());
        }

        return entidad;
    }

    /**
     * @generated
     */
    private List<Certificacion> convertirDTO(List<CertificacionDTO> dtos) {
        List<Certificacion> entidades = new ArrayList<Certificacion>();
        for (CertificacionDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    private CertificacionDTO convertirEntidad(Certificacion entidad) {
        CertificacionDTO dto = new CertificacionDTO();
        dto.setId(entidad.getId());
        dto.setNumero(entidad.getNumero());
        if (entidad.getFecha() != null) {
            dto.setFecha(fecha.format(entidad.getFecha()));
        }
        dto.setFolio(entidad.getFolio());
        dto.setLibro(entidad.getLibro());
        dto.setTitulo(entidad.getTitulo());

        if (entidad.getTipoCertificacion() != null) {
            dto.setTipoCertificacion(
                    new TipoCertificacionDTO(
                            entidad.getTipoCertificacion().getId()));
            dto.getTipoCertificacion().setNombre(entidad.getTipoCertificacion().getNombre());
        }
        if (entidad.getCentroFormacion() != null) {
            dto.setCentroFormacion(
                    new CentroFormacionDTO(
                            entidad.getCentroFormacion().getId()));
        }

        return dto;
    }

    /**
     * @generated
     */
    private List<CertificacionDTO> convertirEntidad(List<Certificacion> entidades) {
        List<CertificacionDTO> dtos = new ArrayList<CertificacionDTO>();
        for (Certificacion entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
