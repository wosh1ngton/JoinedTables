package com.mycompany.joinedtables.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="TERMINOLOGY")
@PrimaryKeyJoinColumn(name="OBJECTID_ID")
public class TerminologyID extends ObjectID {

    public TerminologyID(String value) {
        super(value);
    }   

    public TerminologyID() {
       
    }
    
       
}
