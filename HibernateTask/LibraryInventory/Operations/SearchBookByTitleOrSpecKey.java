package com.operations.criteria;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import com.common.HibernateConfig;
import com.entity.Library;

public class SearchBookByTitleOrSpecKey {
	public static void main(String[] args) {
		SessionFactory sf= HibernateConfig.getSessionFactory();
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Library.class);
		criteria.add(Restrictions.or(Restrictions.eq("title","Lord of the Rings") , Restrictions.like("title","%"+"the"+"%")));
//		criteria.add(Restrictions.or(Restrictions.eq("title","Lord of the Rings") , Restrictions.like("title","%"+"of"+"%")));
//		criteria.add(Restrictions.or(Restrictions.eq("title","Lord of the Rings") , Restrictions.like("title","%"+"r"+"%)));
		List<Library> l = criteria.list();
		System.out.println(l);
		System.out.println("Data saved successfully");
		session.close();
	}
}
