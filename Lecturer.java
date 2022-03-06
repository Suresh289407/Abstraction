package org.login;

public abstract class Lecturer extends Student implements interface1,interface2{
	//default constructor
public Lecturer (){
		
System.out.println(" default constructor method");
super.mechanical();
this.abstractmenthods();
this.abstractmentod2();
this.computerscience();


}
//argument based
public Lecturer(int name) {
	this();


System.out.println("aurgument based constructor is "+ name);
	
}
// non abstract method
private void noralmethpod() {

System.out.println("norma method");
}

@Override
	public void abstractmenthods() {
		
	System.out.println("it is interface class  method 1");
	}
@Override
	public void abstractmentod2() {
		System.out.println("it is a inteface class method 2");
	}
@Override
public void computerscience() {
	System.out.println( "abstract method");
}

public static void main(String[] arg) {

	 
	 Lecturer a= new Lecturer() {
	};
	 
}
}
