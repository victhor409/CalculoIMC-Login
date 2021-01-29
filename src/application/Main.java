package application;
	


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	private static Scene  scene;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/views/Login.fxml"));
			ScrollPane scrollpane = loader.load();
			
			scene = new Scene(scrollpane);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("IMC");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Scene getMainScene() {
		return scene;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
