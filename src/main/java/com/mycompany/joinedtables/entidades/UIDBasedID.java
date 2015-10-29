package com.mycompany.joinedtables.entidades;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Woshington
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="UID_BASED_ID_TYPE",
        discriminatorType=DiscriminatorType.STRING, length=1)
@DiscriminatorValue(value="UIDBASED")
@PrimaryKeyJoinColumn(name="OBJECT_ID")
public abstract class UIDBasedID extends ObjectID {
    
}
