package co.com.runt.cias.persistencia.entity;

import javax.persistence.*;

/**
 * @generated
 */
@Entity
@Table(name = "PA_DEPARTAME", schema = "RUNTPROD")
@NamedQueries({
    @NamedQuery(name = "Departamento.obtenerTodos", query = "select e from Departamento e")
})
public class Departamento {

    @Id
    @Column(name = "DEPARTAME_CODDPTO")
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
    @Column(name = "DEPARTAME_NOMBRE")
    private String nombre;

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

}
