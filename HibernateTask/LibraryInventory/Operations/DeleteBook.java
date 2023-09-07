package com.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.common.HibernateConfig;
import com.entity.Library;

public class DeleteBook {

	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Library l=new Library();
		l.setIsbn(108);
		session.delete(l);
		System.out.println("Data saved successfully");
		tr.commit();
		session.close();
	}

}