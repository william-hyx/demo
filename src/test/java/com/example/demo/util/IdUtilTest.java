package com.example.demo.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class IdUtilTest {

    @Test
    void nextIdString() {
    }

    @Test
    void nextId() {
        log.info("{}", IdUtil.nextId());
    }
}