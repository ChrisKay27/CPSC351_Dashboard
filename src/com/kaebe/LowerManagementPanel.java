package com.kaebe;

import com.sun.javafx.charts.Legend;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;

/**
 * Created by chris_000 on 9/20/2015.
 */
public class LowerManagementPanel extends JPanel {


    public LowerManagementPanel() {
        super(new GridLayout(3, 4, 5, 5));
        setBackground(Color.WHITE);
        int gridLayoutIndex = 0;

        add(createNewsFeed(), gridLayoutIndex++);

        add(PieChart.createPieChart("Pissed And Happy Customers", createPieDataset()), gridLayoutIndex++);

        add(LineChart.createLineChart("Employee Suicides", createSuicidesDataset()), gridLayoutIndex++);

        add(BubbleChart.createBubbleChart(), gridLayoutIndex++);

        add(BarChart.createBarChart("Hotties", "Hair Color", "Number of Employees", createHottiesDataset()), gridLayoutIndex++);


        add( createMinorityTheivesChart(), gridLayoutIndex++);

    }


    private JComponent createNewsFeed() {
        JTextPane newsFeed = new JTextPane();
        newsFeed.setBorder(BorderFactory.createTitledBorder("News Feed"));
        newsFeed.setEditable(false);
        newsFeed.setText("Lower Management");
        return newsFeed;
    }




    private static PieDataset createPieDataset() {
        DefaultPieDataset pieData = new DefaultPieDataset();

        for (int i = 0; i < 4; i++) {
            pieData.setValue( "Pissed Customers" , new Double( 40 ) );
            pieData.setValue( "Happy Customers" , new Double( 60 ) );
        }

        return pieData;
    }



    private static DefaultCategoryDataset createSuicidesDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
        dataset.addValue( (int)(10*Math.random()) , "suicides" , "2010" );
        dataset.addValue( (int)(10*Math.random()) , "suicides" , "2011" );
        dataset.addValue( (int)(30*Math.random()) , "suicides" ,  "2012" );
        dataset.addValue( (int)(10*Math.random()) , "suicides" , "2013" );
        dataset.addValue( (int)(10*Math.random()) , "suicides" , "2014" );
        dataset.addValue( (int)(10*Math.random()) , "suicides" , "2015" );
        return dataset;
    }


    private static ChartPanel createMinorityTheivesChart() {

        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeriesCollection dataset1 = new XYSeriesCollection();

        XYSeries series = new XYSeries("Minorities");
        series.add(2010, (int)(100*Math.random()));
        series.add(2011, (int)(100*Math.random()));
        series.add(2012, (int)(100*Math.random()));
        series.add(2013, (int)(100*Math.random()));
        series.add(2014, (int) (100 * Math.random()));

        XYSeries series1 = new XYSeries("XYGraph2");
        series1.add(3, 521);
        series1.add(4, 622);
        series1.add(2, 531);
        series1.add(6, 639);
        series1.add(2, 413);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Losses vs Minority Workers",
                "Minorities", "Stolen Product",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setBorder(BorderFactory.createEtchedBorder());
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));

        String sYAxis = "Strain";
        String sYAxisUOM = "J";
        String sYAxisLabel = sYAxis + "(" + sYAxisUOM + ")";
        String sXAxis = "Temperature";
        String sXAxisUOM = "C";
        String sXAxisLabel = sXAxis + "(" + sXAxisUOM + ")";

        String sY2Axis = "Stress";
        String sY2AxisUOM = "KJ";
        String sY2AxisLabel = sY2Axis + "(" + sY2AxisUOM + ")";
        String sX2Axis = "Viscosity";
        String sX2AxisUOM = "J/C";
        String sX2AxisLabel = sX2Axis + "(" + sX2AxisUOM + ")";

        XYPlot xyplot = chart.getXYPlot();

        NumberAxis domainAxis = new NumberAxis(sXAxisLabel);
        NumberAxis secdomainAxis = new NumberAxis(sX2AxisLabel);
        NumberAxis rangeAxis = new NumberAxis(sYAxisLabel);
        NumberAxis secrangeAxis = new NumberAxis(sY2AxisLabel);

        dataset.addSeries(series);
        xyplot.setDataset(0,dataset);
        xyplot.setDomainAxis(domainAxis);
        xyplot.setRangeAxis(rangeAxis);

        dataset1.addSeries(series1);
        xyplot.setDataset(1,dataset1);
        xyplot.mapDatasetToRangeAxis(1, 1);
        xyplot.setRangeAxis(1,secrangeAxis);
        xyplot.setRangeAxisLocation(1, AxisLocation.BOTTOM_OR_RIGHT);


