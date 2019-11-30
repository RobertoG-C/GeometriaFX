package dad.geometry.hexagono;

import javafx.beans.binding.Bindings;
import javafx.util.converter.NumberStringConverter;

public class HexagonoControl {
	
	private hexagonoModel model=new hexagonoModel();
	private HexagonoView  view=new HexagonoView();
	
	public HexagonoControl() {
		
		Bindings.bindBidirectional(view.getRadius().textProperty(), model.radiusProperty(), new NumberStringConverter());
		view.getArea().textProperty().bind(model.areaProperty().asString());
		view.getPerimetro().textProperty().bind(model.perimetroProperty().asString());
		view.getHexagon().radiusProperty().bind(model.radiusProperty());
		
		
	}
	
	public hexagonoModel getModel() {
		return model;
	}
	
	public HexagonoView getView() {
		return view;
	}

}
