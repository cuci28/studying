import java.awt.*;
import java.awt.event.*;

class TextComments extends Frame {
  TextArea txtComment = new TextArea(50, 50);
  Label lblCom = new Label("Comments:");

  public TextComments(String title) {
    super(title);
    setLayout(new FlowLayout());
    add(lblCom);
    add(txtComment);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        setVisible(false);
        System.exit(0);
      }
    });

  }

  public static void main(String[] args) {
    TextComments ObjComments = new TextComments("Testing components");
    ObjComments.setSize(1200, 1200);
    ObjComments.setVisible(true);
  }

}
