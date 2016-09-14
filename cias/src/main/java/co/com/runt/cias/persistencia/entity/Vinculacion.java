package co.com.runt.cias.persistencia.entity;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.*;

/**
 * @generated
 */
@Entity
@Table(name = "CI_Vinculacion")//, schema="${schema}")
@NamedQueries({
    @NamedQuery(name = "Vinculacion.obtenerTodos", query = "select e from Vinculacion e")
})
public class Vinculacion {

    @Id
    //@Column(name = "Vinculacion_id")
    @GeneratedValue(generator = "VinculacionGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "VinculacionGen", sequenceName = "Vinculacion_SEQ", allocationSize = 1)
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
    @Temporal(TemporalType.DATE)
    //@Column(name = "fechaInicio")
    private Date fechaInicio;

    /**
     * @generated 1-1-false
     */
    @Temporal(TemporalType.DATE)
    //@Column(name = "fechaFin")
    private Date fechaFin;

    /**
     * @generated
     */
    public Date getFechaInicio() {
        return this.fechaInicio;
    }

    /**
     * @generated
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @generated
     */
    public Date getFechaFin() {
        return this.fechaFin;
    }

    /**
     * @generated
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

}
