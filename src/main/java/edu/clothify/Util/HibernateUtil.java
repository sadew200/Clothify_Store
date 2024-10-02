package edu.clothify.Util;

import edu.clothify.Entity.EmployeAccountEntity;
import edu.clothify.Entity.OwnerAccountEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    private static SessionFactory sessionFactory=createSessionFactory();

    private static SessionFactory createSessionFactory() {
        StandardServiceRegistry build=new StandardServiceRegistryBuilder()
                .configure("hibernate.cjg.xml")
                .build();
        Metadata metadata=new MetadataSources(build)
                .addAnnotatedClass(EmployeAccountEntity.class)
                .addAnnotatedClass(OwnerAccountEntity.class)
                .getMetadataBuilder()
                .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
                .build();
        return metadata.getSessionFactoryBuilder().build();
    }
    public static Session getSession(){
        return sessionFactory.openSession();
    }
}
