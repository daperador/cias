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
public class CertificacionDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * @generated
     */
    public List<Certificacion> obtenerTodos() {
        return em.createNamedQuery("Certificacion.obtenerTodos").getResultList();
    }

    /**
     * @generated
     */
    public Certificacion obtener(Long id) {
        return em.find(Certificacion.class, id);
    }

    /**
     * @generated
     */
    public Certificacion guardar(Certificacion entidad) {
        em.persist(entidad);
        return entidad;
    }

    /**
     * @generated
     */
    public void borrar(Long id) {
        em.remove(em.find(Certificacion.class, id));
    }

    /**
     * @generated
     */
    public void actualizar(Certificacion entidad) {
        em.merge(entidad);
    }

}
