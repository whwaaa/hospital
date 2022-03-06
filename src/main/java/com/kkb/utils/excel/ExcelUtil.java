package com.kkb.utils.excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.fastjson.JSON;
import com.kkb.pojo.Drug;
import com.kkb.vo.AjaxResultVo;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;

/**
 * show Excel导出工具类，借助的是aliba的EasyExcel，
 * 可以比较容易实现导出功能
 *
 * @author guguofu
 * @since 2021/11/13
 */
public class ExcelUtil {

    /**
     * show 简易导数据,后期可以考虑设置单独的线程，如果下载的数据较多，独立运行
     *
     * @param list 需要导出的数据
     * @param fileName 导出的文件名称,不需要后缀
     * @param response 返回的响应response,导出成功返回包含数据的xlsx文件，失败返回JSON提示
     */
    public static void exportDefault(List list, String fileName, HttpServletResponse response){
        try {
            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            response.setCharacterEncoding("utf-8");
            // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
            fileName = URLEncoder.encode(fileName, "UTF-8").replaceAll("\\+", "%20");
            response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
            // 这里需要设置不关闭流
            EasyExcel.write(response.getOutputStream(), list.get(0).getClass())
                    .autoCloseStream(Boolean.FALSE)
                    .sheet("0")
                    .doWrite(list);
        } catch (Exception e) {
            // 重置response
            AjaxResultVo resultVo = new AjaxResultVo(500, "下载文件失败");
            if (list==null||list.size()==0){
                resultVo.setMsg("当前没有数据可以导出");
            }
            response.reset();
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            System.out.println(e.getMessage());
            try {
                response.getWriter().println(JSON.toJSONString(resultVo));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

}
