package com.mycompany.joinedtables.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Woshington
 */
@Entity
public class VersionTreeID {
    
    
    public VersionTreeID() {
    }

    public VersionTreeID(String value) {
        this.value = value;
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String value;
  
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}