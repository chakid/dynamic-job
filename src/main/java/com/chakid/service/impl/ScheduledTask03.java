package com.chakid.service.impl;

import com.chakid.runner.ScheduledTaskJob;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author chakid
 * @version 1.0
 * @date 2021/6/3 16:46
 * @description
 */
public class ScheduledTask03 implements ScheduledTaskJob {

    /**
     * 日志
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTask03.class);

    @Override
    public void run() {
        LOGGER.info("ScheduledTask => 03  run  当前线程名称 {} ", Thread.currentThread().getName());
    }
}
