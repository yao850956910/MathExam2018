package zuoye1;
import java.util.*;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class MathExam6386{
	public static void main(String[] args)  {
	System.out.println("输入题目数量");
	Scanner sc =new Scanner(System.in);
	String number = sc.nextLine();
	int n = Integer.valueOf(number);
	DataOutputStream list;
	PrintStream ps;
	if(n>=1) {
	   for(int i=1;i<=n;i++) {
	    int b =(int)(Math.random()*100);
	    int c =(int)(Math.random()*100);
	    int d;
	    int rd=Math.random()>0.5?1:0; 
	    if(rd==1) {
	     System.setOut(ps);
	     System.out.println("("+i+")"+" "+b+" "+"+"+" "+c+" "+"=");
	    d=b+c; list.add("("+i+")"+" "+b+" "+"+"+" "+c+" "+"="+" "+d);
	    }
	    if(rd==0) {
	     while(b-c<0) 
	     {b=(int)(Math.random()*100);}
	     System.setOut(ps);
	     System.out.println("("+i+")"+" "+b+" "+"-"+" "+c+" "+"=");
	     d=b-c;
	     list.add("("+i+")"+" "+b+" "+"-"+" "+c+" "+"="+" "+d);
	     }  
	   }
	}
	else
		System.out.println("错误重新输入");
	   System.setOut(ps);
	   System.out.println("-----------标准答案-----------");
	   for (int i = 0; i < list.size(); i++) {
	    System.setOut(ps);
	    System.out.println(list.get(i));
	   }
		System.setOut(ps);
		File file = new File("e:/output.txt");
		FileReader reader = new FileReader(file);
		int fileLen = (int)file.length();
		char[] chars = new char[fileLen];
		reader.read(chars);
		String txt = String.valueOf(chars);
		PrintStream out;
		System.setOut(out);
		System.out.println(txt);
		System.out.println("e:/output.txt生成");
}
}