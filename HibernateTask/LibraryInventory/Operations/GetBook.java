package com.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.common.HibernateConfig;
import com.entity.Library;

public class GetBook{
	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Library l = session.get(Library.class, 101);
		System.out.println(l);
		tr.commit();
		session.close();
	}

}
