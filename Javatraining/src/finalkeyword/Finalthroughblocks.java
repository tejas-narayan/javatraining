package finalkeyword;

public class Finalthroughblocks {
		
				final int p;
				final static int q;
				static {
					q=2000;
				}
				static {
				}
				{
					p=1000;
				}

				public static void main(String[] args) {
					Finalthroughblocks fk= new Finalthroughblocks();
					System.out.println("x: "+fk.p);
					System.out.println("y: "+q); 

				}

	}

