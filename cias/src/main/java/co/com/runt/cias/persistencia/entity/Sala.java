package co.com.runt.cias.persistencia.entity;

import javax.persistence.*;

/**
 * @generated
 */
@Entity
@Table(name = "CI_Sala")//, schema="${schema}")
@NamedQueries({
    @NamedQuery(name = "Sala.obtenerTodos", query = "select e from Sala e")
})
public class Sala {

    @Id
    //@Column(name = "Sala_id")
    @GeneratedValue(generator = "SalaGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SalaGen", sequenceName = "Sala_SEQ", allocationSize = 1)
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
    //@Column(name = "capacidad")
    private Integer capacidad;

    /**
     * @generated 0-1-false
     */
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER)
    private Empresa sede;

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
    public Integer getCapacidad() {
        return this.capacidad;
    }

    /**
     * @generated
     */
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @generated
     */
    public Empresa getSede() {
        return this.sede;
    }

    /**
     * @generated
     */
    public void setSede(Empresa sede) {
        this.sede = sede;
    }

}
