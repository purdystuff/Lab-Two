import java.util.Random;

public class TwoDimensions {

	public static void main(String[] args) {

		Random rand = new Random();
		int randInt = 0;
		int [][] arr = new int [10][10];
		int currentRowSum = 0;
		int largestRowSum = 0;
		int rowIndex = 0;

		int currentColSum = 0;
		int largestColSum = 0;
		int colIndex = 0;

		for(int i = 0; i < arr.length; i++) {
			int rowSum = 0;
			for(int j = 0; j < arr.length; j++){

				randInt = rand.nextInt(100);

				arr [i][j] = randInt;

				System.out.println("arr [" + i + "] [" + j + "] = " + arr[i][j]);
				rowSum += arr[i][j];
			}	

			currentRowSum = rowSum;

			if(currentRowSum > largestRowSum ) {
				largestRowSum = currentRowSum;
				rowIndex = i;				
			}

			System.out.println("the current row sum is " + currentRowSum);
			System.out.println();

		}
		for (int j = 0; j < arr.length; j++){
			int colSum = 0;
			for (int i =0; i < arr.length; i++) {
				colSum += arr[i][j];
				System.out.println("arr [" + i + "] [" + j + "] = " + arr[i][j]);

			}
			currentColSum = colSum;

			if(currentColSum > largestColSum ) {
				largestColSum = currentColSum;
				colIndex =j;				
			}

			System.out.println("The current column sum is " + currentColSum);
			System.out.println();

		}
		System.out.println("The sum of the largest row is " + largestRowSum + 
				", located in row index " + rowIndex);
		System.out.println("The sum of the largest column is " + largestColSum + 
				", located in row index " + colIndex);

	}

}
