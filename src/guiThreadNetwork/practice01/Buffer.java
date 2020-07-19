package guiThreadNetwork.practice01;

public class Buffer {
	private int cnt=0;
	private boolean empty = true;
	
	public synchronized void newItem(int cnt) {		// 새로운 제품을 생산
		while(!empty) {							// 재고수량이 남아있는 경우 대기
			try {
				wait();			// java.lang.Object.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.cnt = cnt;			// 제품 순번
		empty = false;
		System.out.println("제품 생산: " + cnt + "번째 제품이 생산되었습니다.");
		notify();
	}

	public synchronized void consumItem() {		// 제품을 사용
		while(empty) {							// 재고수량이 없는 경우 대기
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		empty = true;
		System.out.println("제품 사용: " + cnt + "번째 제품이 사용되었습니다.");
	}
	
	
}
