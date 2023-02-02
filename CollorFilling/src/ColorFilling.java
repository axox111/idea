import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Scanner;
import java.io.File;

public class ColorFilling {

    public static void main(String[] args) {
        String path = "C:\\Users\\user\\Desktop\\full white.png";
        try {
            BufferedImage pic = ImageIO.read(new File(path));
            int picWidth = pic.getWidth();
            int picHeight = pic.getHeight();
            System.out.println("Введите координаты начальной точки заливки: ");
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            int y = input.nextInt();
            if (picWidth < x & picHeight < y) {
                System.out.println("Точка начала заливки за пределами полей изображения");
            }
            System.out.println("Введите цвет заливки в формате RGB: ");
            int red = input.nextInt();
            int green = input.nextInt();
            int blue = input.nextInt();
            System.out.println("Введите размер заливки: ");
            int paintWidth = input.nextInt();
            int paintHeight = input.nextInt();
            Graphics g = pic.createGraphics();
            Color newColor = new Color(red, green, blue);
            g.setColor(newColor);
            g.fillRect(x, y, paintWidth, paintHeight);
            ImageIO.write(pic, "png", new File(path));
        } catch (Exception e) {
            System.out.println("Файл не найден");
        }
    }
}