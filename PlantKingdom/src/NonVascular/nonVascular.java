package NonVascular;

import Plant.plant;
import detail.det;

public class nonVascular extends plant {
	public String specialCell;
	public String example;
	public det Detail =new det();
	public nonVascular() {
		
		specialCell ="non water conducting no xylem and phoem" ;
		example="algae";
	}
	
	public String showInfo() {
		return "nonVascular [specialCell=" + specialCell + ", example=" + example + ", Detail=" + Detail
				+ ", structure=" + structure + ", living=" + living + ", cell=" + cell + ", nutritionMechanism="
				+ nutritionMechanism + ", modeOfNutrition=" + modeOfNutrition + "]";
	}


	
	
}
