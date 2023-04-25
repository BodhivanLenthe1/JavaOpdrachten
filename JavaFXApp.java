import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import view.Guihandler;

public class JavaFXApp extends Application
{
	@Override
	public void start(Stage primaryStage)
	{
		GridPane root = new GridPane();
		Scene scene = new Scene(root, 300,200);
		Guihandler gui = new Guihandler(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Gridpane");
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		launch(args);
	}
}