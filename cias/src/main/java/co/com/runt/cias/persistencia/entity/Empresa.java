package co.com.runt.cias.persistencia.entity;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

/**
 * @generated
 */
@Entity
@Table(name = "GE_EMPRESA", schema="RUNTPROD")
@NamedQueries({
    @NamedQuery(name = "Empresa.obtenerTodos", query = "select e from Empresa e")
})
public class Empresa {

    @Id
    @Column(name = "EMPRESA_PERSONA_IDPERSONA")
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
    @Column(name = "EMPRESA_RAZOSOCIA")
    private String razonSocial;

    /**
     * @generated 1-1-false
     */
    @Column(name = "EMPRESA_ESTAEMPRE_NOMBRE")
    private String estado;

    /**
     * @generated 0-1-false
     */
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER)
    @JoinColumn(name = "EMPRESA_MUNICIPIO_IDMUNICIP")
    private Municipio municipio;

    /**
     * @generated 0-1-false
     */
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER)
    @JoinColumn(name = "EMPRESA_PERSONA_IDPERSONA", updatable = false)
    private Persona persona;

    /**
     * @generated
     */
    public String getRazonSocial() {
        return this.razonSocial;
    }

    /**
     * @generated
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * @generated
     */
    public String getEstado() {
        return this.estado;
    }

    /**
     * @generated
     */
    public void setEstado(String estado) {
        this.estado = estado;
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

    /**
     * @generated
     */
    public Municipio getMunicipio() {
        return this.municipio;
    }

    /**
     * @generated
     */
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

}
