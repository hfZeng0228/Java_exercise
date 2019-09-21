/* 
	Last edit date: 2019/9/15
	Author:huafeng Tsang
	Mail:huafeng_tsang@bupt.edu.cn
*/
package Ex01.ex1_2;
import java.util.Scanner;
import java.util.Arrays;

public class Cramer { 
 
    public static void main(String[] args)
	{
		double[] array1 = new double[6];
		System.out.println("解方程组：ax+by=e;cx+dy=f");
		System.out.println("请按序输入：a、b、c、d、e、f");
		for(int i=0;i<6;i++){
		Scanner sc = new Scanner(System.in);
		double num=sc.nextDouble();
		array1[i]=num;
		}
		//sc.close();
		double a=array1[0];
		double b=array1[1];
		double c=array1[2];
		double d=array1[3];
		double e=array1[4];
		double f=array1[5];
		double x=(e*d-b*f)/(a*d-b*c);
		double y=(a*f-e*c)/(a*d-b*c);
		
		System.out.println("x="+x+";"+"y="+y);
	}
  }