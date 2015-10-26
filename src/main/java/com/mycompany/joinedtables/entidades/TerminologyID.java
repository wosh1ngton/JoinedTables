/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.joinedtables.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="TI")
@PrimaryKeyJoinColumn(name="Object_ID")
public class TerminologyID extends ObjectID {
    
    private String name;
    private String version;
    
}
