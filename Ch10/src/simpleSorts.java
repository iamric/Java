
public class simpleSorts {

	/**
	 * @param args
	 */
		public static void InsertSort(int []A)
		{
			// www.mycstutorials.com
			//
			//
			//
			int temp;
			int pos;
			
			for (int i = 1; i < A.length; i++)
			{
				temp = A[i];
				pos = i - 1;
				
				while((pos >= 0) && (temp < A[pos]))
				{
					A[pos + 1] = A[pos];
					pos--;
				}
				A[pos + 1] = temp;
			}
		}
		
		public static void Sort(int [] number)
		{
			int Temp = 0;
			for(int i = 0; i < number.length-1; i++)
			{
				for(int j = i + 1; j < number.length; j++)
				{
					if (number[i] > number[j])
					{
						Temp = number[i];
						number[i] = number[j];
						number[j] = Temp;
					}
				}
					
				
			}
			 
			
			
		}
		
		public static void shell(int[] a) {
			int increment = a.length / 2;
			while (increment > 0) {
				for (int i = increment; i < a.length; i++) {
					int j = i;
					int temp = a[i];
					while (j >= increment && a[j - increment] > temp) {
						a[j] = a[j - increment];
						j = j - increment;
					}
					a[j] = temp;
				}
				if (increment == 2) {
					increment = 1;
				} else {
					increment *= (5.0 / 11);
				}
			}
		}
		
		public static void randArray(int[][] ArrayNum){
			
		for(int row = 0; row < 2; row++){	
			for (int col = 0 ; col < ArrayNum.length ; col++)
			{
				ArrayNum[row][col] = (int) (Math.random () * 100);
			}

			}
		}
		
		public static void printMatric(int G[][], int h){
			System.out.println();
			for(int Row = 1; Row < h; Row++){
				for(int Col = 1; Col < h; Col++){
					System.out.print(Format.rightAlign(h, G[Row][Col]));
				}
				System.out.println();
			}
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int [][] ArrayRandom = new int[16][16];
			int [][] secondRandom = new int[16][16];
			long start = System.currentTimeMillis();
			
			randArray(ArrayRandom);
			randArray(secondRandom);
			System.out.println("Unsorted Array1!");
			for(int z = 0; z < ArrayRandom.length; z += 4){
				System.out.println("[" + Format.centerAlign(5, ArrayRandom[z]) + "]" + "[" + Format.centerAlign(5, ArrayRandom[z+1]) + "][" + Format.centerAlign(5, ArrayRandom[z+2]) + "]" + "[" + Format.centerAlign(5, ArrayRandom[z+3] + "]"));
				}
			
			System.out.println("Sorted Array1!");
			InsertSort(ArrayRandom);
			for(int z = 0; z < ArrayRandom.length; z += 4){
			System.out.println("[" + Format.centerAlign(5, ArrayRandom[z]) + "]" + "[" + Format.centerAlign(5, ArrayRandom[z+1]) + "][" + Format.centerAlign(5, ArrayRandom[z+2]) + "]" + "[" + Format.centerAlign(5, ArrayRandom[z+3] + "]"));
			}
			System.out.println("Unsorted Array2!");
			for(int z = 0; z < secondRandom.length; z += 4){
				System.out.println("[" + Format.centerAlign(5, secondRandom[z]) + "]" + "[" + Format.centerAlign(5, secondRandom[z+1]) + "][" + Format.centerAlign(5, secondRandom[z+2]) + "]" + "[" + Format.centerAlign(5, secondRandom[z+3] + "]"));
				}
			
			System.out.println("Sorted Array2!");
			InsertSort(secondRandom);
			for(int z = 0; z < secondRandom.length; z += 4){
			System.out.println("[" + Format.centerAlign(5, secondRandom[z]) + "]" + "[" + Format.centerAlign(5, secondRandom[z+1]) + "][" + Format.centerAlign(5, secondRandom[z+2]) + "]" + "[" + Format.centerAlign(5, secondRandom[z+3] + "]"));
			}
			
			long elapsedTimeMillis = System.currentTimeMillis()-start;
			
			System.out.println(elapsedTimeMillis);
		}
			

}
