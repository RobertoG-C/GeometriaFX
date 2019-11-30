package dad.geometry.circle;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class CircleControl {
	
	private CircleModel model=new CircleModel();
	private CircleView  view=new CircleView();
	
	public CircleControl() {
		
		Bindings.bindBidirectional(view.getRadius().textProperty(), model.radiusProperty(), new NumberStringConverter());
		view.getArea().textProperty().bind(model.areaProperty().asString());
		view.getPerimetro().textProperty().bind(model.perimetroProperty().asString());
		view.getCircle().radiusProperty().bind(model.radiusProperty());
		
		
	}
	
	public CircleModel getModel() {
		return model;
	}
	
	public CircleView getView() {
		return view;
	}

}
