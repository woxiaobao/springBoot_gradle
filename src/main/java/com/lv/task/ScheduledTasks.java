package com.lv.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Future;

/**
 * Created by lvbaolin on 2017/2/16.
 * 定时任务官网学习
 * http://spring.io/guides/gs/scheduling-tasks/
 */
@Component
public class ScheduledTasks {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * 定时任务
     */
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        try {
//            doTaskOne();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        log.info("The time is now {}", dateFormat.format(new Date()));
    }

    /**
     * 异步执行
     * @return
     * @throws Exception
     */
    @Async
    public Future<String> doTaskOne() throws Exception {
        Thread.sleep(6000);
        System.out.println("开始做任务一");
        long start = System.currentTimeMillis();
        Thread.sleep(100);
        long end = System.currentTimeMillis();
        System.out.println("完成任务一，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务一完成");
    }
}
