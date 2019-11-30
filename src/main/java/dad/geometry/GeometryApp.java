package dad.geometry;

import dad.geometry.shape.Hexagon;
import dad.geometry.shape.Triangle;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class GeometryApp extends Application {

	private Circle circle;
	private Rectangle rectangle; 
	private Triangle triangle;
	private Hexagon hexagon;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		circle=new Circle();
		circle.setRadius(40);
		circle.setFill(Color.RED);
		circle.setStrokeWidth(2);
		circle.setStroke(Color.BLACK);
		
		rectangle=new Rectangle();
		rectangle.setHeight(60);
		rectangle.setWidth(80);
		rectangle.setFill(Color.CYAN);
		rectangle.setStrokeWidth(2);
		rectangle.setStroke(Color.BLACK);
		
		triangle=new Triangle(60, 60);
		triangle.setFill(Color.GREEN);
		triangle.setStrokeWidth(2);
		triangle.setStroke(Color.BLACK);
		
		hexagon=new Hexagon();
		hexagon.setRadius(40);
		hexagon.setFill(Color.PURPLE);
		hexagon.setStrokeWidth(2);
		hexagon.setStroke(Color.BLACK);
		
		
		GridPane root=new GridPane();
		root.setHgap(5);
		root.setVgap(5);
		root.add(rectangle, 0, 0);
		root.add(circle, 1, 0);
		root.add(triangle, 0, 1);
		root.add(hexagon, 1, 1);
		
		Scene scene = new Scene(root,320,200);
		 primaryStage.setTitle("Geometry");
		 primaryStage.setScene(scene);
		 primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
