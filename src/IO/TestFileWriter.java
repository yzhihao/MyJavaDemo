package IO;


/*ʹ��FileWriter���ַ�������ָ���ļ���д������
д������ʱ��1���ַ�Ϊ��λ����д��*/
import java.io.*;
public class TestFileWriter{
    @SuppressWarnings("resource")
	public static void main(String args[]){
        /*ʹ��FileWriter������ӳ��������д�뵽Uicode.dat�ļ���
        ʹ��FileWriter�����ļ�д������ʱ��һ���ַ�һ���ַ�д���*/
        FileWriter fw = null;
        try{
                fw = new FileWriter("E:\\Iotest.txt");
                //�ַ��ı�����һ���޷��ŵ�16λ����
                //�ַ��ڼ�����ڲ�ռ��2���ֽ�
                //����ʹ��forѭ����0��60000������������������
                //�����൱���ǰ�ȫ����������ҵ����ֶ�0��60000�ڵ���������ʽ����ʾ
                for(int c=1;c<=6000;c*=2){
                    fw.write((char)c);
                    //ʹ��write(int c)��0��60000�ڵ�����д�뵽ָ���ļ���
                    //����write()����ʱ������Ϊ��ִ�еĹ�����Ӧ��ʹ���ˡ�(char)c������ǿ��ת������������ת�����ַ�����ʾ
                    //��Ϊ��д�����ݵ��ļ����Կ�����������ʾ�����ݲ�����0��60000�ڵ����������ǲ�ͬ���ҵ����ֵı�ʾ��ʽ
            }
            /*ʹ��FileReader(�ַ���)��ȡָ���ļ����������
            ��ȡ����ʱ����һ���ַ�Ϊ��λ���ж�ȡ��*/
                int b = 0;
                long num = 0;
                FileReader fr = null;
                fr = new FileReader("E:\\Iotest1.txt");
                while((b = fr.read())!= -1){
                    System.out.print((char)b);
                    num++;
                }
                System.out.println();
                System.out.println("�ܹ���ȡ��"+num+"���ַ�");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
