package Thread;

public class Priority {
	public static void main(String[] args) {
		pri p =new pri();
		for(int i=0;i<10;i++) {
		Thread a= new Thread(p,"adidas");
		a.setPriority(Thread.MAX_PRIORITY);
		Thread n= new Thread(p,"nike");
		n.setPriority(Thread.MAX_PRIORITY);
		Thread a1= new Thread(p,"anta");
		a1.setPriority(Thread.MAX_PRIORITY-5);
		Thread p1= new Thread(p,"puma");
		p1.setPriority(Thread.MIN_PRIORITY);
		Thread h= new Thread(p,"����");
		h.setPriority(Thread.MAX_PRIORITY-6);
	
		
		a.start();		
		a1.start();		
		p1.start();		
		h.start();		
		n.start();		
		}
	}
}

class pri implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "----->" + Thread.currentThread().getPriority());

	}

}