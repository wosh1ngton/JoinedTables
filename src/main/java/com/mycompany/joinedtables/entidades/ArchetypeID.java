package com.mycompany.joinedtables.entidades;

import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author 
 */
@Entity
@DiscriminatorValue(value="ARCHETYPE")
@PrimaryKeyJoinColumn(name="OBJECTID_ID")
public class ArchetypeID extends ObjectID {

    public ArchetypeID(String value) {
        super(value);
    }

    public ArchetypeID() {
    }
       
    
}
