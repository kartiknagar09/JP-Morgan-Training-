import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EventListenersDemo extends JFrame implements MouseListener, MouseMotionListener, KeyListener, WindowListener, ActionListener {
    JButton button;

    public EventListenersDemo() {
        setTitle("Event Listeners Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Click Me");
        button.addActionListener(this);

        add(button);
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);
        addWindowListener(this);

        setVisible(true);
    }

    // ActionListener implementation
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked!");
    }

    // MouseListener implementation
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    // MouseMotionListener implementation
    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse Dragged at: (" + e.getX() + ", " + e.getY() + ")");
    }
    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse Moved at: (" + e.getX() + ", " + e.getY() + ")");
    }

    // KeyListener implementation
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed: " + e.getKeyChar());
    }
    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    // WindowListener implementation
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened!");
    }
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing!");
    }
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed!");
    }
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified!");
    }
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified!");
    }
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] args) {
        new EventListenersDemo();
    }
}
