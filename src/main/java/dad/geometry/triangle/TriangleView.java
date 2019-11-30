package dad.geometry.triangle;

import dad.geometry.shape.Triangle;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class TriangleView extends GridPane {

	private TextField ancho,alto;
	private Label area,perimetro;
	private Triangle triangle;
	
	public TriangleView() {
		
		ancho=new TextField();
		ancho.setMaxWidth(80);
		
		alto=new TextField();
		alto.setMaxWidth(80);
		
		area=new Label();
		perimetro=new Label();
		
		triangle=new Triangle();
		triangle.setFill(Color.GREEN);
		triangle.setStrokeWidth(2);
		triangle.setStroke(Color.BLACK);
		
		this.setHgap(10);
		this.setVgap(10);
		this.setAlignment(Pos.BASELINE_CENTER);
		this.addRow(0, new Label("Ancho"),ancho);
		this.addRow(1, new Label("Altura"),alto);
		this.addRow(2, triangle);
		this.addRow(3, new Label("Area"),area);
		this.addRow(4, new Label("Perímetro"),perimetro);
		
		GridPane.setColumnSpan(triangle,2);
		GridPane.setHalignment(triangle,HPos.CENTER);
	}

	public TextField getAncho() {
		return ancho;
	}

	public TextField getAlto() {
		return alto;
	}

	public Label getArea() {
		return area;
	}

	public Label getPerimetro() {
		return perimetro;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	
	
}
