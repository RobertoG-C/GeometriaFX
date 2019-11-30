package dad.geometry.root;

import dad.geometry.circle.CircleControl;
import dad.geometry.hexagono.HexagonoControl;
import dad.geometry.rectangle.RectangleControl;
import dad.geometry.triangle.TriangleControl;

public class Control {
	
	private RectangleControl retenglaControl=new RectangleControl();
	private TriangleControl triangleControl=new TriangleControl();
	private CircleControl circleControl=new CircleControl();
	private HexagonoControl hexagonoControl=new HexagonoControl();
	
	private View view=new View();

	public Control() {
		view.getRetangleTab().setContent(retenglaControl.getView());
		view.getTriangleTab().setContent(triangleControl.getView());
		view.getCircleTab().setContent(circleControl.getView());
		view.getHexagonTab().setContent(hexagonoControl.getView());
	}
	
	public View getView() {
		return view;
	}
}
