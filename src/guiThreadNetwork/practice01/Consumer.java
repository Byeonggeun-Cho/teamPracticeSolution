package guiThreadNetwork.practice01;

public class Consumer extends Thread {
	private Buffer buffer = new Buffer();
	
	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		for(int i=0; i<=4; i++) {
			buffer.consumItem();
			
			if(i == 4) {
				System.out.println("마지막 제품이 사용되었습니다.");
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
