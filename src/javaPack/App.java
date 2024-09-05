package javaPack;
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int BoardWidth = 360;
        int BoardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
//        frame.setVisible(true);
        frame.setSize(BoardWidth, BoardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        object created
        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);


    }

}
