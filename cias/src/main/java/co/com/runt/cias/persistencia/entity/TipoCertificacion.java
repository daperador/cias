package co.com.runt.cias.persistencia.entity;

import javax.persistence.*;

/**
 * @generated
 */
@Entity
@Table(name = "CI_TipoCertificacion")//, schema="${schema}")
@NamedQueries({
    @NamedQuery(name = "TipoCertificacion.obtenerTodos", query = "select e from TipoCertificacion e")
})
public class TipoCertificacion {

    @Id
    //@Column(name = "TipoCertificacion_id")
    @GeneratedValue(generator = "TipoCertificacionGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "TipoCertificacionGen", sequenceName = "TipoCertificacion_SEQ", allocationSize = 1)
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
    //@Column(name = "nombre")
    private String nombre;

    /**
     * @generated 1-1-false
     */
    //@Column(name = "estado")
    private Boolean estado;

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
    public Boolean getEstado() {
        return this.estado;
    }

    /**
     * @generated
     */
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

}
