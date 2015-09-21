package com.kaebe;

import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;

/**
 * Created by chris_000 on 9/20/2015.
 */
public class UpperManagementPanel extends JPanel {


    public UpperManagementPanel() {
        super(new GridLayout(3,4,5,5));
        setBackground(Color.WHITE);

        int gridLayoutIndex = 0;

        add(createNewsFeed(), gridLayoutIndex++);

        add(PieChart.createPieChart(), gridLayoutIndex++);

        add(LineChart.createLineChart("Employee Suicides", createDataset()), gridLayoutIndex++);

        add(BubbleChart.createBubbleChart(), gridLayoutIndex++);

        add(BarChart.createBarChart(), gridLayoutIndex++);
    }

    private JComponent createNewsFeed() {
        JTextPane newsFeed = new JTextPane();
        newsFeed.setBorder(BorderFactory.createTitledBorder("News Feed"));
        newsFeed.setEditable(false);
        newsFeed.setText("-Upper Management\n\n-Sales are down 2%!\n\n-Sexual Harassment Lawsuit begins today!\n\n");
        return newsFeed;
    }


    private static DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
        dataset.addValue( (int)(10*Math.random()) , "suicides" , "2010" );
        dataset.addValue( (int)(10*Math.random()) , "suicides" , "2011" );
        dataset.addValue( (int)(30*Math.random()) , "suicides" ,  "2012" );
        dataset.addValue((int) (10 * Math.random()), "suicides", "2013");
        dataset.addValue((int) (10 * Math.random()), "suicides", "2014");
        dataset.addValue((int) (10 * Math.random()), "suicides", "2015");
        return dataset;
    }

    @Override
    public String toString() {
        return "Upper Management";
    }
}

