/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author mircea
 */
@Entity
public class Order implements Serializable {

    /**
     * Properties
     */

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer orderID;

    /**
     * Relationships
     */
    
    @ManyToOne
    private Customer customer;
    
    @OneToMany(mappedBy = "order")
    private List<OrderLine> orderLines = new ArrayList();
    
    /**
     * Getters
     */

    public Long getId() {
        return id;
    }
    
    public Integer getOrderID() {
        return orderID;
    }

    /**
     * Setters
     */
    
    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }
}
