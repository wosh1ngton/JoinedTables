package com.mycompany.joinedtables.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Woshington 
 */
@Entity
@DiscriminatorValue(value="ISO")
@PrimaryKeyJoinColumn(name="UID_ID")
public class ISO_OID  extends UID{

    public ISO_OID() {
    }
    
    //@FullConstructor
    public ISO_OID(String value) {
        super(value);        
    }
     
}
