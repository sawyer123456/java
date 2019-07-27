package Thread;
/**
 * 避免死锁：不要在同一个代码块中同时持有多个对象锁
 */
public class DeadLock {
	public static void main(String[] args) {
		MakeUp g1 = new MakeUp(1, "小芳");
		MakeUp g2 = new MakeUp(2, "小张");
		g1.start();
		g2.start();
	}
}

class Lipstick {

}

class Mirror {

}

class MakeUp extends Thread {
	static Lipstick lipstick = new Lipstick();
	static Mirror mirror = new Mirror();

	int choice;

	String girl;

	public MakeUp(int choice, String girl) {
		this.choice = choice;
		this.girl = girl;
	}

	@Override
	public void run() {
		markUp();
	}

	// 相互持有2个对象，造成死锁
	
	private void markUp() {

		if (choice == 0) {
			synchronized (lipstick) {
				System.out.println(this.girl + "使用口红");
				// 拥有口红的锁
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//把一个同步块里的2个锁分开，就可以避免死锁
				/*
				 * synchronized (mirror) { System.out.println(this.girl +"使用镜子"); }
				 */
			}
			synchronized (mirror) {
				System.out.println(this.girl + "使用镜子");
			}
		} else {
			synchronized (mirror) {
				System.out.println(this.girl + "使用镜子");
				// 2秒后想拥有口红的锁
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//			synchronized (lipstick) {
//				System.out.println(this.girl +"使用口红");
//			}
			}
			synchronized (lipstick) {
				System.out.println(this.girl + "使用口红");
			}

		}
	}

}