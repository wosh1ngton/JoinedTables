package com.mycompany.joinedtables.entidades;

import java.io.Serializable;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Woshington
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="OBJECT_ID_TYPE",
        discriminatorType=DiscriminatorType.STRING, length=20)
public abstract class ObjectID implements Serializable {
    
     public ObjectID(String value) {
        this.value = value;
    }

    public ObjectID() {
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long ID;
    
    
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }
    
}