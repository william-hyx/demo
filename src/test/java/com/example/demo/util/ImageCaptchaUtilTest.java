package com.example.demo.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class ImageCaptchaUtilTest {

    @Test
    void drawImage() throws Exception{
        ImageCaptchaUtil.drawImage("ch");
        ImageCaptchaUtil.drawImage("nl");
        ImageCaptchaUtil.drawImage("n");
        ImageCaptchaUtil.drawImage("l");
    }
}