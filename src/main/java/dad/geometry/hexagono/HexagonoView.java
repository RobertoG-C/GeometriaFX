package dad.geometry.hexagono;

import dad.geometry.shape.Hexagon;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class HexagonoView extends GridPane {

	private TextField radius;
	private Label area,perimetro;
	private Hexagon hexagon;
	
	public HexagonoView() {
		
		radius=new TextField();
		radius.setMaxWidth(80);

		area=new Label();
		perimetro=new Label();
		
		hexagon=new Hexagon();
		hexagon.setFill(Color.PURPLE);
		hexagon.setStrokeWidth(2);
		hexagon.setStroke(Color.BLACK);
		
		this.setHgap(10);
		this.setVgap(10);
		this.setAlignment(Pos.BASELINE_CENTER);
		this.addRow(0, new Label("Radius"),radius);
		this.addRow(1, hexagon);
		this.addRow(2, new Label("Area"),area);
		this.addRow(3, new Label("Perímetro"),perimetro);
		
		GridPane.setColumnSpan(hexagon,1);
		GridPane.setHalignment(hexagon,HPos.CENTER);
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

	public Hexagon getHexagon() {
		return hexagon;
	}

	public void setHexagon(Hexagon hexagon) {
		this.hexagon = hexagon;
	}

}
