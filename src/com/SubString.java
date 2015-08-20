package com;

import java.sql.Date;

public class SubString {

	public static void main(String[] args) {
		
		
	    Date date= new Date(0);
	     String dat=date.toString();
	     System.out.println(dat.substring(0,dat.length()>11?11:dat.length()));
	     System.out.println(dat.substring(0,dat.length()>11?11:dat.length()));

	}

}
