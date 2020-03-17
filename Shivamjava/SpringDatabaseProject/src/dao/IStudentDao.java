package dao;
import java.util.List;

import data.Student;

public interface IStudentDao {

	//this method is used to create a record in the student table
	public void create(Student student);
	
	//used to get one record from student table
	public Student getStudent(int id);
	
	//used to get all record from student table
	public List<Student> listStudents();
	
	//used to delete a record from student table
	public void delete(int id);
	
	//used to update a record in student table
	public void update(Student student);

	public boolean saveStudentByPst(final Student e);
}
