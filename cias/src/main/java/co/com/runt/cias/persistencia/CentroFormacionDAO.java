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
public class CentroFormacionDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * @generated
     */
    public List<CentroFormacion> obtenerTodos() {
        return em.createNamedQuery("CentroFormacion.obtenerTodos").getResultList();
    }

    /**
     * @generated
     */
    public CentroFormacion obtener(Long id) {
        return em.find(CentroFormacion.class, id);
    }

    /**
     * @generated
     */
    public CentroFormacion guardar(CentroFormacion entidad) {
        em.persist(entidad);
        return entidad;
    }

    /**
     * @generated
     */
    public void borrar(Long id) {
        em.remove(em.find(CentroFormacion.class, id));
    }

    /**
     * @generated
     */
    public void actualizar(CentroFormacion entidad) {
        em.merge(entidad);
    }

}
