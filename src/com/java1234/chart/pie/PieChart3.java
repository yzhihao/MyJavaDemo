package com.java1234.chart.pie;

import java.awt.Font;
import java.text.NumberFormat;

import javax.servlet.http.HttpSession;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.servlet.ServletUtilities;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

public class PieChart3 {

	public static String getPieChart(HttpSession session) throws Exception {
		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("���Ŀ���", 1000);
		dataset.setValue("��Ƽ�ʻ", 800);
		dataset.setValue("�ǹ�ǿ��", 400);
		dataset.setValue("ҽ���¹�", 100);
		dataset.setValue("����", 29);

		JFreeChart chart=ChartFactory.createPieChart3D("���������������ֲ�ͼ", dataset, true, true, true);
		
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
		
		
		PiePlot3D pieplot3d = (PiePlot3D)chart.getPlot(); 
		
		//���ÿ�ʼ�Ƕ�  
		pieplot3d.setStartAngle(120D);  
		//���÷���Ϊ��˳ʱ�뷽��  
		pieplot3d.setDirection(Rotation.CLOCKWISE);  
		//����͸���ȣ�0.5FΪ��͸����1Ϊ��͸����0Ϊȫ͸��  
		pieplot3d.setForegroundAlpha(0.7F); 
		
		String fileName=ServletUtilities.saveChartAsPNG(chart, 700, 500, null, session);
		
		return fileName;
	}
}
