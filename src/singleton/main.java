package singleton;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2 ) {
			System.out.print("equal");
		} else {
			System.out.print("not equal");
		}
		
		System.out.println("\n==========");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ":" + TicketMaker.getTicketMaker().getNextTicketNumber() );
		}
		
		System.out.println("\n==========");
		
		Triple a1 = Triple.getInstance("Alpha");
		Triple a2 = Triple.getInstance("Alpha");
//		Triple b1 = Triple.getInstance("Alpha");
		
		if(a1 == a2) {
			System.out.println("equal");
		}else {
			
		}
		
		
	}

}
