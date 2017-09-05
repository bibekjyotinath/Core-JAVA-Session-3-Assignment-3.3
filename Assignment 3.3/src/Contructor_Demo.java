
class Area{   //creating base class Area to find area
	
	public Area(int x) {      //creating a constructor (parameterized) of Area
		System.out.println("Area of Square is: " +x*x);  //prints the area of square
	}
	public Area(int x, int y) {     //overloading the parameterized constructor Area
		System.out.println("Area of Rectangle is: " +x*y);   //prints the area of rectangle
	}
}
class Perimeter extends Area {     //creating Parimeter class and extending the Area class 

	public Perimeter(int x) {      //creating parameterized constructor of Perimeter  
		super(x);				//Suoer refers to the parent class method with one parameter
		System.out.println("Perimeter of Square is: " +4*x);  //prints the perimeter of square
	}
	public Perimeter(int x, int y) {  //overloading the parameterized constructor Perimeter
		super(x, y);		//Suoer refers to the parent class method with two parameter
		System.out.println("Perimeter of Rectangle is: " +2*(x+y));  //prints the perimeter of rectangle 
	}
	
}
public class Contructor_Demo {    //main class 

	public static void main(String[] args) {  //main method of the program
		
		Perimeter p = new Perimeter(13);		//creating an object of class Perimeter and passing the value to the constructor
		Perimeter p1 =  new Perimeter(13, 17);   //creating second objecr of class perimeter and passing the value to the constructor
	}

}
