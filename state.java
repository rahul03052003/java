import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.Map;

public class swingn {
    private JPanel panel;
    private Map<String, String> stateCapitalMap;

    public swingn() {
        panel = new JPanel(new FlowLayout());

        // Initialize state-capital data
        stateCapitalMap = new HashMap<>();
        stateCapitalMap.put("Maharashtra", "Mumbai");
        stateCapitalMap.put("Tamil Nadu", "Chennai");
        stateCapitalMap.put("Karnataka", "Bengaluru");
        stateCapitalMap.put("West Bengal", "Kolkata");
        stateCapitalMap.put("Uttar Pradesh", "Lucknow");

        // Create a button for each state
        for (String state : stateCapitalMap.keySet()) {
            JButton button = new JButton(state);
            button.addActionListener((ActionEvent e) -> {
                String capital = stateCapitalMap.get(state);
                JOptionPane.showMessageDialog(panel,
                        "The capital of " + state + " is " + capital + ".",
                        "State Capital",
                        JOptionPane.INFORMATION_MESSAGE);
            });
            panel.add(button);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("State Capitals");
        swingn example = new swingn();
        frame.setContentPane(example.panel);
        frame.setSize(400, 120);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
