package App;

import Tabuleiro.Tabuleiro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
//teste
public class App extends Canvas implements Runnable {

    public static JFrame frame;
    public Thread thread;
    public static BufferedImage imagem;

    public Tabuleiro tabuleiro;
    public String IMAGEM_TABULEIRO = "espacoPreto.jpg";


    public static int LARGURA = 200;
    public static int ALTURA = 200;
    public static int ESCALA = 3;
    public boolean jogando = false;


    public App(){
        this.setPreferredSize(new Dimension(LARGURA*ESCALA, ALTURA*ESCALA));
        imagem = new BufferedImage(LARGURA*ESCALA, ALTURA*ESCALA, BufferedImage.TYPE_INT_RGB);
        IniciarFrame();
        tabuleiro = new Tabuleiro(IMAGEM_TABULEIRO);
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
        tabuleiro.Renderizar(g);
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
}
