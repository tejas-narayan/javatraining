package packages.javabuiltinpackage;

import java.util.Scanner;
public class BuiltinPackage {
	
	String name = "Ford"; /*String is a class of java.lang.String package
	                       you need not use import java.lang.String as compiler does it automatic
	                       exclusive for fundamentals only */
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in); //scanner is class of java.lang.util.Util package
		
		System.out.println("Enter UserName");  //you need to use import or else you get error
		System.out.println("UserName is:"+ myObj.nextLine());
	}
	
	

}