package IO;

import java.io.*;

public class TestFileInputStream {
    public static void main(String args[]) {
        int b = 0;// ʹ�ñ���b��װ����read()����ʱ���ص�����
        /*FileInputStream in = null;*/
        FileReader in = null;
        // ʹ��FileInputStream������ȡ�����ĵ�����ʱ���������������룬��Ϊʹ��InputStream�������read()������ȡ����ʱ��һ���ֽ�һ���ֽڵض�ȡ�ģ���һ��������ռ�������ֽڵģ����Զ�ȡ�����ĺ����޷���ȷ��ʾ��
        // FileReader in = null;//ʹ��FileReader������ȡ����ʱ����Ӣ�Ķ�������ȷ��ʾ����ΪReader�������read()������һ���ַ�һ���ַ��ض�ȡ�ģ�����ÿ�ζ�ȡ�����Ķ���һ�������ĺ��֣������Ϳ�����ȷ��ʾ�ˡ�
        try {
            //in = new FileInputStream("E:\\Iotest.txt");
             in = new FileReader("E:\\Iotest.txt");
        } catch (FileNotFoundException e) {
            System.out.println("ϵͳ�Ҳ���ָ���ļ���");
            System.exit(-1);// ϵͳ�������˳�
        }
        long num = 0;// ʹ�ñ���num����¼��ȡ�����ַ���
        try {// ����read()����ʱ�����쳣��������Ҫ�����쳣
            while ((b = in.read()) != -1) {
                // ����int read() throws Exception����ʱ�����ص���һ��int���͵�����
                // ѭ���������������Ƿ���һ��ֵ-1����ʾ��ʱ�Ѿ���ȡ���ļ���ĩβ�ˡ�
                // System.out.print(b+"\t");//���û��ʹ�á�(char)b������ת������ôֱ�Ӵ�ӡ������b�������֣�������Ӣ�ĺ�������
                System.out.print((char) b);
                // ��char(b)����ʹ�����ֱ�ʾ�ĺ��ֺ�Ӣ����ĸת�����ַ�����
                num++;
            }
            in.close();// �ر�������
            System.out.println();
            System.out.println("�ܹ���ȡ��" + num + "���ֽڵ��ļ�");
        } catch (IOException e1) {
            System.out.println("�ļ���ȡ����");
        }
    }
}
