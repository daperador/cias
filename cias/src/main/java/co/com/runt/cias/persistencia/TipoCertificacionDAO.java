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
public class TipoCertificacionDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * @generated
     */
    public List<TipoCertificacion> obtenerTodos() {
        return em.createNamedQuery("TipoCertificacion.obtenerTodos").getResultList();
    }

    /**
     * @generated
     */
    public TipoCertificacion obtener(Long id) {
        return em.find(TipoCertificacion.class, id);
    }

    /**
     * @generated
     */
    public TipoCertificacion guardar(TipoCertificacion entidad) {
        em.persist(entidad);
        return entidad;
    }

    /**
     * @generated
     */
    public void borrar(Long id) {
        em.remove(em.find(TipoCertificacion.class, id));
    }

    /**
     * @generated
     */
    public void actualizar(TipoCertificacion entidad) {
        em.merge(entidad);
    }

}
