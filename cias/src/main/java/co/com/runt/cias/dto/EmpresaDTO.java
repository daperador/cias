package co.com.runt.cias.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
 * @generated
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmpresaDTO {

    public EmpresaDTO() {
        //constructor base
    }

    public EmpresaDTO(Long id) {
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
    private String razonSocial;

    /**
     * @generated
     */
    private String estado;

    /**
     * @generated
     */
    private MunicipioDTO municipio;

    /**
     * @generated
     */
    private PersonaDTO persona;

    /**
     * @generated
     */
    public String getRazonSocial() {
        return this.razonSocial;
    }

    /**
     * @generated
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * @generated
     */
    public String getEstado() {
        return this.estado;
    }

    /**
     * @generated
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @generated
     */
    public MunicipioDTO getMunicipio() {
        return this.municipio;
    }

    /**
     * @generated
     */
    public void setMunicipio(MunicipioDTO municipio) {
        this.municipio = municipio;
    }

    /**
     * @generated
     */
    public PersonaDTO getPersona() {
        return this.persona;
    }

    /**
     * @generated
     */
    public void setPersona(PersonaDTO persona) {
        this.persona = persona;
    }

}
