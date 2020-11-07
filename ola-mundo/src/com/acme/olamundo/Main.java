package com.acme.olamundo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);		
	}

	@Override
	public void start(Stage stage) throws Exception {

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		
		Text titulo = new Text("Bem Vindo");
		titulo.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
		
		Label usuarioLabel = new Label("Usuário");
		Label senhaLabel = new Label("Senha");
		
		TextField usuarioTextField = new TextField();
		PasswordField senhaPasswordField = new PasswordField();

		Text mensagemText = new Text();
		mensagemText.setId("mensagem");

		HBox boxMensagem = new HBox(10);
		boxMensagem.setAlignment(Pos.CENTER);
		boxMensagem.getChildren().add(mensagemText);

		Button entrarButton = new Button("Entrar");
		entrarButton.setOnAction(evento -> {
			if (senhaPasswordField.getText().length() < 6) {
				mensagemText.setText("Senha Inválida!");
			}
			else {
				mensagemText.setText("");
			}
		});

		HBox boxBotao = new HBox(10);
		boxBotao.setAlignment(Pos.BOTTOM_RIGHT);
		boxBotao.getChildren().add(entrarButton);
		
		grid.add(titulo, 0, 0, 2, 1);
		grid.add(usuarioLabel, 0, 1);
		grid.add(senhaLabel, 0, 2);
		grid.add(usuarioTextField, 1, 1);
		grid.add(senhaPasswordField , 1, 2);
		grid.add(boxBotao, 1, 3);
		grid.add(boxMensagem, 0, 4, 2, 1);

		Scene scene = new Scene(grid, 300, 275);
		
		scene.getStylesheets().add(Main.class.getResource("Main.css").toExternalForm());
		
		stage.setScene(scene);
		stage.setTitle("Login");
		stage.show();
		
	}
	

	
}
