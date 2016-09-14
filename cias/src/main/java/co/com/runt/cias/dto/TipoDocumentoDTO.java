package co.com.runt.cias.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
 * @generated
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TipoDocumentoDTO {

    public TipoDocumentoDTO() {
        //constructor base
    }

    public TipoDocumentoDTO(Long id) {
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
    private String abreviatura;

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
    public String getAbreviatura() {
        return this.abreviatura;
    }

    /**
     * @generated
     */
    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

}
