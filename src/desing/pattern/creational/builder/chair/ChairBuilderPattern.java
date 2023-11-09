package desing.pattern.creational.builder.chair;

public class ChairBuilderPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chair chair = Chair.builder().setId(1).setName("Rocha").build();
		
		System.out.println(chair.getName());

	}

}
