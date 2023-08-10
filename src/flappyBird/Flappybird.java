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
        jframe.setTitle("Flappy Bird");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(WIDTH, HEIGHT);
        jframe.setResizable(false);
        jframe.setVisible(true);

        bird = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
        columns = new ArrayList<Rectangle>();
        rand = new Random();

        timer.start();
    }

    public void repaint(Graphics g)
    {
        g.setColor(Color.cyan);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        g.setColor(Color.red);
        g.fillRect(bird.x, bird.y, bird.width, bird.height);

        g.setColor(Color.orange);
        g.fillRect(0, HEIGHT -120, WIDTH,150);

        g.setColor(Color.green);
        g.fillRect(0, HEIGHT -120, WIDTH,20);
    }

    public void addColumn()
    {
        int space = 300;
        int width = 100;
        int heigth = 50 + rand.nextInt(300);

        columns.add(new Rectangle())
    }

    public void paintColumn(Graphics g, Rectangle column)
    {
        g.setColor(Color.green);
        g.fillRect(column.x, column.y, column.width, column.height);
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