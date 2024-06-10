import javax.swing.*;
import java.awt.*;

class Layouts {
    public static void main(String[] args) {
        // FlowLayout
        JFrame flowLayoutFrame = new JFrame("FlowLayout Demo");
        flowLayoutFrame.setLayout(new FlowLayout());
        flowLayoutFrame.add(new JButton("Button 1"));
        flowLayoutFrame.add(new JButton("Button 2"));
        flowLayoutFrame.add(new JButton("Button 3"));
        flowLayoutFrame.add(new JButton("Button 4"));
        flowLayoutFrame.add(new JButton("Button 5"));
        flowLayoutFrame.setSize(300, 200);
        flowLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flowLayoutFrame.setVisible(true);

        // BorderLayout
        JFrame borderLayoutFrame = new JFrame("BorderLayout Demo");
        borderLayoutFrame.setLayout(new BorderLayout());
        borderLayoutFrame.add(new JButton("North"), BorderLayout.NORTH);
        borderLayoutFrame.add(new JButton("South"), BorderLayout.SOUTH);
        borderLayoutFrame.add(new JButton("East"), BorderLayout.EAST);
        borderLayoutFrame.add(new JButton("West"), BorderLayout.WEST);
        borderLayoutFrame.add(new JButton("Center"), BorderLayout.CENTER);
        borderLayoutFrame.setSize(300, 200);
        borderLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        borderLayoutFrame.setVisible(true);

        // GridLayout
        JFrame gridLayoutFrame = new JFrame("GridLayout Demo");
        gridLayoutFrame.setLayout(new GridLayout(2, 3));
        gridLayoutFrame.add(new JButton("Button 1"));
        gridLayoutFrame.add(new JButton("Button 2"));
        gridLayoutFrame.add(new JButton("Button 3"));
        gridLayoutFrame.add(new JButton("Button 4"));
        gridLayoutFrame.add(new JButton("Button 5"));
        gridLayoutFrame.add(new JButton("Button 6"));
        gridLayoutFrame.setSize(300, 200);
        gridLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gridLayoutFrame.setVisible(true);

        // GridBagLayout
        JFrame gridBagLayoutFrame = new JFrame("GridBagLayout Demo");
        gridBagLayoutFrame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gridBagLayoutFrame.add(new JButton("Button 1"), gbc);
        gbc.gridx = 1;
        gridBagLayoutFrame.add(new JButton("Button 2"), gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gridBagLayoutFrame.add(new JButton("Button 3"), gbc);
        gridBagLayoutFrame.setSize(300, 200);
        gridBagLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gridBagLayoutFrame.setVisible(true);

        // CardLayout
        JFrame cardLayoutFrame = new JFrame("CardLayout Demo");
        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Card 1"));
        card1.add(new JButton("Button 1"));
        cardPanel.add(card1, "Card 1");
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Card 2"));
        card2.add(new JButton("Button 2"));
        cardPanel.add(card2, "Card 2");
        cardLayoutFrame.add(cardPanel);
        cardLayoutFrame.setSize(300, 200);
        cardLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cardLayoutFrame.setVisible(true);
    }
}
