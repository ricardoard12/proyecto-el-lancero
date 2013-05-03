/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Reyes
 */
public class JpaUtil {
    private static final EntityManagerFactory emf;
    static{
        try{
        emf=Persistence.createEntityManagerFactory("appLanceroPU");
        } catch (Throwable ex) {
    // Log the exception.
        System.err.println("Initial SessionFactory creation failed." + ex);
        throw new ExceptionInInitializerError(ex);
        }
    }
    public static EntityManagerFactory getEntityManagerFactory(){
    return emf;
    }
}
