package dad.geometry.circle;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CircleView extends GridPane {

	private TextField radius;
	private Label area,perimetro;
	private Circle circle;
	
	public CircleView() {
		
		radius=new TextField();
		radius.setMaxWidth(80);
		
		area=new Label();
		perimetro=new Label();
		
		circle=new Circle();
		circle.setFill(Color.RED);
		circle.setStrokeWidth(2);
		circle.setStroke(Color.BLACK);
		
		this.setHgap(10);
		this.setVgap(10);
		this.setAlignment(Pos.BASELINE_CENTER);
		this.addRow(0, new Label("Ancho"),radius);
		this.addRow(1, circle);
		this.addRow(2, new Label("Area"),area);
		this.addRow(3, new Label("Perímetro"),perimetro);
		
		GridPane.setColumnSpan(circle,1);
		GridPane.setHalignment(circle,HPos.CENTER);
	}

	public TextField getRadius() {
		return radius;
	}

	public Label getArea() {
		return area;
	}

	public Label getPerimetro() {
		return perimetro;
	}

	public Circle getCircle() {
		return circle;
	}

}
