package javaFiles;

import java.util.ArrayList;


import java.util.Scanner;

public class StudentClass {
	
	private int studentId;
	private String studentName;
	
	//GPA for 1st and 2nd semesters
	private double GPA1;
	
	//GPA for pathOption1
	private double GPA2;
	
	//GPA for path option2
	private double GPA3;
	
	
	private int credits;
	private String degreeTitle;
	
	
	//Constructor
	public StudentClass(int id,String name,double gpa1,int credits,String degreeTitle){
		this.studentId=id;
		this.studentName=name;
		this.GPA1=gpa1;
		this.credits=credits;
		this.degreeTitle=degreeTitle;
		
	}
	
	//array list to store marks used for calculations
	static ArrayList<Integer> marksArray = new ArrayList<>();
	

	//array list used to store student objects
	public static ArrayList<StudentClass> studentsArray=new ArrayList<>();
	
	
	public static ArrayList<Integer> getMarksArray() {
		return marksArray;
	}




	public static void setMarksArray(ArrayList<Integer> marksArray) {
		StudentClass.marksArray = marksArray;
	}




	public static ArrayList<StudentClass> getStudentsArray() {
		return studentsArray;
	}




	public static void setStudentsArray(ArrayList<StudentClass> studentsArray) {
		StudentClass.studentsArray = studentsArray;
	}




	public int getStudentId() {
		return studentId;
	}




	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}




	public String getStudentName() {
		return studentName;
	}




	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}




	public double getGPA1() {
		return GPA1;
	}




	public void setGPA1(double gPA1) {
		GPA1 = gPA1;
	}




	public double getGPA2() {
		return GPA2;
	}




	public void setGPA2(double gPA2) {
		GPA2 = gPA2;
	}




	public double getGPA3() {
		return GPA3;
	}




	public void setGPA3(double gPA3) {
		GPA3 = gPA3;
	}




	public int getCredits() {
		return credits;
	}




	public void setCredits(int credits) {
		this.credits = credits;
	}




	public String getDegreeTitle() {
		return degreeTitle;
	}




	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}

	
	
	
	
	
	public static void addStudent(){
		

		int id =StudentDetailsController.studId;
		
		String name=StudentDetailsController.studName;
		
		double GPA=calculateGPA(marksArray);
		
		int credits=2;
		
		String degreeTitle="pass";
		
		
		StudentClass student=new StudentClass(id, name,GPA,credits,degreeTitle);
		
		studentsArray.add(student);
		
		
	}
	
	//for testing purposes
	public static void seeStudents(){
		for(int i=0;i<studentsArray.size();i++){
			System.out.println(i);
			System.out.println("-----------------");
			System.out.println("name =="+studentsArray.get(i).getStudentName());
			System.out.println("id ="+studentsArray.get(i).getStudentId());
		}
		
	}
	
	//for testing purposes
		public static void seeMarks(){
			for(int i=0;i<marksArray.size();i++){
				System.out.println(i);
				System.out.println("-----------------");
				System.out.println(marksArray.get(i));
			}
			
		}
	

	
	
	
	//This method is to get the respective grade point for the ranges of marks
	public static double getGradePoint(int marks){
	
		double gradePoint=0.0;
		if (marks>=85){
			gradePoint=4.0;
		}
		else if(marks>=70){
			gradePoint=3.67;
			
		}
		
		else if(marks>=65){
			gradePoint=3.33;
			
		}
		else if(marks>=60){
			gradePoint=3.00;
			
		}
		else if(marks>=55){
			gradePoint=2.67;
			
		}
		else if(marks>=45){
			gradePoint=2.00;
			
		}
		else if(marks>=35){
			gradePoint=1.67;
			
		}
		else if(marks>=30){
			gradePoint=1.00;
			
		}
		else{
			gradePoint=0.00;
		}
		
		return gradePoint;
		
	}

	//Method to Calculate GPA
	public static double calculateGPA(ArrayList<Integer> marks) {
		double GPA=0;
		
		double totalGradePoints=0.0;
		
		for (int i = 0; i < marks.size(); i++) {
			totalGradePoints+=getGradePoint(marks.get(i));
			
		}
		
		GPA=totalGradePoints/marks.size();
		
		return GPA;
	}
	
	
//to added all the inputed marks to the marksarray
	public static  void addMarksToArray() {
		
		marksArray.add(StudentMarksSemester1Controller.S1Marks1);
		marksArray.add(StudentMarksSemester1Controller.S1Marks2);
		marksArray.add(StudentMarksSemester1Controller.S1Marks3 );
		marksArray.add(StudentMarksSemester1Controller.S1Marks4);
		marksArray.add(StudentMarksSemester1Controller.S1Marks5);
	
		
	}

	
	

}
