package niit1;

public class Pizza {
	void   serve(){
        System.out.println("You can eat Pizza for Rs : 150");
}};
class  ChickenPizza  extends   Pizza  {
  void   serve(){
        System.out.println("You can eat  chicken topping.for Rs : 250");
}};
class  MuttonPizza  extends   ChickenPizza { 
  void   serve(){
        System.out.println("You can eat  mutton topping. for Rs : 350");
}};

