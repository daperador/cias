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
public class CursoDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * @generated
     */
    public List<Curso> obtenerTodos() {
        return em.createNamedQuery("Curso.obtenerTodos").getResultList();
    }

    /**
     * @generated
     */
    public Curso obtener(Long id) {
        return em.find(Curso.class, id);
    }

    /**
     * @generated
     */
    public Curso guardar(Curso entidad) {
        em.persist(entidad);
        return entidad;
    }

    /**
     * @generated
     */
    public void borrar(Long id) {
        em.remove(em.find(Curso.class, id));
    }

    /**
     * @generated
     */
    public void actualizar(Curso entidad) {
        em.merge(entidad);
    }

}
