import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StudentInfo extends JFrame implements ActionListener {
    private JTextField idField, nameField, ageField, emailField, semField;

    public StudentInfo() {
        setTitle("Student Information Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create labels
        JLabel idLabel = new JLabel("ID:");
        JLabel nameLabel = new JLabel("Name:");
        JLabel ageLabel = new JLabel("Age:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel semLabel = new JLabel("Semester:");

        // Create text fields
        idField = new JTextField(10);
        nameField = new JTextField(10);
        ageField = new JTextField(10);
        emailField = new JTextField(10);
        semField = new JTextField(10);

        // Create buttons
        JButton submitButton = new JButton("Submit");
        JButton clearButton = new JButton("Clear");

        // Add action listeners to buttons
        submitButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Create panel for form elements
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
        panel.add(idLabel);
        panel.add(idField);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(semLabel);
        panel.add(semField);
        panel.add(submitButton);
        panel.add(clearButton);

        // Add panel to frame
        getContentPane().add(panel);

        setVisible(true);
    }

    // ActionListener implementation
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Submit")) {
            // Validate email
            if (!isValidEmail(emailField.getText())) {
                JOptionPane.showMessageDialog(this, "Please enter a valid email address", "Invalid Email", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Display student information
            String message = "ID: " + idField.getText() + "\n" +
                             "Name: " + nameField.getText() + "\n" +
                             "Age: " + ageField.getText() + "\n" +
                             "Email: " + emailField.getText() + "\n" +
                             "Semester: " + semField.getText();
            JOptionPane.showMessageDialog(this, message, "Student Information", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getActionCommand().equals("Clear")) {
            // Clear all fields
            idField.setText("");
            nameField.setText("");
            ageField.setText("");
            emailField.setText("");
            semField.setText("");
        }
    }

    // Method to validate email address
    private boolean isValidEmail(String email) {
        // Simple email validation using regular expression
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }

    public static void main(String[] args) {
        new StudentInfo();
    }
}
