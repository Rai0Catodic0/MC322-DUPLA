package App;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Spritesheet {
    private BufferedImage spritesheet;

    public Spritesheet(String caminho){
        try {
            spritesheet = ImageIO.read(getClass().getResource(caminho));
        } catch (IOException e){
            System.out.println("exceção");
            e.printStackTrace();
        }

    }

    public BufferedImage getSpritesheet(int x, int y, int largura, int altura) {
        return spritesheet.getSubimage(x,y,largura,altura);
    }
}
