package View;

import Tabuleiro.Jogador;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class BarraLateral {
    public Group root;

    public BarraLateral(Group root){
        this.root = root;
    }

    public void Desenhar(Jogador jogador){

        //Quadrado
        int [] valores = jogador.status();
        Rectangle lateralBar = new Rectangle();
        lateralBar.setX(0);
        lateralBar.setY(119.5);
        lateralBar.setWidth(100);
        lateralBar.setHeight(400);
        lateralBar.setFill(Color.GREY);

        //Textos itens
        // metal
        Text metal = new Text();
        metal.setText(String.valueOf(valores[0]));
        metal.setX(70);
        metal.setY(469.5);//409.5
        metal.setFont(Font.font("Verdana", 20));
        metal.setFill(Color.BLACK);


        // combutivel
        Text fuel = new Text();
        fuel.setText(String.valueOf(valores[2]));
        fuel.setX(70);
        fuel.setY(349.5);
        fuel.setFont(Font.font("Verdana", 20));
        fuel.setFill(Color.BLACK);

        //municao
        Text bullet = new Text();
        bullet.setText(String.valueOf(valores[1]));
        bullet.setX(70);
        bullet.setY(409.5);
        bullet.setFont(Font.font("Verdana", 20));
        bullet.setFill(Color.BLACK);

        //guerra
        Text warStarship = new Text();
        warStarship.setText(String.valueOf(valores[4]));//valores[5]
        warStarship.setX(70);
        warStarship.setY(169.5 ); //  349.5
        warStarship.setFont(Font.font("Verdana", 20));
        warStarship.setFill(Color.BLACK);

        //colonizadora
        Text colonizationStarship = new Text();
        colonizationStarship.setText(String.valueOf(valores[5]));
        colonizationStarship.setX(70);
        colonizationStarship.setY(229.5);
        colonizationStarship.setFont(Font.font("Verdana", 20));
        colonizationStarship.setFill(Color.BLACK);

        //satelite
        Text satelite = new Text();
        satelite.setText(String.valueOf(valores[3]));
        satelite.setX(70); // 70
        satelite.setY(289.5); // 469.5
        satelite.setFont(Font.font("Verdana", 20));
        satelite.setFill(Color.BLACK);

        //Imagens dos itens
        //FIXME fazer o getter pro repre do jogador
        // guerra
        String guerraPath = "images/naveguerra"+jogador.repre+".png";
        Image warStarshipImage = new Image(guerraPath);
        ImageView imageViewWarStarship = new ImageView(warStarshipImage);
        imageViewWarStarship.setX(5);
        imageViewWarStarship.setY(139.5);

        // colonizadora
        String colonizadoraPath = "images/navecolonizadora"+jogador.repre+".png";
        Image colonizationStarshipImage = new Image(colonizadoraPath);
        ImageView imageViewColonizationStarship = new ImageView(colonizationStarshipImage);
        imageViewColonizationStarship.setX(5);
        imageViewColonizationStarship.setY(200.5);

        // satelite
        String satelitePath = "images/satelite"+jogador.repre+".png";
        Image sateliteImage = new Image(satelitePath);
        ImageView imageViewSatelite = new ImageView(sateliteImage);
        imageViewSatelite.setX(5);
        imageViewSatelite.setY(261.5);

        Image fuelImage = new Image("images/combustivel.png");
        ImageView imageViewFuel = new ImageView(fuelImage);
        imageViewFuel.setX(5);
        imageViewFuel.setY(322.5);

        Image bulletImage = new Image("images/municao.png");
        ImageView imageViewBullet = new ImageView(bulletImage);
        imageViewBullet.setX(5);
        imageViewBullet.setY(383.5);

        Image metalImage = new Image("images/metal.png");
        ImageView imageViewMetal = new ImageView(metalImage);
        imageViewMetal.setX(5);
        imageViewMetal.setY(444.5);

        root.getChildren().add(lateralBar);
        root.getChildren().add(metal);
        root.getChildren().add(fuel);
        root.getChildren().add(bullet);
        root.getChildren().add(warStarship);
        root.getChildren().add(colonizationStarship);
        root.getChildren().add(satelite);
        root.getChildren().add(imageViewSatelite);
        root.getChildren().add(imageViewWarStarship);
        root.getChildren().add(imageViewColonizationStarship);
        root.getChildren().add(imageViewFuel);
        root.getChildren().add(imageViewBullet);
        root.getChildren().add(imageViewMetal);
    }
}
