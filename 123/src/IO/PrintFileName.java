package IO;

import java.io.File;

public class PrintFileName {

	public static void main(String[] args) {
		File src = new File("F:\\\\小果联盟 解压密码123");

		printName(src, 0);
		System.out.println(len);
		count(src);
		System.out.println(len+"B");
	}

	private static void printName(File src, int iss) {  //打印层次目录
		for (int i = 0; i < iss; i++) {
			System.out.print("-"); // 层次感
		}
		System.out.println(src.getName());
		if (null == src || !src.exists()) {
			return;
		} else if (src.isDirectory()) { // 递归头
			for (File s : src.listFiles()) { // 递归体
				printName(s, iss + 1);
			}
		}
	}

	static int len = 0;

	public static void count(File src) {   //统计文件夹大小
		if (null != src && src.exists()) {
			if (src.isFile()) {
				len += src.length();
			} else {
				for (File s : src.listFiles()) {
					count(s);
				}
			}

		}
	}

}