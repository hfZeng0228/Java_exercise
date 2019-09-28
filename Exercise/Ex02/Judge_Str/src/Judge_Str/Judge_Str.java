/* 
	Last edit date: 2019/9/21
	Author:huafeng Tsang
	Mail:huafeng_tsang@bupt.edu.cn
	Function:Calculate the individual-income-tax in China.
*/

//说明：
//str.toCharArray()方法将字符串变量str转换为字符数组
package Judge_Str;

import java.util.Scanner;

public class Judge_Str {
public static void main(String[] args) {
	System.out.println("此程序用于判断已知字符串是否为回文字符串。");
	System.out.println("请输入一个字符串：");
	Scanner input=new Scanner(System.in);
	String str=input.next();
	//System.out.println("您输入的字符串是："+str);
	boolean judge=isHuiWen(str);
	if(judge) 
		System.out.println("此字符串是回文字符串！");
	else
		System.out.println("此字符串不是回文字符串！");
}

public static boolean isHuiWen(String str) {
    int length = str.length();

    for (int i = 0; i < length / 2; i++) {
        if (str.toCharArray()[i] != str.toCharArray()[length - 1 - i]) {
            return false;
        }
    }
    
    return true;
}
}
