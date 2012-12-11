
public class multiArray {

		/**
		 * @param args
		 */
		public static void loadarray(int A[][]){
			for(int row=0; row < A.length; row++){
				
				for(int col=0; col < A.length; col++){
					A[row][col] = (int) (Math.random() * 6 - 3);
				}
			}
			
		}
		
		public static void mutiplyArray (int A[][], int B[][], int C[][])
		{
			for(int Row = 1; Row <= 3; Row++){
				
				for(int Col = 1; Col <= 3; Col++){
					C[Row][Col] = 0;
					for(int i = 1; i <= 3; i++){
						C[Row][Col] = A[Row][i] * B[i][Col] + C[Row][Col];
					}
				}
				
			}
			
			
		}
		
		public static void MatricAdd(int[][] A,int[][] B, int [][] C ){
			//System.out.println();
			for(int Row = 0; Row < A. length; Row++){
				for(int Col = 0; Col < A.length; Col++){
					C[Row][Col] = A[Row][Col] + B[Row][Col];
					//System.out.println(Format.rightAlign(6, C[Row][Col]));
				}
				//System.out.println();
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
			int n = 2;
			int[][]D = new int[10][10];
			int[][]E = new int[10][10];
			int[][]F = new int[10][10];
			int[][]Z = new int[10][10];
			loadarray(D);
			loadarray(E);
			
			 
			for (int l = 2; l <= 9; l++){
			mutiplyArray(D, E, F);
			 MatricAdd(D, E, Z);
			printMatric(D, l);
			printMatric(E, l);
			printMatric(F, l);
			printMatric(Z, l);
			}
		}

}
