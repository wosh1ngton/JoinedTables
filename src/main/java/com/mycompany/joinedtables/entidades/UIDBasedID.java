package com.mycompany.joinedtables.entidades;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrimaryKeyJoinColumn;


/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="UID_BASEDID")
@PrimaryKeyJoinColumn(name="OBJECTID_ID")
//@MappedSuperclass
//@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "UIDBASEDID_TYPE", discriminatorType=DiscriminatorType.STRING, length=20)
public abstract class UIDBasedID extends ObjectID {

    public UIDBasedID(String value) {
        super(value);
    }

    public UIDBasedID() {
    }
    
    
    
}
