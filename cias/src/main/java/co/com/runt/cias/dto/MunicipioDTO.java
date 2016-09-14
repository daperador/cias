package co.com.runt.cias.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
 * @generated
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MunicipioDTO {

    public MunicipioDTO() {
        //constructor base
    }

    public MunicipioDTO(Long id) {
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
    private String nombre;

    /**
     * @generated
     */
    private DepartamentoDTO departamento;

    /**
     * @generated
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @generated
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @generated
     */
    public DepartamentoDTO getDepartamento() {
        return this.departamento;
    }

    /**
     * @generated
     */
    public void setDepartamento(DepartamentoDTO departamento) {
        this.departamento = departamento;
    }

}
