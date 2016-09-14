package co.com.runt.cias.persistencia.entity;

import javax.persistence.*;

/**
 * @generated
 */
@Entity
@Table(name = "PA_MUNICPIO", schema="RUNTPROD")
@NamedQueries({
    @NamedQuery(name = "Municipio.obtenerTodos", query = "select e from Municipio e")
})
public class Municipio {

    @Id
    @Column(name = "MUNICPIO_DIVIPOL")
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
    @Column(name = "MUNICPIO_NOMBRE")
    private String nombre;

    /**
     * @generated 0-1-false
     */
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER)
    @JoinColumn(name = "MUNICPIO_DEPARTAME_CODDPTO")
    private Departamento departamento;

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
    public Departamento getDepartamento() {
        return this.departamento;
    }

    /**
     * @generated
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

}
