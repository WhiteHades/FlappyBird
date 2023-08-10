package flappyBird;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Flappybird implements ActionListener
{
    public static Flappybird flappybird;
    public final int WIDTH = 800;
    public final int HEIGHT = 800;
    public boolean started, gameOver;
    public int ticks, yMotion, score;
    public Renderer renderer;
    public Rectangle bird;
    public ArrayList<Rectangle> columns;
    public Random rand;

    public Flappybird()
    {
        JFrame jframe = new JFrame();
        Timer timer = new Timer(20, this);

        renderer = new Renderer();
        rand = new Random();

        jframe.add(renderer);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(WIDTH, HEIGHT);
        jframe.setResizable(false);
        jframe.setVisible(true);

        bird = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);

        timer.start();
    }

    public void repaint(Graphics g)
    {
        g.setColor(Color.cyan);
        g.fillRect(0, 0, WIDTH, HEIGHT);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        renderer.repaint();
    }

    public static void main(String[] args)
    {
        flappybird = new Flappybird();
    }
}