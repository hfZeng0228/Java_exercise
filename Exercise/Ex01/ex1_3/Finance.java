/* 
	Last edit date: 2019/9/15
	Author:huafeng Tsang
	Mail:huafeng_tsang@bupt.edu.cn
*/

package Ex01.ex1_3;
import java.util.Scanner;

public class Finance { 
 
    public static void main(String[] args)
	{
		System.out.println("������Ͷ���ܶ�����ʺ�����");
		Scanner sc=new Scanner(System.in);
		double TolInvs=sc.nextDouble();
		double Rate=sc.nextDouble();
		double Years=sc.nextDouble();
		double Sum_Future=TolInvs*(Math.pow(1+Rate/12,Years*12));
		sc.close();
		System.out.println("δ��Ͷ�ʶ�Ϊ��"+Sum_Future);
	}
  }