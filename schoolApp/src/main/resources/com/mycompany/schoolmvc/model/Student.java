package com.mycompany.schoolmvc.model;

public class Student implements StJohns {
	public ClassS classS;
	public StJohns stjohns;
	public Student(ClassS classS,StJohns stjohns) {
		this.stjohns=stjohns;
		this.classS=classS;
		stjohns.setStudentName("Ravi");
		classS.setClassStuding("graduate");
	}

}