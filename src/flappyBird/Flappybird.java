package flappyBird;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Flappybird implements ActionListener
{
    public static Flappybird flappybird;

    public Renderer renderer;

    public final int WIDTH = 800, HEIGHT = 800;

    public Rectangle bird;


    public Flappybird()
    {
        JFrame jframe = new JFrame();
        Timer timer = new Timer(20, this);

        renderer = new Renderer();

        jframe.add(renderer);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(WIDTH, HEIGHT);
        jframe.setResizable(false);
        jframe.setVisible(true);

        bird = new Rectangle();

        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        renderer.repaint();
    }

    public void repaint(Graphics g)
    {
        System.out.println();
    }

    public static void main(String[] args)
    {
        Flappybird flappybird = new Flappybird();
    }
}