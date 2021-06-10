package testefx;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotaoPlaneta extends Button {
    public BotaoPlaneta(String path){
        super();
        ImageView planeta = new ImageView(new Image(path));
        this.setGraphic(planeta);
        this.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
    }


}
