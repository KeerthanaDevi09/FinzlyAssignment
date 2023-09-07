package com.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.common.HibernateConfig;
import com.entity.Library;

public class UpdateBook {

	public static void main(String[] args) {
			SessionFactory sf= HibernateConfig.getSessionFactory();
			Session session = sf.openSession();
			Transaction tr = session.beginTransaction();
			Library l=new Library();
			l.setIsbn(106);
			l.setTitle("Lord of the Rings");
			l.setPublication_year(1995);
			l.setAuthor("J.R.R.Tolkien");
			l.setAvailable(true);
			session.update(l);
			System.out.println("Data saved successfully");
			tr.commit();
			session.close();
	}

}