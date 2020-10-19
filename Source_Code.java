import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Myclass implements ActionListener{
    private static JTextField field;
    Myclass(){}
    public static void main(String[] args){
        create_window();
    }
    private static void create_window(){
        JFrame frame = new JFrame("Calculator");
        frame.setSize(600, 518);
        frame.setLayout(null);
        frame.setVisible(true);
        ImageIcon icon = new ImageIcon("Icon.png");
        frame.setIconImage(icon.getImage());
        Myclass Class = new Myclass();
        field = new JTextField();
        field.setBounds(0, 0, 600, 80);
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("+");
        JButton b5 = new JButton("4");
        JButton b6 = new JButton("5");
        JButton b7 = new JButton("6");
        JButton b8 = new JButton("-");
        JButton b9 = new JButton("7");
        JButton b10 = new JButton("8");
        JButton b11 = new JButton("9");
        JButton b12 = new JButton("X");
        JButton b13 = new JButton(".");
        JButton b14 = new JButton("0");
        JButton b15 = new JButton("C");
        JButton b16 = new JButton("/");
        JButton b17 = new JButton("=");
        b1.setBounds(0, 80, 150, 80);
        b2.setBounds(150, 80, 150, 80);
        b3.setBounds(300, 80, 150, 80);
        b4.setBounds(450, 80, 150, 80);
        b5.setBounds(0, 160, 150, 80);
        b6.setBounds(150, 160, 150, 80);
        b7.setBounds(300, 160, 150, 80);
        b8.setBounds(450, 160, 150, 80);
        b9.setBounds(0, 240, 150, 80);
        b10.setBounds(150, 240, 150, 80);
        b11.setBounds(300, 240, 150, 80);
        b12.setBounds(450, 240, 150, 80);
        b13.setBounds(0, 320, 150, 80);
        b14.setBounds(150, 320, 150, 80);
        b15.setBounds(300, 320, 150, 80);
        b16.setBounds(450, 320, 150, 80);
        b17.setBounds(0, 400, 600, 80);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b10);
        frame.add(b11);
        frame.add(b12);
        frame.add(b13);
        frame.add(b14);
        frame.add(b15);
        frame.add(b16);
        frame.add(b17);
        frame.add(field);
        b1.addActionListener(Class);
        b2.addActionListener(Class);
        b3.addActionListener(Class);
        b4.addActionListener(Class);
        b5.addActionListener(Class);
        b6.addActionListener(Class);
        b7.addActionListener(Class);
        b8.addActionListener(Class);
        b9.addActionListener(Class);
        b10.addActionListener(Class);
        b11.addActionListener(Class);
        b12.addActionListener(Class);
        b13.addActionListener(Class);
        b14.addActionListener(Class);
        b15.addActionListener(Class);
        b16.addActionListener(Class);
        b17.addActionListener(Class);
    }
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.charAt(0) == 'C') {
            field.setText("");
        }else if (command.charAt(0) == '=') {
            field.setText(evaluate(field.getText()));
        }else {
            field.setText(field.getText() + command);
        }

    }
    public static String evaluate(String expression) {
        char[] arr = expression.toCharArray();
        String operand1 = "";String operand2 = "";String operator = "";
        double result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
                if(operator.isEmpty()){
                    operand1 += arr[i];
                }else{
                    operand2 += arr[i];
                }
            }

            if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == 'X') {
                operator += arr[i];
            }
        }

        if (operator.equals("+"))
            result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
        else if (operator.equals("-"))
            result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
        else if (operator.equals("/"))
            result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
        else
            result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));
        return operand1 + operator + operand2 + "=" +result;
    }
}
