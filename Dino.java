import java.awt.Color;
import java.awt.Graphics;
import javafx.scene.shape.Rectangle;

public class Dino extends Rectangle {

  Dino(double dx, double dy, double dw, double dh) {
    super(dx, dy, dw, dh);
  }

  void draw(Graphics g) {
    g.setColor(Color.red);
    g.fillRect((int) getX(), (int) getY(), (int) getWidth(), (int) getHeight());
  }
}
