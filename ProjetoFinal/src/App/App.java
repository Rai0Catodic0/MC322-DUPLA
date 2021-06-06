package App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class App extends Canvas implements Runnable, MouseListener {

    public static JFrame frame;
    public Thread thread;
    public static BufferedImage imagem;
    public static BufferedImage nave;
    public static BufferedImage fundoImagem;
    public Spritesheet spritesheet;
    public Spritesheet fundo;
    public int x = 0, y = 0;


    public static int LARGURA = 200;
    public static int ALTURA = 200;
    public static int ESCALA = 3;
    public int yClick=0, xClick=0;
    public boolean jogando = false;

    public boolean DIREITA, ESQUERDA, CIMA, BAIXO;

    public App(){
        //addKeyListener(this);
        addMouseListener(this);
        this.setPreferredSize(new Dimension(LARGURA*ESCALA, ALTURA*ESCALA));
        imagem = new BufferedImage(LARGURA*ESCALA, ALTURA*ESCALA, BufferedImage.TYPE_INT_RGB);
        IniciarFrame();
        spritesheet = new Spritesheet("nave.png");
        fundo = new Spritesheet("espacoPreto.jpg");
        nave = spritesheet.getSpritesheet(1656,822,166,166);
        fundoImagem = fundo.getSpritesheet(0,0,600,400);
    }

    public static void main(String args[]){
        App app = new App();
        app.Iniciar();
    }

    public void IniciarFrame(){
        frame = new JFrame("Colonizadores Espaciais");
        frame.add(this);
        frame.setResizable(false);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public synchronized void Iniciar(){
        thread = new Thread(this);
        jogando = true;
        thread.start();
    }

    public synchronized void Parar(){
        jogando = false;
        try {
            thread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    public void Tick(){
        this.x = this.xClick;
        this.y = this.yClick;
//        if(DIREITA){
//            x++;
//        } else if(ESQUERDA){
//            x--;
//        } else if(CIMA){
//            y--;
//        } else if(BAIXO){
//            y++;
//        }
        //System.out.println("AQUIIIIUI"+DIREITA+ESQUERDA+CIMA+BAIXO);
    }

    public void Renderizar(){
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
            this.createBufferStrategy(3);
            return;
        }
        requestFocus();
        Graphics g = bs.getDrawGraphics();
        //g.setColor(Color.BLACK);
        g.fillRect(0,0,LARGURA*ESCALA,ALTURA*ESCALA);
        g.setColor(Color.GREEN);
        //g.setColor(Color.white);
        //g.setFont(new Font("Arial", Font.BOLD,26));
        //g.drawString("oioioi",30,30);
        g.drawImage(fundoImagem, 0,0, null);
        g.drawImage(nave, x,y,null);

        bs.show();

    }

    @Override
    public void run() {
        long lastTime = System.nanoTime();
        double amountOfTick = 60.0;
        double ns = 1000000000/amountOfTick;
        double delta = 0;
        int frames = 0;
        double timer = System.currentTimeMillis();
        while(jogando){
            long now = System.nanoTime();
            delta+=(now-lastTime)/ns;
            lastTime = now;
            if(delta>=1){
                Tick();
                Renderizar();
                frames++;
                delta--;
            }
            if(System.currentTimeMillis()-timer>=1000){
                System.out.println("FPS "+frames);
                frames = 0;
                timer+=1000;
            }
        }
        Parar();
    }

//    @Override
//    public void keyTyped(KeyEvent keyEvent) {
//
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//        if(e.getKeyCode()==e.VK_D){
//            DIREITA = true;
//        } else if(e.getKeyCode()==KeyEvent.VK_A){
//            ESQUERDA = true;
//        } else if(e.getKeyCode()==KeyEvent.VK_W){
//            CIMA = true;
//        } else if(e.getKeyCode()==KeyEvent.VK_S){
//            BAIXO = true;
//        }
//    }
//
//    @Override
//    public void keyReleased(KeyEvent keyEvent) {
//        if(keyEvent.getKeyCode()==keyEvent.VK_D){
//            DIREITA = false;
//        } else if(keyEvent.getKeyCode()==KeyEvent.VK_A){
//            ESQUERDA = false;
//        } else if(keyEvent.getKeyCode()==KeyEvent.VK_W){
//            CIMA = false;
//        } else if(keyEvent.getKeyCode()==KeyEvent.VK_S){
//            BAIXO = false;
//        }
//    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        this.xClick = mouseEvent.getX()-83;
        this.yClick = mouseEvent.getY()-83;
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        System.out.println("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        System.out.println("mouseEvent");
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        System.out.println("mouseExited");
    }
}
