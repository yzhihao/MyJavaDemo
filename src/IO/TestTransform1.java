package IO;


import java.io.*;

public class TestTransform1 {
    public static void main(String args[]) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(
                    new FileOutputStream("E:\\Iotest.txt"));
            osw.write("MircosoftsunIBMOracleApplet");// ���ַ���д�뵽ָ�����ļ���ȥ
            System.out.println(osw.getEncoding());// ʹ��getEncoding()����ȡ�õ�ǰϵͳ��Ĭ���ַ�����
            osw.close();
            osw = new OutputStreamWriter(new FileOutputStream(
                    "E:\\Iotest.txt", true), "ISO8859_1");
            // ����ڵ���FileOutputStream�Ĺ��췽��ʱû�м���true����ô�¼�����ַ����ͻ��滻��ԭ��д����ַ������ڵ��ù��췽��ʱָ�����ַ��ı���
            osw.write("MircosoftsunIBMOracleApplet");// �ٴ���ָ�����ļ�д���ַ�������д����ַ������뵽ԭ���ַ����ĺ���
            System.out.println(osw.getEncoding());
            osw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}