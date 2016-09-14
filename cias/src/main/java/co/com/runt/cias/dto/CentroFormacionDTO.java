package co.com.runt.cias.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 * @generated
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CentroFormacionDTO {

    public CentroFormacionDTO() {
        //constructor base
    }

    public CentroFormacionDTO(Long id) {
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
    private String numeroResolucion;

    /**
     * @generated
     */
    private String fechaResolucion;

    /**
     * @generated
     */
    private EmpresaDTO empresa;

    /**
     * @generated
     */
    private EntidadAutorizadoraDTO entidadAutorizadora;

    /**
     * @generated
     */
    public String getNumeroResolucion() {
        return this.numeroResolucion;
    }

    /**
     * @generated
     */
    public void setNumeroResolucion(String numeroResolucion) {
        this.numeroResolucion = numeroResolucion;
    }

    /**
     * @generated
     */
    public String getFechaResolucion() {
        return this.fechaResolucion;
    }

    /**
     * @generated
     */
    public void setFechaResolucion(String fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    /**
     * @generated
     */
    public EmpresaDTO getEmpresa() {
        return this.empresa;
    }

    /**
     * @generated
     */
    public void setEmpresa(EmpresaDTO empresa) {
        this.empresa = empresa;
    }

    /**
     * @generated
     */
    public EntidadAutorizadoraDTO getEntidadAutorizadora() {
        return this.entidadAutorizadora;
    }

    /**
     * @generated
     */
    public void setEntidadAutorizadora(EntidadAutorizadoraDTO entidadAutorizadora) {
        this.entidadAutorizadora = entidadAutorizadora;
    }

}
