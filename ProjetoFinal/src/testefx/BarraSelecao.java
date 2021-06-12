package testefx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class BarraSelecao {
    public boolean naveColonizadoraSelecionada = false;
    public boolean naveGuerraSelecionada = false;
    public boolean sateliteSelecionado = false;
    public Group root;
    public BarraSelecao(Group root){
        this.root = root;
    }

    private void ColocarBotoes(Button botaoMover, Button botaoConstruirSatelite, Button botaoConstruirNaveColonizacao, Button botaoConstruirNaveGuerra){
        if(naveColonizadoraSelecionada){
            root.getChildren().add(botaoMover);
            root.getChildren().add(botaoConstruirSatelite);
        } else {
            root.getChildren().remove(botaoMover);
            root.getChildren().remove(botaoConstruirSatelite);
        }
        if(naveGuerraSelecionada){
            root.getChildren().add(botaoMover);
        } else {
            root.getChildren().remove(botaoMover);
        }
        if(sateliteSelecionado){
            root.getChildren().add(botaoConstruirNaveColonizacao);
            root.getChildren().add(botaoConstruirNaveGuerra);
        } else {
            root.getChildren().remove(botaoConstruirNaveColonizacao);
            root.getChildren().remove(botaoConstruirNaveGuerra);
        }
    }

    public void Desenhar(){

        //Botao Mover
        Button botaoMover = new Button();
        botaoMover.setText("Mover");
        botaoMover.setLayoutY(539.5);
        botaoMover.setLayoutX(300);
        botaoMover.setFont(Font.font("Verdana", 15));
        botaoMover.getStylesheets().add(getClass().getResource("styleBotaoSelecao.css").toExternalForm());

        //Botao Construir satélite
        Button botaoConstruirSatelite = new Button();
        botaoConstruirSatelite.setText("Construir Satelite");
        botaoConstruirSatelite.setLayoutY(539.5);
        botaoConstruirSatelite.setLayoutX(500);
        botaoConstruirSatelite.setFont(Font.font("Verdana", 15));
        botaoConstruirSatelite.getStylesheets().add(getClass().getResource("styleBotaoSelecao.css").toExternalForm());

        //Botao Construir Nave de Guerra
        Button botaoConstruirNaveGuerra = new Button();
        botaoConstruirNaveGuerra.setText("Construir Nave de Guerra");
        botaoConstruirNaveGuerra.setLayoutY(539.5);
        botaoConstruirNaveGuerra.setLayoutX(700);
        botaoConstruirNaveGuerra.setFont(Font.font("Verdana", 15));
        botaoConstruirNaveGuerra.getStylesheets().add(getClass().getResource("styleBotaoSelecao.css").toExternalForm());

        //Botao Construir Nave de Colonização
        Button botaoConstruirNaveColonizacao = new Button();
        botaoConstruirNaveColonizacao.setText("Construir Nave de Colonizacao");
        botaoConstruirNaveColonizacao.setLayoutY(539.5);
        botaoConstruirNaveColonizacao.setLayoutX(300);
        botaoConstruirNaveColonizacao.setFont(Font.font("Verdana", 15));
        botaoConstruirNaveColonizacao.getStylesheets().add(getClass().getResource("styleBotaoSelecao.css").toExternalForm());

        //Botao Nave colonizadora
        Button botaoNaveColonizadora = new Button();
        botaoNaveColonizadora.setText("Nave Colonizadora");
        botaoNaveColonizadora.setLayoutY(539.5);
        botaoNaveColonizadora.setLayoutX(0);
        botaoNaveColonizadora.setFont(Font.font("Verdana", 15));
        Image imageNave = new Image(getClass().getResourceAsStream("nave.png"));
        ImageView iNave = new ImageView(imageNave);
        botaoNaveColonizadora.setGraphic(iNave);
        botaoNaveColonizadora.getStylesheets().add(getClass().getResource("styleBotaoSelecao.css").toExternalForm());
        botaoNaveColonizadora.setMinWidth(210);
        botaoNaveColonizadora.setAlignment(Pos.BASELINE_LEFT);
        botaoNaveColonizadora.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println(actionEvent);
                naveGuerraSelecionada = false;
                sateliteSelecionado = false;
                naveColonizadoraSelecionada=!naveColonizadoraSelecionada;
                ColocarBotoes( botaoMover,  botaoConstruirSatelite,  botaoConstruirNaveColonizacao,  botaoConstruirNaveGuerra);
            }
        });
        root.getChildren().add(botaoNaveColonizadora);

        //Botao Nave de Guerra
        Button botaoNaveGuerra = new Button();
        botaoNaveGuerra.setText("Nave de Guerra");
        botaoNaveGuerra.setLayoutY(599.5);
        botaoNaveGuerra.setLayoutX(0);
        botaoNaveGuerra.setFont(Font.font("Verdana", 15));
        Image imageNaveGuerra = new Image(getClass().getResourceAsStream("nave.png"));
        ImageView iNaveGuerra = new ImageView(imageNaveGuerra);
        botaoNaveGuerra.setGraphic(iNaveGuerra);
        botaoNaveGuerra.getStylesheets().add(getClass().getResource("styleBotaoSelecao.css").toExternalForm());
        botaoNaveGuerra.setMinWidth(210);
        botaoNaveGuerra.setAlignment(Pos.BASELINE_LEFT);
        botaoNaveGuerra.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                naveColonizadoraSelecionada = false;
                sateliteSelecionado = false;
                naveGuerraSelecionada=!naveGuerraSelecionada;
                ColocarBotoes( botaoMover,  botaoConstruirSatelite,  botaoConstruirNaveColonizacao,  botaoConstruirNaveGuerra);
            }
        });
        root.getChildren().add(botaoNaveGuerra);


        //Botao Nave de Guerra
        Button botaoSatelite = new Button();
        botaoSatelite.setText("Satélite");
        botaoSatelite.setLayoutY(659.5);
        botaoSatelite.setLayoutX(0);
        botaoSatelite.setFont(Font.font("Verdana", 15));
        Image imageSatelite = new Image(getClass().getResourceAsStream("nave.png"));
        ImageView iSatelite = new ImageView(imageSatelite);
        botaoSatelite.setGraphic(iSatelite);
        botaoSatelite.getStylesheets().add(getClass().getResource("styleBotaoSelecao.css").toExternalForm());
        botaoSatelite.setMinWidth(210);
        botaoSatelite.setAlignment(Pos.BASELINE_LEFT);
        botaoSatelite.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                naveColonizadoraSelecionada = false;
                naveGuerraSelecionada = false;
                sateliteSelecionado=!sateliteSelecionado;
                ColocarBotoes( botaoMover,  botaoConstruirSatelite,  botaoConstruirNaveColonizacao,  botaoConstruirNaveGuerra);
            }
        });
        root.getChildren().add(botaoSatelite);
    }
}
