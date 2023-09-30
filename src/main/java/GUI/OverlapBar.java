package GUI;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.Histogram;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.demo.charts.ExampleChart;
import org.knowm.xchart.style.Styler;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverlapBar implements ExampleChart<CategoryChart> {
    public void createChart(List<Integer> data, List<Integer> dataTotal) {
        CategoryChart chart = getChart();

        chart.addSeries("Total days", Arrays.asList(new Integer[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23}), dataTotal);
        chart.addSeries("Bad days", Arrays.asList(new Integer[] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23}), data);

        new SwingWrapper<CategoryChart>(chart).displayChart();
    }

    @Override
    public CategoryChart getChart() {
        CategoryChart chart = new CategoryChartBuilder().width(800).height(600).title("Airport Weather").xAxisTitle("Hour of day").yAxisTitle("Percent of bad days").build();

        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
        chart.getStyler().setAvailableSpaceFill(.96);
        chart.getStyler().setOverlapped(true);
        chart.getStyler().setSeriesColors(new Color[]{Color.DARK_GRAY, new Color(200,0,0)});
        chart.getStyler().setLabelsVisible(true);
        chart.getStyler().setLabelsFontColor(Color.WHITE);

        return chart;
    }

    @Override
    public String getExampleChartName() {
        return null;
    }
}
