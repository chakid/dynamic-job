package com.chakid.service.impl;

import com.chakid.entity.TestEntity1;
import com.chakid.entity.TestEntity2;
import com.chakid.repository.TestEntity1Repository;
import com.chakid.repository.TestEntity2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author chakid
 * @version 1.0
 * @date 2021/6/3 18:30
 * @description
 */
@Service
public class TestTransactionalServiceImpl {

    @Autowired
    private TestEntity1Repository testEntity1Repository;

    @Autowired
    private TestEntity2Repository testEntity2Repository;


    @Transactional(rollbackFor = Exception.class)
    public void test1() {

        TestEntity1 testEntity1 = new TestEntity1();

        testEntity1.setContent1("test1");
        test2();

        int a = 1;
        int b = 0;
        int c = a / b;
        testEntity1Repository.save(testEntity1);
    }

    private void test2() {

        TestEntity2 testEntity2 = new TestEntity2();

        testEntity2.setContent2("content2");

        testEntity2Repository.save(testEntity2);
    }
}
