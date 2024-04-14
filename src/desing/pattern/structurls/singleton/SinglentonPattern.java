package desing.pattern.structurls.singleton;

public class SinglentonPattern {
	
	private static SinglentonPattern instace;
	private SinglentonPattern() {}
	
	public static SinglentonPattern getIntace() {
		if(instace ==null) {
			instace = new SinglentonPattern();
		}
		
		return instace;
	}
	
	

}
