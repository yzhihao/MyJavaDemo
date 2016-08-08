package IO;

import java.io.*;
public class TestBufferStream1{
    public static void main(String args[]){
        try{
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\Iotest.txt"));
            //�ڽڵ���FileWriter����������һ�㴦����BufferedWriter
            String s = null;
            for(int i=0;i<100;i++){
                s = String.valueOf(Math.random());//��Math.random()����������һϵ�н���0��1֮����������
                // static String valueOf(double d)���valueOf()���������þ��ǰ�һ��double���͵���ת�����ַ���
                //valueOf()��һ����̬���������Կ���ʹ�á�����.��̬������������ʽ������ 
                bw.write(s);//��������ַ���д�뵽ָ���ļ���
                bw.newLine();//����newLine()����ʹ��ÿд��һ��������ͻ�����ʾ
            }
            bw.flush();//����flush()������ջ�����,��ˮͰ�е�ˮ�ų�ȥ
            
        BufferedReader br = new BufferedReader(new FileReader("E:\\Iotest.txt"));
                //�ڽڵ���FileReader����������һ�㴦����BufferedReader
            while((s = br.readLine())!=null){
                //ʹ��BufferedReader�����������ṩString readLine()������ȡ�ļ��е�����ʱ��һ��һ�ж�ȡ��
                //ѭ����������������ʹ��readLine()������ȡ���ݷ��ص��ַ���Ϊ��ֵ�����ʾ�Ѿ���ȡ���ļ���ĩβ�ˡ�
                System.out.println(s);
                
            }
        bw.close();
        br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
