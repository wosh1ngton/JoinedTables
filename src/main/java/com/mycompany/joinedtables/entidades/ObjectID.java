/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.joinedtables.entidades;

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
 */
@Entity
@Table(name="Object_id")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="object_id_TYPE",
        discriminatorType=DiscriminatorType.STRING, length=2)
public abstract class ObjectID {
    @Id
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}