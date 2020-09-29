package com.example.demo.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class ImageCaptchaUtilTest {

    @Test
    void drawImage() {
        ImageCaptchaUtil.drawImage("ch", null, null);
        ImageCaptchaUtil.drawImage("nl", null, null);
        ImageCaptchaUtil.drawImage("n", null, null);
        ImageCaptchaUtil.drawImage("l", null, null);
    }
}