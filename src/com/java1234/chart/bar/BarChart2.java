package com.java1234.chart.bar;

import javax.servlet.http.HttpSession;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChart2 {

	public static String genBarChart(HttpSession session) throws Exception {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.addValue(510, "����", "ƻ��");
		dataset.addValue(320, "����", "�㽶");
		dataset.addValue(580, "����", "����");
		dataset.addValue(390, "����", "����");
		JFreeChart chart=ChartFactory.createBarChart3D("ˮ������ͳ��ͼ", "ˮ��", "����", dataset,
				PlotOrientation.HORIZONTAL, true, true, true);
		String fileName=ServletUtilities.saveChartAsPNG(chart, 700, 500, null,session);
		return fileName;
	}
}
