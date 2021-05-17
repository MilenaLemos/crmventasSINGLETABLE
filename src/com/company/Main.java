package com.company;

import com.company.DAO.OportunidadDAO;
import com.company.DAO.PersonaDAO;
import com.company.entities.Oportunidad;
import com.company.entities.Persona;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {

    public static void main(String[] args) {
            SessionFactory sf = new Configuration().configure().buildSessionFactory();

            Session session = sf.openSession();
            List<Persona> personas = (List<Persona>) session.createQuery("FROM Persona").list();
            for(Persona p : personas)
                System.out.println(p);


             List<Oportunidad> Oportunidades = (List<Oportunidad>) session.createQuery("FROM Oportunidad").list();
             for(Oportunidad o : Oportunidades);

        List<Persona> personas1 = PersonaDAO.getPersonas();
    }
}
