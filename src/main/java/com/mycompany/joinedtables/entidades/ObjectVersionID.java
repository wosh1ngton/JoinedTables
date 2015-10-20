/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.joinedtables.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="OV")
public class ObjectVersionID extends UIDBasedID{
    
    @OneToOne
    private UID objectID;
    private VersionTreeID versionTreeID;
    private HierObjectID creatingSystemID;
    
}
