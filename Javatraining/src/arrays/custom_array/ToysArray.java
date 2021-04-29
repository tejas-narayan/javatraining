package arrays.custom_array;

public class ToysArray {

	public static void main(String[] args) {

		Toy car = new Toy("car","grey",100.00);
		Toy bike = new Toy("bike","blue",200.00);
		Toy teddy = new Toy("teddy","yellow",300.00);
		Toy dog = new Toy("dog","black",250.00);
		
		Toy toys[]= {car,bike,teddy,dog};
		
		for(int i=0;i<toys.length;i++) {
			System.out.println(toys[i]);
			
			//System.out.println(toys[i].name);   //it prints the names of an arrays/object.
			//System.out.println(toys[i].color);   // it prints the color of an object.
			
		}
		
	}
}
