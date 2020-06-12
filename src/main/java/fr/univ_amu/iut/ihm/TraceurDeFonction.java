package fr.univ_amu.iut.ihm;

import fr.univ_amu.iut.utilitaires.Analyseur;
import fr.univ_amu.iut.utilitaires.ErreurDeSyntaxe;
import fr.univ_amu.iut.utilitaires.Expression;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TraceurDeFonction {

  public static void main(String[] args) {
    Stage stage = new Stage();
    BorderPane root = new BorderPane();
    Scene scene = new Scene(root);

    stage.setTitle("Traceur de fonction");

    stage.setWidth(600);
    stage.setHeight(650);

    stage.setResizable(false);

    TextField textField = new TextField("exp(-x * 0.2) * sin(x)");


    Button anl = new Button("Analyser");

    Expression val = new Expression();
    anl.setOnAction(actionEvent -> { val = analyser(textField.getText()); }); // analyser est une fonction

    Label labelText = new Label("Expression analysée : f(x) = ");
    labelText.setText("Expression analysée : f(x) = " + val);

    NumberAxis x = new NumberAxis();
    NumberAxis y = new NumberAxis();
    x.setAutoRanging(true);
    y.setAutoRanging(true);


    root.setCenter(textField);
    root.setBottom(labelText);

    root.setCenter(x);
    root.setCenter(y);

    stage.show();
  }

  void calculCoeffTransformationsAffines() {
  }
  	
  int transformationAffineY(double y) {
    return 0;
  }

  int transformationAffineX(double x) {
    return 0;
  }

  private void setIds() {
/*      votreIdentificateur.setId("texteAAnalyser");
      votreIdentificateur.setId("resultatAnalyse");
      votreIdentificateur.setId("demandeAnalyser");
      votreIdentificateur.setId("demandeTracer");
      votreIdentificateur.setId("demandeEffacer");
      votreIdentificateur.setId("zoneTraceCourbe");
      votreIdentificateur.setId("choixXMin");
      votreIdentificateur.setId("choixXMax");
      votreIdentificateur.setId("choixEspacementX_v1");
      votreIdentificateur.setId("choixEspacementX_v2");
      votreIdentificateur.setId("choixEspacementY_v1");
      votreIdentificateur.setId("choixEspacementY_v2");
      votreIdentificateur.setId("choixCouleur");
      votreIdentificateur.setId("choixEpaisseur");
      votreIdentificateur.setId("segmentsATracer");
      votreIdentificateur.setId("quadrillage");
      votreIdentificateur.setId("axeX");
      votreIdentificateur.setId("axeY");*/
  }

}