/**
 * Performs CRUD operations on Student table.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

import database.DBConnection;
import model.Student;

public class StudentDAO {
	

	private Connection connection;

    public StudentDAO() {

        connection = DBConnection.getConnection();
 }
    public void addStudent(Student student) {

        String query =
                "INSERT INTO students(student_id,name,department,semester,email,phone_number) VALUES(?,?,?,?,?,?)";

        try {

            PreparedStatement ps = connection.prepareStatement(query);

            ps.setInt(1, student.getStudentId());
            ps.setString(2, student.getName());
            ps.setString(3, student.getDepartment());
            ps.setInt(4, student.getSemester());
            ps.setString(5, student.getEmail());
            ps.setString(6, student.getPhoneNumber());

            ps.executeUpdate();
            ps.close();

            System.out.println();
            System.out.println("========================================");
            System.out.println(" Student Added Successfully!");
            System.out.println("========================================");

        } catch (SQLException e) {

        	if (e.getErrorCode() == 1062) {
                System.out.println();
                System.out.println("========================================");
                System.out.println(" Student ID already exists!");
                System.out.println("========================================");
            } else {
            	 System.out.println();
                 System.out.println("====================================");
                 System.out.println(" Something went wrong.");
                 System.out.println(" Please try again.");
                 System.out.println("====================================");
                 
                e.printStackTrace();
            }

        }

    }
    public ArrayList<Student> getAllStudents() {

        ArrayList<Student> studentList = new ArrayList<>();

        String query = "SELECT * FROM students";

        try {

            PreparedStatement ps = connection.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Student student = new Student();

                student.setStudentId(rs.getInt("student_id"));
                student.setName(rs.getString("name"));
                student.setDepartment(rs.getString("department"));
                student.setSemester(rs.getInt("semester"));
                student.setEmail(rs.getString("email"));
                student.setPhoneNumber(rs.getString("phone_number"));

                studentList.add(student);

            }
            rs.close();
            ps.close();

        } catch (Exception e) {
        	 System.out.println();
        	    System.out.println("====================================");
        	    System.out.println(" Database operation failed.");
        	    System.out.println(" Please try again.");
        	    System.out.println("====================================");
            e.printStackTrace();

        }
       
        return studentList;

    }
    public Student searchStudent(int studentId) {

        String query = "SELECT * FROM students WHERE student_id = ?";

        try {

            PreparedStatement ps = connection.prepareStatement(query);

            ps.setInt(1, studentId);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Student student = new Student();

                student.setStudentId(rs.getInt("student_id"));
                student.setName(rs.getString("name"));
                student.setDepartment(rs.getString("department"));
                student.setSemester(rs.getInt("semester"));
                student.setEmail(rs.getString("email"));
                student.setPhoneNumber(rs.getString("phone_number"));
                
                rs.close();
                ps.close();
                return student;
            }

        } catch (SQLException e) {
        	 System.out.println();
        	    System.out.println("====================================");
        	    System.out.println(" Database operation failed.");
        	    System.out.println(" Please try again.");
        	    System.out.println("====================================");
            e.printStackTrace();

        }

        return null;

    }
    public void updateStudent(Student student) {

        String query = "UPDATE students SET name=?, department=?, semester=?, email=?, phone_number=? WHERE student_id=?";

        try {

            PreparedStatement ps = connection.prepareStatement(query);

            ps.setString(1, student.getName());
            ps.setString(2, student.getDepartment());
            ps.setInt(3, student.getSemester());
            ps.setString(4, student.getEmail());
            ps.setString(5, student.getPhoneNumber());
            ps.setInt(6, student.getStudentId());

            ps.executeUpdate();
            ps.close();

            System.out.println();
            System.out.println("========================================");
            System.out.println(" Student Updated Successfully!");
            System.out.println("========================================");

        } catch (SQLException e) {

            e.printStackTrace();

        }

    }
    public void deleteStudent(int studentId) {

        String query = "DELETE FROM students WHERE student_id=?";

        try {

            PreparedStatement ps = connection.prepareStatement(query);

            ps.setInt(1, studentId);

            ps.executeUpdate();
            ps.close();

            System.out.println();
            System.out.println("========================================");
            System.out.println(" Student Deleted Successfully!");
            System.out.println("========================================");

        } catch (SQLException e) {
        	 System.out.println();
        	    System.out.println("====================================");
        	    System.out.println(" Database operation failed.");
        	    System.out.println(" Please try again.");
        	    System.out.println("====================================");
            e.printStackTrace();

        }

    }
}
