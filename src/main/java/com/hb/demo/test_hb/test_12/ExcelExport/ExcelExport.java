package com.hb.demo.test_hb.test_12.ExcelExport;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

// @RequestMapping("/excel")
// @RestController
public class ExcelExport {

    // @GetMapping("/export")
    // public void exportExcel(HttpServletResponse response){
    //     List<TestExcelVo> data = getData();
    //     response.setCharacterEncoding(StandardCharsets.UTF_8.name());
    //     response.setHeader("content-Type","application/vnd.ms-excel");
    //     try {
    //         response.setHeader("Content-Disposition","attachment;filename=" + URLEncoder.encode("template"+ DateUtils.format(new Date(), "yyyy-MM-dd")+".xlsx", StandardCharsets.UTF_8.name()));
    //     } catch (UnsupportedEncodingException e) {
    //         e.printStackTrace();
    //     };
    //     try {
    //         EasyExcel.write(response.getOutputStream(),TestExcelVo.class).sheet().doWrite(data);
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }

    public static void main(String[] args) {
        String fileName = "C:\\Users\\ben.huang\\Desktop\\result.xlsx";
        EasyExcel.write(fileName, TestExcelVo.class).sheet("测试").doWrite(getData());
    }

    static List<TestExcelVo> getData() {
        ArrayList<TestExcelVo> list = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            TestExcelVo excelVo = new TestExcelVo();
            excelVo.setFirstLine("第一列");
            excelVo.setLineName("首列");
            list.add(excelVo);
        }
        for (int i = 1; i <= 2; i++) {
            TestExcelVo excelVo = new TestExcelVo();
            excelVo.setFirstLine("第2列");
            excelVo.setLineName("2列");
            list.add(excelVo);
        }
        return list;
    }
}
