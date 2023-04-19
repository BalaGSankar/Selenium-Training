package org.college;

public class College {
private void CollegeName() {
	System.out.println("My College Name - Manakula Vinayagar Engineering College");
}
private void CollegeCode() {
	System.out.println("College Code - 1234");}
private void CollegeRank() {
	System.out.println("My College Rank - No 1 Position in Pondicherry");
}
public static void main(String[] args) {
	College MyCollege = new College();
	MyCollege.CollegeName();
	MyCollege.CollegeCode();
	MyCollege.CollegeRank();
}
}
