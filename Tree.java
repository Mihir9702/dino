import javafx.scene.shape.Rectangle;

public class Tree extends Rectangle {

  private int tx;
  private int ty;
  private int tw;
  private int th;

  void Tree(int tx, int ty, int tw, int th) {
    this.tx = tx;
    this.ty = ty;
    this.tw = tw;
    this.th = th;
  }
}
