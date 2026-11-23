package modul7.seven4;
import java.awt.*;
import java.applet.*;

@SuppressWarnings("removal")
public class no1 extends Applet {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;

    public void init() {
        // Mengatur jenis, gaya, dan ukuran huruf
        font = new Font("Arial", Font.ITALIC, 18);

        // Mengubah semua penetapan warna menjadi hitam, putih, dan abu-abu
        redColor = Color.black;            // Sebelumnya: Color.red
        backgroundColor = Color.lightGray; // Sebelumnya: Color.orange
        blueColor = Color.darkGray;        // Sebelumnya: new Color(0, 0, 122)

        // Mengatur warna latar belakang applet menjadi abu-abu terang
        setBackground(backgroundColor);
    }

    public void paint(Graphics graph) {
        // Menampilkan judul teks (otomatis berwarna hitam di atas latar abu-abu terang)
        graph.setFont(font);
        graph.drawString("Draw Shapes", 90, 20);

        // Menggambar persegi luar dan persegi isi berwarna abu-abu gelap
        graph.setColor(blueColor);
        graph.drawRect(120, 120, 120, 120);
        graph.fillRect(115, 115, 90, 90);

        // Menggambar lingkaran (arc 360 derajat) berwarna hitam
        graph.setColor(redColor);
        graph.fillArc(110, 110, 50, 50, 0, 360);

        // Menggambar persegi di sudut kiri atas berwarna putih (sebelumnya: Color.CYAN)
        graph.setColor(Color.white);
        graph.drawRect(50, 50, 50, 50);
        graph.fillRect(50, 50, 60, 60);
    }
}