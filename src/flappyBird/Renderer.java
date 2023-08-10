package flappyBird;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.io.Serial;
import flappyBird.Flappybird;

public class Renderer extends JPanel
{
    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Flappybird.flappybird.repaint(g);
    }
}
