package co.com.runt.cias.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 * @generated
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CertificacionDTO {

    public CertificacionDTO() {
        //constructor base
    }

    public CertificacionDTO(Long id) {
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
    private String fecha;

    /**
     * @generated
     */
    private String folio;

    /**
     * @generated
     */
    private String libro;

    /**
     * @generated
     */
    private String titulo;

    /**
     * @generated
     */
    private CentroFormacionDTO centroFormacion;

    /**
     * @generated
     */
    private TipoCertificacionDTO tipoCertificacion;

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
    public String getFolio() {
        return this.folio;
    }

    /**
     * @generated
     */
    public void setFolio(String folio) {
        this.folio = folio;
    }

    /**
     * @generated
     */
    public String getLibro() {
        return this.libro;
    }

    /**
     * @generated
     */
    public void setLibro(String libro) {
        this.libro = libro;
    }

    /**
     * @generated
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * @generated
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @generated
     */
    public TipoCertificacionDTO getTipoCertificacion() {
        return this.tipoCertificacion;
    }

    /**
     * @generated
     */
    public void setTipoCertificacion(TipoCertificacionDTO tipoCertificacion) {
        this.tipoCertificacion = tipoCertificacion;
    }

    /**
     * @generated
     */
    public CentroFormacionDTO getCentroFormacion() {
        return this.centroFormacion;
    }

    /**
     * @generated
     */
    public void setCentroFormacion(CentroFormacionDTO centroFormacion) {
        this.centroFormacion = centroFormacion;
    }

}
