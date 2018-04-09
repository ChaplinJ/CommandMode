/**
 * 文件名：.java
 * 版权： 北京联众信安成都分公司
 * 描述：
 * 创建时间：2018年03月22日
 */
package Piped;

import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * @Description 描述代码功能
 * @author gongchengping
 * @version [版本号, 2018/03/22]
 */
public class Piped {
    public static void main(String[] args) throws Exception {
        //管道输入
        PipedReader in = new PipedReader();
        //管道输出
        PipedWriter out = new PipedWriter();

        Thread thread = new Thread(new Print(in),"inThread");
        thread.start();
        //绑定管道
        out.connect(in);
        int receive = 0;

        while((receive = System.in.read()) != -1) {
            out.write(receive);
        }
        out.close();
    }
    static class Print implements Runnable {

        private PipedReader in;

        public Print(PipedReader in) {
            this.in = in;
        }

        @Override
        public void run() {

            try {
                int read = -1;
                while((read = in.read()) != -1) {
                    System.out.print((char)read);
                    Thread.sleep(100);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
