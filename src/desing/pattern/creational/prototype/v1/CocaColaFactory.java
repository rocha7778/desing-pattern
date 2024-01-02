package desing.pattern.creational.prototype.v1;

public class CocaColaFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cocacola cocacolaMediana = new Cocacola("light", "negra", "secreto");
		Cocacola cocacolaGrade = (Cocacola) cocacolaMediana.getClone();
		
		
		
		
		
		System.out.println( "CocaCola grande "+ cocacolaGrade.prepararGaseosa());

		System.out.println("CocaCola mediana " +cocacolaMediana.prepararGaseosa());

	}

}
