package IO;


/*���С�������������ô�ӡ����Ĵ��ڣ�
 * ��Ĭ���������д��������ӡ�������ó�����ָ���Ĵ�ӡ��ʾ����
 */
import java.io.*;
public class TestPrintStream{
    public static void main(String args[]){
        PrintStream ps = null;
        try{
                FileOutputStream fos = new FileOutputStream("E:\\Iotest.txt");
                ps = new PrintStream(fos);//��������������׽�һ���ӡ�����������ƴ�ӡ���
                if(ps != null){
                    System.setOut(ps);//�������setOut()�����ı���������ڣ���ǰдSystem.out.print()Ĭ�ϵ�������ھ��������д���.
                    //������ʹ��System.setOut(ps)����ӡ������ڸĳ�����psָ�����ļ����棬ͨ�����������Ժ󣬴�ӡ���ʱ������ָ�����ļ��ڴ�ӡ���
                    //�����ｫ��ӡ����������õ���log.txt����ļ����棬���Դ�ӡ���������ݻ���log.txt����ļ����濴��
                }
            for(char c=0;c<=60000;c++){
                    System.out.print(c+"\t");//��������������ִ�ӡ��log.txt����ļ���ȥ
                }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}