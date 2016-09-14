package co.com.runt.cias.persistencia;

import co.com.runt.cias.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
 * @generated
 */
@Stateless
public class InstructorDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * @generated
     */
    public List<Instructor> obtenerTodos() {
        return em.createNamedQuery("Instructor.obtenerTodos").getResultList();
    }
    
    /**
     * Obtiene la lista de instructores por CIA
     */
    public List<Instructor> obtenerPorCIA(Long idCia) {
        return em.createNamedQuery("Instructor.obtenerPorCIA")
                .setParameter("cia", idCia)
                .getResultList();
    }

    /**
     * @generated
     */
    public Instructor obtener(Long id) {
        return em.find(Instructor.class, id);
    }

    /**
     * @generated
     */
    public Instructor guardar(Instructor entidad) {
        em.persist(entidad);
        return entidad;
    }

    /**
     * @generated
     */
    public void borrar(Long id) {
        em.remove(em.find(Instructor.class, id));
    }

    /**
     * @generated
     */
    public void actualizar(Instructor entidad) {
        em.merge(entidad);
    }

}
