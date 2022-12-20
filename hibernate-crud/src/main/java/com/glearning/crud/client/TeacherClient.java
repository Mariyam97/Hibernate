package com.glearning.crud.client;



import java.util.List;

import com.glearning.crud.model.Teacher;
import com.glearning.crud.service.TeacherService;

public class TeacherClient {

	/*
	private static TeacherService teacherService = new TeacherService();
	
	public static void main(String[] args) {
		Teacher teacher = new Teacher("Sardar",20000,"sardar@com");
		teacherService.insertTeacherRecord(teacher);
	}
	*/
	
private final TeacherService teacherService;
	
	public TeacherClient() {
		this.teacherService = new TeacherService();
	}
		
	public static void main(String[] args) {
		TeacherClient client = new TeacherClient();
		client.insertTeacher();
		//fetch all the teachers
		
		client.fetchTeacher();
		
		//fetch teacher by teacher Id
		
		client.fetchTeacherByTeacherId(1);
		
		//delete the  teacher  record from the DB based on Id
		
				client.deleteTeacherByTeacherId(1);
	
		

}

	private void deleteTeacherByTeacherId(long id) {
		// TODO Auto-generated method stub
		this.teacherService.deleteTeacherRecordByTeacherId(id);
	}

	private void fetchTeacherByTeacherId(long teacherId) {
		// TODO Auto-generated method stub
		Teacher teacher = this.teacherService.findTeacherByTeacherId(teacherId);
		
		System.out.println("Fetched the teacher by teacher id");
		System.out.println(teacher);
	}

	private void fetchTeacher() {
		// TODO Auto-generated method stub
		List<Teacher> teachers = this.teacherService.findAllTeachers();
		for(Teacher teacher: teachers) {
			System.out.println(teacher);
		}

	}

	private void insertTeacher() {
		// TODO Auto-generated method stub
		Teacher mariyam = new Teacher("mariyam",12399,"mari@com");
		Teacher queen = new Teacher("queen",1299,"que@com");
		
		teacherService.insertTeacherRecord(mariyam);
		teacherService.insertTeacherRecord(queen);
	}
	
}
