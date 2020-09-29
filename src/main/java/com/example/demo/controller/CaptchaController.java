package com.example.demo.controller;

import com.example.demo.domain.ImageCaptcha;
import com.example.demo.util.ImageCaptchaUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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
    public void getImageCaptcha(@ApiParam(name = "type", value = "图形验证码类型", defaultValue = "nl") String type,
                                HttpServletResponse response) throws IOException {
        response.setContentType("image/jpeg");
        response.setDateHeader("expries", -1);
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Pragma", "no-cache");
        if (StringUtils.isBlank(type)) {
            type = "nl";
        }
        ImageCaptcha imageCaptcha = ImageCaptchaUtil.drawImage(type, null, null);
        ImageIO.write(imageCaptcha.getImage(), "jpg", response.getOutputStream());
    }
}
