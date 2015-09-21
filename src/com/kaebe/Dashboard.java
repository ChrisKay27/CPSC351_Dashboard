package com.kaebe;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;

/**
 * Created by chris_000 on 9/20/2015.
 */
public class Dashboard extends JPanel {

    private JPanel upperManagementPanel = new UpperManagementPanel();
    private JPanel middleManagementPanel = new MiddleManagementPanel();
    private JPanel lowerManagementPanel = new LowerManagementPanel();

    private JPanel northPanel = new JPanel(new GridBagLayout());


    public Dashboard(){
        super(new BorderLayout());
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEtchedBorder());

        JLabel title = new JLabel("Dashboard");
        title.setFont(new Font("Impact", Font.PLAIN, 30));
        northPanel.add(title);
        northPanel.setBackground(Color.WHITE);
        add(northPanel, BorderLayout.NORTH);


        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(Color.WHITE);
        eastPanel.setPreferredSize(new Dimension(100, 10000));
        add(eastPanel, BorderLayout.EAST);



        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.WHITE);
        westPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
        //westPanel.setPreferredSize(new Dimension(200, 10000));


        DefaultListModel<JPanel> mListModel = new DefaultListModel<>();
        mListModel.addElement(upperManagementPanel);
        mListModel.addElement(middleManagementPanel);
        mListModel.addElement(lowerManagementPanel);
        JList<JPanel> managementLevelsList = new JList<>(mListModel);
        //managementLevelsList.setPreferredSize(new Dimension(200, 10000));

        managementLevelsList.addListSelectionListener(e -> {
            System.out.println(((JList) e.getSource()).getSelectedValue());
            BorderLayout layout = (BorderLayout) getLayout();
            Dashboard.this.remove(layout.getLayoutComponent(BorderLayout.CENTER));
            Dashboard.this.add((JPanel) ((JList) e.getSource()).getSelectedValue(), BorderLayout.CENTER);
            validate();
            Dashboard.this.repaint();
        });
        westPanel.add(managementLevelsList);
        add(westPanel, BorderLayout.WEST);



        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.WHITE);
        southPanel.setPreferredSize(new Dimension(10000, 100));
        add(southPanel, BorderLayout.SOUTH);




//        for (int i = gridLayoutIndex; i < 12; i++)
//            upperManagementPanel.add(new JPanel());

        add(upperManagementPanel, BorderLayout.CENTER);

    }



}
