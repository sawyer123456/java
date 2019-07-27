import java.io.File;
import java.util.Date;

//File 的玩法
public class file {
	public static void main(String[] args) {
		File f = new File("D:/电影/华语/大陆");
		boolean flag = f.exists();
		
		if (!flag) {
			System.out.println("没有该文件夹,创建文件夹");
			f.mkdirs();
		}if(flag) {
			System.out.println("文件夹存在");
		}
		
		System.out.println(f);
		// f.renameTo(new File("D:/bb.txt")); //重命名
		System.out.println(System.getProperty("d:"));
		System.out.println("File名字：" + f.getName());
		System.out.println("File路径：" + f.getPath());
		System.out.println("File是否存在：" + f.length());
		System.out.println("File最后修改时间：" + new Date(f.lastModified()));
		System.out.println("File是否存在：" + f.exists());
		System.out.println("File是否是文件：" + f.isFile());
		System.out.println("File绝对路径：" + f.getAbsolutePath());
	}

}
