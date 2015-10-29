/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.joinedtables.teste;

import com.mycompany.joinedtables.entidades.InternetID;
import com.mycompany.joinedtables.entidades.ObjectID;
import com.mycompany.joinedtables.entidades.TerminologyID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Woshington
 */
public class GeraTabela {
    public static void main(String[] args) {
        InternetID internet=new InternetID();
        internet.setValue("www.globo.com.br2");
        
        TerminologyID ti=new TerminologyID();
        ti.setID(2L);
        ti.setValue("wos");
        
        
        EntityManagerFactory factory=Persistence.createEntityManagerFactory("joined-table");
        EntityManager em=factory.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(internet);
        em.getTransaction().commit();
        
        System.out.println("Endereco: " + ti.getValue());
        
        em.close();
    }
  
}
