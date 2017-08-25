/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpacontrol;

import entity.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author mircea
 */
public class Facade {
    
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    
    /**
     * Methods
     */
    
    public void createCustomer(String name, String email) {
        Customer c = new Customer();
        c.setName(name);
        c.setEmail(email);
        em.persist(c);
    }
    
    public List getCustomers() {
        Query query = em.createQuery("SELECT c FROM CUSTOMERS c");
        List customers = query.getResultList();

        return customers;
    }
    
    public List getCustomer(Integer id) {
        Query query = em.createQuery("SELECT * FROM CUSTOMERS WHERE id = ");
        query.setParameter("id", id);
        List customer = query.getResultList();
        
        return customer;
    }

    public void createOrder(Integer orderId) {
        Order o = new Order();
        o.setOrderID(orderId);
        em.persist(o);
    }
    
}
