package com.kkb.constant;


/**
 * show 上传使用到的常量
 *
 * @author guguofu
 * @since 2021/11/1
 */
public class UploadConstant {

    /* 图片上传位置 （注意Linux和Windows上的目录结构不同）  */
    public static String UPLOAD_FILE_PATH;
    /* 支持的图片类型 */
    public static String UPLOAD_FILE_TYPE;
    /* 上传资源映射路径 前缀*/
    public static String RESOURCE_PREFIX;

    // springmvc自动注入属性
    public UploadConstant(String uploadFilePath, String resourcePrefix, String upLoadFileType) {
        UPLOAD_FILE_PATH = uploadFilePath;
        RESOURCE_PREFIX = resourcePrefix;
        UPLOAD_FILE_TYPE = upLoadFileType;
    }
}
