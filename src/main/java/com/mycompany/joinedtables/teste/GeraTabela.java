/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.joinedtables.teste;

import com.mycompany.joinedtables.entidades.InternetID;
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
        internet.setValue("www.concursosdeti.net");
        
        EntityManagerFactory factory;
        factory = Persistence.createEntityManagerFactory("joined-table");
        EntityManager manager=factory.createEntityManager();
        
        manager.getTransaction().begin();
        manager.persist(internet);
        manager.getTransaction().commit();
        System.out.println("Endereço: " + internet.getValue());
        
        manager.close();
    }
}
