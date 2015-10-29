package com.mycompany.joinedtables.entidades;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="GENERIC")
@PrimaryKeyJoinColumn(name="OBJECT_ID")
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
