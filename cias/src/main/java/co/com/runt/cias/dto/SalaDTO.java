package co.com.runt.cias.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
 * @generated
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SalaDTO {

    public SalaDTO() {
        //constructor base
    }

    public SalaDTO(Long id) {
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
    private String numero;

    /**
     * @generated
     */
    private Integer capacidad;

    /**
     * @generated
     */
    private EmpresaDTO sede;

    /**
     * @generated
     */
    public String getNumero() {
        return this.numero;
    }

    /**
     * @generated
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @generated
     */
    public Integer getCapacidad() {
        return this.capacidad;
    }

    /**
     * @generated
     */
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @generated
     */
    public EmpresaDTO getSede() {
        return this.sede;
    }

    /**
     * @generated
     */
    public void setSede(EmpresaDTO sede) {
        this.sede = sede;
    }

}
