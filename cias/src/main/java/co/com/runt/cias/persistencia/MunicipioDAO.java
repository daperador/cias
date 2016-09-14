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
public class MunicipioDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * @generated
     */
    public List<Municipio> obtenerTodos() {
        return em.createNamedQuery("Municipio.obtenerTodos").getResultList();
    }

    /**
     * @generated
     */
    public Municipio obtener(Long id) {
        return em.find(Municipio.class, id);
    }

    /**
     * @generated
     */
    public Municipio guardar(Municipio entidad) {
        em.persist(entidad);
        return entidad;
    }

    /**
     * @generated
     */
    public void borrar(Long id) {
        em.remove(em.find(Municipio.class, id));
    }

    /**
     * @generated
     */
    public void actualizar(Municipio entidad) {
        em.merge(entidad);
    }

}
