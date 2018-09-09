package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.DButil.DB;
import com.orilore.mappers.*;
import java.util.*;
import org.apache.ibatis.session.SqlSession;
public class StudentBiz implements IStudentBiz{
	private SqlSession session =null;
	@Override
	public boolean addStudent(Student bean) {
		try{
			session = DB.getSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			mapper.insert(bean);
			session.commit();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}finally{
			session.close();
		}
	}
	@Override
	public boolean removeStudent(int id) {
		try{
			session = DB.getSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			mapper.delete(id);
			session.commit();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}finally{
			session.close();
		}
	}
	@Override
	public boolean modifyStudent(Student bean) {
		try{
			session = DB.getSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			mapper.update(bean);
			session.commit();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}finally{
			session.close();
		}
	}
	@Override
	public Student getStudent(int id) {
		Student bean = null;
		try{
			session = DB.getSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			bean = mapper.selectOne(id);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return bean;
	}
	@Override
	public List<Student> findStudent() {
		List<Student> beans = null;
		try{
			session = DB.getSession();
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			beans = mapper.select();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			session.close();
		}
		return beans;
	}
}
