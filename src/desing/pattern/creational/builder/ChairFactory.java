package desing.pattern.creational.builder;

import java.util.HashMap;
import java.util.Map;

public class ChairFactory {
	private Map<String, BaseChair> makersMap = new HashMap<>();
	
	public ChairFactory() {
		makersMap.put("CLASICA", new Classic().builder().setBrand("Classic Brand").setColor("Classic color").setHeight(10).setWeight(30).build());
		makersMap.put("MODERNA", new ModernChair().builder().setBrand("Modern Brand").setColor("Modern Color").setHeight(20).setWeight(15).build());
		makersMap.put("VINTAGE", new VintageChair().builder().setBrand("Vintage Brand").setColor("Vintage Color").setHeight(15).setWeight(10).build());
		makersMap.put("ROCKERA", new RockChair().builder().setBrand("Rock Brand").setColor("Black/gray Color").setHeight(10).setWeight(5).build());
	}

	public BaseChair getChair(String shapeType) {
		return makersMap.get(shapeType);
	}
}



