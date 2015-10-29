package com.mycompany.joinedtables.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="TEMPLATE")
@PrimaryKeyJoinColumn(name="OBJECT_ID")
public class TemplateID extends ObjectID {
    
    public TemplateID() {
    }
    
    //@FullConstructor
    public TemplateID(String value) {
	super.setValue(value);
    }
}
