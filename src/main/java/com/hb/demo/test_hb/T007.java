package com.hb.demo.test_hb;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

public class T007 {
    public static void main(String[] args) throws Exception{
        String path = "C:/Users/ben.huang/Desktop/picture/t004.png";
        String target = "Picture source：https://佛祖保佑，永无BUG.com";
        T007.getImage(path,target);

    }

    public static void getImage(String path,String targert) throws Exception{
        File file = new File(path);
        BufferedImage read = ImageIO.read(file);
        int width = read.getWidth(null);
        int height = read.getHeight(null);
        System.out.println("width:"+width);
        System.out.println("height:"+height);

        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = bufferedImage.createGraphics();
        graphics.drawImage(read,0,0,width,height,null);
        graphics.setColor(new Color(255,255,255,128));
        graphics.setFont(new Font("华文楷体",Font.BOLD,60));
        graphics.setBackground(Color.BLACK);
        int x = (width - getWatermarkLength(targert,graphics) );
        int y = height;
        graphics.drawString(targert,x,y);
        graphics.dispose();

        String path1 = "C:/Users/ben.huang/Desktop/picture/product/now.jpg";
        String name = String.valueOf(System.currentTimeMillis());
        String path2 = path1.replace("now",name);
        FileOutputStream fileOutputStream = new FileOutputStream(path2);
        ImageIO.write(bufferedImage,"jpg",fileOutputStream);
        System.out.println("finish!!!");
        fileOutputStream.flush();
        fileOutputStream.close();

    }

    public static int getWatermarkLength(String waterMarkContent, Graphics2D g) {
        return g.getFontMetrics(g.getFont()).charsWidth(waterMarkContent.toCharArray(), 0, waterMarkContent.length());
    }
}
