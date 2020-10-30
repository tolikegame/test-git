package com.example.demogit;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {
        try { // 防止檔案建立或讀取失敗，用catch捕捉錯誤並列印，也可以throw
            /* 讀入TXT檔案 */
            String pathname = "C:\\temp\\qqq.txt"; // 絕對路徑或相對路徑都可以，這裡是絕對路徑，寫入檔案時演示相對路徑
            File filename = new File(pathname); // 要讀取以上路徑的input。txt檔案
            InputStreamReader reader = new InputStreamReader(new FileInputStream(filename)); // 建立一個輸入流物件reader
            BufferedReader br = new BufferedReader(reader); // 建立一個物件，它把檔案內容轉成計算機能讀懂的語言
            String line;
//            line = br.readLine();
            while ((line = br.readLine()) != null) {
//                line = br.readLine(); // 一次讀入一行資料
                System.out.println(line);
            }
            /* 寫入Txt檔案 */
            File writename = new File("C:\\temp\\www.txt"); // 相對路徑，如果沒有則要建立一個新的output。txt檔案
            writename.createNewFile(); // 建立新檔案
            BufferedWriter out = new BufferedWriter(new FileWriter(writename));
            out.write("我會寫入檔案啦\r\n"); // \r\n即為換行
            out.flush(); // 把快取區內容壓入檔案
            out.close(); // 最後記得關閉檔案
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
