/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento;

import Entidades.CodigoArea;
import Entidades.JpaUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Reyes
 */
public class mantenimientoCodigoArea {
    public int guardar(CodigoArea departamentos){
    EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
    int flag = 0;
    em.getTransaction().begin();
    try {
    em.persist(departamentos);
    em.getTransaction().commit();
    flag = 1;
    } catch (Exception e) {
    em.getTransaction().rollback();
    flag = 0;
    } finally {
    em.close();
    }
    return flag;
    }
    public CodigoArea consultar(String codigoCarea){
    EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
    CodigoArea departamento=null;
    em.getTransaction().begin();
    try {
    departamento = em.find(CodigoArea.class, codigoCarea);
    em.getTransaction().commit();
    } catch (Exception e) {
    em.getTransaction().rollback();
    } finally {
    em.close();
    }
    return departamento;
}
    public int modificar(CodigoArea d){
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        CodigoArea departamento=null;
        int flag = 0;
        em.getTransaction().begin();
        try {
            departamento = em.find(CodigoArea.class, d.getNombreCarea());
            departamento.setNombreCarea(d.getNombreCarea());
            em.merge(departamento);
            em.getTransaction().commit();
        flag = 1;
        } catch (Exception e) {
        em.getTransaction().rollback();
        flag = 0;
        } finally {
        em.close();
        }
        return flag;
}
public int eliminar(String nombreCarea){
    EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
    CodigoArea departamento=null;
    em.getTransaction().begin();
    int flag = 0;
    try {
    departamento = em.find(CodigoArea.class, nombreCarea);
    em.remove(departamento);
    em.getTransaction().commit();
    flag = 1;
    } catch (Exception e) {
    em.getTransaction().rollback();
    flag = 0;
    } finally {
    em.close();
    }
    return flag;
    }
public List consultarTodosDepartamentos() {
    List<CodigoArea> listaDepartamentos = null;
    EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
    em.getTransaction().begin();
    try {
    Query query = em.createQuery("SELECT c FROM Departamentos c");
    em.getTransaction().commit();
    listaDepartamentos = query.getResultList();
    } catch (Exception e) {
    em.getTransaction().rollback();
    } finally {
    em.close();
    }
    return listaDepartamentos;
    }
}
