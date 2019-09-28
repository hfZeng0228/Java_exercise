/* 
	Last edit date: 2019/9/21
	Author:huafeng Tsang
	Mail:huafeng_tsang@bupt.edu.cn
	Function:Calculate the individual-income-tax in China.
*/

//˵����
//str.toCharArray()�������ַ�������strת��Ϊ�ַ�����
package Judge_Str;

import java.util.Scanner;

public class Judge_Str {
public static void main(String[] args) {
	System.out.println("�˳��������ж���֪�ַ����Ƿ�Ϊ�����ַ�����");
	System.out.println("������һ���ַ�����");
	Scanner input=new Scanner(System.in);
	String str=input.next();
	//System.out.println("��������ַ����ǣ�"+str);
	boolean judge=isHuiWen(str);
	if(judge) 
		System.out.println("���ַ����ǻ����ַ�����");
	else
		System.out.println("���ַ������ǻ����ַ�����");
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
