package Vascular;

import Plant.plant;
import detail.det;

public class vascular extends plant {
protected String specialCell;
public String example;
public det Detail =new det();
public vascular() {
	 specialCell="water conducting";
	 example="fern";
}

public String showInfo() {
	return "vascular [specialCell=" + specialCell + ", example=" + example + ", Detail=" + Detail + ", structure="
			+ structure + ", living=" + living + ", cell=" + cell + ", nutritionMechanism=" + nutritionMechanism
			+ ", modeOfNutrition=" + modeOfNutrition + "]";
}


}
