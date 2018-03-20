package com.nis.controller;

import java.sql.Connection;
import java.sql.ResultSet;

import com.nis.model.Agency;
import com.nis.model.AgencyVehicals;

public class AgencyController 
{
	public static boolean AddNewRecord(Agency A)
	{
		try
		{
			Connection cn=DBHelper.openConnection();
			String query="insert into agency(agencyname,ownername,address,contactperson,mobileno,emailid,registrationid,identity,identity_proof,password,status) values('"+A.getAgencyname()+"','"+A.getOwnername()+"','"+A.getAddress()+"','"+A.getContactperson()+"','"+A.getMobileno()+"','"+A.getEmailid()+"','"+A.getRegistrationid()+"','"+A.getIdentity()+"','"+A.getIdentity_proof()+"','"+A.getPassword()+"','"+A.getStatus()+"')";
			boolean st=DBHelper.executeUpdate(query, cn);
			return(st);
			
		}
		catch(Exception e)
		{
			System.out.println("AddNewRecord "+e);
			return false;
		}
	}
	public static ResultSet DisplayAll()
	{
		try
		{
			Connection cn=DBHelper.openConnection();
			String query="select a.agencyid,a.agencyname,a.ownername,a.address,a.contactperson,a.mobileno,a.emailid,a.registrationid,a.identity,a.identity_proof,a.password,a.status  from agency a";
			ResultSet rs=DBHelper.executeQuery(query, cn);
			return(rs);
		}
		catch(Exception e)
		{
			System.out.println("AddNewRecord "+e);
			return null;
		}
	}
	public static Agency DisplayByID(int aid)
	{
		try
		{
			Connection cn=DBHelper.openConnection();
			String query="select a.agencyid,a.agencyname,a.ownername,a.address,a.contactperson,a.mobileno,a.emailid,a.registrationid,a.identity,a.password,a.status from agency a where a.agencyid="+aid;
			ResultSet rs=DBHelper.executeQuery(query, cn);
			if(rs.next())
			{
				Agency A=new Agency();
				A.setAgencyid(rs.getString(1));
				A.setAgencyname(rs.getString(2));
				A.setOwnername(rs.getString(3));
				A.setAddress(rs.getString(4));
				A.setContactperson(rs.getString(5));
				A.setMobileno(rs.getString(6));
				A.setEmailid(rs.getString(7));
				A.setRegistrationid(rs.getString(8));
				A.setIdentity(rs.getString(9));
				return(A);
			}
			return(null);
		}
		catch(Exception e)
		{
			System.out.println("AddNewRecord "+e);
			return null;
		}
	}
	public static Agency CheckLogin(int aid,String password)
	{ try
		{Connection cn=DBHelper.openConnection();
		ResultSet rs=DBHelper.executeQuery("select a.agencyid,a.agencyname,a.ownername,a.address,a.contactperson,a.mobileno,a.emailid,a.registrationid,a.identity,a.password,a.status from agency a where a.agencyid="+aid+" and +a.password='"+password+"'",cn);
		Agency A=new Agency();
		if(rs.next())
		{
			A.setAgencyid(rs.getString(1));
			A.setAgencyname(rs.getString(2));
			A.setOwnername(rs.getString(3));
			A.setAddress(rs.getString(4));
			A.setContactperson(rs.getString(5));
			A.setMobileno(rs.getString(6));
			A.setEmailid(rs.getString(7));
			A.setRegistrationid(rs.getString(8));
			A.setIdentity(rs.getString(9));
			
		return A;}
		else {return null;}
		}catch(Exception e)
	    {System.out.println("DisplayById"+e);
	    return null;}
		
	}


public static boolean EditRecord(Agency A)
{
try{
	Connection cn=DBHelper.openConnection();
	String query="update agency set agencyname='"+A.getAgencyname()+"',ownername='"+A.getOwnername()+"',address='"+A.getAddress()+"',contactperson='"+A.getContactperson()+"',mobileno='"+A.getMobileno()+"',emailid='"+A.getEmailid()+"',status='"+A.getStatus()+"' where agencyid="+A.getAgencyid(); 
	System.out.println(query);
	boolean st=DBHelper.executeUpdate(query, cn);
	return(st);
	
	
}catch(Exception e){
	System.out.println("AddNewRecord "+e);
	return false;
}
}
public static boolean DeleteRecord(int aid)
{
try{
	Connection cn=DBHelper.openConnection();
	String query="delete from agency where agencyid="+aid; 
	System.out.println(query);
	boolean st=DBHelper.executeUpdate(query, cn);
	return(st);
	
	
}catch(Exception e){
	System.out.println("AddNewRecord "+e);
	return false;
}
}

public static boolean AddNewVehical(AgencyVehicals A)
{
	try
	{
		Connection cn=DBHelper.openConnection();
		String query="insert into agencyvehicals(vrn,dname,dmobileno,identity) values('"+A.getVehicalregistrationnumber()+"','"+A.getDrivername()+"','"+A.getDrivercontactnumber()+"','"+A.getIdentity()+"')";
		boolean st=DBHelper.executeUpdate(query, cn);
		return(st);
		
	}
	catch(Exception e)
	{
		System.out.println("AddNewRecord "+e);
		return false;
	}
}

public static boolean EditIdProof(Agency A)
{
try{
	Connection cn=DBHelper.openConnection();
	String query="update agency set identity='"+A.getIdentity()+"',identity_proof='"+A.getIdentity_proof()+"' where agencyid="+A.getAgencyid(); 
	System.out.println(query);
	boolean st=DBHelper.executeUpdate(query, cn);
	return(st);
	
	
}catch(Exception e){
	System.out.println("Edit Proof "+e);
	return false;
}
}

public static boolean EditRegistration(Agency A)
{
try{
	Connection cn=DBHelper.openConnection();
	String query="update agency set registrationid='"+A.getRegistrationid()+"' where agencyid="+A.getAgencyid(); 
	System.out.println(query);
	boolean st=DBHelper.executeUpdate(query, cn);
	return(st);
	
	
}catch(Exception e){
	System.out.println("Edit Regid "+e);
	return false;
}
}

}
