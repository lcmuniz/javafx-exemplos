package com.acme.boasorte;

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main extends Application {
	
	String[] frases = {
			"Que tudo corra bem na sua cirurgia e que logo sua vida volte ao normal. Boa sorteText!",
			"Estarei enviando minhas melhores vibrações na hora da sua cirurgia. Boa sorteText!",
			"Estou torcendo por você e sei que sua cirurgia será um sucesso. Boa sorteText!",
			"Que a boa sorteText te encontre e decida jamais te abandonar.",
			"Jogue para o alto todos os seus desejos e apanhe um. Boa sorteText!",
			"O sucesso andará sempre do seu lado. Toda a sorteText do mundo!",
			"Boa sorteText! Estou torcendo para que tudo dê certo neste dia tão especial.",
			"Em todos os momentos, para todas as situações, o meu desejo é que a boa sorteText acompanhe sempre você!",
			"Tenho certeza que você terá mais uma conquista. Boa sorteText!",
			"Que a boa sorteText te persiga, a fé te mova, a coragem te acompanhe, os passos avancem e que seu coração se preencha de supostos vazios."
	};
	
	Text sorteText;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		
		VBox box = new VBox();
		box.setPadding(new Insets(20));
		box.setSpacing(20);
		box.setAlignment(Pos.CENTER);
		
		Text titulo = new Text("Gerador de Boa Sorte");
		titulo.setFont(Font.font("Tahoma", 36));

		box.getChildren().add(titulo);
		
		sorteText = new Text();
		sorteText.setFont(Font.font("SanSerif", 18));
		sorteText.setWrappingWidth(580);
		sorteText.setTextAlignment(TextAlignment.CENTER);
		
		box.getChildren().add(sorteText);
		
		Button botao = new Button("Nova Sorte");
		
		botao.setOnAction(this::mostrarSorte);
		
		box.getChildren().add(botao);
		
		Scene scene = new Scene(box, 600, 400);

		stage.setTitle("Gerador de Boa Sorte");
		stage.setScene(scene);
		stage.show();

	}
	
	private void mostrarSorte(ActionEvent event) {
		Random random = new Random();
		int indice = random.nextInt(frases.length);
		String frase = frases[indice];
		sorteText.setText(frase);
	}

}
