package com.test;

public class UpdateSimpleCode {

	public static void main(String[] args) {
		String orginalstr="Welcome";
		String reversestring="";
		for(int i=0;i<=orginalstr.length()-1;i++) {
			reversestring=orginalstr.charAt(i)+reversestring;
		}
		System.out.println("Reverse String is:"+reversestring);
				
	}
}
