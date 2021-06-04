package com.chakid.repository;

import com.chakid.entity.ScheduledTask;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author chakid
 * @version 1.0
 * @date 2021/6/3 16:41
 * @description
 */
public interface ScheduledTaskRepository extends JpaRepository<ScheduledTask, Long> {

    ScheduledTask findByTaskKey(String key);

    List<ScheduledTask> findByInitStartFlag(Integer initStartFlag);

}
