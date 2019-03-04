package com.cts.emplmngt.dao;

import java.util.List;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.emplmngt.bean.Employee;
import com.cts.emplmngt.util.HibernateUtil;


public class EmployeeDAOImpl implements EmployeeDAO {

	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	public String insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Session session=null;
		Transaction transaction=null;
		try{
		session = sessionFactory.openSession();//all hibernate exceptions are uncheck exceptions
		transaction = session.getTransaction();
		
		transaction.begin();
		session.save(employee);
		transaction.commit();
		}
		catch(Exception e){
			if(transaction!=null){
				transaction.rollback();
			}
			e.printStackTrace();
		}
		finally {
			if(session!=null){
				session.close();
			}
		}
		return null;
	}

	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteEmployee(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		Session session = null;
		String query = "from Emp1";
		org.hibernate.query.Query<Employee> query2 = null;
		try {
			session = sessionFactory.openSession();
			query2 = session.createQuery(query);
			List<Employee> list = query2.getResultList();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			if(session!=null){
				session.close();
			}
		}
		return null;
	}

	public List<Employee> getAllEmployeeByName(String name) {
		// TODO Auto-generated method stub
		Session session = null;
		String query = "from Emp1 where firstName = ?";
		org.hibernate.query.Query<Employee> query2 = null;
		try {
			session = sessionFactory.openSession();
			query2 = session.createQuery(query);
			query2.getParameter(name);
			List<Employee> list = query2.getResultList();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			if(session!=null){
				session.close();
			}
		}
		return null;
	}

}
