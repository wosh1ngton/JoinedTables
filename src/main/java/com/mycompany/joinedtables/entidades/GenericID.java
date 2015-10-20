/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.joinedtables.entidades;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Woshington
 */
@Entity
@Table(name="Generic_ID")
@DiscriminatorValue(value="GI")
@PrimaryKeyJoinColumn(name="Object_ID")
public class GenericID extends ObjectID {

    public GenericID(String scheme) {
        this.scheme = scheme;
    }
    @Column   
    private final String scheme;

    public String getScheme() {
        return scheme;
    }
    
    
    
}
