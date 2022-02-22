package com.company.weekTen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends Frame implements ActionListener
{
    Label uname,uPass;
    TextField nameText;
    TextField passText;
    Button login,Clear;
    Panel p;
    int attempt=0;
    char c='*';


    public void login()
    {
        p=new Panel();
        uname=new Label("Use Name: " ,Label.CENTER);
        uPass=new Label ("Password:" ,Label.RIGHT);

        nameText=new TextField(20);
        passText =new TextField(20);
        passText.setEchoChar(c);


        login=new Button("Login");
        Clear=new Button("Clear");
        login.addActionListener(this);
        Clear.addActionListener(this);

        p.add(uname);
        p.add(nameText);
        p.add(uPass);
        p.add(passText);
        p.add(login);
        p.add(Clear);

        add(p);

        setTitle("Login");
        setSize(290,200);
        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        Button btn=(Button)(ae.getSource());
        if(attempt<3)
        {
            if((btn.getLabel())=="Clear")
            {
                nameText.setText("");
                passText.setText("");
            }
            if((btn.getLabel()).equals("Login"))
            {
                try
                {
                    String user=nameText.getText();
                    String upass=passText.getText();

                    if(user.compareTo(upass)==0)
                    {

                        JOptionPane.showMessageDialog(this, "Login Successful");
                        System.out.println("Username is valid");
                    }
                    else
                    {
                        throw new InvalidPasswordException();
                    }
                }
                catch(Exception e)
                {

                    JOptionPane.showMessageDialog(this, "incorrect username or password");
                }
                attempt++;
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Limit exhausted 3 attempt");
            System.out.println("you are using 3 attempt");
            System.exit(0);
        }
    }
    public static void main(String args[])
    {
        Login pd=new Login();
        pd.login();
    }

    class InvalidPasswordException extends Exception
    {
        InvalidPasswordException()
        {
            System.out.println("User name and Password is not same");
        }
    }
}
