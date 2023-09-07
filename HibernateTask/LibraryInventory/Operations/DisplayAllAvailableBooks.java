package com.operations.criteria;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import com.common.HibernateConfig;
import com.entity.Library;

public class DisplayAllAvailableBooks {
	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Library.class);
		criteria.add(Restrictions.eq("isAvailable",true));
		List<Library> l = criteria.list();
		for(Library lib:l)
		{
			System.out.println("Title "+lib.getTitle());
			System.out.println("Author "+lib.getAuthor());
			System.out.println("ISBN number "+lib.getIsbn());
			System.out.println("Publication year "+lib.getPublication_year());
		}
		System.out.println("Data saved successfully");
		session.close();
	}
}
