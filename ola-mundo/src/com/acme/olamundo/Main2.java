package com.acme.olamundo;

import java.util.Date;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main2 extends Application {

	public static void main(String[] args) {
		launch(args);		
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		Button botao = new Button();
		botao.setText("Clique em Mim");
		
		botao.setOnAction(event -> {
			System.out.println("OLÁ PESSOAL! " + new Date());
		});
		
		StackPane root = new StackPane();
		
		root.getChildren().add(botao);
		
		Scene scene = new Scene(root, 500, 300);
		
		stage.setScene(scene);
		stage.setTitle("Olá Mundo!");
		stage.show();
		
	}
	
}
