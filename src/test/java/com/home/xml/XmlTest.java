package com.home.xml;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;


public class XmlTest {

    private XmlParser xmlParser = new XmlParser();

    public static final String fileName = "/test.xml";


    @Test
    public void test1() {
        InputStream inputStream = getClass().getResourceAsStream(fileName);
        xmlParser.parse(inputStream, null);
    }

}
