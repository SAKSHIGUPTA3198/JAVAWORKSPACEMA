package com.lti.ArrayListDemos;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> lst = new  LinkedList<>();//<generics>
		
		lst.add("A");
		lst.add("B");
		lst.add("C");
		lst.add("D");
		lst.add("E");				
		lst.addLast("F");
		lst.addLast("G");			
		lst.add(1, "A2");
		System.out.println("Original contents of lst: " + lst );
		lst.remove("F");
		lst.remove(2);
		System.out.println("Contents of lst after deletion: " + lst);
		lst.removeFirst();
		lst.removeLast();
		System.out.println("lst after deleting first and last: " + lst);
		
	}

}
