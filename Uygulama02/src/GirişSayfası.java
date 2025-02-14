import javax.swing.*;
import java.awt.*;
import java.util.jar.JarFile;

public class GirişSayfası {
    JFrame frame;
    JTextField kullaniciAdi;


    public GirişSayfası(){

        kullaniciAdi = new JTextField();
        kullaniciAdi.setPreferredSize(new Dimension(200,40));

        JPanel ustPanel = new JPanel();
        ustPanel.setLayout(new FlowLayout());
        JLabel ustLabel = new JLabel("Kullanıcı Adı:");
        ustPanel.setFont(new Font("Arial",Font.PLAIN,20));

        ustPanel.add(ustLabel);
        ustPanel.add(kullaniciAdi);



        frame = new JFrame("Giriş Sayfası");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);

        frame.add(ustPanel);

    }
}
