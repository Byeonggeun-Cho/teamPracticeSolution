package guiThreadNetwork.practice01;

public class Producer extends Thread {
	private Buffer buffer = new Buffer();
	
	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		for(int i=0; i<=4; i++) {
			buffer.newItem(i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}
