import javax.swing.*;

public class Panel extends JPanel {

  Consts consts = new Consts();

  void init() {
    JFrame frame = new JFrame(consts.getGameName());
    frame.setSize(consts.getScreenWidth(), consts.getScreenHeight());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);
    frame.add(this);
  }
}
