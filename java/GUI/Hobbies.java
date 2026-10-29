import java.awt.Checkbox;
import java.awt.Label;
import java.awt.event.WindowAdapter;

public class Hobbies extends Frame {
  Checkbox cboxRead = new CheckBox("Reading", false);
  Checkbox cboxMus = new Checkbox("Music", false);
  Checkbox cboxPaint = new Checkbox("Painting", false);
  Checkbox cboxMovie = new Checkbox("Movies", false);
  Checkbox cboxDance = new Checkbox("Dancing", false);

  Label lblQts = new Label("Whats you're hobby?");

  public Hobbies(String str) {
    super(str);
    setLayout = new GridLayout(6, 1);
    add(lblQts);
    add(cboxRead);
    add(cboxDance);
    add(cboxMovie);
    add(cboxMus);
    add(cboxPaint);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        setVisible(false);
        System.exit(0);
      }
    });
  }

  public static void main(String[] args) {
    Hobbies objHobbies = new Hobbies("A basket full of checkboxes");
    objHobbies.setSize(500, 500);
    objHobbies.setVisible(true);
  }
}
