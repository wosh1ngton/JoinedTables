/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.joinedtables.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="VERSIONID")
@PrimaryKeyJoinColumn(name="UIDBASEDID_ID")
public class ObjectVersionID extends UIDBasedID{
   
    
    public ObjectVersionID(String value) {
        super(value);
    }

    public ObjectVersionID() {
    }
    
   
    
}
