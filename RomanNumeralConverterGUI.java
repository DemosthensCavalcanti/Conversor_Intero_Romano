import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RomanNumeralConverterGUI {
    private JFrame frame;
    private JTextField inputField;
    private JLabel resultLabel;

    public RomanNumeralConverterGUI() {
        frame = new JFrame("Conversor de Numerais Romanos");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel inputLabel = new JLabel("Entrada:");
        inputLabel.setBounds(10, 20, 80, 25);
        panel.add(inputLabel);

        inputField = new JTextField(20);
        inputField.setBounds(100, 20, 165, 25);
        panel.add(inputField);

        JButton intToRomanButton = new JButton("Inteiro para Romano");
        intToRomanButton.setBounds(10, 50, 200, 25);
        panel.add(intToRomanButton);

        JButton romanToIntButton = new JButton("Romano para Inteiro");
        romanToIntButton.setBounds(10, 80, 200, 25);
        panel.add(romanToIntButton);

        resultLabel = new JLabel("Resultado:");
        resultLabel.setBounds(10, 110, 300, 25);
        panel.add(resultLabel);

        intToRomanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(inputField.getText());
                    String result = RomanNumeralConverter.intToRoman(number);
                    resultLabel.setText("Resultado: " + result);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Por favor, insira um número válido.");
                } catch (IllegalArgumentException ex) {
                    resultLabel.setText(ex.getMessage());
                } catch (InvalidRomanNumeralException ex) {
                    resultLabel.setText(ex.getMessage());
                }
            }
        });

        romanToIntButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String roman = inputField.getText().toUpperCase();
                    int result = RomanNumeralConverter.romanToInt(roman);
                    resultLabel.setText("Resultado: " + result);
                } catch (InvalidRomanNumeralException ex) {
                    resultLabel.setText(ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RomanNumeralConverterGUI();
            }
        });
    }
}