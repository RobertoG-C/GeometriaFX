package dad.geometry.hexagono;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ReadOnlyDoubleWrapper;
import javafx.beans.property.SimpleDoubleProperty;

public class hexagonoModel {

	private DoubleProperty radius=new SimpleDoubleProperty();
	private ReadOnlyDoubleWrapper perimetro=new ReadOnlyDoubleWrapper();
	private ReadOnlyDoubleWrapper area=new ReadOnlyDoubleWrapper();
	
	public hexagonoModel() {
		perimetro.bind(radius.multiply(6));
		area.bind(perimetro.multiply(Math.sqrt(3)).multiply(radius).divide(4));
	}

	public final DoubleProperty radiusProperty() {
		return this.radius;
	}
	

	public final double getRadius() {
		return this.radiusProperty().get();
	}
	

	public final void setRadius(final double radius) {
		this.radiusProperty().set(radius);
	}
	

	public final javafx.beans.property.ReadOnlyDoubleProperty perimetroProperty() {
		return this.perimetro.getReadOnlyProperty();
	}
	

	public final double getPerimetro() {
		return this.perimetroProperty().get();
	}
	

	public final javafx.beans.property.ReadOnlyDoubleProperty areaProperty() {
		return this.area.getReadOnlyProperty();
	}
	

	public final double getArea() {
		return this.areaProperty().get();
	}
	

	
	
}
