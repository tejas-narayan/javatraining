package arrays;

public class JaggedAssignment {

	public static void main(String[] args) {

		int[][] numbers = new int[4][4];
		numbers[0] = new int[3];
		numbers[1] = new int[2];
		for(int i=0;i<numbers.length;i++) {
		
			for(int j=0;j<numbers[i].length;j++) {
				numbers[i][j] = j*2;
			}
			}
		for(int i=0;i<numbers.length;i++) {
		for(int j=0;j<numbers[i].length;j++) {
			System.out.print(numbers[i][j]+" ");
			
		}
		System.out.println();
		
		}
	}

		
	}