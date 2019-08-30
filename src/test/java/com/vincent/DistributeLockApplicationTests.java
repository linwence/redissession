package com.vincent;

import com.vincent.lock.RedissonDistributedLocker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class DistributeLockApplicationTests {

    @Autowired
    private RedissonDistributedLocker redissonLocker;

    @Test
    public void contextLoads() throws Exception{
        int count=10;
        CountDownLatch latch=new CountDownLatch(count);

        for (int i=0;i<10;i++){
            Thread thread=new Thread(()->{
               try{
                   String lockKey="17631701110";
                   redissonLocker.tryLock(lockKey, TimeUnit.SECONDS,100,8);
                   System.out.println("=========加锁==========="+Thread.currentThread().getName());

                   System.out.println("=============操作=========");
                   Thread.sleep(5000);

                   System.out.println("==========释放锁========="+Thread.currentThread().getName());
                   redissonLocker.unlock(lockKey);

                   System.out.println(latch.getCount());
               }catch (Exception e){
                   e.printStackTrace();
               }
               latch.countDown();
            });
            thread.start();

        }
        latch.await();


    }
}
