package com.mycompany.joinedtables.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="UUID")
@PrimaryKeyJoinColumn(name="UID_ID")
public class UUID extends UID {  
    
     public UUID() {
    }
    
    //@FullConstructor
    public UUID(String value) {
        super(value);        
    }    
    
}
