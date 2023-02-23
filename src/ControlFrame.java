import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class ControlFrame {

    JFrame controlFrame;
    public ControlFrame() {

        controlFrame = new JFrame();
        controlFrame.setTitle("Control");
        controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controlFrame.setSize(200, 100);
        controlFrame.setLocationRelativeTo(null);
        controlFrame.setResizable(false);
        controlFrame.setLayout(null);
        controlFrame.setAlwaysOnTop(true);
        controlFrame.setUndecorated(true);
        controlFrame.setVisible(true);

        controlFrame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

                controlFrame.setLocation(e.getXOnScreen(), e.getYOnScreen());
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
    }
}
