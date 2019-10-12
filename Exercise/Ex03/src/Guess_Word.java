/* 
	Last edit date: 2019/10/12
	Author:huafeng Tsang
	Mail:huafeng_tsang@bupt.edu.cn
	Function:Guess the word by typing in.
*/

import java.util.Random;
import java.util.Scanner;

public class Guess_Word {
	public static void main(String[] args) {
		System.out.println("Welcome to the word-guessing party!");
		System.out.println("You can type in 'esc' to exit in anytime.");
		String[] words= {"expression","word","interesting","trace","navigate","programmer","self-discipline"};
		boolean goon=true;
		//one time word-guessing playing
		while(goon==true) {
			Random rand=new Random();
			int s_num=rand.nextInt(words.length);
			int w_len=words[s_num].length();
			char[] str=words[s_num].toCharArray();
			
			System.out.print("(Guess)Enter a letter in word ");
			String tip="";
			for(int i=0;i<w_len;i++) {
				tip=tip+'*';
			}
			System.out.println(tip+">");
			
			//press "esc" to exit the programming in anytime
			String exit="esc";
			int miss=0;
			boolean guess_on=true;
			//type in a word to guess the word.
			while(guess_on==true){
				char[] tips=tip.toCharArray();
				Scanner input1=new Scanner(System.in);
				String input=input1.next();
				if(input.equals("esc")) {
					System.out.println("Thanks for coming!");
					return;
				}
				else if(input.length()!=1) {
					System.out.println("Please enter only one letter!");
					continue;
				}
				char letter=input.charAt(0);
				boolean have=false;
				for(int i=0;i<w_len;i++) {
					if(letter==str[i]&&letter!=tips[i]) {
						have=true;
						tips[i]=letter;
					}
					else if(letter==str[i]&&letter==tips[i]) {
						System.out.println(letter+" is already in the word!");
						have=true;
						break;
					}
				}
				if(have==false) {
					System.out.println(letter+" is not in the word!");
					miss++;
				}
				tip="";
				for(int i=0;i<w_len;i++) {
					tip+=tips[i];
				}
				if(tip.equals(words[s_num])) {
					System.out.println("The word is "+tip+". You missed "+miss+" times.");
					guess_on=false;
					System.out.println("Do you want to guess another word? Enter y or n>");
					Scanner input2=new Scanner(System.in);
					String s=input2.next();
					char choice=s.charAt(0);
					if(choice=='y')
						goon=true;
					else {
						goon=false;
						System.out.println("Thanks for coming!");
					}
				}
				else
					System.out.println("(Guess)Enter a letter in word "+tip+">");
			}
		}
	}
}
