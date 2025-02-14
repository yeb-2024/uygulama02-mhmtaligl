import javax.swing.*;
import java.awt.*;
import java.util.jar.JarFile;

public class GirişSayfası {
    JFrame frame;
    JTextField kullaniciAdi;
    JTextField sifre;


    public GirişSayfası(){

        kullaniciAdi = new JTextField();
        kullaniciAdi.setPreferredSize(new Dimension(200,40));

        JPanel ustPanel = new JPanel();
        ustPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JLabel ustLabel = new JLabel("Kullanıcı Adı:");
        ustPanel.setFont(new Font("Arial",Font.PLAIN,20));

        ustPanel.add(ustLabel);
        ustPanel.add(kullaniciAdi);

        JPanel altPanel = new JPanel();
        altPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JLabel altLabel = new JLabel("Şifre:");
        altLabel.setFont(new Font("Arial",Font.PLAIN,20));

        sifre = new JTextField();
        sifre.setPreferredSize(new Dimension(200,40));

        altPanel.add(altLabel);
        altPanel.add(sifre);

        frame = new JFrame("Giriş Sayfası");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);

        frame.add(ustPanel);
        frame.add(altPanel);

    }
}
