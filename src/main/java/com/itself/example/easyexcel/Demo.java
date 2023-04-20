package com.itself.example.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.write.style.column.LongestMatchColumnWidthStyleStrategy;
import com.itself.user.entity.UserPO;
import com.itself.user.service.UserService;
import org.apache.commons.lang.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/**
 *  EasyExcel数据导出加模板下载
 *
 * @Author xxw
 * @Date 2022/09/25
 */
public class Demo {
    public static void main(String[] args) {

    }
}
class ExportDemo01 {
    @Resource
    private HttpServletResponse response;
    @Resource
    private UserService userService;

    /**
     * controller接口按照这个downloadHistoryData接口写
     */
    public void downloadHistoryData(String filename) throws IOException {
        String name  = buildResponse(filename.split("\\."));
        List<UserPO> list = userService.listAll();
        EasyExcel.write(response.getOutputStream(), UserPO.class).registerWriteHandler(new LongestMatchColumnWidthStyleStrategy()).sheet(name).doWrite(list);
    }

    private String buildResponse(String... names) throws UnsupportedEncodingException {
        //防止中文乱码，和easyExcel没关系
        response.setContentType("application/vnd.ms-excel");
        response.setCharacterEncoding("UTF-8");
        String preName = "数据模板";
        String end = "xlsx";
        if (null != names && names.length > 0) {
            if (!StringUtils.isEmpty(names[0])) {
                preName = names[0];
            }
            if (names.length > 1 && !StringUtils.isEmpty(names[1])) {
                end = names[1];
            }
        }
        String fileName = URLEncoder.encode(preName, "UTF-8").replaceAll("\\+", "%20");
        response.setHeader("Content-disposition", "attachment;filename*=UTF-8''" + fileName + "." + end);
        return preName;
    }
}
