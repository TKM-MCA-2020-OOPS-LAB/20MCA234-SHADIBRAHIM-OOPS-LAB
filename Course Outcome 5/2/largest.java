/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shads;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class largest extends Applet implements ActionListener
 {  TextField txt1,txt2,txt3,txt4;
    Button b1;
      public void init()
    {   setLayout(null);
        txt1=new TextField();
        txt2=new TextField();
        txt3=new TextField();
        txt4=new TextField();
        b1=new Button("Submit");
        txt1.setBounds(100, 100,50, 30);
        add(txt1);
        txt2.setBounds(100,200,50, 30);
        add(txt2);
        txt3.setBounds(100,300,50, 30);
        add(txt3);
        txt4.setBounds(100,400,50, 30);
        add(txt4);
        b1.setBounds(100, 500,100,100);
        add(b1);
        
    b1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          float num1,num2,num3;
        String str;
        str = txt1.getText();
        num1 = Float.parseFloat(str);
        str = txt2.getText();
        num2 = Float.parseFloat(str);
        str = txt3.getText();
        num3 = Float.parseFloat(str);
        if(num1>num2 && num1>num3)
            txt4.setText(num1+"");
        else if(num2>num1 && num2>num3)
            txt4.setText(num2+"");
        else
            txt4.setText(num3+"");

    } //To change body of generated methods, choose Tools | Templates.
    }

 


