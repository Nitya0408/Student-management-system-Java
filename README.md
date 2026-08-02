# 🎓 Student Management System

A **console-based Student Management System** developed using **Java, JDBC, and MySQL**.

![Java](https://img.shields.io/badge/Java-21-orange)
![JDBC](https://img.shields.io/badge/JDBC-Database-success)
![MySQL](https://img.shields.io/badge/MySQL-8-blue)
![GitHub](https://img.shields.io/badge/GitHub-Portfolio-black)

---

## 📖 Table of Contents

- Features
- Technologies Used
- Project Structure
- Database Schema
- How to Run
- Future Improvements
- Author

---

## ✨ Features

- ✅ Add Student
- ✅ View All Students
- ✅ Search Student
- ✅ Update Student
- ✅ Delete Student

---

## 🛠 Technologies Used

- Java
- JDBC
- MySQL
- Eclipse IDE
- Git
- GitHub

---

## 📂 Project Structure

```text
StudentManagementSystem
│
├── src
│   ├── app
│   │   └── App.java
│   │
│   ├── dao
│   │   └── StudentDAO.java
│   │
│   ├── database
│   │   └── DBConnection.java
│   │
│   └── model
│       └── Student.java
```

---

## 🗄 Database Schema

```sql
CREATE TABLE students (
    student_id INT PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(100),
    semester INT,
    email VARCHAR(100),
    phone_number VARCHAR(20)
);
```

---

## ▶️ How to Run

1. Clone this repository.
2. Open the project in Eclipse IDE.
3. Create the MySQL database.
4. Update your MySQL username and password inside `DBConnection.java`.
5. Run `App.java`.

---

## 🚀 Future Improvements

- GUI using JavaFX
- Login Authentication
- Export Student Data to Excel
- Export Student Data to PDF
- Search by Department
- Better Input Validation

---

## 👩‍💻 Author

**Nitya**

---

⭐ If you found this project useful, consider starring the repository.
