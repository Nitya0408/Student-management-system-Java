/**
 * Student Management System
 *
 * Developed using:
 * Java
 * JDBC
 * MySQL
 *
 * Author : Nitya
 */
package app;

import java.util.Scanner;

import dao.StudentDAO;
import model.Student;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {

        	System.out.println();
        	System.out.println("==================================================");
        	System.out.println("          STUDENT MANAGEMENT SYSTEM");
        	System.out.println("==================================================");
        	System.out.println("1. Add Student");
        	System.out.println("2. View All Students");
        	System.out.println("3. Search Student");
        	System.out.println("4. Update Student");
        	System.out.println("5. Delete Student");
        	System.out.println("6. Exit");
        	System.out.println("==================================================");
        	System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1: {

                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Department: ");
                String department = sc.nextLine();

                System.out.print("Enter Semester: ");
                int semester = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                System.out.print("Enter Phone Number: ");
                String phone = sc.nextLine();

                Student student = new Student(id, name, department,
                        semester, email, phone);

                dao.addStudent(student);

                break;
            }

            case 2: {

                    System.out.println("--------------------------------");

                    System.out.printf("%-10s %-20s %-15s %-10s %-30s %-15s%n",
                            "ID", "Name", "Department", "Semester", "Email", "Phone");

                    System.out.println("---------------------------------------------------------------------------------------------");

                    for (Student student1 : dao.getAllStudents()) {

                        System.out.printf("%-10d %-20s %-15s %-10d %-30s %-15s%n",
                                student1.getStudentId(),
                                student1.getName(),
                                student1.getDepartment(),
                                student1.getSemester(),
                                student1.getEmail(),
                                student1.getPhoneNumber());

                    }

                

                break;
            }
            case 3:{

                System.out.print("Enter Student ID: ");

                int searchId = sc.nextInt();

                Student found = dao.searchStudent(searchId);

                if (found != null) {

                    System.out.println("Student Found");

                    System.out.println("Name : " + found.getName());
                    System.out.println("Department : " + found.getDepartment());
                    System.out.println("Semester : " + found.getSemester());
                    System.out.println("Email : " + found.getEmail());
                    System.out.println("Phone : " + found.getPhoneNumber());

                } else {

                    System.out.println("Student Not Found");

                }

                break;
            }

            case 4:{

                System.out.print("Enter Student ID: ");
                int updateId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter New Name: ");
                String newName = sc.nextLine();

                System.out.print("Enter Department: ");
                String newDepartment = sc.nextLine();

                System.out.print("Enter Semester: ");
                int newSemester = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Email: ");
                String newEmail = sc.nextLine();

                System.out.print("Enter Phone: ");
                String newPhone = sc.nextLine();

                Student updated = new Student(updateId,
                        newName,
                        newDepartment,
                        newSemester,
                        newEmail,
                        newPhone);

                dao.updateStudent(updated);

                break;
            }
            case 5:{

                System.out.print("Enter Student ID: ");

                int deleteId = sc.nextInt();

                dao.deleteStudent(deleteId);

                break;
            }

            case 6:{

                System.out.println("Thank You!");

                sc.close();

                System.exit(0);
            }

            default:{

                System.out.println("Invalid Choice");
                break;
            }
            }

        }

    }

}