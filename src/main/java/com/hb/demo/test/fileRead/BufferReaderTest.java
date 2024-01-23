package com.hb.demo.test.fileRead;

import java.io.*;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;

public class BufferReaderTest {
    // public static void main(String[] args) throws IOException {
    //     BufferedReader reader  = new BufferedReader(new FileReader("C:\\Users\\ben.huang\\Desktop\\链接.txt"));
    //     String line;
    //     while((line = reader.readLine()) != null){
    //         System.out.println(line);
    //     }
    // }

    // public static void main(String[] args) throws IOException {
    //     BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\ben.huang\\Desktop\\链接.txt"));
    //     byte[] bytes = new byte[1024];
    //     int bytesRead;
    //     while((bytesRead = inputStream.read(bytes)) != -1){
    //         System.out.println(bytesRead);
    //     }
    // }

    // public static void main(String[] args) throws IOException {
    //     RandomAccessFile file = new RandomAccessFile("C:\\Users\\ben.huang\\Desktop\\链接.txt","r");
    //     file.seek(1024);
    //     byte[] bytes = new byte[1024];
    //     int read = file.read(bytes);
    //     System.out.println(read);
    //
    // }

    public static void main(String[] args) throws IOException {
        FileChannel channel = FileChannel.open(Paths.get("C:\\Users\\ben.huang\\Desktop\\链接.txt"));
        MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
        while(buffer.hasRemaining()){
            System.out.println(buffer);
        }
    }
}
