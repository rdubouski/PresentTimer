import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class TimerFrame {

    JFrame timerFrame;
    JLabel lTimer;

    public TimerFrame() {

        timerFrame = new JFrame();
        timerFrame.setTitle("Timer");
        timerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        timerFrame.setSize(200, 100);
        timerFrame.setLocationRelativeTo(null);
        timerFrame.setResizable(false);
        timerFrame.setLayout(null);
        timerFrame.setAlwaysOnTop(true);
        timerFrame.setUndecorated(true);

        lTimer = new JLabel("Timer");
        lTimer.setBounds(0, 0, 200, 100);
        timerFrame.add(lTimer);
        timerFrame.setVisible(true);

        timerFrame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

                timerFrame.setLocation(e.getXOnScreen(), e.getYOnScreen());
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
    }

}
