package declaringexceptions;

public class E2{
	public static void main(String[] args) throws InterruptedException {
		
		for(int i=0;i<5;i++) {
			System.out.println(" Hello Harshal ");
			
			Thread.sleep(3000);
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {
//				System.out.println("InterruptedException");
//			}
		}
		
	}
}