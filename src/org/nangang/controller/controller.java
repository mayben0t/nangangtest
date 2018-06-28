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
		request.setCharacterEncoding("UTF-8");				//设置请求编码 固定格式
		response.setContentType("text/html;charset=utf-8");	//设置response格式 固定格式
		PrintWriter out=response.getWriter();				//获得页面输出对象 调用了内置对象response的方法

		opcontentDao od=new opcontentDao();					//新建Dao对象
		String da=request.getParameter("datetest");				//获得ajax传过来的date值
		Date date1=Date.valueOf(da);						//把da由String格式转换成Date格式
//		System.out.println(da);								
		List<opcontentEntity> list=new ArrayList<opcontentEntity>();	//声明一个list对象	
		list=od.findByDate(date1);					//调用了Dao层的方法 返回的是list对象 list里是entity实体对象
		ObjectMapper mapper=new ObjectMapper();
		Iterator it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		Map<String,Boolean> map=new HashMap<String, Boolean>();
		String mapjackson=mapper.writeValueAsString(list);
		String mapjackson1=mapper.writeValueAsString(map);
		out.print(mapjackson);
		
		//		Iterator it=list.iterator();				//对结果进行迭代
//		while(it.hasNext()) {
//			opcontentEntity ope= (opcontentEntity) it.next();		//获取list中的entity对象
////			System.out.println(ope.toString());
////			JSONObject obj=JSON.
//			ObjectMapper mapper=new ObjectMapper();				//jackson对象声明
//		String mapjackson=mapper.writeValueAsString(ope);//将对象ope转换为json格式的String类型 jackson方法
//			System.out.println(mapjackson);
//			out.print(mapjackson);					//用out对象输出JSON格式到页面
//		}
		
		od.close();								//调用Dao对象 关闭数据库连接对象
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
