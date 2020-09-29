package com.example.demo.domain;

import lombok.Data;

import java.awt.image.BufferedImage;
import java.io.Serializable;

/**
 * @description:
 * @author: huangyixin
 * @create: 2020/9/28 16:41
 **/
@Data
public class ImageCaptcha implements Serializable {
    private static final long serialVersionUID = -3799325053504064275L;

    private String content;

    private BufferedImage image;
}
