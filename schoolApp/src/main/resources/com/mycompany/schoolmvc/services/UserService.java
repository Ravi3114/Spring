package com.mycompany.schoolmvc.services;
import com.mycompany.schoolmvc.model.*;
public class UserService {
private Student student;
private ClassS classS;
private Teacher teacher;
private StJohns stjohns;
public Student setStudent(Student student) {
	this.student=student;
}
public ClassS setClassS(ClassS classS) {
	this.classS=classS;
}
public Teacher setTeacher(Teacher teacher) {
	this.teacher=teacher;
}
public StJohns setStjohns(StJohns stjohns) {
	this.stjohns=stjohns;
}
public void getStudent() {
	return student;
}
public void getClassS() {
	return classS;
}
public void getTeacher() {
	return teacher;
}
public void getStjohn() {
	return stjohns;
}
}
