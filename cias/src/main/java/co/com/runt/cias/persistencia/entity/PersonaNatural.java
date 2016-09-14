package co.com.runt.cias.persistencia.entity;

import javax.persistence.*;

/**
 * @generated
 */
@Entity
@Table(name = "TR_PERSNATUR", schema="RUNTPROD")
@NamedQueries({
    @NamedQuery(name = "PersonaNatural.obtenerTodos", query = "select e from PersonaNatural e")
})
public class PersonaNatural {

    @Id
    @Column(name = "PERSNATUR_PERSONA_IDPERSONA")
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
    @Column(name = "PERSNATUR_NOMBRE1")
    private String primerNombre;

    /**
     * @generated 1-1-false
     */
    @Column(name = "PERSNATUR_NOMBRE2")
    private String segundoNombre;

    /**
     * @generated 1-1-false
     */
    @Column(name = "PERSNATUR_APELLIDO1")
    private String primerApellido;

    /**
     * @generated 1-1-false
     */
    @Column(name = "PERSNATUR_APELLIDO2")
    private String segundoApellido;

    /**
     * @generated 0-1-false
     */
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER)
    @JoinColumn(name = "PERSNATUR_PERSONA_IDPERSONA", updatable = false, insertable = false)
    private Persona persona;

    /**
     * @generated
     */
    public String getPrimerNombre() {
        return this.primerNombre;
    }

    /**
     * @generated
     */
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    /**
     * @generated
     */
    public String getSegundoNombre() {
        return this.segundoNombre;
    }

    /**
     * @generated
     */
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    /**
     * @generated
     */
    public String getPrimerApellido() {
        return this.primerApellido;
    }

    /**
     * @generated
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * @generated
     */
    public String getSegundoApellido() {
        return this.segundoApellido;
    }

    /**
     * @generated
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    /**
     * @generated
     */
    public Persona getPersona() {
        return this.persona;
    }

    /**
     * @generated
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
