package com.mycompany.joinedtables.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="GENERIC")
@PrimaryKeyJoinColumn(name="OBJECTID_ID")
public class GenericID extends ObjectID {
    
    
    private  String scheme;
    
    public GenericID(String scheme, String value) {
        super(value);
        this.scheme = scheme;
    }

    public GenericID(String scheme) {
        this.scheme = scheme;
    }

    public GenericID() {
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

   

    public String getScheme() {
        return scheme;
    }
    
    
    
}