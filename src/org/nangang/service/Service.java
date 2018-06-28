package org.nangang.service;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nangang.entity.NgEntity;

public interface Service {
	public boolean insert(HttpServletRequest request, HttpServletResponse response);
	
	public boolean update(HttpServletRequest request, HttpServletResponse response);
	
	public boolean delete(HttpServletRequest request, HttpServletResponse response);
	
	public String query(HttpServletRequest request, HttpServletResponse response,Date date,String banCi,String banBie,String zhanBie);
}
