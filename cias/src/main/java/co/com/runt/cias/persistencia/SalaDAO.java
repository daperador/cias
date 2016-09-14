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
public class SalaDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * @generated
     */
    public List<Sala> obtenerTodos() {
        return em.createNamedQuery("Sala.obtenerTodos").getResultList();
    }

    /**
     * @generated
     */
    public Sala obtener(Long id) {
        return em.find(Sala.class, id);
    }

    /**
     * @generated
     */
    public Sala guardar(Sala entidad) {
        em.persist(entidad);
        return entidad;
    }

    /**
     * @generated
     */
    public void borrar(Long id) {
        em.remove(em.find(Sala.class, id));
    }

    /**
     * @generated
     */
    public void actualizar(Sala entidad) {
        em.merge(entidad);
    }

}
