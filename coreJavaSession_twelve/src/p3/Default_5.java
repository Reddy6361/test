package p3;

import p2.Default_1;

/*Default(non sub class different package):if you make variable and method 
 * default,then you cannot access it in non sub class same package.
 * */
public class Default_5 {// no inheritance.
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Default_1 a = new Default_1(); // object creation of parent class
//		System.out.println(a.x); //cannot accessing default variable.//error.
//		a.test();// cannot accessing default method.// error.
	}
}
