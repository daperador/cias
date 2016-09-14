package co.com.runt.cias.persistencia.entity;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

/**
 * @generated
 */
@Entity
@Table(name = "CI_INSTRUCTOR")//, schema="${schema}")
@NamedQueries({
    @NamedQuery(name = "Instructor.obtenerTodos", query = "select e from Instructor e"),
    @NamedQuery(name = "Instructor.obtenerPorCIA", query = "select e from Instructor e where e.empresa.id=:cia")
})
public class Instructor {

    @Id
    @Column(name = "INSTRUCTOR_ID")
    @GeneratedValue(generator = "InstructorGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "InstructorGen", sequenceName = "Instructor_SEQ", allocationSize = 1)
    private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @generated 0-1-false
     */
    @ManyToOne(cascade = {}, fetch = FetchType.EAGER)
    @JoinColumn(name = "INSTRUCTOR_PERSNATUR")
    private PersonaNatural personaNatural;

    /**
     * @generated 0--1-true
     */
    //@OneToMany(cascade={},fetch=javax.persistence.FetchType.LAZY)
    //private List<Vinculacion> vinculacion;
    /**
     * @generated 0--1-true
     */
    //@OneToMany(cascade={},fetch=javax.persistence.FetchType.LAZY)
    //private List<Certificacion> certificacion;

    /*public List<Vinculacion> getVinculacion(){
		if(vinculacion!=null){
			vinculacion=new ArrayList<Vinculacion>(); 
		}
		return this.vinculacion;
	}
	
	public void setVinculacion(List<Vinculacion> vinculacion){
		this.vinculacion=vinculacion;
	}*/
 /*public List<Certificacion> getCertificacion(){
		if(certificacion!=null){
			certificacion=new ArrayList<Certificacion>(); 
		}
		return this.certificacion;
	}
	
	public void setCertificacion(List<Certificacion> certificacion){
		this.certificacion=certificacion;
	}*/
    /**
     * @generated
     */
    public PersonaNatural getPersonaNatural() {
        return this.personaNatural;
    }

    /**
     * @generated
     */
    public void setPersonaNatural(PersonaNatural personaNatural) {
        this.personaNatural = personaNatural;
    }

}
