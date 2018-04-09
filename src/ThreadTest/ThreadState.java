/**
 * 文件名：.java
 * 版权： 北京联众信安成都分公司
 * 描述：
 * 创建时间：2018年03月22日
 */
package ThreadTest;

/**
 * @Description 描述代码功能
 * @author gongchengping
 * @version [版本号, 2018/03/22]
 */
public class ThreadState {
    public static void main(String[] args) {
        new Thread(new TimeWaiting(), "TimeWaitingThread").start();
        new Thread(new Waiting(),"waitingThread");
        //
        new Thread(new Blocked(), "BlockedThread-1").start();
        new Thread(new Blocked(), "BlockedThread-2").start();
    }
    static class TimeWaiting implements Runnable {

        @Override
        public void run() {
            while(true) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Waiting implements Runnable {

        @Override
        public void run() {
            while(true) {
                synchronized (Waiting.class) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Blocked implements Runnable {

        @Override
        public void run() {
            synchronized (Blocked.class) {
                while (true) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
