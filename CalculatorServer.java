import java.rmi.Naming;

public class CalculatorServer {
	public CalculatorServer() {
		try {
			Calculator c = new CalculatorImpl(); //Exportation implicite
			//Bind sur le rmiregistry
			Naming.rebind("rmi://localhost:1099/CalculatorService", c);
		} catch (Exception e) { System.out.println("Trouble: " + e); }
	}
	
	public static void main(String args[]) { new CalculatorServer(); }
} 