package com.kaebe;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

	    JFrame mainFrame = new JFrame("Dashboard");
        mainFrame.setSize(1500, 800);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        JPanel contentPage = new Dashboard();

        mainFrame.setContentPane(contentPage);
        mainFrame.setVisible(true);
    }






}
