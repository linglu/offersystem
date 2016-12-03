package com.linky.offersystem.support.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Linky on 16-12-3.
 */
public final class FileUtils {

    // 读取每一行内容
    public static List<String> readEachLine(InputStream is) throws IOException {

        List<String> strList = new LinkedList<>();
        InputStreamReader inputReader = new InputStreamReader(is);
        BufferedReader bufReader = new BufferedReader(inputReader);
        String line;
        while ((line = bufReader.readLine()) != null) {
            strList.add(line);
        }
        return strList;
    }
}
