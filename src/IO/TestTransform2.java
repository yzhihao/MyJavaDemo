package IO;


import java.io.*;
public class TestTransform2{
    public static void main(String args[]){
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            //System.in�����in��һ����׼�����������������մӼ������������
            BufferedReader br = new BufferedReader(isr);
            String s = null;
            s = br.readLine();//ʹ��readLine()�����Ѷ�ȡ����һ���ַ������浽�ַ�������s��ȥ
            while(s != null){
                System.out.println(s.toUpperCase());//�ѱ������ڴ�s�е��ַ�����ӡ����
                s = br.readLine();//��ѭ�����ڼ������մӼ��̵�����
                if(s.equalsIgnoreCase("exit")){
                    //ֻҪ����exitѭ���ͽ������ͻ��˳�
                    break;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}