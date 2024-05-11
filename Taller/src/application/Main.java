package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;


public class Main extends Application {
	 private ListView<String> listView;
	 private TextField newInfoTextField;
	 private Map<String, String> labelData;

	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			AnchorPane leftPane = new AnchorPane();
			Image image1 = new Image("https://external-preview.redd.it/nOSHoIQgOoy9MVCMI9YjGV4GE0BNmVshlkrQFg2wis8.jpg?auto=webp&s=d5524309475049ab14909fc64470c9360f3d7de1");
			Image image2 = new Image("https://th.bing.com/th/id/OIP.e41ksQ3KF3hzQjTDY0MVogHaE3?rs=1&pid=ImgDetMain");
			Image image3 = new Image("https://th.bing.com/th/id/R.8dbc3f42f87fc77d4ca1b0cec4e2abd8?rik=FzQY19cZ4xz3mw&pid=ImgRaw&r=0");
			Image image4 = new Image("https://th.bing.com/th/id/OIP.a_unhNtavB916d01to5_QQHaJo?rs=1&pid=ImgDetMain");
			ImageView imageView1 = new ImageView(image1);
            ImageView imageView2 = new ImageView(image2);
            ImageView imageView3 = new ImageView(image3);
            ImageView imageView4 = new ImageView(image4);
            
            double imageWidth = 80;
            double imageHeight = 80;

            imageView1.setFitWidth(imageWidth);
            imageView1.setFitHeight(imageHeight);
            imageView2.setFitWidth(imageWidth);
            imageView2.setFitHeight(imageHeight);
            imageView3.setFitWidth(imageWidth);
            imageView3.setFitHeight(imageHeight);
            imageView4.setFitWidth(imageWidth);
            imageView4.setFitHeight(imageHeight);

            Label label1 = new Label("LIONEL MESSI", imageView1);
            Label label2 = new Label("CRISTIANO RONALDO", imageView2);
            Label label3 = new Label("LUCA MODRID", imageView3);
            Label label4 = new Label("TONY KROOS", imageView4);
            
            leftPane.getChildren().addAll(label1, label2, label3, label4);
            
            AnchorPane.setTopAnchor(label1, 20.0);
            AnchorPane.setLeftAnchor(label1, 20.0);

            AnchorPane.setTopAnchor(label2, 100.0);
            AnchorPane.setLeftAnchor(label2, 20.0);

            AnchorPane.setTopAnchor(label3, 180.0);
            AnchorPane.setLeftAnchor(label3, 20.0);

            AnchorPane.setTopAnchor(label4, 270.0);
            AnchorPane.setLeftAnchor(label4, 20.0);

            AnchorPane rightPane = new AnchorPane();

            listView = new ListView<>();
            rightPane.getChildren().add(listView);
            
            AnchorPane.setTopAnchor(listView, 20.0);
            AnchorPane.setLeftAnchor(listView, 10.0);
            AnchorPane.setRightAnchor(listView, 20.0);
            AnchorPane.setBottomAnchor(listView, 150.0);

            newInfoTextField = new TextField();
            newInfoTextField.setPromptText("       Aqui informacion    ");
            newInfoTextField.setStyle("-fx-background-color: blue; -fx-text-fill: white;");
            
            listView.setStyle("-fx-background-color: black; -fx-text-fill: blue;");
            rightPane.getChildren().add(newInfoTextField);

            AnchorPane.setBottomAnchor(newInfoTextField, 50.0);
            AnchorPane.setLeftAnchor(newInfoTextField, 170.0);
            AnchorPane.setRightAnchor(newInfoTextField, 30.0);

            root.setLeft(leftPane);
            root.setRight(rightPane);

			Scene scene = new Scene(root,800,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("ETIQUETAS");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
