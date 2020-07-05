//출제자: 김순기
//2차원 배열을 활용하여 별을 찍자 
//		*        
//		* *      
//		* * *	   
//      * * * *  
//	    * * * * * 

package array2.practice01;

public class Array2 {
	public static void main(String[] args) {
		
		char[][] arr = new char[5][9]; 
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = ' ';
			}
		}
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=4; j<=i+4; j++) {
				arr[i][j] = '*';
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%c ", arr[i][j]);
			}
			System.out.println();
		}
	}
}
