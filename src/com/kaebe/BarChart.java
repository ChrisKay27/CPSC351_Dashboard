package com.kaebe;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;

/**
 * Created by chris_000 on 9/20/2015.
 */
public class BarChart {

    public static ChartPanel createBarChart(){
        return createBarChart("Cars", "Category", "Value" ,createDataset());
    }


    public static ChartPanel createBarChart(String title, String categoryAxisLabel, String valueAxisLabel, CategoryDataset categoryDataset){
        JFreeChart barChart = ChartFactory.createBarChart(
                title,
                categoryAxisLabel,
                valueAxisLabel,
                categoryDataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel( barChart );
        chartPanel.setBorder(BorderFactory.createEtchedBorder());
        chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );
        return chartPanel;
    }

    private static CategoryDataset createDataset() {
            final String fiat = "FIAT";
            final String audi = "AUDI";
            final String ford = "FORD";
            final String speed = "Speed";
            final String millage = "Millage";
            final String userrating = "User Rating";
            final String safety = "safety";
            final DefaultCategoryDataset dataset =
                    new DefaultCategoryDataset( );

            dataset.addValue( 1.0 , fiat , speed );
            dataset.addValue( 3.0 , fiat , userrating );
            dataset.addValue( 5.0 , fiat , millage );
            dataset.addValue( 5.0 , fiat , safety );

            dataset.addValue( 5.0 , audi , speed );
            dataset.addValue( 6.0 , audi , userrating );
            dataset.addValue( 10.0 , audi , millage );
            dataset.addValue( 4.0 , audi , safety );

            dataset.addValue( 4.0 , ford , speed );
            dataset.addValue( 2.0 , ford , userrating );
            dataset.addValue( 3.0 , ford , millage );
            dataset.addValue( 6.0 , ford , safety );

            return dataset;
        }
}
