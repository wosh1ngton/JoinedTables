/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.joinedtables.entidades;

import java.io.Serializable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author Woshington
 * Single-Table Strategy
 */
@Entity
@Table(name="UID")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="UID_TYPE",
        discriminatorType=DiscriminatorType.STRING, length=1)
public abstract class UID implements Serializable {

    public UID() {
    }
    
    
    @Id
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    
}
