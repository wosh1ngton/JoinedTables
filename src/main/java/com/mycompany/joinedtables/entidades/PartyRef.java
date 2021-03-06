package com.mycompany.joinedtables.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Woshington
 */


@Entity
@DiscriminatorValue(value="PARTYREF")
@PrimaryKeyJoinColumn(name="OBJECTREF_ID")
public class PartyRef extends ObjectRef {
    
    //Obrigatório o uso pelo JPA
    public PartyRef() {
    }
    
   //@FullConstructor

    public PartyRef(ObjectID objectId, String namespace, String type) {
        super(objectId, namespace, type);
    }
     public PartyRef(ObjectID objectId) {
        super(objectId);
    }
  
    
}
