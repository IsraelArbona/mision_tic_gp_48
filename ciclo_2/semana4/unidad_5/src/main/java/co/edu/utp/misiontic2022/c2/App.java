package co.edu.utp.misiontic2022.c2;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import co.edu.utp.misiontic2022.c2.model.Persona;

/**
 * Orm - Hibernate
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Inicio....." );

        /* 
        Persona persona = new Persona("Carlos", 27);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidad5-pu");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(persona);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }

        */


        // Deshabilitar el loggin de sql-hibernate
        disablelogging();
        
        // buscarPersona();
        // eliminarPersona();

        consultaJPQL();

        consultaApi();

    }

    public static void disablelogging(){
        LogManager logManager = LogManager.getLogManager();
        Logger logger = logManager.getLogger("");
        logger.setLevel(Level.SEVERE);
    }

    public static void buscarPersona(){
        System.out.println("Buscando persona....");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidad5-pu");
        EntityManager em = emf.createEntityManager();

        try {
            Persona persona = em.find(Persona.class, "Carlos");
            System.out.println(persona.getNombre());
            System.out.println(persona.getEdad());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }


    public static void eliminarPersona(){
        // declaramos nuestra unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidad5-pu");
        // crear la conexion con la unidad de persistencia
        EntityManager em = emf.createEntityManager();

        try{
            // Buscar el registo a eliminar
            Persona persona = em.find(Persona.class, "Maria");
            em.getTransaction().begin();
            // Eliminamos el registro de la tabla persona
            em.remove(persona);
            // confirmamos la eliminacion del registro cragado en el objeto persona
            em.getTransaction().commit();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            // cerrar la conexion de la unidad persistencia
            em.close();
        }
    }

    public static void consultaJPQL(){
        // declaramos nuestra unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidad5-pu");
        // crear la conexion con la unidad de persistencia
        EntityManager em = emf.createEntityManager();

        try {
            // consulta de la tabla persona

            Query sql = em.createQuery("SELECT p.nombre FROM Persona p WHERE p.edad > 30");
            // cargamos al objeto persona el resultado de la consulta
            List persona = sql.getResultList();

            // recorremos el objeto persona y lo imprimimos en la consola
            persona.forEach(System.out::println);
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }

    }


    public static void consultaApi(){
        // declaramos nuestra unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidad5-pu");
        // crear la conexion con la unidad de persistencia
        EntityManager em = emf.createEntityManager();

        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery cq = cb.createQuery(Persona.class);
            Root rootEntity = cq.from(Persona.class);
            CriteriaQuery<Persona> all = cq.select(rootEntity);

            Query sql = em.createQuery(all);
            List personas = sql.getResultList();

            personas.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }

    }
}


