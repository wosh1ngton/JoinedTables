/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.joinedtables.entidades;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="H")
@PrimaryKeyJoinColumn(name="Object_ref")
public class HierObjectID extends UIDBasedID {
    
   
    private UID root;   // mandatory
    @Column
    private String extension;
    
}
