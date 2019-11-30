package dad.geometry.triangle;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class TriangleControl {
	
	private TriangleModel model=new TriangleModel();
	private TriangleView  view=new TriangleView();
	
	public TriangleControl() {
		
		Bindings.bindBidirectional(view.getAlto().textProperty(), model.altoProperty(), new NumberStringConverter());
		Bindings.bindBidirectional(view.getAncho().textProperty(),model.anchoProperty(), new NumberStringConverter());
		view.getArea().textProperty().bind(model.areaProperty().asString());
		view.getPerimetro().textProperty().bind(model.perimetroProperty().asString());
		view.getTriangle().baseProperty().bind(model.anchoProperty());
		view.getTriangle().heightProperty().bind(model.altoProperty());
		
	}
	
	public TriangleModel getModel() {
		return model;
	}
	
	public TriangleView getView() {
		return view;
	}

}
