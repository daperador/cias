package co.com.runt.cias.persistencia.entity;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.*;

/**
 * @generated
 */
@Entity
@Table(name = "CI_Certificacion")//, schema="${schema}")
@NamedQueries({
    @NamedQuery(name = "Certificacion.obtenerTodos", query = "select e from Certificacion e")
})
public class Certificacion {

    @Id
    //@Column(name = "Certificacion_id")
    @GeneratedValue(generator = "CertificacionGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "CertificacionGen", sequenceName = "Certificacion_SEQ", allocationSize = 1)
    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @generated 1-1-false
     */
    //@Column(name = "numero")
    private String numero;

    /**
     * @generated 1-1-false
     */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fecha")
    private Date fecha;

    /**
     * @generated 1-1-false
     */
    //@Column(name = "folio")
    private String folio;

    /**
     * @generated 1-1-false
     */
    //@Column(name = "libro")
    private String libro;

    /**
     * @generated 1-1-false
     */
    //@Column(name = "titulo")
    private String titulo;

    /**
     * @generated 0-1-false
     */
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER)
    private TipoCertificacion tipoCertificacion;

    /**
     * @generated 0-1-false
     */
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER)
    private CentroFormacion centroFormacion;

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
    public Date getFecha() {
        return this.fecha;
    }

    /**
     * @generated
     */
    public void setFecha(Date fecha) {
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
    public CentroFormacion getCentroFormacion() {
        return this.centroFormacion;
    }

    /**
     * @generated
     */
    public void setCentroFormacion(CentroFormacion centroFormacion) {
        this.centroFormacion = centroFormacion;
    }

    /**
     * @generated
     */
    public TipoCertificacion getTipoCertificacion() {
        return this.tipoCertificacion;
    }

    /**
     * @generated
     */
    public void setTipoCertificacion(TipoCertificacion tipoCertificacion) {
        this.tipoCertificacion = tipoCertificacion;
    }

}
