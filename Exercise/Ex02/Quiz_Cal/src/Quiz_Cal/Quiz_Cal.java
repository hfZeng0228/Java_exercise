/* 
	Last edit date: 2019/9/21
	Author:huafeng Tsang
	Mail:huafeng_tsang@bupt.edu.cn
	Function:Simulation exercises and examinations for primary school students
*/

package Quiz_Cal;

import java.util.Scanner;
import java.util.Random;

public class Quiz_Cal {
public static void main(String[] args) {
	System.out.println("欢迎来到爱学习课堂！");
	System.out.println("请输入0进入练习，输入1进入考试！");
	Scanner text1=new Scanner(System.in);
	int choice=text1.nextInt();
	if(choice!=0&&choice!=1) {
		System.out.println("选择的模式不存在！");
		return;
	}
	System.out.println("请输入需要练习/考试的题目数：");
	Scanner text2=new Scanner(System.in);
	int ques_num=text2.nextInt();
	if(ques_num<0) {
		System.out.println("输入的题目数错误！");
		return;
	}
	if(choice==0)
		Exercise(ques_num);
	else 
		Exam(ques_num);
}

public static void Exercise(int n) {	//练习模式
	int Y_num=0;int N_num=0;
	int result[] = new int[n]; 
	int cond[] = new int[n];
	for(int i=0;i<n;i++) {
		Random rand=new Random();
		int num1=rand.nextInt(101);
		int num2=rand.nextInt(101);
		int ope=Math.random()>0.5?1:0;
		if(ope==0) {
			result[i]=num1+num2;
			System.out.println("Q"+(i+1)+":"+num1+"+"+num2+"=");
			Scanner text=new Scanner(System.in);
			int re=text.nextInt();
			if(re==result[i]) {
				Y_num++;
				cond[i]=1;
			}
			else {
				N_num++;
				cond[i]=0;
			}
		}
		else {
			result[i]=num1-num2;
			System.out.println("Q"+(i+1)+":"+num1+"-"+num2+"=");
			Scanner text=new Scanner(System.in);
			int re=text.nextInt();
			if(re==result[i]) {
				Y_num++;
				cond[i]=1;
			}
			else {
				N_num++;
				cond[i]=0;
			}
		}
	}
	System.out.println("在本次练习的"+n+"题中，你做对了"+Y_num+"题。正确率："+(Y_num/(float)n)*100+"%");
	if(N_num!=0) {
	System.out.println("错题及其正解：");
	for(int i=0;i<n;i++) {
		if(cond[i]==0) {
			System.out.println("错题："+"Q"+(i+1)+"，正解："+result[i]);
		}
		else 
			continue;
	}
	}
	else
		return;
}

public static void Exam(int n) {	//考试模式
	int Y_num=0;int N_num=0;
	int result[] = new int[n]; 
	for(int i=0;i<n;i++) {
		Random rand=new Random();
		int num1=rand.nextInt(101);
		int num2=rand.nextInt(101);
		int ope=Math.random()>0.5?1:0;
		if(ope==0) {
			result[i]=num1+num2;
			System.out.println("Q"+(i+1)+":"+num1+"+"+num2+"=");
			Scanner text=new Scanner(System.in);
			int re=text.nextInt();
			if(re==result[i]) {
				Y_num++;
			}
			else {
				N_num++;
			}
		}
		else {
			result[i]=num1-num2;
			System.out.println("Q"+(i+1)+":"+num1+"-"+num2+"=");
			Scanner text=new Scanner(System.in);
			int re=text.nextInt();
			if(re==result[i]) {
				Y_num++;
			}
			else {
				N_num++;
			}
		}
	}
	System.out.println("在本次考试的"+n+"题中，你做对了"+Y_num+"题。得分："+((int)((Y_num/(float)n)*100+0.5))); //得分四舍五入，保留整数
	System.out.println("答案：");
	for(int i=0;i<n;i++) 
		System.out.println("Q"+(i+1)+":"+result[i]);

}
}