package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;
public interface IStudentBiz{
	public boolean addStudent(Student student);
	public boolean removeStudent(int id);
	public boolean modifyStudent(Student student);
	public Student getStudent(int id);
	public List<Student> findStudent();
}