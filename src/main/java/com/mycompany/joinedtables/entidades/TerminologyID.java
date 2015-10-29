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
@PrimaryKeyJoinColumn(name="OBJECT_ID")
public class TerminologyID extends ObjectID {
    
    public TerminologyID(String name, String version, String value) {
        super(value); //chama o construtor da classe ancestral.
        this.name = name;
        this.version = version;
    }

    public TerminologyID() {
       
    }
    
    private String name;
    private String version;
    
}
