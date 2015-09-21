package com.kaebe;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;

/**
 * Created by chris_000 on 9/20/2015.
 */
public class LineChart {

    public static ChartPanel createLineChart() {
        return createLineChart("Line Graph", createDataset());
    }

    public static ChartPanel createLineChart(String title,DefaultCategoryDataset defaultCategoryDataset) {
        JFreeChart lineChart = ChartFactory.createLineChart(
                title,
                "Years", "Number of values",
                defaultCategoryDataset,
                PlotOrientation.VERTICAL,
                true, true, false);
        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setBorder(BorderFactory.createEtchedBorder());
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        return chartPanel;
    }

    private static DefaultCategoryDataset createDataset( )
    {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
        dataset.addValue( (int)(100*Math.random()) , "values" , "1970" );
        dataset.addValue( (int)(100*Math.random()) , "values" , "1980" );
        dataset.addValue( (int)(100*Math.random()) , "values" ,  "1990" );
        dataset.addValue( (int)(100*Math.random()) , "values" , "2000" );
        dataset.addValue((int) (100 * Math.random()), "values", "2010");
        dataset.addValue((int) (100 * Math.random()), "values", "2014");
        return dataset;
    }


    public static ChartPanel createXYLineChart(String title, String xAxis, String yAxis, XYSeriesCollection dataset) {
        JFreeChart lineChart = ChartFactory.createXYLineChart(
                title,
                xAxis, yAxis,
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);
        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setBorder(BorderFactory.createEtchedBorder());
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        return chartPanel;
    }



}
