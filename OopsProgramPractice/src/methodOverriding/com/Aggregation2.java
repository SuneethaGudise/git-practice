package methodOverriding.com;

public class Aggregation2 {
	
		int id;  
		String name;  
		 Aggregation address;  
		  
		public  Aggregation2(int id, String name, Aggregation address) {  
		    this.id = id;  
		    this.name = name;  
		    this.address=address;  
		}  
		  
		void display(){  
		System.out.println(id+" "+name);  
		System.out.println(address.city+" "+address.state+" "+address.country);  
		}  
		  
		public static void main(String[] args) {  
			 Aggregation address1=new  Aggregation("San Ramon","CA","USA");  
			 Aggregation address2=new  Aggregation("Dallas","TX","USA");  
		  
			 Aggregation2 e=new  Aggregation2(111,"Stanley",address1);  
			 Aggregation2 e2=new  Aggregation2(112,"Rebekha",address2);  
		      
		e.display();  
		e2.display();  
		      
		}  
		}  
		