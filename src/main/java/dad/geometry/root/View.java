package dad.geometry.root;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class View extends TabPane {
	
	private Tab retangleTab,circleTab,hexagonTab,triangleTab;
	
	public View() {
		 retangleTab= new Tab();
		 retangleTab.setText("Rectangle");
		 
		 circleTab=new Tab();
		 circleTab.setText("Circle");
		 
		 hexagonTab= new Tab();
		 hexagonTab.setText("Hexagon");
		 
		 triangleTab=new Tab();
		 triangleTab.setText("Triangle");
		 
		 this.getTabs().addAll(retangleTab,circleTab,hexagonTab,triangleTab);
	}

	public Tab getRetangleTab() {
		return retangleTab;
	}

	public Tab getCircleTab() {
		return circleTab;
	}

	public Tab getHexagonTab() {
		return hexagonTab;
	}

	public Tab getTriangleTab() {
		return triangleTab;
	}

	

}
