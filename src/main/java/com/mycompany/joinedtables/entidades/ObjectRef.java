package com.mycompany.joinedtables.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

/**
 *
 * @author Woshington
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="OBJECTREF_TYPE", discriminatorType=DiscriminatorType.STRING, length=20)
@DiscriminatorValue(value = "OBJECT_REF")
public class ObjectRef implements Serializable {
    
    public ObjectRef() {
    }

    public ObjectRef(ObjectID objectId) {
        this.objectId = objectId;
    }
    
    //@FullConstructor
    public ObjectRef(ObjectID objectId, String namespace, String type) {
        this.objectId = objectId;
        this.namespace = namespace;
        this.type = type;
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
        
    @OneToOne
    private ObjectID objectId;
        
    private String namespace;
    private String type;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public ObjectID getObjectId() {
        return objectId;
    }

    public void setObjectId(ObjectID objectId) {
        this.objectId = objectId;
    }
    
}
