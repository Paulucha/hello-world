package com;

import com.com.paulucha.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Users.class)
                .buildSessionFactory();


        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            session.createQuery("update users set name = 'Buka'").executeUpdate();
            session.createQuery("update users set name = 'Muminek' where email = 'user@qp.pl'").executeUpdate();
            session.createQuery("delete from users where users_id = 2").executeUpdate();
            session.getTransaction().commit();
            //
// Create object of entity class type
//            Users user = new Users();
//            // Start transaction
//            session.beginTransaction();
//            //Perform operation
////            session.save(user);
//
//            user = session.get(Users.class, 1);
////         Updating user
//            user.setName("borys");
////            Deleting user
////           session.delete(user);


//Start transaction
//            session.beginTransaction();
//            List<Users> users = session
//                    .createQuery("from users where name = 'user 2'" + "OR email like '%d%'").getResultList();
//
//            for (Users temp: users
//                 ) {
//                System.out.println(temp);
//
//            }
            //Commit the transaction
//            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }

    }
}
