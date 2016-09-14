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
public class CursoLogica {

    @EJB
    private CursoDAO persistencia;

    private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * @generated
     */
    public List<CursoDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @generated
     */
    public CursoDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * @generated
     */
    public CursoDTO guardar(CursoDTO dto) {
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
    public void actualizar(CursoDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    private Curso convertirDTO(CursoDTO dto) {
        if (dto == null) {
            return null;
        }
        Curso entidad = new Curso();
        entidad.setId(dto.getId());
        if (dto.getFecha() != null) {
            try {
                entidad.setFecha(fecha.parse(dto.getFecha()));
            } catch (ParseException ex) {
                throw new RuntimeException("Error al convertir la fecha Fecha " + dto.getFecha());
            }
        }
        entidad.setHoraInicio(dto.getHoraInicio());
        entidad.setHoraFin(dto.getHoraFin());

        if (dto.getSala() != null) {
            entidad.setSala(new Sala());
            entidad.getSala().setId(dto.getSala().getId());
        }
        if (dto.getInstructor() != null) {
            entidad.setInstructor(new Instructor());
            entidad.getInstructor().setId(dto.getInstructor().getId());
        }

        return entidad;
    }

    /**
     * @generated
     */
    private List<Curso> convertirDTO(List<CursoDTO> dtos) {
        List<Curso> entidades = new ArrayList<Curso>();
        for (CursoDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    private CursoDTO convertirEntidad(Curso entidad) {
        CursoDTO dto = new CursoDTO();
        dto.setId(entidad.getId());
        if (entidad.getFecha() != null) {
            dto.setFecha(fecha.format(entidad.getFecha()));
        }
        dto.setHoraInicio(entidad.getHoraInicio());
        dto.setHoraFin(entidad.getHoraFin());

        if (entidad.getSala() != null) {
            dto.setSala(
                    new SalaDTO(
                            entidad.getSala().getId()));
        }
        if (entidad.getInstructor() != null) {
            dto.setInstructor(
                    new InstructorDTO(
                            entidad.getInstructor().getId()));
        }

        return dto;
    }

    /**
     * @generated
     */
    private List<CursoDTO> convertirEntidad(List<Curso> entidades) {
        List<CursoDTO> dtos = new ArrayList<CursoDTO>();
        for (Curso entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
