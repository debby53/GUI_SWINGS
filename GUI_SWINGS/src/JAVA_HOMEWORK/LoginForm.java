package JAVA_HOMEWORK;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame=new JFrame("LOGIN FORM");
        frame.setSize(700,400);
        frame.setResizable(false);
        JLabel userName=new JLabel("enter your username ");
        JLabel password=new JLabel("enter your password");
        JTextField txtName=new JTextField();
        JTextField txtPass=new JTextField();
        JButton log=new JButton("login");
        JButton clear=new JButton("clear");
        JLabel lblMessage = new JLabel("");

        userName.setBounds(100,50,150,30);
        txtName.setBounds(270,50,150,30);
        password.setBounds(100,100,150,30);
        txtPass.setBounds(270,100,150,30);
        log.setBounds( 150,140,100,30);
        clear.setBounds(270,140,100,30);
        lblMessage.setBounds(100, 200, 300, 30);

        frame.setLayout(null);
        frame.add(userName);
        frame.add(password);
        frame.add(txtPass);
        frame.add(txtName);
        frame.add(log);
        frame.add(clear);
        frame.add(lblMessage);

        log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String name=txtName.getText();
               String pswd=new String(txtPass.getText());
               if(name.equals("java")&& pswd.equals("auca@123")){
                   lblMessage.setText("WELCOME TO JAVA");
               }else {
                   lblMessage.setText("Incorrect username/password. try again");
               }

            }
        });
clear.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        txtPass.setText("");
        txtName.setText("");
        lblMessage.setText("");
    }
});


 frame.setVisible(true);



    }
}
