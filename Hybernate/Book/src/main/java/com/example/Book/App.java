package com.example.Book;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//import com.example.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg=new Configuration();
        
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sessionFactory=cfg.buildSessionFactory();
        
        //created a session
        Session session=sessionFactory.openSession();
        
        //created transaction
        Transaction transaction=session.beginTransaction();
                Book obj=new Book();
        
        obj.setId(56L);
        obj.setTitle("Java for beginners");
        obj.setAuthor("A.B.Watt");
        obj.setYear(199);
        obj.setPrice(234);
        
        session.save(obj);
        System.out.println("Book added");
        transaction.commit();
        session.close();            
    }
}