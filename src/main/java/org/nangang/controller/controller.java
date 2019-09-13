package org.nangang.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
//import java.text.SimpleDateFormat;
//import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nangang.dao.opcontentDao;
import org.nangang.entity.opcontentEntity;

import com.fasterxml.jackson.databind.ObjectMapper;



/**
 * Servlet implementation class controller
 */
@WebServlet("/controller")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();

		opcontentDao od=new opcontentDao();
		String da=request.getParameter("datetest");
		System.out.println(da);
		Date date1=Date.valueOf(da);
//		System.out.println(da);								
		List<opcontentEntity> list=new ArrayList<opcontentEntity>();
		list=od.findByDate(date1);
		ObjectMapper mapper=new ObjectMapper();
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		Map<String,Boolean> map=new HashMap<String, Boolean>();
		String mapjackson=mapper.writeValueAsString(list);
		String mapjackson1=mapper.writeValueAsString(map);
		out.print(mapjackson);
		
		//		Iterator it=list.iterator();
//		while(it.hasNext()) {
//			opcontentEntity ope= (opcontentEntity) it.next();
////			System.out.println(ope.toString());
////			JSONObject obj=JSON.
//			ObjectMapper mapper=new ObjectMapper();
//		String mapjackson=mapper.writeValueAsString(ope);
//			System.out.println(mapjackson);
//			out.print(mapjackson);
//		}
		
		od.close();
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
