package arrays;

public class MultiAssignment {

	public static void main(String[] args) {

		int[][] numbers = new int[4][4];
		
		
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

