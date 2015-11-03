/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.joinedtables.teste;

import com.mycompany.joinedtables.entidades.AccessGroupRef;
import com.mycompany.joinedtables.entidades.ArchetypeID;
import com.mycompany.joinedtables.entidades.GenericID;
import com.mycompany.joinedtables.entidades.HierObjectID;
import com.mycompany.joinedtables.entidades.LocatableRef;
import com.mycompany.joinedtables.entidades.ObjectID;
import com.mycompany.joinedtables.entidades.ObjectVersionID;
import com.mycompany.joinedtables.entidades.PartyRef;
import com.mycompany.joinedtables.entidades.TemplateID;
import com.mycompany.joinedtables.entidades.TerminologyID;
import com.mycompany.joinedtables.entidades.UIDBasedID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Woshington
 */
public class PopulaObjectRef {
    
     public static void main(String[] args) {
         
        EntityManagerFactory fabrica=Persistence.createEntityManagerFactory("joined-table");
        EntityManager entidade=fabrica.createEntityManager();
         entidade.getTransaction().begin();
    
    
    ObjectID objeto = entidade.find(ArchetypeID.class, 1L);
         
    TemplateID temp=entidade.find(TemplateID.class, 2L);
        
    GenericID generic=entidade.find(GenericID.class, 3L);
       //TerminologyID termi=entidade.find(TerminologyID.class, 4L);
        
        UIDBasedID uid=entidade.find(ObjectVersionID.class, 5L);
        UIDBasedID uid2=entidade.find(HierObjectID.class, 6L);
        
        //HierObjectID hier=entidade.find(HierObjectID.class, 7L);
       // ObjectVersionID version=entidade.find(ObjectVersionID.class, 8L);
      ObjectVersionID versao=entidade.find(ObjectVersionID.class, 9L);
         
         AccessGroupRef acc=new AccessGroupRef(temp);
         PartyRef party = new PartyRef(objeto);
         AccessGroupRef acc2=new AccessGroupRef(temp);
       PartyRef party2 = new PartyRef(generic);
       LocatableRef local = new LocatableRef(uid2, "feliz");
        LocatableRef local2 = new LocatableRef(versao, "teste", "teste", "teste");
    
      entidade.persist(acc);
      entidade.persist(party);
        entidade.persist(acc2);
       entidade.persist(party2);
       entidade.persist(local);
     entidade.persist(local2);
      //  entidade.persist();
      //  entidade.persist();
      //  entidade.persist();
        entidade.getTransaction().commit();
        entidade.close();
       
     }
}
