package testefx;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class BarraSelecao {
    public Group root;
    public BarraSelecao(Group root){
        this.root = root;
    }
    public void Desenhar(){

        //Botao
        Button botaoNaveColonizadora = new Button();
        botaoNaveColonizadora.setText("Nave Colonizadora");
        botaoNaveColonizadora.setLayoutY(539.5);
        botaoNaveColonizadora.setLayoutX(0);
        botaoNaveColonizadora.setFont(Font.font("Verdana", 15));
        Image imageNave = new Image(getClass().getResourceAsStream("nave.png"));
        ImageView iNave = new ImageView(imageNave);
        botaoNaveColonizadora.setGraphic(iNave);
        botaoNaveColonizadora.getStylesheets().add(getClass().getResource("styleBotaoSelecao.css").toExternalForm());
        root.getChildren().add(botaoNaveColonizadora);
    }
}
