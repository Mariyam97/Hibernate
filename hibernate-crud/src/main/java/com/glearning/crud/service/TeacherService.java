package com.glearning.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.glearning.crud.model.Teacher;
import com.glearning.crud.model.TeacherDetails;
import com.glearning.crud.util.HibernateUtil;


public class TeacherService {

	private final SessionFactory sessionFactory;
	private Session session;
	
	
	public TeacherService() {
		this.sessionFactory = HibernateUtil.getSessionFactory();
	}
	
	
	public Teacher insertTeacherRecord(Teacher teacher, TeacherDetails teacherDetails) {
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			teacher.addTeacherDetails(teacherDetails);
			Long result =(Long)session.save(teacher);
			
			System.out.println("The primary key of the stored teacher instance: "+ result);
			transaction.commit();
				
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		
		}finally {
			session.close();
		}
		
		
		return teacher;
	}
	
	public List<Teacher> findAllTeachers() {
		List<Teacher> teachers = new ArrayList();
		
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			teachers=session.createQuery("From Teacher").list();
			

			transaction.commit();
				
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		
		}finally {
			session.close();
		}
		
		
		return teachers;
	}
	
	public Teacher findTeacherByTeacherId(long teacherId){
Teacher teacher = null;
		
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			teacher=session.get(Teacher.class,teacherId);
			

			transaction.commit();
				
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		
		}finally {
			session.close();
		}
		
		return teacher;
	}

	
	public  void deleteTeacherRecordByTeacherId(long teacherId){
Teacher teacher = null;
		
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			teacher=session.get(Teacher.class,teacherId);
			session.delete(teacher);
			

			transaction.commit();
				
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		
		}finally {
			session.close();
		}
		
	}
	
	
	
}
