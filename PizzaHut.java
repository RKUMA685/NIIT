package niit1;

import java.util.Scanner;

public class PizzaHut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new  Scanner(System.in);
	    while(true) {
	    	System.out.println("1- Pizza Rs. 150");
	    	System.out.println("2- Mutton pizza Rs. 950");
	        System.out.println("3- Chicken Pizza Rs. 550");
	        System.out.println("4- To Exit");
	          
	        int  ch= sc.nextInt();
	        if(ch==4)
	        	break;
	        
	        Pizza  fd=null; 
	        if(ch==1) {    
	        	Pizza  pz = new  Pizza();  
	        	fd = pz;
	        }else  if(ch==3)
	        	fd = new  ChickenPizza();  
	        else  if(ch==2)
	        	fd = new   MuttonPizza ();  

	        fd.serve();   
	    }
	    sc.close();
	};
	}


