package testefx;

import Itens.Item;
import Itens.NaveColonizadora;
import Itens.NaveGuerra;
import Itens.Satelite;
import Tabuleiro.Planeta;
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
    private boolean naveColonizadoraSelecionada = false;
    private boolean naveGuerraSelecionada = false;
    private boolean sateliteSelecionado = false;
    private Button botaoMover;
    private Button botaoConstruirSatelite;
    private Button botaoConstruirNaveGuerra;
    private Button botaoConstruirNaveColonizacao;
    private Button botaoNaveColonizadora;
    private Button botaoNaveGuerra;
    private Button botaoSatelite;



    private Group root;



    public BarraSelecao(Group root){
        this.root = root;
        CriarCena();
    }

    private void CriarCena(){
        //Botao Mover
        botaoMover = new Button();
        botaoMover.setText("Mover");
        botaoMover.setLayoutY(539.5);
        botaoMover.setLayoutX(300);
        botaoMover.setFont(Font.font("Verdana", 15));
        botaoMover.getStylesheets().add(getClass().getResource("styleBotaoSelecao.css").toExternalForm());

        //Botao Construir satélite
        botaoConstruirSatelite = new Button();
        botaoConstruirSatelite.setText("Construir Satelite");
        botaoConstruirSatelite.setLayoutY(539.5);
        botaoConstruirSatelite.setLayoutX(500);
        botaoConstruirSatelite.setFont(Font.font("Verdana", 15));
        botaoConstruirSatelite.getStylesheets().add(getClass().getResource("styleBotaoSelecao.css").toExternalForm());

        //Botao Construir Nave de Guerra
        botaoConstruirNaveGuerra = new Button();
        botaoConstruirNaveGuerra.setText("Construir Nave de Guerra");
        botaoConstruirNaveGuerra.setLayoutY(539.5);
        botaoConstruirNaveGuerra.setLayoutX(700);
        botaoConstruirNaveGuerra.setFont(Font.font("Verdana", 15));
        botaoConstruirNaveGuerra.getStylesheets().add(getClass().getResource("styleBotaoSelecao.css").toExternalForm());

        //Botao Construir Nave de Colonização
        botaoConstruirNaveColonizacao = new Button();
        botaoConstruirNaveColonizacao.setText("Construir Nave de Colonizacao");
        botaoConstruirNaveColonizacao.setLayoutY(539.5);
        botaoConstruirNaveColonizacao.setLayoutX(300);
        botaoConstruirNaveColonizacao.setFont(Font.font("Verdana", 15));
        botaoConstruirNaveColonizacao.getStylesheets().add(getClass().getResource("styleBotaoSelecao.css").toExternalForm());

        //Botao Nave colonizadora
        botaoNaveColonizadora = new Button();
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
                ColocarBotoes();
            }
        });

        //Botao Nave de Guerra
        botaoNaveGuerra = new Button();
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
                ColocarBotoes();
            }
        });


        //Botao Nave de Guerra
        botaoSatelite = new Button();
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
                ColocarBotoes();
            }
        });
    }

    private void ColocarBotoes(){
        System.out.println("nave col: "+naveColonizadoraSelecionada);
        System.out.println("nave guer: "+naveGuerraSelecionada);
        System.out.println("satelite : "+sateliteSelecionado);
        if((naveColonizadoraSelecionada || naveGuerraSelecionada)&&!root.getChildren().contains(botaoMover)){
            root.getChildren().add(botaoMover);
        }
        if(!naveColonizadoraSelecionada && !naveGuerraSelecionada){
            root.getChildren().remove(botaoMover);
        }
        if(naveColonizadoraSelecionada){
            root.getChildren().add(botaoConstruirSatelite);
        }
        if(!naveColonizadoraSelecionada){
            root.getChildren().remove(botaoConstruirSatelite);
        }
        if(sateliteSelecionado){
            root.getChildren().add(botaoConstruirNaveColonizacao);
            root.getChildren().add(botaoConstruirNaveGuerra);
        } else {
            root.getChildren().remove(botaoConstruirNaveColonizacao);
            root.getChildren().remove(botaoConstruirNaveGuerra);
        }
    }

    public void Esconder(){
        root.getChildren().remove(botaoConstruirNaveColonizacao);
        root.getChildren().remove(botaoConstruirNaveGuerra);
        root.getChildren().remove(botaoConstruirSatelite);

        root.getChildren().remove(botaoNaveColonizadora);
        root.getChildren().remove(botaoNaveGuerra);
        root.getChildren().remove(botaoSatelite);
    }

    public void Desenhar(Planeta planeta){
        double y = 539.5;
        int itemNaveGuerra = 0;
        int itemNaveCol = 0;
        int itemSat = 0;
        Esconder();
        for(Item item : planeta.getItens()){
            if(item instanceof NaveGuerra && itemNaveGuerra ==0){
                itemNaveGuerra = 1;
                botaoNaveGuerra.setLayoutY(y);
                root.getChildren().add(botaoNaveGuerra);
                y+=60;
            } else if (item instanceof NaveColonizadora && itemNaveCol == 0){
                itemNaveCol = 1;
                botaoConstruirNaveColonizacao.setLayoutY(y);
                root.getChildren().add(botaoNaveColonizadora);
                y+=60;
            } else if(item instanceof Satelite && itemSat == 0) {
                itemSat = 1;
                botaoSatelite.setLayoutY(y);
                root.getChildren().add(botaoSatelite);
                y+=60;
            }
        }
    }
}
