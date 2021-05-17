package com.company.DAO;

import com.company.entities.Persona;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class PersonaDAO {

    private static SessionFactory sf = new Configuration().configure().buildSessionFactory();

    public static List<Persona> getPersonas(){
        Session session = sf.openSession();
        return (List<Persona>) session.createQuery("FROM Persona").list();
    }

    public static void guardarPersona(Persona persona){
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(persona);
        session.getTransaction().commit();
        session.close();
    }
}
