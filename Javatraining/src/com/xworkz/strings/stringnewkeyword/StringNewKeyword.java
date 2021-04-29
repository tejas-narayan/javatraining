package com.xworkz.strings.stringnewkeyword;

public class StringNewKeyword {

	public static void main(String[] args) {
		
		String name1 =new String("Tejas");
		String name2 =new String("Tejas");
		String name3 ="Tejas";
		
 		
		System.out.println(name1);
		
		System.out.println(name2);
		
		System.out.println(name1==name2);
		
		System.out.println(name2==name3);
		
		System.out.println(name1.intern() .hashCode());
		
		System.out.println(name3.hashCode());

		System.out.println(name2.hashCode());

		
	}

}
