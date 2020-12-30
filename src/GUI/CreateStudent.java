/*
 * Created by JFormDesigner on Wed Dec 30 19:41:37 EET 2020
 */

package GUI;

import Users.Student;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author 3enwanak
 */
public class CreateStudent extends JFrame {
    public CreateStudent() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        Student student = new Student(textField1.getText(),Integer.parseInt(textField2.getText()),textField3.getText(),textField4.getText());
        JOptionPane.showMessageDialog(null,"Student Registered Successfully!" + "\nStudent ID: " + student.getID());
        this.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - 3enwanak
        panel1 = new JPanel();
        panel2 = new JPanel();
        label2 = new JLabel();
        label1 = new JLabel();
        panel3 = new JPanel();
        textField1 = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        textField2 = new JTextField();
        label5 = new JLabel();
        textField3 = new JTextField();
        label6 = new JLabel();
        textField4 = new JTextField();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setForeground(new Color(0, 255, 204));
            panel1.setBackground(Color.lightGray);
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax
            .swing.border.EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing
            .border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.
            Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt.Color.red
            ),panel1. getBorder()));panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override
            public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r".equals(e.getPropertyName(
            )))throw new RuntimeException();}});

            //======== panel2 ========
            {
                panel2.setBackground(new Color(6, 96, 159));

                //---- label2 ----
                label2.setText("Register Student");
                label2.setForeground(Color.black);
                label2.setFont(label2.getFont().deriveFont(label2.getFont().getStyle() | Font.BOLD, label2.getFont().getSize() + 5f));
                label2.setBackground(new Color(0, 51, 255));
                label2.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label1 ----
                label1.setIcon(new ImageIcon(getClass().getResource("/GUI/asu scaled.png")));

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGroup(panel2Layout.createParallelGroup()
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            //======== panel3 ========
            {
                panel3.setBackground(Color.white);

                //---- textField1 ----
                textField1.setBackground(Color.white);
                textField1.setForeground(Color.black);

                //---- label3 ----
                label3.setText("Full Name:");
                label3.setForeground(Color.black);
                label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 2f));

                //---- label4 ----
                label4.setText("Age:");
                label4.setForeground(Color.black);
                label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 2f));

                //---- textField2 ----
                textField2.setBackground(Color.white);
                textField2.setForeground(Color.black);

                //---- label5 ----
                label5.setText("Phone:");
                label5.setForeground(Color.black);
                label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 2f));

                //---- textField3 ----
                textField3.setBackground(Color.white);
                textField3.setForeground(Color.black);

                //---- label6 ----
                label6.setText("Email:");
                label6.setForeground(Color.black);
                label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 2f));

                //---- textField4 ----
                textField4.setForeground(Color.black);
                textField4.setBackground(Color.white);

                //---- button1 ----
                button1.setText("Register");
                button1.setBackground(new Color(6, 96, 159));
                button1.setForeground(Color.white);
                button1.addActionListener(e -> button1ActionPerformed(e));

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel3Layout.createParallelGroup()
                                    .addGroup(panel3Layout.createSequentialGroup()
                                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(textField4, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel3Layout.createSequentialGroup()
                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 456, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(GroupLayout.Alignment.LEADING, panel3Layout.createSequentialGroup()
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(21, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                            .addContainerGap(255, Short.MAX_VALUE)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
                            .addGap(236, 236, 236))
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(43, 43, 43)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(53, 53, 53)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(29, 29, 29)
                            .addComponent(button1)
                            .addGap(17, 17, 17))
                );
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(31, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 648, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createParallelGroup()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 528, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - 3enwanak
    private JPanel panel1;
    private JPanel panel2;
    private JLabel label2;
    private JLabel label1;
    private JPanel panel3;
    private JTextField textField1;
    private JLabel label3;
    private JLabel label4;
    private JTextField textField2;
    private JLabel label5;
    private JTextField textField3;
    private JLabel label6;
    private JTextField textField4;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
