package com.kaebe;

import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;

/**
 * Created by chris_000 on 9/20/2015.
 */
public class MiddleManagementPanel extends JPanel {


    public MiddleManagementPanel() {
        super(new GridLayout(3, 4, 5, 5));
        setBackground(Color.WHITE);

        int gridLayoutIndex = 0;

        add(createNewsFeed(), gridLayoutIndex++);

        add(PieChart.createPieChart(), gridLayoutIndex++);

        add(LineChart.createLineChart("Lower Manager Suicides", createDataset()), gridLayoutIndex++);

        add(BubbleChart.createBubbleChart(), gridLayoutIndex++);

        add(BarChart.createBarChart(), gridLayoutIndex++);
    }

    private JComponent createNewsFeed() {
        JTextPane newsFeed = new JTextPane();
        newsFeed.setBorder(BorderFactory.createTitledBorder("News Feed"));
        newsFeed.setEditable(false);
        newsFeed.setText("Middle Management");
        return newsFeed;
    }


    private static DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
        dataset.addValue( (int)(5*Math.random()) , "suicides" , "2010" );
        dataset.addValue( (int)(5*Math.random()) , "suicides" , "2011" );
        dataset.addValue( (int)(15*Math.random()) , "suicides" ,  "2012" );
        dataset.addValue((int) (5 * Math.random()), "suicides", "2013");
        dataset.addValue((int) (5 * Math.random()), "suicides", "2014");
        dataset.addValue((int) (5 * Math.random()), "suicides", "2015");
        return dataset;
    }


    @Override
    public String toString() {
        return "Middle Management";
    }
}
