package task;


import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class FileScanner
{
    //线程池
    private ExecutorService pool = Executors.newFixedThreadPool(4);

    //计数器不传入数值,表示初始化的值为0
    private volatile AtomicInteger count = new AtomicInteger();

    //线程等待的锁对象
    //private Object lock = new Object();

    // CountDownLatch latch = new CountDownLatch(1);
    private Semaphore semaphore = new Semaphore(0);

    private ScanCallback callback;

    public FileScanner(ScanCallback callback)
    {
        this.callback = callback;
    }

    /**
     * 扫描文件目录
     * 最开始，不知道有多少子文件夹，不知道应该启动多少个线程
     * @param path
     */
    public void scan(String path)
    {
        count.incrementAndGet();//启动根目录扫描任务，计数器++i
        doScan(new File(path));
    }

    //dir 待处理的文件夹
    public void doScan(File dir)
    {
        pool.execute(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    callback.callback(dir);
                    File[] children = dir.listFiles();
                    if(children != null)
                    {
                        for(File child : children)
                        {
                            if(child.isDirectory())
                            {
                                count.incrementAndGet();//启动子文件夹扫描任务,计数器++i;
                                System.out.println("当前任务数: " + count.get());
                                doScan(child);
                            }
                        }
                    }
                }
                finally  //保证线程计数器不管是否出现异常, 能够进行 -1 操作
                {
                    int r = count.decrementAndGet();
                    if(r == 0)
                    {
                        semaphore.release();
                    }
                }
            }
        });
    }

    public void waitFinish() throws InterruptedException
    {
        try
        {
            semaphore.acquire();
        }
        finally
        {
            //阻塞等待直到任务完成,完成后需关闭线程池
            System.out.println("关闭线程池.");
            pool.shutdownNow();
        }
    }
}
