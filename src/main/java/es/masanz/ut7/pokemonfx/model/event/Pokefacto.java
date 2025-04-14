package es.masanz.ut7.pokemonfx.model.event;

import es.masanz.ut7.pokemonfx.model.base.Evento;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import static es.masanz.ut7.pokemonfx.util.Configuration.*;

public class Pokefacto implements Evento {

    private final String[] pokefactos = {
            "Los jugadores de Pokémon son conocidos por tener una habilidad oculta: evadir la luz del sol",
            "Si usas a Charizard en competitivo, felicidades, eres único… como los otros 10 millones que hacen lo mismo",
            "Te pasaste horas criando por IVs perfectos, pero perdiste contra un niño con un Rattata y Focus Sash.",
            "Pueden recordar todas las evoluciones de Eevee, pero olvidan ducharse tres días seguidos",
            "Entrenan a sus Pokémon para ser campeones, mientras ellos se cansan subiendo escaleras"
    };

    private VBox root = new VBox();
    private Label label;
    private int step = 0;
    private String imagenEvento = "/pruebas/pokeball_transparente.png";

    @Override
    public void aplicarEfecto() {
        label = new Label(pokefactos[step]);
        label.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        label.setTextFill(Color.BLACK);

        root.setPrefWidth(VIEW_WIDTH);
        root.setMaxWidth(Double.MAX_VALUE);
        root.setPrefHeight(VIEW_HEIGHT / 4);
        root.setMaxHeight(VIEW_HEIGHT / 4);
        root.setStyle("-fx-background-color: white; -fx-alignment: center;");

        VBox.setVgrow(root, Priority.ALWAYS);
        root.setAlignment(Pos.BOTTOM_CENTER);
        root.getChildren().add(label);

        root.setOnMouseClicked(event -> {
            step++;
            actualizarTexto();
        });
    }

    private void actualizarTexto() {
        if (step < pokefactos.length) {
            label.setText(pokefactos[step]);
        } else {
            Platform.runLater(() -> {
                imagenEvento = null;
                ((Pane) root.getParent()).getChildren().remove(root);
            });
        }
    }

    @Override
    public String imagenDelEvento() {
        return imagenEvento;
    }

    public VBox getRoot() {
        return root;
    }
}
