/* 
	Last edit date: 2019/9/15
	Author:huafeng Tsang
	Mail:huafeng_tsang@bupt.edu.cn
*/

package Ex01.ex1_4;
import java.util.Scanner;

public class Cal_Years { 
 
    public static void main(String[] args)
	{
		System.out.println("请输入分钟数：");
		Scanner sc=new Scanner(System.in);
		int Mins=sc.nextInt();
		sc.close();
		
		double Days=Mins/60/24;
		double Years=Mins/60/24/365;
		System.out.println("相当于"+Days+"天"+"，"+Years+"年");
		
  }
}