/* 
	Last edit date: 2019/9/21
	Author:huafeng Tsang
	Mail:huafeng_tsang@bupt.edu.cn
	Function:Calculate the individual-income-tax in China.
*/

//说明：
//纳税人的每月个税=(工资收入-起征点5000元-五险一金-专项附加扣除)*适用税率-速算扣除数
//专项附加扣除就是指2019新推出的子女教育、继续教育、住房租金、住房贷款、赡养老人以及大病医疗费用专项扣除
//适用税率：查表可得
//速算扣除数：速算扣除数是指为解决超额累进税率分级计算税额的复杂技术问题，而预先计算出的一个数据。查表得。
package Indiv_Income_tax;

import java.util.Scanner;

public class IITax {
public static void main(String[] args) {
	final int threshold=5000;
	double tax_rate=0;	//适用税率
	double num_tax=0;	//需缴个税
	double qui_sub=0;	//速算扣除数
	System.out.println("欢迎进入中国新个人所得税计算器！");
	System.out.println("中国新个人所得税起征点为："+threshold+"元。");
	System.out.println("请输入您的每月工资(单位：元)：");
	Scanner text1=new Scanner(System.in);
	double num_RMB=text1.nextDouble();
	System.out.println("请输入您每月需缴纳的五险一金费用(单位：元)：");
	Scanner text2=new Scanner(System.in);
	double num_insurance=text2.nextDouble();
	System.out.println("请输入您的专项附加扣除(单位：元)：");
	Scanner text3=new Scanner(System.in);
	double num_subtraction=text3.nextDouble();
	double sum_taxable=num_RMB-5000-num_insurance-num_subtraction;
	if(sum_taxable<=0) {
		System.out.println("您的每月工资扣除五险一金和专项附加扣除后，小于或等于个税起征点，无需缴个税。");
		return;
	}
	if(sum_taxable<=3000) {
		tax_rate=0.03;
		qui_sub=0;
		System.out.println("您的适用税率为："+tax_rate*100+"%"+"，速算扣除数为："+qui_sub+"元。");
		num_tax=sum_taxable*tax_rate-qui_sub;
		System.out.println("您每月需缴个税："+num_tax+"元。");
	}
	else if(sum_taxable<=12000) {
		tax_rate=0.1;
		qui_sub=210;
		System.out.println("您的适用税率为："+tax_rate*100+"%"+"，速算扣除数为："+qui_sub+"元。");
		num_tax=sum_taxable*tax_rate-qui_sub;
		System.out.println("您每月需缴个税："+num_tax+"元。");
	}
	else if(sum_taxable<=25000) {
		tax_rate=0.2;
		qui_sub=1410;
		System.out.println("您的适用税率为："+tax_rate*100+"%"+"，速算扣除数为："+qui_sub+"元。");
		num_tax=sum_taxable*tax_rate-qui_sub;
		System.out.println("您每月需缴个税："+num_tax+"元。");
	}
	else if(sum_taxable<=35000) {
		tax_rate=0.25;
		qui_sub=2660;
		System.out.println("您的适用税率为："+tax_rate*100+"%"+"，速算扣除数为："+qui_sub+"元。");
		num_tax=sum_taxable*tax_rate-qui_sub;
		System.out.println("您每月需缴个税："+num_tax+"元。");
	}
	else if(sum_taxable<=55000) {
		tax_rate=0.3;
		qui_sub=4410;
		System.out.println("您的适用税率为："+tax_rate*100+"%"+"，速算扣除数为："+qui_sub+"元。");
		num_tax=sum_taxable*tax_rate-qui_sub;
		System.out.println("您每月需缴个税："+num_tax+"元。");
	}
	else if(sum_taxable<=80000) {
		tax_rate=0.35;
		qui_sub=7160;
		System.out.println("您的适用税率为："+tax_rate*100+"%"+"，速算扣除数为："+qui_sub+"元。");
		num_tax=sum_taxable*tax_rate-qui_sub;
		System.out.println("您每月需缴个税："+num_tax+"元。");
	}
	else {
		tax_rate=0.45;
		qui_sub=15160;
		System.out.println("您的适用税率为："+tax_rate*100+"%"+"，速算扣除数为："+qui_sub+"元。");
		num_tax=sum_taxable*tax_rate-qui_sub;
		System.out.println("您每月需缴个税："+num_tax+"元。");
	}
}
}
