package com.xworkz.strings.stringnewkeyword;

import java.util.Arrays;

public class StringsAssignment {

	public static void main(String[] args) {
		
		String name ="refrigerator";
		String name1 ="REFRIGERATOR";
		int num = 50;
		
		String words = "peoples are leaving bangalore";
		
		String spaces = " hi guys whatsup, how are you feeling today ?? ";
		
		//codePointAt           -->> every alphabet have a unicode value and that unicode value will be printed.
		int uni = name.codePointAt(2);
		System.out.println("unicode value of index 2 is :"+uni);
				
		
		//equalsIgnoreCase    -->> it compares two strings and it will not check for cases...cases means upper case and lower case.
		boolean eic =name.equalsIgnoreCase(name1);
		System.out.println("boolean value :" +eic);
		
		//contains     -->>if the string contains entered word it returns true or it returns false.
		boolean con = name.contains("erat");
		System.out.println("String contains erat word ? :"+con);
		
		
		//endsWith   -->>if given string is returning with the ends with letters then it returns true or it returns false.
		boolean ends = name.endsWith("tor");
		System.out.println("String is ending with tor?? :"+ends);
		
		//toUpperCase  --> it converts the string to UpperCase.
		String uppcase = name1.toUpperCase();
		System.out.println("refrigerator to uppercase is :"+uppcase);
		
		//toLowerCase  -->>it converts the string to LowerCase
		String lowcase = name1.toLowerCase();
		System.out.println("REFRIGERATOR to lowercase is :"+lowcase);
	
		//isEmpty     -->if the string is empty it returns true,else it returns false.
		//space is also considered,if we enter space it returns false.
		boolean isempt = "".isEmpty();
		System.out.println("Is the String is Empty?? "+isempt);
		
		//replace     -->it replaces the characters that we enter..
		String replace = name.replace('r', 'l');
		System.out.println("In regrigerator we replaced r with l :"+replace);
		
		//indexOf     -->>here the index starts the counts from zero(0)...so "are"is located at the index of 8th position.
		int index = words.indexOf("are");
		System.out.println("the index of are in Sentence is :"+index);
	
		//substring   -->>it starts from 0...now it prints 1st to 4th(upto) character...efr
		String sub = name.substring(1,4);
		System.out.println("the substring is :"+sub);
		
		//charAt      -->>it displays the character position in the word...it starts counting from the zero'th position.
		char ch1 = name1.charAt(4);
		System.out.println("in refrigerator the 4th char is :"+ch1);

		//split       -->>it splits the words.
		String[] split = name.split("g");
		System.out.println("The split of ~g~ from refrigerator is :"+ Arrays.toString(split));
		
		//valueOf
		String val = String.valueOf(num);
		System.out.println(val);
	
		//toCharArray
		char cha[] = name.toCharArray();
		for(char ca : cha) {
			System.out.print(ca+"");
	
		//trim    -->>to delete the unwanted spaces at the beginning and ending.	
		String trim = spaces.trim();
		System.out.println("After trimming the Spaces :"+trim);
		System.out.println(trim.length());
		
		//copyOf
		int arr[] = new int[] {1,2,3,4,5};
		for(int go : arr) {
			System.out.println(go);
		}
		System.out.println("");
		int[] array = Arrays.copyOf(arr,8);
		array[5] = 71;
		array[6] = 81;
		array[7] = 91;
		for(int arr1 : array) {
		System.out.println(arr1+" ");
		}
		
		//format  -->>this is to format the output screen.
		String sf1=String.format("name is %s", name);
		String sf2=String.format("value is %f", 32.9876543);
		String sf3=String.format("value is %65.8f", 76.8);
		System.out.println(sf1);
		System.out.println(sf2);
		System.out.println(sf3);
		
		
		}
		
	}

}
