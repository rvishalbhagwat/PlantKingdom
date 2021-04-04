package Plant;

import NonVascular.nonVascular;
import Vascular.vascular;

public class Main {

	public static void main(String[] args) {
		
		nonVascular nv = new nonVascular();
		vascular vs = new vascular();
		nv.setStructure("soft");
		vs.setStructure("hard");
		System.out.println(nv.showInfo());
		System.out.println(vs.showInfo());

	}

}
