package com.mycompany.joinedtables.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author 
 */
@Entity
@DiscriminatorValue(value="ACCESSGROUP")
@PrimaryKeyJoinColumn(name="OBJECTREF_ID")
public class AccessGroupRef extends ObjectRef {

    
    public AccessGroupRef() {
    }

    //@FullConstructor
    public AccessGroupRef(ObjectID objectId) {
        super.setObjectId(objectId);
    }  
    
    
}
