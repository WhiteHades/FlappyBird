package flappyBird;
import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel
{
    @Override
    protected void painComponent(Graphics g)
    {
        super.paintComponent(g);

        Flappybird.flappybird.repaint(g);
    }
}
