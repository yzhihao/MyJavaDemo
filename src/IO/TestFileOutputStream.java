package IO;


import java.io.*;

public class TestFileOutputStream {
    public static void main(String args[]) {
        int b = 0;
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("E:\\Iotest.txt");
            out = new FileOutputStream("E:\\Iotest1.txt");
            // ָ��Ҫд�����ݵ��ļ������ָ����·���в�����TestFileOutputStream1.java�������ļ�����ϵͳ���Զ�����һ��
            while ((b = in.read()) != -1) {
                out.write(b);
                // ����write(int c)�����Ѷ�ȡ�����ַ�ȫ��д�뵽ָ���ļ���ȥ��������Ḳ��ԭ��������
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("�ļ���ȡʧ��");
            System.exit(-1);// �������˳�
        } catch (IOException e1) {
            System.out.println("�ļ�����ʧ�ܣ�");
            System.exit(-1);
        }
        System.out
                .println("Iotest.txt�ļ�����������Ѿ��ɹ����Ƶ��ļ�Iotest1.txt����");
    }
}
