
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculatorMain {
    public static void main(String[] args) {
        // Calculator calculator = new Calculator();
    }
}

class Calculator implements ActionListener {

    double number, answer;
    int calculation;

    JFrame frame;
    JLabel label = new JLabel();
    JTextField textField = new JTextField();

    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonDiv = new JButton("/");
    JButton buttonMinus = new JButton("-");

    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonMul = new JButton("*");

    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonPlus = new JButton("+");

    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonEqual = new JButton("=");

    JButton buttonZero = new JButton("0");
    JButton buttonDot = new JButton(".");

    Calculator() {
        setInterface();
        addCalculatorItems();
        addEventListener();
    }

    public void setInterface() {
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(300, 400);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addCalculatorItems() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.black);
        frame.add(label);

        textField.setBounds(10, 40, 270, 60);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        // First row
        buttonClear.setBounds(10, 110, 60, 40);
        frame.add(buttonClear);

        buttonDelete.setBounds(80, 110, 60, 40);
        frame.add(buttonDelete);

        buttonDiv.setBounds(150, 110, 60, 40);
        frame.add(buttonDiv);

        buttonMinus.setBounds(220, 110, 60, 40);
        frame.add(buttonMinus);

        // Second row
        buttonSeven.setBounds(10, 160, 60, 40);
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 160, 60, 40);
        frame.add(buttonEight);

        buttonNine.setBounds(150, 160, 60, 40);
        frame.add(buttonNine);

        buttonMul.setBounds(220, 160, 60, 40);
        frame.add(buttonMul);

        // Third row
        buttonFour.setBounds(10, 210, 60, 40);
        frame.add(buttonFour);

        buttonFive.setBounds(80, 210, 60, 40);
        frame.add(buttonFive);

        buttonSix.setBounds(150, 210, 60, 40);
        frame.add(buttonSix);

        buttonPlus.setBounds(220, 210, 60, 40);
        frame.add(buttonPlus);

        // Fourth row
        buttonOne.setBounds(10, 260, 60, 40);
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 260, 60, 40);
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 260, 60, 40);
        frame.add(buttonThree);

        buttonEqual.setBounds(220, 260, 60, 90);
        frame.add(buttonEqual);

        // Fifth row
        buttonDot.setBounds(150, 310, 60, 40);
        frame.add(buttonDot);

        buttonZero.setBounds(10, 310, 60, 40);
        frame.add(buttonZero);
    }

    public void addEventListener() {
        // 1st Row
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonMinus.addActionListener(this);

        // 2nd row
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);

        // 3rd row
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);

        // 4th row
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);

        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == buttonClear) {
            label.setText("");
            textField.setText("");
        } else if (source == buttonDelete) {
            int length = textField.getText().length();
            int number = length - 1;
            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());
            }
            if (textField.getText().isEmpty()) {
                label.setText("");
            }
        } else if (source == buttonZero) {
            if (!textField.getText().equals("0")) {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        }
    }
}
