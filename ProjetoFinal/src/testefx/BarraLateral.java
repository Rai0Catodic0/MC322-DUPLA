package testefx;

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

    public void Desenhar(int qtdmetal, int qtdmunicao, int qtdcombustivel, int qtdnaveGuerra, int qtdnaveColonizacao, int qtdsatelite){
        //Quadrado
        Rectangle lateralBar = new Rectangle();
        lateralBar.setX(0);
        lateralBar.setY(119.5);
        lateralBar.setWidth(100);
        lateralBar.setHeight(400);
        lateralBar.setFill(Color.GREY);

        //Textos itens
        Text metal = new Text();
        metal.setText(String.valueOf(qtdmetal));
        metal.setX(70);
        metal.setY(169.5);
        metal.setFont(Font.font("Verdana", 20));
        metal.setFill(Color.BLACK);

        Text fuel = new Text();
        fuel.setText(String.valueOf(qtdcombustivel));
        fuel.setX(70);
        fuel.setY(229.5);
        fuel.setFont(Font.font("Verdana", 20));
        fuel.setFill(Color.BLACK);

        Text bullet = new Text();
        bullet.setText(String.valueOf(qtdmunicao));
        bullet.setY(289.5);
        bullet.setX(70);
        bullet.setFont(Font.font("Verdana", 20));
        bullet.setFill(Color.BLACK);

        Text warStarship = new Text();
        warStarship.setText(String.valueOf(qtdnaveColonizacao));
        warStarship.setX(70);
        warStarship.setY(349.5);
        warStarship.setFont(Font.font("Verdana", 20));
        warStarship.setFill(Color.BLACK);

        Text colonizationStarship = new Text();
        colonizationStarship.setText(String.valueOf(qtdnaveGuerra));
        colonizationStarship.setX(70);
        colonizationStarship.setY(409.5);
        colonizationStarship.setFont(Font.font("Verdana", 20));
        colonizationStarship.setFill(Color.BLACK);

        Text satelite = new Text();
        satelite.setText(String.valueOf(qtdsatelite));
        satelite.setX(70);
        satelite.setY(469.5);
        satelite.setFont(Font.font("Verdana", 20));
        satelite.setFill(Color.BLACK);

        //Imagens dos itens
        Image warStarshipImage = new Image("testefx/nave.png");
        ImageView imageViewWarStarship = new ImageView(warStarshipImage);
        imageViewWarStarship.setX(5);
        imageViewWarStarship.setY(139.5);

        Image colonizationStarshipImage = new Image("testefx/nave.png");
        ImageView imageViewColonizationStarship = new ImageView(colonizationStarshipImage);
        imageViewColonizationStarship.setX(5);
        imageViewColonizationStarship.setY(200.5);

        Image sateliteImage = new Image("testefx/nave.png");
        ImageView imageViewSatelite = new ImageView(sateliteImage);
        imageViewSatelite.setX(5);
        imageViewSatelite.setY(261.5);

        Image fuelImage = new Image("testefx/nave.png");
        ImageView imageViewFuel = new ImageView(fuelImage);
        imageViewFuel.setX(5);
        imageViewFuel.setY(322.5);

        Image bulletImage = new Image("testefx/nave.png");
        ImageView imageViewBullet = new ImageView(bulletImage);
        imageViewBullet.setX(5);
        imageViewBullet.setY(383.5);

        Image metalImage = new Image("testefx/nave.png");
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
