package com.mycompany.joinedtables.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="NET")
@PrimaryKeyJoinColumn(name="UID_ID")
public class InternetID extends UID {
   
    public InternetID() {
    }
    
    //@FullConstructor
    public InternetID(String value) {
        super(value);
    }
    
}
