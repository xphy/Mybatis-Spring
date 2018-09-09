package com.orilore.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.orilore.bizs.IStudentBiz;
import com.orilore.bizs.StudentBiz;
import com.orilore.model.Student;


@WebServlet("/students.do")
public class StudentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    IStudentBiz dao =new StudentBiz();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out =response.getWriter();
		List<Student> students = this.dao.findStudent();
		JSONArray jsa =new JSONArray();
		for(Student s:students) {
			JSONObject jso =new JSONObject();
			jso.put("name", s.getSname());
			jso.put("sex",s.getSsex());
			jso.put("age", s.getSage());
			jso.put("dept", s.getSdept());
			jsa.add(jso);
		}
		out.print(jsa);
		out.flush();
		out.close();
	}

}
