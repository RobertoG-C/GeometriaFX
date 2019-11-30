package dad.geometry.rectangle;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class RectangleControl {
	
	private RectangleModel model=new RectangleModel();
	private RectangleView  view=new RectangleView();
	
	public RectangleControl() {
		
		Bindings.bindBidirectional(view.getAlto().textProperty(), model.altoProperty(), new NumberStringConverter());
		Bindings.bindBidirectional(view.getAncho().textProperty(),model.anchoProperty(), new NumberStringConverter());
		view.getArea().textProperty().bind(model.areaProperty().asString());
		view.getPerimetro().textProperty().bind(model.perimetroProperty().asString());
		view.getRectangle().widthProperty().bind(model.anchoProperty());
		view.getRectangle().heightProperty().bind(model.altoProperty());
		
	}
	
	public RectangleModel getModel() {
		return model;
	}
	
	public RectangleView getView() {
		return view;
	}

}
