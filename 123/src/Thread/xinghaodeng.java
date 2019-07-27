package Thread;

/**
 * 演员表演，观众看 演员停止，观众等待
 * 
 * @author Administrator
 *
 */
public class xinghaodeng {
	public static void main(String[] args) {
		Tv tv=new Tv();
		new Player(tv).start();
		new Watcher(tv).start();
		 
	}
}

class Tv {
	String voice;
	boolean flag = true;

	public synchronized void Player(String voice) {
		//演员等待
		if(!flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.voice = voice;	
		System.out.println("表演了" + this.voice);
		
		//唤醒
		this.notifyAll();  
		//切换灯
		this.flag=!flag;
	}

	public synchronized void Watcher() {
		//观众等待
		if(flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("听到了" + this.voice);
		//唤醒
		this.notifyAll();
		//切换灯
		this.flag=!flag;
	}
}

class Player extends Thread {
	Tv tv;

	public Player(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			if(i%2==0) {
				this.tv.Player("奇葩说");
			}else {
				this.tv.Player("今日说法");
			}
		}
	}
}

class Watcher extends Thread {
	Tv tv;

	public Watcher(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			tv.Watcher();
		}
	}
}
