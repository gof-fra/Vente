package com.haggar.VenteBack.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.haggar.VenteBack.dao.CategoryDAO;
import com.haggar.VenteBack.dto.Category;


@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory ;
	
	
	

	@Override
	public List<Category> list() {
		
		String selectActiveCategory = "FROM Category WHERE active = :active";  // Category : pricipale class @Entity
		
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		
		query.setParameter("active", true);
		
		return query.getResultList();
	}
	
	//getting single category
	@Override
	public Category get(int id) {
		
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override
	public Boolean add(Category category) {
		
		try {
			// add the category to the database table
			
			sessionFactory.getCurrentSession().persist(category);
			
			
			return true;
			
		}catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

		
	}
	/*
	 * Updating a single category
	 * */
	@Override
	public Boolean update(Category category) {
		try {
			// add the category to the database table
			
			sessionFactory.getCurrentSession().update(category);
			
			
			return true;
			
		}catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public Boolean delete(Category category) {
		
		category.setActive(false);
		
		try {
			// add the category to the database table
			
			sessionFactory.getCurrentSession().update(category);
			
			
			return true;
			
		}catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}
}



