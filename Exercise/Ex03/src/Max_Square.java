/* 
	Last edit date: 2019/10/12
	Author:huafeng Tsang
	Mail:huafeng_tsang@bupt.edu.cn
	Function:Find the maximum square.
*/

import java.util.Scanner;

public class Max_Square {
	public static void main(String[] args) {
		System.out.println("This procedure is design for finding the maximum square!");
		System.out.print("Enter the number of rows in the matrix: ");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();

		//create the matrix and print out
		int[][] matrix=new int[num][num];
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				matrix[i][j]=Math.random()>0.5?1:0;
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		int[] result=new int[3];
		result=findLargestBlock(matrix);
		System.out.println();
        System.out.println("The maximum square submatrix is at ("+result[0]+","+result[1]+") with size "+result[2]);
	}
	
	public static int[] findLargestBlock(int[][] m) {
		int[] result=new int[3];
		 boolean t=true;
	        int n=m.length;
	        int i=0,j=0,d=0;
	        for(d=n;d>=1;d--){ //矩阵维数，从最大开始
	            for(i=0;i<=n-d;i++){
	                for(j=0;j<=n-d;j++){
	                    t=true;
	                    for(int x=i;x<i+d;x++){
	                        for(int y=j;y<j+d;y++){
	                            if(m[x][y]!=1){    //不为1退出此轮循环
	                                t=false;
	                                break;
	                            }
	                        }
	                        if(t==false) break;
	                    }
	                    if(t==true) break;
	                }
	                if(t==true) break;
	            }
	            if(t==true) break;
	        }
	        result[0]=i;
	        result[1]=j;
	        result[2]=d;
		return result;
		
	}
}
