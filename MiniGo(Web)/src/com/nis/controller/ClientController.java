package com.nis.controller;


import java.sql.Connection;
import java.sql.ResultSet;

import com.nis.model.ClientModel;

public class ClientController {
	public static boolean AddRecord(ClientModel C)
	{
	try
	{ 
	Connection cn=DBHelper.openConnection();

	String query="insert into client(emailid,mobile,name,birthdate,gender,address,password)values('"+C.getEmailid()+"','"+C.getMobile()+"','"+C.getName()+"','"+C.getBirthdate()+"','"+C.getGender()+"','"+C.getAddress()+"','"+C.getPassword()+"')";	
	System.out.println(query);	
	boolean st=DBHelper.executeUpdate(query, cn);
	return (st);
	}
	catch(Exception e)
	{
		System.out.println("Error in client" +e.getMessage());
		return false;
	}
	
	}
	public static ClientModel checkPassword(String cid,String pwd)
	{
	try{
		Connection cn=DBHelper.openConnection();
		String query="select * from client where (emailid='"+cid+"' or mobile='"+cid+"') and password='"+pwd+"'";
		System.out.println(query);
		ResultSet rs=DBHelper.executeQuery(query, cn);
		if(rs.next())
		{ClientModel C=new ClientModel();
		C.setEmailid(rs.getString(1));
		C.setMobile(rs.getString(2));
		C.setName(rs.getString(3));
		C.setBirthdate(rs.getString(4));
		C.setGender(rs.getString(5));
		C.setAddress(rs.getString(6));
		
		 
		return(C);
		}
		return null;
			
		

	}catch(Exception e)
	{
	return(null);	
	}
	}
	}
