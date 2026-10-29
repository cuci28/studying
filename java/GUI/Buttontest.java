import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class ButtonTest extends Frame {
  Button btnBread = new Button("Bread!");
  Button btnButter = new Button("Butter!");
  Button btnJam = new Button("Jam!");

  public ButtonTest(String title) {
    super(title);
    setLayout(new FlowLayout());
    add(btnBread);
    add(btnButter);
    add(btnJam);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        setVisible(false);
        System.exit(0);
      }
    });
  }

  public static void main(String[] args) {
    ButtonTest ObjTest = new ButtonTest("The three little buttons!");
    ObjTest.setSize(1000, 1000);
    ObjTest.setVisible(true);
  }
}
