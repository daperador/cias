package co.com.runt.cias.persistencia.entity;

import java.util.Date;
import javax.persistence.*;

/**
 * @generated
 */
@Entity
@Table(name = "CI_Curso")//, schema="${schema}")
@NamedQueries({
    @NamedQuery(name = "Curso.obtenerTodos", query = "select e from Curso e")
})
public class Curso {

    @Id
    //@Column(name = "Curso_id")
    @GeneratedValue(generator = "CursoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "CursoGen", sequenceName = "Curso_SEQ", allocationSize = 1)
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
    //@Column(name = "fecha")
    private Date fecha;

    /**
     * @generated 1-1-false
     */
    //@Column(name = "horaInicio")
    private Integer horaInicio;

    /**
     * @generated 1-1-false
     */
    //@Column(name = "horaFin")
    private Integer horaFin;

    /**
     * @generated 0-1-false
     */
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER)
    private Instructor instructor;

    /**
     * @generated 0-1-false
     */
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER)
    private Sala sala;

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
    public Integer getHoraInicio() {
        return this.horaInicio;
    }

    /**
     * @generated
     */
    public void setHoraInicio(Integer horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @generated
     */
    public Integer getHoraFin() {
        return this.horaFin;
    }

    /**
     * @generated
     */
    public void setHoraFin(Integer horaFin) {
        this.horaFin = horaFin;
    }

    /**
     * @generated
     */
    public Instructor getInstructor() {
        return this.instructor;
    }

    /**
     * @generated
     */
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    /**
     * @generated
     */
    public Sala getSala() {
        return this.sala;
    }

    /**
     * @generated
     */
    public void setSala(Sala sala) {
        this.sala = sala;
    }

}
