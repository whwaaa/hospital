package com.kkb.constant;

/**
 * show 上传使用到的常量
 * TODO: 可以考虑将这里的参数配置到app。properties，然后把这个类对象初始化成Bean
 *
 * @author guguofu
 * @since 2021/11/1
 */
public class UploadConstant {

    /* 图片上传位置 （注意Linux和Windows上的目录结构不同）  */
    public static final String UPLOAD_FILE_PATH = "D:/shandong-hospita/upload";
    /* 支持的图片类型 */
    public static final String UPLOAD_FILE_TYPE = "png,jpg,jpeg";
    /* 上传资源映射路径 前缀*/
    public static final String RESOURCE_PREFIX = "/shandong-hospita/uploads";

}
