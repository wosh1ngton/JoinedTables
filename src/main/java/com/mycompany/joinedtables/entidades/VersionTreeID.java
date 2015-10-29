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
public class VersionTreeID implements Serializable {
    
    
    public VersionTreeID() {
    }

    public VersionTreeID(String value, String trunkVersion, String branchNumber, String branchVersion) {
        this.value = value;
        this.trunkVersion = trunkVersion;
        this.branchNumber = branchNumber;
        this.branchVersion = branchVersion;
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String value;
    private String trunkVersion;
    private String branchNumber;
    private String branchVersion;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}