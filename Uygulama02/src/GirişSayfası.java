import javax.swing.*;
import java.awt.*;
import java.util.jar.JarFile;

public class GirişSayfası {
    JFrame frame;

    public GirişSayfası(){
        frame = new JFrame("Giriş Sayfası");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);
    }
}
