package com.java1234.chart.pie;

import java.awt.Font;
import java.text.NumberFormat;

import javax.servlet.http.HttpSession;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;

public class PieChart1 {

	public static String getPieChart(HttpSession session) throws Exception {
		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("���Ŀ���", 1000);
		dataset.setValue("��Ƽ�ʻ", 800);
		dataset.setValue("�ǹ�ǿ��", 400);
		dataset.setValue("ҽ���¹�", 100);
		dataset.setValue("����", 29);

		JFreeChart chart=ChartFactory.createPieChart("���������������ֲ�ͼ", dataset, true, true, true);
		
		// ������
		chart.addSubtitle(new TextTitle("2013���"));
		
		PiePlot pieplot=(PiePlot)chart.getPlot();
		pieplot.setLabelFont(new Font("����",0,11));
		// ���ñ�ͼ��Բ�ģ�true����������Բ�ģ�false����Ĭ��Ϊtrue  
		pieplot.setCircular(true);
		// û�����ݵ�ʱ����ʾ������
		pieplot.setNoDataMessage("��������ʾ");
		StandardPieSectionLabelGenerator standarPieIG = new StandardPieSectionLabelGenerator("{0}:({1}.{2})", NumberFormat.getNumberInstance(), NumberFormat.getPercentInstance());  
		pieplot.setLabelGenerator(standarPieIG);  
		
		String fileName=ServletUtilities.saveChartAsPNG(chart, 700, 500, null, session);
		
		return fileName;
	}
}
