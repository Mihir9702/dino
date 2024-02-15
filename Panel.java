import java.awt.*;
import javax.swing.*;

public class Panel extends JPanel {

  static final Consts consts = new Consts();
  static JFrame frame;
  static Dino dino;
  Graphics g;
  Image image;
  Thread thread;

  Panel() {
    frame = new JFrame(consts.GAME_NAME);
    frame.setSize(consts.SCREEN_WIDTH, consts.SCREEN_HEIGHT);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.add(this);

    thread = new Thread();
    thread.start();
  }

  void draw(Graphics g) {
    dino = new Dino(100, -100, 100, 100);
    dino.draw(g);
  }

  void run() {
    image = createImage(consts.SCREEN_WIDTH, consts.SCREEN_HEIGHT);
    g = image.getGraphics();

    // g.drawImage(image, 0, 0, this);
    draw(g);
  }
}
