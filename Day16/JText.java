import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JText extends JFrame implements ActionListener {
    private JTextField textField1, textField2;
    private JTextArea textArea;

    public JText() { // Constructor without return type specified
        setTitle("Text Field Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creating text fields
        textField1 = new JTextField(20);
        textField2 = new JTextField(20);
        // Creating text area
        textArea = new JTextArea(10, 20);

        // Create a button
        JButton button = new JButton("Copy Text");

        // Add action listener to the button
        button.addActionListener(this);

        // Create a panel to hold components
        JPanel panel = new JPanel();
        panel.add(new JLabel("Text Field 1:"));
        panel.add(textField1);
        panel.add(new JLabel("Text Field 2:"));
        panel.add(textField2);
        panel.add(button);

        // Add components to the frame
        getContentPane().add(panel, BorderLayout.NORTH);
        getContentPane().add(new JScrollPane(textArea), BorderLayout.CENTER);

        setVisible(true);
    }

    // ActionListener implementation
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Copy Text")) {
            // Get text from textField1
            String text = textField1.getText();
            // Append text to textField2
            textField2.setText(text);

            // Append text to textArea
            textArea.append(text + "\n");

            // Clear textField1
            textField1.setText("");
        }
    }

    public static void main(String[] args) {
        new JText();
    }
}
