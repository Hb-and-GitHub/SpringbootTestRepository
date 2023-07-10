package com.hb.demo.test_hb;

import org.junit.Test;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class test_file {
    @Test
    public void testReadFile1() throws IOException {
        //文件内容：Hello World|Hello Zimug

        String fileName = "C:\\Users\\ben.huang\\Desktop\\项目理解.docx";

        Scanner sc = null;

        try (FileReader fr = new FileReader(fileName);

             BufferedReader br = new BufferedReader(fr)) {

            sc = new Scanner(br);

            while (sc.hasNextLine()) { //按行读取字符串

                String line = sc.nextLine();

                System.out.println(line);

            }

        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            if (sc != null) {

                sc.close();

            }

        }

    }


}
