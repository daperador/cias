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
public class PersonaNaturalDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * @generated
     */
    public List<PersonaNatural> obtenerTodos() {
        return em.createNamedQuery("PersonaNatural.obtenerTodos").getResultList();
    }

    /**
     * @generated
     */
    public PersonaNatural obtener(Long id) {
        return em.find(PersonaNatural.class, id);
    }

    /**
     * @generated
     */
    public PersonaNatural guardar(PersonaNatural entidad) {
        em.persist(entidad);
        return entidad;
    }

    /**
     * @generated
     */
    public void borrar(Long id) {
        em.remove(em.find(PersonaNatural.class, id));
    }

    /**
     * @generated
     */
    public void actualizar(PersonaNatural entidad) {
        em.merge(entidad);
    }

}
