package com.mycompany.joinedtables.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="LOCATABLE")
@PrimaryKeyJoinColumn(name="OBJECTREF_ID")
public class LocatableRef extends ObjectRef {

    public LocatableRef() {
    }
    public LocatableRef(UIDBasedID based_id, String path) {
        this.based_id = based_id;
        this.path = path;
    }

       
    //@FullConstructor
    public LocatableRef(ObjectVersionID id, String namespace, String type, String path) {
        super(id, namespace, type);
        this.path=path;
        this.based_id=id;
    }
    
    @OneToOne(fetch = FetchType.EAGER)
    UIDBasedID based_id;       
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
}
