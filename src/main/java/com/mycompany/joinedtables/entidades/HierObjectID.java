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
@DiscriminatorValue(value="HIER")
@PrimaryKeyJoinColumn(name="UID_BASED_ID_TYPE")
public class HierObjectID extends UIDBasedID {
    
   
    private UID root;   // mandatory
    private String extension;
    
}
