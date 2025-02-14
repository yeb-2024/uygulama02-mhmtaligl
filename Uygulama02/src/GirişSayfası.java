import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

public class GirişSayfası implements ActionListener {
    JFrame frame;
    JTextField kullaniciAdi;
    JTextField sifre;
    JButton button;


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

        button = new JButton("Giriş yap");
        button.setFont(new Font("Arial",Font.PLAIN,20));
        button.addActionListener(this);


        frame = new JFrame("Giriş Sayfası");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);

        frame.add(ustPanel);
        frame.add(altPanel);
        frame.add(button);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            String kullanicAdi = this.kullaniciAdi.getText().trim();
            String sifre = this.sifre.getText().trim();

            if (kullanicAdi.isEmpty() || sifre.isEmpty()){
                JOptionPane.showMessageDialog(null,"Lütfen tüm alanları doldurun","Hata",JOptionPane.ERROR_MESSAGE);
            }
            if (sifre.length() < 5 ){
                JOptionPane.showMessageDialog(null,"Minimun 5 karalter olmalı","Hata",JOptionPane.ERROR_MESSAGE);

            }
        }
    }
}
