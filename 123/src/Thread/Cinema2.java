package Thread;

import java.util.ArrayList;
import java.util.List;

public class Cinema2 {
	public static void main(String[] args) {
		List<Integer> available =new ArrayList<>();
		available.add(1);
		available.add(2);
		available.add(3);
		available.add(4);
		available.add(5);
		available.add(7);
		
		List<Integer> seats1= new ArrayList<>();
		seats1.add(1);
		seats1.add(2);
		List<Integer> seats2= new ArrayList<>();
		seats2.add(3);
		seats2.add(4);
		List<Integer> seats3= new ArrayList<>();
		seats3.add(5);
		seats3.add(7);
		
		Cinema3 cn=new Cinema3(available, "sxt");
		new Thread(new Coustomern(cn,seats1),"小明").start();
		new Thread(new Coustomern(cn,seats2),"小芳").start();
		new Thread(new Coustomern(cn,seats3),"小张").start();
		
		
	}
}

class Coustomern implements Runnable {
	Cinema3 cinema;
	List<Integer> seats;

	public Coustomern(Cinema3 cinema, List<Integer> seats) {

		this.cinema = cinema;
		this.seats = seats;
	}

	@Override
	public void run() {
		synchronized (cinema) {

			boolean flag = cinema.Booktickets3(seats);
			if (flag) {
				System.out.println("出票成功" + Thread.currentThread().getName()+seats);
			} else {
				System.out.println("出票失败" + Thread.currentThread().getName()+seats);
			}

		}
	}

}

class Cinema3 {
	List<Integer> available;
	String name;

	public Cinema3(List<Integer> available, String name) {

		this.available = available;
		this.name = name;
	}

	//购票
	public boolean Booktickets3(List<Integer> seats) {
		System.out.println("可用位置为：" + available);
		 List<Integer> copy =new ArrayList<Integer>();		 
		 
		 copy.addAll(available);		 
		 //相减，求交集
		 copy.removeAll(seats);
		 //判断大小
		 if(available.size()-copy.size()!=seats.size()) {
			 return false;
		 }
		 
		 available =copy;
		 return true;
		 
	}
}
