package com.info.details;
import org.springframework.stereotype.Component;

@Component
public class Ravi implements Student{
	private String marks="The total marks of Ravi is";
	private int totalMarks=100;
	private String grade="is studying 10th grade";
	public void sumOfMarks(){
		System.out.println(marks+" "+totalMarks);
	}
	public void incrementOfGrades(){
		System.out.println(grade);
	}
}
		