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
		System.out.println("开始计算A与B两数的基本运算！");
		System.out.println("请输入基本运算类型：1-加，2-减，3-乘，4-除，5-开方，6-指数运算，7-归零，8-exit");
		Scanner sc=new Scanner(System.in);
		int methods=sc.nextInt();
		if(methods<=8)
		{
		while(methods!=8){
			switch(methods){
				case 1:{
					System.out.println("请输入A的值：");
					double A=sc.nextDouble();
					cal.set_result(A);
					System.out.println("请输入B的值：");
					double B=sc.nextDouble();
					cal.add(B);
					System.out.println(A+"+"+B+"="+cal.getResult());
					System.out.println("请输入基本运算类型：1-加，2-减，3-乘，4-除，5-开方，6-指数运算，7-归零，8-exit");
					methods=sc.nextInt();
				}break;
				case 2:{
					System.out.println("请输入A的值：");
					double A=sc.nextDouble();
					cal.set_result(A);
					System.out.println("请输入B的值：");
					double B=sc.nextDouble();
					cal.substract(B);
					System.out.println(A+"-"+B+"="+cal.getResult());
					System.out.println("请输入基本运算类型：1-加，2-减，3-乘，4-除，5-开方，6-指数运算，7-归零，8-exit");
					methods=sc.nextInt();
				}break;
				case 3:{
					System.out.println("请输入A的值：");
					double A=sc.nextDouble();
					cal.set_result(A);
					System.out.println("请输入B的值：");
					double B=sc.nextDouble();
					cal.multiply(B);
					System.out.println(A+"×"+B+"="+cal.getResult());
					System.out.println("请输入基本运算类型：1-加，2-减，3-乘，4-除，5-开方，6-指数运算，7-归零，8-exit");
					methods=sc.nextInt();
				}break;
				case 4:{
					System.out.println("请输入A的值：");
					double A=sc.nextDouble();
					cal.set_result(A);
					System.out.println("请输入B的值：");
					double B=sc.nextDouble();
					cal.divide(B);
					System.out.println(A+"÷"+B+"="+cal.getResult());
					System.out.println("请输入基本运算类型：1-加，2-减，3-乘，4-除，5-开方，6-指数运算，7-归零，8-exit");
					methods=sc.nextInt();
				}break;
				case 5:{
					System.out.println("请输入A的值：");
					double A=sc.nextDouble();
					cal.set_result(A);
					cal.square();
					System.out.println(A+"的平方根"+"="+cal.getResult());
					System.out.println("请输入基本运算类型：1-加，2-减，3-乘，4-除，5-开方，6-指数运算，7-归零，8-exit");
					methods=sc.nextInt();
				}break;
				case 6:{
					System.out.println("请输入A的值：");
					double A=sc.nextDouble();
					cal.set_result(A);
					System.out.println("请输入B的值：");
					double B=sc.nextDouble();
					cal.power(B);
					System.out.println(A+"^"+B+"="+cal.getResult());
					System.out.println("请输入基本运算类型：1-加，2-减，3-乘，4-除，5-开方，6-指数运算，7-归零，8-exit");
					methods=sc.nextInt();
				}break;
				case 7:{
					cal.clear();
					System.out.println("结果为："+cal.getResult());
					System.out.println("请输入基本运算类型：1-加，2-减，3-乘，4-除，5-开方，6-指数运算，7-归零，8-exit");
					methods=sc.nextInt();
				}break;
				}
			}
		}
		else{
			System.out.println("输入的基本运算类型不存在!");
			return ;
		}
	}
}
class Calculator {
    private static double result; // 静态变量，用于存储运行结果
	
	public void set_result(double r){
		this.result=r;
	}
    public void add(double n) {	//加      
		result = result + n;
    }
    public void substract(double n) {	//减       
		result = result - n;  
    }
    public void multiply(double n) {	//乘
		result=result*n;
	}
    public void divide(double n) { //除	
		result=result/n;
    }
    public void square() {	//开方	
		result=Math.sqrt(result);
    }
    public void power(double n) {//指数运算
		result=Math.pow(result,n);
    }
    public void clear() {     // 归零
        result = 0;
    }
    public double getResult() {
        return result;
    }
}