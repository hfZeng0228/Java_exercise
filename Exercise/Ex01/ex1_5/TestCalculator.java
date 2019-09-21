/* 
	Last edit date: 2019/9/15
	Author:huafeng Tsang
	Mail:huafeng_tsang@bupt.edu.cn
	For:Complete the calculator
*/

package Ex01.ex1_5;
import java.util.Scanner;

public class TestCalculator{
	public static void main(String[] args){
		Calculator cal=new Calculator();
		System.out.println("��ʼ����A��B�����Ļ������㣡");
		System.out.println("����������������ͣ�1-�ӣ�2-����3-�ˣ�4-����5-������6-ָ�����㣬7-���㣬8-exit");
		Scanner sc=new Scanner(System.in);
		int methods=sc.nextInt();
		if(methods<=8)
		{
		while(methods!=8){
			switch(methods){
				case 1:{
					System.out.println("������A��ֵ��");
					double A=sc.nextDouble();
					cal.set_result(A);
					System.out.println("������B��ֵ��");
					double B=sc.nextDouble();
					cal.add(B);
					System.out.println(A+"+"+B+"="+cal.getResult());
					System.out.println("����������������ͣ�1-�ӣ�2-����3-�ˣ�4-����5-������6-ָ�����㣬7-���㣬8-exit");
					methods=sc.nextInt();
				}break;
				case 2:{
					System.out.println("������A��ֵ��");
					double A=sc.nextDouble();
					cal.set_result(A);
					System.out.println("������B��ֵ��");
					double B=sc.nextDouble();
					cal.substract(B);
					System.out.println(A+"-"+B+"="+cal.getResult());
					System.out.println("����������������ͣ�1-�ӣ�2-����3-�ˣ�4-����5-������6-ָ�����㣬7-���㣬8-exit");
					methods=sc.nextInt();
				}break;
				case 3:{
					System.out.println("������A��ֵ��");
					double A=sc.nextDouble();
					cal.set_result(A);
					System.out.println("������B��ֵ��");
					double B=sc.nextDouble();
					cal.multiply(B);
					System.out.println(A+"��"+B+"="+cal.getResult());
					System.out.println("����������������ͣ�1-�ӣ�2-����3-�ˣ�4-����5-������6-ָ�����㣬7-���㣬8-exit");
					methods=sc.nextInt();
				}break;
				case 4:{
					System.out.println("������A��ֵ��");
					double A=sc.nextDouble();
					cal.set_result(A);
					System.out.println("������B��ֵ��");
					double B=sc.nextDouble();
					cal.divide(B);
					System.out.println(A+"��"+B+"="+cal.getResult());
					System.out.println("����������������ͣ�1-�ӣ�2-����3-�ˣ�4-����5-������6-ָ�����㣬7-���㣬8-exit");
					methods=sc.nextInt();
				}break;
				case 5:{
					System.out.println("������A��ֵ��");
					double A=sc.nextDouble();
					cal.set_result(A);
					cal.square();
					System.out.println(A+"��ƽ����"+"="+cal.getResult());
					System.out.println("����������������ͣ�1-�ӣ�2-����3-�ˣ�4-����5-������6-ָ�����㣬7-���㣬8-exit");
					methods=sc.nextInt();
				}break;
				case 6:{
					System.out.println("������A��ֵ��");
					double A=sc.nextDouble();
					cal.set_result(A);
					System.out.println("������B��ֵ��");
					double B=sc.nextDouble();
					cal.power(B);
					System.out.println(A+"^"+B+"="+cal.getResult());
					System.out.println("����������������ͣ�1-�ӣ�2-����3-�ˣ�4-����5-������6-ָ�����㣬7-���㣬8-exit");
					methods=sc.nextInt();
				}break;
				case 7:{
					cal.clear();
					System.out.println("���Ϊ��"+cal.getResult());
					System.out.println("����������������ͣ�1-�ӣ�2-����3-�ˣ�4-����5-������6-ָ�����㣬7-���㣬8-exit");
					methods=sc.nextInt();
				}break;
				}
			}
		}
		else{
			System.out.println("����Ļ����������Ͳ�����!");
			return ;
		}
	}
}
class Calculator {
    private static double result; // ��̬���������ڴ洢���н��
	
	public void set_result(double r){
		this.result=r;
	}
    public void add(double n) {	//��      
		result = result + n;
    }
    public void substract(double n) {	//��       
		result = result - n;  
    }
    public void multiply(double n) {	//��
		result=result*n;
	}
    public void divide(double n) { //��	
		result=result/n;
    }
    public void square() {	//����	
		result=Math.sqrt(result);
    }
    public void power(double n) {//ָ������
		result=Math.pow(result,n);
    }
    public void clear() {     // ����
        result = 0;
    }
    public double getResult() {
        return result;
    }
}