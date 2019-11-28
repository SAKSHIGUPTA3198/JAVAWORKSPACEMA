package com.lti.oops.user;

class FaceBook{
	
	int id;
	int n=0;
	static int likes=1;
	
	
	 FaceBook(int id) {
	this.id=id;
	}


	void show(){
		
		n++;
		//likes++;
		System.out.print("user ID:"+id +"\t");
		System.out.println("n :" +n);
		
		
	}
	
	static void p_likes(){
	likes++;
	System.out.println("likes :" +likes);
	
	}
}


public class MyFaceBook {

	public static void main(String[] args) {
		FaceBook  user1 = new FaceBook(101);
		user1.show();
		FaceBook.p_likes();
		
		FaceBook  user2 = new FaceBook(102);
		user2.show();
		FaceBook.p_likes();
		
		
		FaceBook  user3 = new FaceBook(103);
		user3.show();
		FaceBook.p_likes();
	}

}
