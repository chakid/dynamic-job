package com.chakid;

import com.chakid.service.impl.TestTransactionalServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DynamicJobApplicationTests {

    @Autowired
    private TestTransactionalServiceImpl testTransactionalService;

    @Test
    void contextLoads() {
    }


    @Test
    void testTransactional(){
        testTransactionalService.test1();
    }

}
