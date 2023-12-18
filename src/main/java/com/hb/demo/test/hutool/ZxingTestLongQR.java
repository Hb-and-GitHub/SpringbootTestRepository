package com.hb.demo.test.hutool;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ZxingTestLongQR {
        // 生成条形码的方法
        public void generateBarcode(String data, int width, int height, String filePath) {
            try {
                Map<EncodeHintType, Object> hints = new HashMap<>();
                hints.put(EncodeHintType.CHARACTER_SET, "UTF-8"); // 设置字符编码

                MultiFormatWriter writer = new MultiFormatWriter();
                BitMatrix bitMatrix = writer.encode(data, BarcodeFormat.CODE_128, width, height, hints);

                // 创建BufferedImage对象来表示条形码
                BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
                for (int x = 0; x < width; x++) {
                    for (int y = 0; y < height; y++) {
                        image.setRGB(x, y, bitMatrix.get(x, y) ? 0 : 0xFFFFFF); // 生成黑色条和白色背景的条形码
                    }
                }

                // 将条形码保存到文件
                File barcodeFile = new File(filePath);
                ImageIO.write(image, "png", barcodeFile);

                System.out.println("条形码已生成并保存到: " + filePath);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            ZxingTestLongQR barcodeGenerator = new ZxingTestLongQR();
            String data = "https://blog.csdn.net/TM007_?spm=1000.2115.3001.5343"; // 要存储在条形码中的数据
            int width = 200; // 条形码的宽度
            int height = 100; // 条形码的高度
            String filePath = "C:\\Users\\ben.huang\\Desktop\\testZxing\\102.png"; // 生成的条形码文件的路径

            barcodeGenerator.generateBarcode(data, width, height, filePath);
        }
}
