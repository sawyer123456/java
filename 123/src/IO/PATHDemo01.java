package IO;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class PATHDemo01 {
public static void main(String[] args)  {
	
	List <String> li =new ArrayList<String>();
	//路径的常用写法
	String path = "I:\\JAVA\\123\\src\\photo.jpg";	
	String path1 = "src\\photo.jpg";	
	String path2 ="I:/JAVA/123/src/photo.jpg";		 //常用写法，同适用于linux
	String path3 ="I:"+File.separatorChar+"JAVA"+File.separatorChar+"123"+File.separatorChar+"src"+File.separatorChar+"photo.jpg";
	li.add(path);
	li.add(path1);
	li.add(path2);
	li.add(path3);
	System.out.println(li);
	
	File sc =new File(path1);
	System.out.println(sc.getAbsolutePath());
	System.out.println(sc.length()/(Math.pow(2, 10))+"KB"); //转化为KB
	System.out.println("*********************************************");
	System.out.println(System.getProperty("user.dir"));
	
	
	System.out.println(sc.getName());
	System.out.println(sc.getPath());
	System.out.println(sc.getTotalSpace());
	System.out.println(sc.getParent());
	System.out.println(sc.getParentFile().getName());
	
	System.out.println(sc.isFile());
	System.out.println(sc.isDirectory());
	System.out.println(sc.exists());
	
	
	
	
	
}
 
}
