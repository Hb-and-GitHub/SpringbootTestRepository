package com.hb.demo.controller;


import com.hb.demo.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@RestController
@RequestMapping("/file")
public class FileController {

    @GetMapping("/downloadFile")
    public Result downloadCheck(HttpServletRequest request, HttpServletResponse response) {
        try {
            File file = new File("D:\\Projects\\test\\springboot_hb\\src\\main\\resources\\pdf\\testpdf.pdf");
            BufferedInputStream bis = null;
            OutputStream os = null;
            FileInputStream fileInputStream = null;
            response.setCharacterEncoding("utf-8");
            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "attachment; filename=testpdf");
            try {
                fileInputStream = new FileInputStream(file);
                byte[] buff = new byte[1024];
                bis = new BufferedInputStream(fileInputStream);
                os = response.getOutputStream();

                int i = bis.read(buff);
                while (i != -1) {
                    os.write(buff, 0, buff.length);
                    i = bis.read(buff);
                    os.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (bis != null) {
                    try {
                        bis.close();
                        fileInputStream.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Result result = new Result();
        result.setMessage("success" );
        result.setState(200);

        return result;
    }

    @GetMapping("/previewCheck")
    public void previewCheck(HttpServletRequest request,HttpServletResponse response) throws  IOException{
        FileInputStream is = new FileInputStream(new File("D:\\Projects\\test\\springboot_hb\\src\\main\\resources\\pdf\\testpdf.pdf"));
        response.reset();response.setCharacterEncoding("utf-8");
        response.setContentType("application/pdf");
        ServletOutputStream outputStream = response.getOutputStream();
        int count = 0;
        byte[] buffer = new byte[1024*1024];
        while((count = is.read(buffer))!=-1){
            outputStream.write(buffer,0,count);

        }
        outputStream.flush();
    }
}
