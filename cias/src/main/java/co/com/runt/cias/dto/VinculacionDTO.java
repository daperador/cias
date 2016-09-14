package co.com.runt.cias.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 * @generated
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class VinculacionDTO {

    public VinculacionDTO() {
        //constructor base
    }

    public VinculacionDTO(Long id) {
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
    private String fechaInicio;

    /**
     * @generated
     */
    private String fechaFin;

    /**
     * @generated
     */
    public String getFechaInicio() {
        return this.fechaInicio;
    }

    /**
     * @generated
     */
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @generated
     */
    public String getFechaFin() {
        return this.fechaFin;
    }

    /**
     * @generated
     */
    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

}
