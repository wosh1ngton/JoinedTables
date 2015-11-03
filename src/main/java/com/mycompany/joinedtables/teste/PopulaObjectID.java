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
import com.mycompany.joinedtables.entidades.InternetID;
import com.mycompany.joinedtables.entidades.LocatableRef;
import com.mycompany.joinedtables.entidades.ObjectID;
import com.mycompany.joinedtables.entidades.ObjectRef;
import com.mycompany.joinedtables.entidades.ObjectVersionID;
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
public class PopulaObjectID {
    public static void main(String[] args) {
       
        EntityManagerFactory factory=Persistence.createEntityManagerFactory("joined-table");
        EntityManager em=factory.createEntityManager();
        
        ArchetypeID arquetipo=new ArchetypeID();
        arquetipo.setValue("valor arquetipo");
        
        TemplateID temp=new TemplateID("ABC");        
        GenericID generic=new GenericID("171", "valor geral");
        TerminologyID termi=new TerminologyID("terminologia");        
        UIDBasedID uid=new ObjectVersionID("version_id");
        UIDBasedID uid2=new HierObjectID("hier_do_uid");        
        HierObjectID hier=new HierObjectID("direto do hier");
        ObjectVersionID version=new ObjectVersionID("Direto do version");
        ObjectVersionID versao=new ObjectVersionID();
        versao.setValue("fwefewf");
        
        em.getTransaction().begin();
        em.persist(arquetipo);
        em.persist(temp);
        em.persist(generic);
        em.persist(termi);
        em.persist(uid);
        em.persist(uid2);
        em.persist(hier);
        em.persist(version);
        em.persist(versao);
        em.getTransaction().commit();
        
        System.out.println("Endereco: " + arquetipo.getValue());
        
        em.close();
    }
  
}
