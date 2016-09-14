package co.com.runt.cias.persistencia.entity;

import java.util.Date;
import javax.persistence.*;

/**
 * @generated
 */
@Entity
@Table(name = "CI_CentroFormacion")//, schema="${schema}")
@NamedQueries({
    @NamedQuery(name = "CentroFormacion.obtenerTodos", query = "select e from CentroFormacion e")
})
public class CentroFormacion {

    @Id
    //@Column(name = "CentroFormacion_id")
    @GeneratedValue(generator = "CentroFormacionGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "CentroFormacionGen", sequenceName = "CentroFormacion_SEQ", allocationSize = 1)
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
    //@Column(name = "numeroResolucion")
    private String numeroResolucion;

    /**
     * @generated 1-1-false
     */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fechaResolucion")
    private Date fechaResolucion;

    /**
     * @generated 0-1-false
     */
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER)
    private Empresa empresa;

    /**
     * @generated 0-1-false
     */
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER)
    private EntidadAutorizadora entidadAutorizadora;

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
    public Date getFechaResolucion() {
        return this.fechaResolucion;
    }

    /**
     * @generated
     */
    public void setFechaResolucion(Date fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    /**
     * @generated
     */
    public Empresa getEmpresa() {
        return this.empresa;
    }

    /**
     * @generated
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * @generated
     */
    public EntidadAutorizadora getEntidadAutorizadora() {
        return this.entidadAutorizadora;
    }

    /**
     * @generated
     */
    public void setEntidadAutorizadora(EntidadAutorizadora entidadAutorizadora) {
        this.entidadAutorizadora = entidadAutorizadora;
    }

}
