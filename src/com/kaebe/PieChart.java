package com.kaebe;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import javax.swing.*;

/**
 * Created by chris_000 on 9/20/2015.
 */
public class PieChart {


    public static ChartPanel createPieChart(){
        return createPieChart("Pie Chart", createPieDataset());
    }


    public static ChartPanel createPieChart(String title, PieDataset pieDataset){
        ChartPanel chartPanel;
        JFreeChart pieChart = ChartFactory.createPieChart( title, pieDataset );

        chartPanel = new ChartPanel(pieChart);
        chartPanel.setBorder(BorderFactory.createEtchedBorder());
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));

        return chartPanel;
    }



    private static PieDataset createPieDataset() {
        DefaultPieDataset pieData = new DefaultPieDataset();

        for (int i = 0; i < 4; i++) {
            pieData.setValue( "IPhone 5s" , new Double( 20 ) );
            pieData.setValue( "SamSung Grand" , new Double( 20 ) );
            pieData.setValue("MotoG", new Double(40));
            pieData.setValue("Nokia Lumia", new Double(10));
        }

        return pieData;
    }
}
