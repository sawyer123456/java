package Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 线程不安全，有负数有重复
 * 
 * @author Administrator
 *
 */
public class unsafe12306 {



	public static void main(String[] args) {
			//多个代理
		unsafe w = new unsafe();
		System.out.println(Thread.currentThread().getName());
		new Thread(w, "马云").start();
		new Thread(w, "牛云").start();
		new Thread(w, "阿里云").start();

	}
}

class unsafe implements Runnable {
	// 一份资源
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

}