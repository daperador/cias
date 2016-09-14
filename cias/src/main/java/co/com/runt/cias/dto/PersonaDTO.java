package co.com.runt.cias.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
 * @generated
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonaDTO {

    public PersonaDTO() {
        //constructor base
    }

    public PersonaDTO(Long id) {
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
    private String numeroDocumento;

    /**
     * @generated
     */
    private String estado;

    /**
     * @generated
     */
    private TipoDocumentoDTO tipoDocumento;

    /**
     * @generated
     */
    public String getNumeroDocumento() {
        return this.numeroDocumento;
    }

    /**
     * @generated
     */
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
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
    public TipoDocumentoDTO getTipoDocumento() {
        return this.tipoDocumento;
    }

    /**
     * @generated
     */
    public void setTipoDocumento(TipoDocumentoDTO tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

}
