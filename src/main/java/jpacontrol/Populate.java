package jpacontrol;

import entity.Customer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Populate
{
    public static void main(String[] args)
    {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPU");
        
        EntityManager em = emf.createEntityManager();
                
        em.getTransaction().begin();

        Customer c = new Customer();

        em.persist(c);

        em.getTransaction().commit();
        
        em.close();
    }
}
