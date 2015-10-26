/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.joinedtables.entidades;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Woshington
 */
@Entity
@DiscriminatorValue(value="V")
@PrimaryKeyJoinColumn(name="UIDBasedId_id")
public class ObjectVersionID extends UIDBasedID{
    
    @OneToOne
    private UID objectID;
    @OneToOne
    private VersionTreeID versionTreeID;
    @OneToOne
    private HierObjectID creatingSystemID;
    
}
