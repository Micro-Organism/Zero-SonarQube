package com.zero.sonarqube;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class ZeroSonarqubeBootApplicationTests {

    @Test
    void contextLoads() {
    }

    @BeforeEach
    public void before()  {
        log.info("init some data");
    }

    @AfterEach
    public void after(){
        log.info("clean some data");
    }

    @Test
    public void execute()  {
        log.info("your method test Code");
    }

}
