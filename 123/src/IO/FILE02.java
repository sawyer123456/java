package IO;

import java.io.File;
import java.io.IOException;

public class FILE02 {
	public static void main(String[] args) throws IOException {

		File sc = new File("I:\\JAVA\\123\\src\\io.txt");
		boolean flag = sc.createNewFile();
		System.out.println(flag);

		boolean flag2 = sc.delete();
		System.out.println(flag2);
		File scc = new File("I:\\JAVA\\123");
		boolean fi = scc.mkdir();
		System.out.println(fi);
		boolean f2 = scc.mkdirs();
		System.out.println(f2); 
		
		
		File[] f3 = scc.listFiles(); //列出下级名称
		for (File s : f3) {
			System.out.println(s);
		}
		System.out.println("----------------------------------------");
		String[] f4 = scc.list();   //列出下级File对象
		for (String  s : f4) {
			System.out.println(s);
		}
		
		printTen(1);
	}
	
	public static void printTen(int n) {  //递归
		if(n>10) { //递归头
			return;
		}
		System.out.println(n);
		printTen(n+1);  //递归体
	}
}
