package com.company.DAO;

import com.company.entities.Oportunidad;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class OportunidadDAO {

    private static SessionFactory sf = new Configuration().configure().buildSessionFactory();

    public static List<Oportunidad> getOportunidad(){
        Session session = sf.openSession();
        return (List<Oportunidad>) session.createQuery("FROM Oportunidad ").list();
    }

    public static void guardarOportunidad(Oportunidad oportunidad){
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(oportunidad);
        session.getTransaction().commit();
        session.close();
    }
}
