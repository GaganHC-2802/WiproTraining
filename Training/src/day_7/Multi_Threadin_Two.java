package day_7;

class Multi_3 implements Runnable{
	public void run() {
		for(int i = 0; i<=10; i++) {
			System.out.println("This is Gagan");
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Multi_4 implements Runnable {
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("Multi-Threading");
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Multi_Threadin_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable m3 = new Multi_3();
		Runnable m4 = new Multi_4();
		Thread t1 = new Thread(m3);
		Thread t2 = new Thread(m4);
		
		t1.start();
		t2.start();
	}
}

