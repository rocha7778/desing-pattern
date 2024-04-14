package desing.pattern.creational.builder;

public class MainTestBuilder {
	
	public static void main(String[] str) {
		
		new BaseChair().builder().setBrand("Hola").setColor("color").setHeight(2).setWeight(3).build();
		
	}

}
