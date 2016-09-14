package co.com.runt.cias.persistencia.entity;

import javax.persistence.*;

/**
 * @generated
 */
@Entity
@Table(name = "PA_TIPOIDENT", schema="RUNTPROD")
@NamedQueries({
    @NamedQuery(name = "TipoDocumento.obtenerTodos", query = "select e from TipoDocumento e")
})
public class TipoDocumento {

    @Id
    @Column(name = "TIPOIDENT_IDTIPIDE")
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
    @Column(name = "TIPOIDENT_NOMBRE")
    private String nombre;

    /**
     * @generated 1-1-false
     */
    @Column(name = "TIPOIDENT_VISUALIZA")
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
