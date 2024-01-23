// package com.hb.demo.test.wordChange;
//
// import com.aspose.words.Document;
// import com.aspose.words.License;
// import com.aspose.words.SaveFormat;
// import org.springframework.core.io.ClassPathResource;
// import org.springframework.core.io.Resource;
//
// import java.io.File;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.InputStream;
//
// /**
//  * @author xxh
//  * @date 2022/5/30 14:05
//  */
// public class Word2PdfAsposeUtil {
//
//     /**
//      *
//      * @return
//      */
//     public static boolean getLicense() {
//         boolean result = false;
//         InputStream is = null;
//         try {
//             Resource resource = new ClassPathResource("license.xml");
//             is = resource.getInputStream();
//             License aposeLic = new License();
//             aposeLic.setLicense(is);
//             result = true;
//         } catch (Exception e) {
//             e.printStackTrace();
//         } finally {
//             if (is != null) {
//                 try {
//                     is.close();
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }
//             }
//         }
//         return result;
//     }
//
//     /**
//      * @return boolean
//      * @Param [inPath, outPath]
//      **/
//     public static boolean doc2pdf(String inPath, String outPath) {
//         // 验证License 若不验证则转化出的pdf文档会有水印产生
//         if (!getLicense()) {
//             return false;
//         }
//         FileOutputStream os = null;
//         try {
//             long old = System.currentTimeMillis();
//             // 新建一个空白pdf文档
//             File file = new File(outPath);
//             os = new FileOutputStream(file);
//             // Address是将要被转化的word文档
//             Document doc = new Document(inPath);
//             // 全面支持DOC, DOCX, OOXML, RTF HTML, OpenDocument, PDF,
//             doc.save(os, SaveFormat.PDF);
//             // EPUB, XPS, SWF 相互转换
//             long now = System.currentTimeMillis();
//             // 转化用时
//             System.out.println("pdf转换成功，共耗时：" + ((now - old) / 1000.0) + "秒");
//         } catch (Exception e) {
//             e.printStackTrace();
//             return false;
//         } finally {
//             if (os != null) {
//                 try {
//                     os.flush();
//                     os.close();
//                 } catch (IOException e) {
//                     e.printStackTrace();
//                 }
//             }
//         }
//         return true;
//     }
// }