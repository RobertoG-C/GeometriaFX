package dad.geometry.root;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GeometryApp extends Application {

	private Control root;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		 root=new Control();
		
		 Scene scene = new Scene(root.getView(),320,200);
		 primaryStage.setTitle("Geometry");
		 primaryStage.setScene(scene);
		 primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
