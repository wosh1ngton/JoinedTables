package com.mycompany.joinedtables.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Transient;
/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="HIER")
@PrimaryKeyJoinColumn(name="UIDBASEDID_ID")
public class HierObjectID extends UIDBasedID {
    
    
    //private UID root;   // mandatory
     public HierObjectID(String value) {
        super(value);
    }

    public HierObjectID() {
    }
    
}
