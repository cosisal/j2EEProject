package ws;

public class WsImplementation {

	
	public String diCiao() {
		
		System.out.println("Dico ciao a tutti");
		
		return "Ciao a tutti";
	}
	
	public String sayHello() {
		
		System.out.println("Hello");
		
		return "Ciao";
	}
	
	public String diQualcosa(String cosaDico) {
		
		System.out.println("Mi hanno fatto dire "+cosaDico);
		
		return cosaDico;
	}
}