package org.college;

public class Student {
private void studentName() {
System.out.println("Student Name- Balaji S");
}
private void studentDept() {
	System.out.println("Student Dept- MCA");
}
private void studentId() {
	System.out.println("Student ID- 2189");
}
public static void main(String[] args) {
	Student MyDetails = new Student();
	MyDetails.studentName();
	MyDetails.studentDept();
	MyDetails.studentId();
}
}
