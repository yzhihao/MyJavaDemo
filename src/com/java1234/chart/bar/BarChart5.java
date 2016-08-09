package com.java1234.chart.bar;

import java.awt.Color;

import javax.servlet.http.HttpSession;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.ui.TextAnchor;

public class BarChart5 {

	public static String genBarChart(HttpSession session) throws Exception {
		double [][]data=new double[][]{{1320,1110,1123,321},{720,210,1423,1321},{830,1310,123,521},{400,1110,623,321}};
		String []rowKeys={"ƻ��","�㽶","����","����"};
		String []columnKeys={"����","����","�Ϻ�","�Ͼ�"};
		CategoryDataset dataset=DatasetUtilities.createCategoryDataset(rowKeys,columnKeys ,data);
		JFreeChart chart=ChartFactory.createBarChart3D("ˮ������ͳ��ͼ", "ˮ��", "����", dataset,
				PlotOrientation.VERTICAL, true, true, true);
		
		CategoryPlot plot=chart.getCategoryPlot();
		// �������񱳾���ɫ
		plot.setBackgroundPaint(Color.white);
		// ��������������ɫ
		plot.setDomainGridlinePaint(Color.pink);
		// �������������ɫ
		plot.setRangeGridlinePaint(Color.pink);
		
		// ��ʾÿ��������ֵ�����޸ĸ���ֵ����������
		BarRenderer3D renderer=new BarRenderer3D();
		renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
		renderer.setBaseItemLabelsVisible(true);
		
		renderer.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.BASELINE_LEFT));
		renderer.setItemLabelAnchorOffset(10D);  
		
		// ����ƽ������֮�����
		renderer.setItemMargin(0.4);
		
		plot.setRenderer(renderer);
		
		String fileName=ServletUtilities.saveChartAsPNG(chart, 700, 500, null,session);
		return fileName;
	}
}
