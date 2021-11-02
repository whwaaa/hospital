package com.kkb.service;

import com.kkb.constant.UploadConstant;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * show 处理 文件上传的业务
 *
 * @author guguofu
 * @since 2021/11/1
 */
@Service
public class UploadService {

    // 图片上传的位置
    public File uploadPicturePath(MultipartFile file,String fileNamePath) throws Exception{
        File uploadFile = new File(fileNamePath);
        if (!uploadFile.exists()){
            if (!uploadFile.getParentFile().exists()){
                uploadFile.getParentFile().mkdirs();
            }
        }
        return uploadFile;
    }

    /**
     * 实现图片上传
     * @param file 图片对象
     * @return 上传成功返回文件映射路径，失败返回为""
     * @throws Exception 上传产生的异常，--》上传失败
     */
    public String uploadPicture(MultipartFile file) throws Exception{
        if (file.isEmpty()){
            // 文件为空
            return "";
        }
        // 判断上传图片的类型
        String filename = file.getOriginalFilename();
        String[] IMAGE_TYPE = UploadConstant.UPLOAD_FILE_TYPE.split(",");
        boolean flag = false;
        for (String type : IMAGE_TYPE) {
            if (StringUtils.endsWithIgnoreCase(filename,type)){
                // 符合上传的图片类型
                flag = true;
                break;
            }
        }
        // 进行上传
        if (flag){
            String fileNamePath = extractFileName(file);
            File uploadFile = uploadPicturePath(file,fileNamePath);
            // 上传文件
            file.transferTo(uploadFile);
            System.out.println("保存的位置: " + uploadFile.getAbsolutePath());
            // 上传成功
            return getPathFileName(fileNamePath);
        }else {
            // 图片类型不符合要求
            return "";
        }
    }

    /**
     * 设置文件夹和新文件名
     */
    public static String extractFileName(MultipartFile file) throws Exception
    {
        String filename = file.getOriginalFilename();
        // 生成新文件名
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        // 文件类型(.XXX)
        String fileType = filename.substring(filename.lastIndexOf("."));
        // 新名称
        String newFileName = uuid + fileType;
        // 年月日文件夹
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String baseDir = sdf.format(new Date());
        // 保存的路径
        String fileName = UploadConstant.UPLOAD_FILE_PATH + "/" + baseDir + "/" + newFileName;
        return fileName;
    }

    /**
     * 获取映射的文件路径
     * @param fileNamePath 当前位置的文件
     * @return 映射的文件路径
     */
    private static String getPathFileName(String fileNamePath)
    {
        int dirLastIndex = UploadConstant.UPLOAD_FILE_PATH.length();
        String currentPath = fileNamePath.substring(dirLastIndex);
        return UploadConstant.RESOURCE_PREFIX + currentPath;
    }
}









