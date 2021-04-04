package Plant;

public class plant {
	
	public String structure;
	public boolean living;
	public String cell;
	public String nutritionMechanism;
	public String modeOfNutrition;
	
	public plant() {
		
		structure = "rigid";
		living = true;
		cell = "multi-cellular";
		nutritionMechanism = "photosynthesis";
		modeOfNutrition ="autotrpic";
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}
	
	
	

}
