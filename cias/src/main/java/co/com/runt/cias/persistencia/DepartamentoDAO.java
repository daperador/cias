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
public class DepartamentoDAO {

    @PersistenceContext
    private EntityManager em;

    /**
     * @generated
     */
    public List<Departamento> obtenerTodos() {
        return em.createNamedQuery("Departamento.obtenerTodos").getResultList();
    }

    /**
     * @generated
     */
    public Departamento obtener(Long id) {
        return em.find(Departamento.class, id);
    }

    /**
     * @generated
     */
    public Departamento guardar(Departamento entidad) {
        em.persist(entidad);
        return entidad;
    }

    /**
     * @generated
     */
    public void borrar(Long id) {
        em.remove(em.find(Departamento.class, id));
    }

    /**
     * @generated
     */
    public void actualizar(Departamento entidad) {
        em.merge(entidad);
    }

}
