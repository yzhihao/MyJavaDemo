package com.java1234.chart.bar;

import javax.servlet.http.HttpSession;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;

public class BarChart4 {

	public static String genBarChart(HttpSession session) throws Exception {
		double [][]data=new double[][]{{1320,1110,1123,321},{720,210,1423,1321},{830,1310,123,521},{400,1110,623,321}};
		String []rowKeys={"ƻ��","�㽶","����","����"};
		String []columnKeys={"����","����","�Ϻ�","�Ͼ�"};
		CategoryDataset dataset=DatasetUtilities.createCategoryDataset(rowKeys,columnKeys ,data);
		JFreeChart chart=ChartFactory.createBarChart3D("ˮ������ͳ��ͼ", "ˮ��", "����", dataset,
				PlotOrientation.VERTICAL, true, true, true);
		String fileName=ServletUtilities.saveChartAsPNG(chart, 700, 500, null,session);
		return fileName;
	}
}
