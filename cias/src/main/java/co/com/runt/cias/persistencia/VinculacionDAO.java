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
public class VinculacionDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * @generated
     */
    public List<Vinculacion> obtenerTodos() {
        return em.createNamedQuery("Vinculacion.obtenerTodos").getResultList();
    }

    /**
     * @generated
     */
    public Vinculacion obtener(Long id) {
        return em.find(Vinculacion.class, id);
    }

    /**
     * @generated
     */
    public Vinculacion guardar(Vinculacion entidad) {
        em.persist(entidad);
        return entidad;
    }

    /**
     * @generated
     */
    public void borrar(Long id) {
        em.remove(em.find(Vinculacion.class, id));
    }

    /**
     * @generated
     */
    public void actualizar(Vinculacion entidad) {
        em.merge(entidad);
    }

}
