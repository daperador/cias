package co.com.runt.cias.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 * @generated
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CursoDTO {

    public CursoDTO() {
        //constructor base
    }

    public CursoDTO(Long id) {
        this.id = id;
    }

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @generated
     */
    private String fecha;

    /**
     * @generated
     */
    private Integer horaInicio;

    /**
     * @generated
     */
    private Integer horaFin;

    /**
     * @generated
     */
    private SalaDTO sala;

    /**
     * @generated
     */
    private InstructorDTO instructor;

    /**
     * @generated
     */
    public String getFecha() {
        return this.fecha;
    }

    /**
     * @generated
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @generated
     */
    public Integer getHoraInicio() {
        return this.horaInicio;
    }

    /**
     * @generated
     */
    public void setHoraInicio(Integer horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @generated
     */
    public Integer getHoraFin() {
        return this.horaFin;
    }

    /**
     * @generated
     */
    public void setHoraFin(Integer horaFin) {
        this.horaFin = horaFin;
    }

    /**
     * @generated
     */
    public InstructorDTO getInstructor() {
        return this.instructor;
    }

    /**
     * @generated
     */
    public void setInstructor(InstructorDTO instructor) {
        this.instructor = instructor;
    }

    /**
     * @generated
     */
    public SalaDTO getSala() {
        return this.sala;
    }

    /**
     * @generated
     */
    public void setSala(SalaDTO sala) {
        this.sala = sala;
    }

}
