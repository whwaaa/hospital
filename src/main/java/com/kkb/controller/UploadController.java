package com.kkb.controller;

import com.kkb.service.UploadService;
import com.kkb.vo.AjaxResultVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * show 文件控制器，处理文件的上传
 *
 * @author guguofu
 * @since 2021/11/1
 */
@Controller
@ResponseBody
@RequestMapping("upload")
public class UploadController {

    @Resource
    private UploadService uploadService;

    /**
     * 响应图片上传请求
     * @param file 图片文件流
     * @return 上传情况
     */
    @RequestMapping(value = "picture",method = RequestMethod.POST)
    public AjaxResultVo uploadOnePicture(@RequestParam("file")MultipartFile file){
        AjaxResultVo resultVo = new AjaxResultVo();
        try {
            String filePath = uploadService.uploadPicture(file);
            if (filePath.length()>0){
                // 返回保存地址
                resultVo.setMsg("图片上传成功！");
                resultVo.setObj(filePath);
            }else {
                resultVo.setCode(400);
                resultVo.setMsg("上传图片失败!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            resultVo.setCode(500);
            resultVo.setMsg("服务器出错，上传失败！");
        }
        return resultVo;
    }


}















