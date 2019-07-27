package Thread;

/**yiled礼让线程，运行到就绪
 * @author Administrator
 *
 */
public class Yiled implements Runnable {
	int i = 100;

	@Override
	public void run() {
		for (int j = 0; j < i; j++) {
			if (i % 20 == 0) {
				System.out.println(Thread.currentThread().getName() + "Start"+j);
				Thread.yield();
				System.out.println(Thread.currentThread().getName() + "End"+j);
			}
		}

	}

	public static void main(String[] args) {
		new Thread(new Yiled(),"商人").start();
		new Thread(new Yiled(),"工人").start();
		new Thread(()->{
			for(int i=0;i<100;i++) {
				System.out.println("---------"+i);
			}
		}).start();
		
	}

}
