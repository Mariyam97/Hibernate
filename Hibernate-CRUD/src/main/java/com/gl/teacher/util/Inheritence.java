package com.gl.teacher.util;

class Doctor {

	public void treatPatient() {
		System.out.println("Treating patients..");
	}
}

class Orthopedician extends Doctor{
	@Override
	public void treatPatient() {
		System.out.println("Treating Ortho patients..");
	}
}

public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Doctor ortho = new Orthopedician();
ortho.treatPatient();
	}

}
