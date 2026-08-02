/**
 * Student Model Class
 * Stores all student information.
 * Author: Nitya
 */
package model;

public class Student {
	 private int studentId;
	    private String name;
	    private String department;
	    private int semester;
	    private String email;
	    private String phoneNumber;

	    public Student() {
	    }

	    public Student(int studentId, String name, String department,
	                   int semester, String email, String phoneNumber) {

	        this.studentId = studentId;
	        this.name = name;
	        this.department = department;
	        this.semester = semester;
	        this.email = email;
	        this.phoneNumber = phoneNumber;
	    }

	    public int getStudentId() {
	        return studentId;
	    }

	    public void setStudentId(int studentId) {
	        this.studentId = studentId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public int getSemester() {
	        return semester;
	    }

	    public void setSemester(int semester) {
	        this.semester = semester;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

}
