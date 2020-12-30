/*
 * Created by JFormDesigner on Wed Dec 30 18:04:56 EET 2020
 */

package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import System.SystemData;
import Users.Professor;

/**
 * @author 3enwanak
 */
public class AssignGrade extends JFrame {
    Professor professor;
    public AssignGrade(Professor professor) {
        this.professor=professor;
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {

    }

    private void comboBox1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button2MouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    private void button2ActionPerformed(ActionEvent e) {
        String name = (String) comboBox2.getSelectedItem();
        for(int i = 0 ; i<SystemData.students.size() ; i++){
            if(name.equals(SystemData.students.get(i).getName())){
                professor.assignGrade(SystemData.students.get(i),Float.parseFloat(textField1.getText()));
                JOptionPane.showMessageDialog(null, "Grade Assigned");
                break;
            }
        }
        this.setVisible(false);

    }

    private void button1ActionPerformed(ActionEvent e) {
        String name = (String) comboBox1.getSelectedItem();

        for(int i = 0 ; i<professor.getCourses().size();i++){
            if(name.equals(professor.getCourses().get(i).getName())){

                comboBox2.setVisible(true);
                label3.setVisible(true);
                button1.setEnabled(false);
                button2.setEnabled(true);
                textField1.setVisible(true);
                label4.setVisible(true);
                for(int j = 0 ; j<professor.getCourses().get(i).getStudents().size();j++){
                    comboBox2.addItem(professor.getCourses().get(i).getStudents().get(j).getName());
                }


                break;

            }
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - 3enwanak
        panel1 = new JPanel();
        panel2 = new JPanel();
        label2 = new JLabel();
        label1 = new JLabel();
        panel3 = new JPanel();
        label3 = new JLabel();
        comboBox1 = new JComboBox();
        label4 = new JLabel();
        comboBox2 = new JComboBox();
        button1 = new JButton();
        button2 = new JButton();
        textField1 = new JTextField();

        //======== this ========
        var contentPane = getContentPane();

        //======== panel1 ========
        {
            panel1.setForeground(new Color(0, 255, 204));
            panel1.setBackground(Color.lightGray);
            panel1.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax
            .swing.border.EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing
            .border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.
            Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt.Color.red
            ),panel1. getBorder()));panel1. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override
            public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.getPropertyName(
            )))throw new RuntimeException();}});

            //======== panel2 ========
            {
                panel2.setBackground(new Color(6, 96, 159));

                //---- label2 ----
                label2.setText("Assign Grade To Your Students");
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
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 484, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(21, Short.MAX_VALUE))
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addComponent(label2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
            }

            //======== panel3 ========
            {
                panel3.setBackground(Color.white);
                panel3.setForeground(Color.white);

                //---- label3 ----
                label3.setText("Choose Course:");
                label3.setForeground(Color.black);

                //---- comboBox1 ----

                comboBox1.setMaximumRowCount(60);
                comboBox1.setForeground(Color.black);
                comboBox1.setBackground(Color.white);
                for(int i = 0; i < professor.getCourses().size();i++){
                    comboBox1.addItem(professor.getCourses().get(i).getName());
                }

                //---- label4 ----
                label4.setText("Choose Student:");
                label4.setForeground(Color.black);
                label4.setVisible(false);

                //---- comboBox2 ----
                comboBox2.setVisible(false);

                //---- button1 ----
                button1.setText("Ok");
                button1.setBackground(new Color(6, 96, 159));
                button1.setForeground(Color.white);
                button1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {

                        button1MouseClicked(e);
                    }
                });
                button1.addActionListener(e -> button1ActionPerformed(e));

                //---- button2 ----
                button2.setText("Assign");
                button2.setBackground(new Color(6, 96, 159));
                button2.setForeground(Color.white);
                button2.setEnabled(false);
                button2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        button1MouseClicked(e);
                        button2MouseClicked(e);
                    }
                });
                button2.addActionListener(e -> button2ActionPerformed(e));

                //---- textField1 ----
                textField1.setVisible(false);

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(label3, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                .addComponent(label4, GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                            .addGap(31, 31, 31)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE)
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textField1)))
                            .addContainerGap(39, Short.MAX_VALUE))
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addContainerGap(73, Short.MAX_VALUE)
                            .addComponent(button1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                            .addGap(113, 113, 113)
                            .addComponent(button2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                            .addGap(74, 74, 74))
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addGap(88, 88, 88)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label4)
                                .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(button1)
                                .addComponent(button2))
                            .addContainerGap(21, Short.MAX_VALUE))
                );
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 128, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private JLabel label3;
    private JComboBox comboBox1;
    private JLabel label4;
    private JComboBox comboBox2;
    private JButton button1;
    private JButton button2;
    private JTextField textField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
