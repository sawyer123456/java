import java.util.ArrayList;

import java.util.List;

public class listssss {
	public static void main(String[] args) {
		/*Collection<String> s = new ArrayList();

		System.out.println(s.size());
		System.out.println(s.isEmpty());
		s.add("zhoujielun");
		System.out.println(s);

		System.out.println("*************************");
		List<String> l1 = new ArrayList<>();
		l1.add("aa");
		l1.add("bb");
		l1.add("cc");
		l1.add(2, "ss"); // set 替换2的内容

		List<String> l2 = new ArrayList<>();
		l2.add("aa");
		l2.add("dd");
		l2.add("ee");

		System.out.println(l1);
		l1.addAll(l2);
		System.out.println(l1);
		l1.retainAll(l2); // 取交集
		System.out.println(l1);
		l1.removeAll(l2); // 去掉相同的部分
		System.out.println(l1);*/
		Lista l =new Lista();
		l.Al("sss");
		
		System.out.println(l);
	
	}
}

class Lista {

	public List<String> Al(String s) {
		List<String> l = new ArrayList(10);
		l.add(s);
		return l;
	}
	 
}
