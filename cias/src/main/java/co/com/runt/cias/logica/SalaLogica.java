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
public class SalaLogica {

    @EJB
    private SalaDAO persistencia;

    /**
     * @generated
     */
    public List<SalaDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * @generated
     */
    public SalaDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * @generated
     */
    public SalaDTO guardar(SalaDTO dto) {
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
    public void actualizar(SalaDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * @generated
     */
    private Sala convertirDTO(SalaDTO dto) {
        if (dto == null) {
            return null;
        }
        Sala entidad = new Sala();
        entidad.setId(dto.getId());
        entidad.setNumero(dto.getNumero());
        entidad.setCapacidad(dto.getCapacidad());

        if (dto.getSede() != null) {
            entidad.setSede(new Empresa());
            entidad.getSede().setId(dto.getSede().getId());
        }

        return entidad;
    }

    /**
     * @generated
     */
    private List<Sala> convertirDTO(List<SalaDTO> dtos) {
        List<Sala> entidades = new ArrayList<Sala>();
        for (SalaDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * @generated
     */
    private SalaDTO convertirEntidad(Sala entidad) {
        SalaDTO dto = new SalaDTO();
        dto.setId(entidad.getId());
        dto.setNumero(entidad.getNumero());
        dto.setCapacidad(entidad.getCapacidad());

        if (entidad.getSede() != null) {
            dto.setSede(
                    new EmpresaDTO(
                            entidad.getSede().getId()));
        }

        return dto;
    }

    /**
     * @generated
     */
    private List<SalaDTO> convertirEntidad(List<Sala> entidades) {
        List<SalaDTO> dtos = new ArrayList<SalaDTO>();
        for (Sala entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
