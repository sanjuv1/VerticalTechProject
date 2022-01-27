package Employees;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Employee_Management  implements ActionListener{

    JFrame f;
    JLabel l1,l2,l3;
    JButton b1,b2,b3,b4,b5,b6;

    Employee_Management(){
        f=new JFrame("Vertical Tech Employee Details");
        f.setBackground(Color.white);
        f.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0,0,700,500);
        l1.setLayout(null);
        //ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/details.jpg"));
        //l1.setIcon(i1);
        f.add(l1);

        l2 = new JLabel("Employee Details");
        l2.setBounds(50,20,200,40);
        l2.setFont(new Font("serif",Font.BOLD,25));
        l2.setForeground(Color.black);
        l1.add(l2);
        
        l3 = new JLabel("Attendance Details");
        l3.setBounds(400,20,200,40);
        l3.setFont(new Font("serif",Font.BOLD,25));
        l3.setForeground(Color.black);
        l1.add(l3);

        b1=new JButton("Add new employee");
        b1.setBounds(50,80,200,40);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        l1.add(b1);


        b2=new JButton("Remove Employee");
        b2.setBounds(50,140,200,40);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.addActionListener(this);
        l1.add(b2);

        b3=new JButton("Update Employee");
        b3.setBounds(50,200,200,40);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.addActionListener(this);
        l1.add(b3);

        b4=new JButton("View Employee Details");
        b4.setBounds(50,260,200,40);
        b4.setFont(new Font("serif",Font.BOLD,15));
        b4.addActionListener(this);
        l1.add(b4);
        
        b5=new JButton("View Attendance Details");
        b5.setBounds(400,80,200,40);
        b5.setFont(new Font("serif",Font.BOLD,15));
        b5.addActionListener(this);
        l1.add(b5);
        
        b6=new JButton("Add Attendance ");
        b6.setBounds(400,140,200,40);
        b6.setFont(new Font("serif",Font.BOLD,15));
        b6.addActionListener(this);
        l1.add(b6);
        
        b6=new JButton("Monthly Report ");
        b6.setBounds(400,250,200,40);
        b6.setFont(new Font("serif",Font.BOLD,15));
        b6.addActionListener(this);
        l1.add(b6);

        f.setVisible(true);
        f.setSize(700,500);
        f.setLocation(450,200);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            f.setVisible(false);
            new Add_Employee();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
             new DeleteEmployee();
        }
        if(ae.getSource()==b3){
            f.setVisible(false);
            new DeleteEmployee();
        }
        if(ae.getSource()==b4){
            f.setVisible(false);
            new SearchEmployee();
        }
         if(ae.getSource()==b5){
            f.setVisible(false);
            new Add_Attendance_Details();
        }
    }

    public static void main(String[ ] arg){
        Employee_Management d = new Employee_Management();
    }
}
