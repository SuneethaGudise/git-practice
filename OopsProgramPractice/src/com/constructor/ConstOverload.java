package com.constructor;

	//CONSTRUCTOR OVERLOADING CONCEPT
	public class ConstOverload {
		int i;
		String s;
		ConstOverload(int id)
		{
		 i=id;	
		}
	    ConstOverload(int id ,String name){
	    	i=id;
	    	s=name;
	    }
	    void display() {
	    	System.out.println("display the details" + i + " " + s);
	    }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ConstOverload col =new ConstOverload(10);
			ConstOverload col1=new ConstOverload(20,"aaa");
			col.display();
			col1.display();

		}

	}


