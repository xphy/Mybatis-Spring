package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface StudentMapper{
	public void insert(Student bean);
	public Student selectOne(int id);
	public void delete(int id);
	public List<Student> select();
	public void update(Student bean);
}