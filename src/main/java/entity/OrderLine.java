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
public class OrderLine implements Serializable {

    /**
     * Properties
     */

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer quantity;

    /**
     * Relationships
     */

    @ManyToOne
    private Order order;
    
    @OneToMany(mappedBy = "orderLine")
    private List<ItemType> itemTypes = new ArrayList();
     
    /**
     * Getters
     */

    public Long getId() {
        return id;
    }
    
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Setters
     */
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
