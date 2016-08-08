package IO;


import java.io.*;
public class TestDataStream{
    public static void main(String args[]){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        //�ڵ��ù��췽��ʱ�����Ȼ����ڴ����洴��һ��ByteArray�ֽ�����
        DataOutputStream dos = new DataOutputStream(baos);
        //�����������������һ������������������int��double���͵���
        try{
            dos.writeDouble(Math.random());//�Ѳ����������ֱ��д�뵽�ֽ�����ByteArray��
            dos.writeBoolean(true);//�������͵��������ڴ��о�ֻռһ���ֽ�
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            System.out.println(bais.available());
            DataInputStream dis = new DataInputStream(bais);
            System.out.println(dis.readDouble());//��д��ȥ�ľ��ȶ�����������readDouble()������ȡ��д��������
            System.out.println(dis.readBoolean());//��д��ȥ�ľͺ��������������Ķ�ȡ˳���ܸ���λ�ã�������ӡ������ȷ�Ľ��
            dos.close();
            bais.close();
        }catch(Exception e){
                e.printStackTrace();
            }
    }
}
