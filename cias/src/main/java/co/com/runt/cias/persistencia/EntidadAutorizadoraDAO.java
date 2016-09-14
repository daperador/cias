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
public class EntidadAutorizadoraDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * @generated
     */
    public List<EntidadAutorizadora> obtenerTodos() {
        return em.createNamedQuery("EntidadAutorizadora.obtenerTodos").getResultList();
    }

    /**
     * @generated
     */
    public EntidadAutorizadora obtener(Long id) {
        return em.find(EntidadAutorizadora.class, id);
    }

    /**
     * @generated
     */
    public EntidadAutorizadora guardar(EntidadAutorizadora entidad) {
        em.persist(entidad);
        return entidad;
    }

    /**
     * @generated
     */
    public void borrar(Long id) {
        em.remove(em.find(EntidadAutorizadora.class, id));
    }

    /**
     * @generated
     */
    public void actualizar(EntidadAutorizadora entidad) {
        em.merge(entidad);
    }

}
