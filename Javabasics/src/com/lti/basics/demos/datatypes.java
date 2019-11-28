package com.lti.basics.demos;

public class datatypes {
	public static void main(String args[]){
	byte b = -128; // 1 byte

    short s = -32768;
    short age = 23;// 2 bytes 

    int i = 2147483647; //  4 bytes 
    int j = 4_83_647; // underscore operator easy to read

    float f = 2.5f; // 4 bytes 
    float weight = 34.43f;

    long l = 9223372036854775807l; // 8 bytes 
    long ssn = 12342L;

    double d = 20.50;// 8 bytes 
    double salary = 1354.23;

    char gender = 'M';

    String name = "Meenal";
    String email = "Meenaluphale@gmail.com";

    System.out.println("it is byte = " + b);
    System.out.println("it is short = " + s);
    System.out.println("it is integer i: = " + i);
    System.out.println("it is integer j:= " + j);
    System.out.println("it is long = " + l);
    System.out.println("it is float = " + f);
    System.out.println("it is double = " + d);
    System.out.println("it is character = " + gender);

    System.out.println("it is String = " + name);
    System.out.println("it is String = " + email);
	}
}
