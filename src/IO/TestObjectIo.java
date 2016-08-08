package IO;

import java.io.*;

public class TestObjectIo {
    public static void main(String args[]) {
        T t = new T();
        t.k = 8;// ��k��ֵ�޸�Ϊ8
        try {
            FileOutputStream fos = new FileOutputStream(
                    "E:\\Iotest.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // ObjectOutputStream��ר����������Object�ģ���fos���������׽�ObjectOutputStream���Ϳ���ֱ�Ӱ�һ��Objectд��ȥ
            oos.writeObject(t);// ֱ�Ӱ�һ��t����д�뵽ָ�����ļ�����
            oos.flush();
            oos.close();
            FileInputStream fis = new FileInputStream(
                    "E:\\Iotest.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            // ObjectInputStreamר��������һ��Object��
            T tRead = (T) ois.readObject();
            // ֱ�Ӱ��ļ����������ȫ����ȡ����Ȼ��ֽ��һ��Object���󣬲�ʹ��ǿ��ת����ָ������T
            System.out.print(tRead.i + "\t" + tRead.j + "\t" + tRead.d + "\t"
                    +"k="+ tRead.k);
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
 * ����Ҫ��һ����Ķ������л���һ���ֽ����ͱ���ʵ��Serializable�ӿ�
 * Serializable�ӿ���û�ж��巽����Serializable�ӿ���һ������Խӿڣ�������������ǣ�ֻ����һ��������á�
 * �������Ǹ����������ģ�����������������֮��Ϳ���֪���������Ա����л� ������ĳ����Ķ������л����ͱ����ʵ��Serializable�ӿ�
 */
class T implements Serializable {
    // Serializable����˼�ǿ��Ա����л���
    int i = 10;
    int j = 9;
    double d = 2.3;
//    int k = 15;
     transient int k = 15;
    // ����������ʱ�������transient�ؼ��֣���ô��������ͻᱻ������͸���ģ��������ڡ�
}