package day_7;

class Multi_1 extends Thread{
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

class Multi_2 extends Thread{
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

public class MultiThreadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi_1 m1 = new Multi_1();
		Multi_2 m2 = new Multi_2();
		//System.out.println(m2.getPriority());
		//m2.setPriority(Thread.MAX_PRIORITY);
		m1.start();
		try {
			Thread.sleep(5);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		m2.start();
		
	}

}
