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
public class VinculacionLogica {

    @EJB
    private VinculacionDAO persistencia;

    private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * @generated
     */
    public List<VinculacionDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @generated
     */
    public VinculacionDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * @generated
     */
    public VinculacionDTO guardar(VinculacionDTO dto) {
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
    public void actualizar(VinculacionDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    private Vinculacion convertirDTO(VinculacionDTO dto) {
        if (dto == null) {
            return null;
        }
        Vinculacion entidad = new Vinculacion();
        entidad.setId(dto.getId());
        if (dto.getFechaInicio() != null) {
            try {
                entidad.setFechaInicio(fecha.parse(dto.getFechaInicio()));
            } catch (ParseException ex) {
                throw new RuntimeException("Error al convertir la fecha FechaInicio " + dto.getFechaInicio());
            }
        }
        if (dto.getFechaFin() != null) {
            try {
                entidad.setFechaFin(fecha.parse(dto.getFechaFin()));
            } catch (ParseException ex) {
                throw new RuntimeException("Error al convertir la fecha FechaFin " + dto.getFechaFin());
            }
        }

        return entidad;
    }

    /**
     * @generated
     */
    private List<Vinculacion> convertirDTO(List<VinculacionDTO> dtos) {
        List<Vinculacion> entidades = new ArrayList<Vinculacion>();
        for (VinculacionDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    private VinculacionDTO convertirEntidad(Vinculacion entidad) {
        VinculacionDTO dto = new VinculacionDTO();
        dto.setId(entidad.getId());
        if (entidad.getFechaInicio() != null) {
            dto.setFechaInicio(fecha.format(entidad.getFechaInicio()));
        }
        if (entidad.getFechaFin() != null) {
            dto.setFechaFin(fecha.format(entidad.getFechaFin()));
        }

        return dto;
    }

    /**
     * @generated
     */
    private List<VinculacionDTO> convertirEntidad(List<Vinculacion> entidades) {
        List<VinculacionDTO> dtos = new ArrayList<VinculacionDTO>();
        for (Vinculacion entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