//        final StandardLegend legend = (StandardLegend) chart.getLegend();
//        legend.setAnchor(Legend.EAST_NORTHEAST);
//        legend.setItemFont(new Font("Arial",Font.PLAIN,7));
//        legend.setPreferredWidth(250.0);
//        chart.setLegend(legend);


//        Font titleFont = new Font("SansSerif", Font.BOLD, 16);
//        TextTitle title = new TextTitle("Heading", titleFont);
//        title.setSpacer(new Spacer(0, 0.05D, 0.05D, 0.05D, 0.0D));
//        chart.setTitle(title);

//        Font subTitleFont = new Font("SansSerif", Font.BOLD, 12);
//        TextTitle subtitle = new TextTitle("SubHeading", subTitleFont);
//        subtitle.setSpacer(new Spacer(0, 0.05D, 0.05D, 0.05D, 0.0D));
//        chart.addSubtitle(subtitle);

        chart.setBackgroundPaint(Color.white);

        XYLineAndShapeRenderer rr = new XYLineAndShapeRenderer();
        rr.setSeriesLinesVisible(2, true);
        rr.setSeriesShapesVisible(2, true);
        chart.getXYPlot().setRenderer(rr);

        return chartPanel;

//        dataset.addValue( (int)(10000*Math.random()) , "Stolen Goods" , "2010" );
//        dataset.addValue( (int)(10000*Math.random()) , "Stolen Goods" , "2011" );
//        dataset.addValue( (int)(10000*Math.random()) , "Stolen Goods" , "2012" );
//        dataset.addValue( (int)(10000*Math.random()) , "Stolen Goods" , "2013" );
//        dataset.addValue( (int)(10000*Math.random()) , "Stolen Goods" , "2014" );
//        dataset.addValue( (int)(10000*Math.random()) , "Stolen Goods" , "2015" );
//        dataset.addValue( (int)(100*Math.random()) , "Minorities" , "2010" );
//        dataset.addValue( (int)(100*Math.random()) , "Minorities" , "2011" );
//        dataset.addValue( (int)(100*Math.random()) , "Minorities" , "2012" );
//        dataset.addValue( (int)(100*Math.random()) , "Minorities" , "2013" );
//        dataset.addValue( (int)(100*Math.random()) , "Minorities" , "2014" );
//        dataset.addValue( (int)(100*Math.random()) , "Minorities" , "2015" );


        //return dataset;
    }

    private static DefaultCategoryDataset createHottiesDataset() {
        final String blondes = "Blondes";
        final String brunettes = "Brunettes";
        final String redHeads = "Red Heads";
        final String under18 = "< 18";
        final String under24 = "18-24";
        final String under30 = "24-30";
        final String over30 = "30+";

        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        dataset.addValue( (int) (Math.random() * 10) , blondes , under18 );
        dataset.addValue( (int) (Math.random() * 10), blondes , under30 );
        dataset.addValue( (int) (Math.random() * 10), blondes , under24 );
        dataset.addValue( (int) (Math.random() * 10), blondes , over30 );

        dataset.addValue( (int) (Math.random() * 10), brunettes , under18 );
        dataset.addValue( (int) (Math.random() * 10), brunettes , under30 );
        dataset.addValue( (int) (Math.random() * 10) , brunettes , under24 );
        dataset.addValue( (int) (Math.random() * 10), brunettes , over30 );

        dataset.addValue( (int) (Math.random() * 10), redHeads , under18 );
        dataset.addValue( (int) (Math.random() * 10), redHeads , under30 );
        dataset.addValue( (int) (Math.random() * 10), redHeads , under24 );
        dataset.addValue( (int) (Math.random() * 10), redHeads , over30 );

        return dataset;
    }


    @Override
    public String toString() {
        return "Lower Management";
    }
}
