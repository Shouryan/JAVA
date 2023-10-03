package assignment_day3;

public class TwoDArray {
	public static void main(String[] args) {
		int f1[][]= {{1,1,1},{1,1,1}};
		int f2[][]= {{2,2,2},{2,2,2}};
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++)
				System.out.print((f1[i][j]+f2[i][j])+" ");
			System.out.println();
		}
	}
}
