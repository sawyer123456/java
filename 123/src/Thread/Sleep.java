package Thread;

import java.text.SimpleDateFormat;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Date;

/**使用sleep来阻塞进程
 * @author Administrator
 *
 */
public class Sleep implements Runnable {
	int ticketNum = 100;

	@Override
	public void run() {
		while (true) {
			if (ticketNum < 0) {
				break;
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "-->" + ticketNum--);
		}
	}

	public static void main(String[] args) {
		Sleep w = new Sleep();
		System.out.println(Thread.currentThread().getName());
		new Thread(w, "马云").start();
		new Thread(w, "牛云").start();
		new Thread(w, "阿里云").start();

		num n = new num();
		new Thread(n, "number").start();

		Timede td = new Timede();
		new Thread(td, "时间------------->").start();

	}
}

class num implements Runnable {
	int nums = 10;

	@Override
	public void run() {
		while (true) {
			if (nums < 0) {
				break;
			}
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + "-->" + nums--);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}

class Timede implements Runnable {
	Date endTime = new Date(System.currentTimeMillis() + 1000 * 10);
	long end = endTime.getTime();

	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName() + new SimpleDateFormat("mm:ss").format(endTime));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			endTime = new Date(endTime.getTime() - 1000);
			if (end - 10000 > endTime.getTime()) {
				break;
			}

		}
	}

}
