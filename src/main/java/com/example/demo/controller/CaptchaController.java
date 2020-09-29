package com.example.demo.controller;

import com.example.demo.domain.ImageCaptcha;
import com.example.demo.util.ImageCaptchaUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author: huangyixin
 * @create: 2020/9/28 16:47
 **/
@Slf4j
@CrossOrigin
@RestController
@Api(tags = "验证码")
@RequestMapping(value = "/captcha")
public class CaptchaController {

    @ApiOperation(value = "获取图形验证码", notes = "获取图形验证码")
    @GetMapping(value = "/imagecaptcha")
    public void getImageCaptcha(HttpServletRequest request,
                                HttpServletResponse response) throws Exception {
        response.setContentType("image/jpeg");
        response.setDateHeader("expries", -1);
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Pragma", "no-cache");
        ImageCaptcha imageCaptcha = ImageCaptchaUtil.drawImage();
        ImageIO.write(imageCaptcha.getImage(), "jpg", response.getOutputStream());
    }
}
