
public class gennericss {
	public static void main(String[] args) {
		MyCollection<String> mc = new MyCollection<>();
		mc.set("swt", 0);
		String a = mc.get(0);
		System.out.println(a);
		
		MyCollection <Object> ww =new MyCollection<>();
		ww.set(555555, 1);
//		ww.set("wwwwww", 6);  //不能这样用
//		String b=(String)ww.get(6);
		System.out.println(ww.get(1)); 
//		System.out.println(b); 
		
				
		
	}
}

class MyCollection <E> {

	Object[] objs = new Object[5];

	public void set(E e, int index) {
		objs[index] = e;
	}

	public E get(int index) {
		return (E)objs[index];
	}
}
