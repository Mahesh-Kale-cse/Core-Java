package Exception;

public class Demo {
	
	
		public static void main(String[] args) {
			
			try {
				LowBalanceException obj = new LowBalanceException();
				throw obj;
			} catch (LowBalanceException e) {
				System.out.println("Send Mail & SMS");
			}
			
		}
}

