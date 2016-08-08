package IO;

import java.io.*;

public class TestBufferStream {
    public static void main(String args[]) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:\\Iotest.txt");
            // ��FileInputStream�ڵ����������׽�һ�㴦����BufferedInputStream
            BufferedInputStream bis = new BufferedInputStream(fis);
            int c = 0;
            System.out.println((char) bis.read());
            //System.out.println((char) bis.read());
            bis.mark(100);// �ڵ�100���ַ�����һ�����
            for (int i = 0; i <= 10 && (c = bis.read()) != -1; i++) {
                System.out.print((char) c);
            }
            System.out.println();
            bis.reset();// ���»ص�ԭ����ǵĵط�
            for (int i = 0; i <= 10 && (c = bis.read()) != -1; i++) {
                System.out.print((char) c);
            }
            bis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}