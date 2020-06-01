package solid_week8;

public class MainRunner {

	public static void main(String[] args) {
		Calculator oba = new Addition(2,3);
		Calculator obs = new Subtraction(10,3);
		Calculator obm = new Multiplication(7,9);
		Calculator obd = new Division(8,4);
		
		System.out.println(oba.operation());
		System.out.println(obs.operation());
		System.out.println(obm.operation());
		System.out.println(obd.operation());
	}

}
