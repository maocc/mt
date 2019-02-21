package com.maocc.mt.net;

import java.io.*;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;

/**
 * @author maocc
 * @description
 * @date: 2019/1/28 16:20
 */
public class Test {
    public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.baidu.com");

    /* 字节流 */
		InputStream is = url.openStream();

    /* 字符流 */
		InputStreamReader isr = new InputStreamReader(is, "utf-8");

    /* 提供缓存功能 */
		BufferedReader br = new BufferedReader(isr);

		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

		br.close();
    }
}
