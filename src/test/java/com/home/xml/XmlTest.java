package com.home.xml;

import org.junit.Test;

public class XmlTest {

    private XmlParser xmlParser = new XmlParser();


    @Test
    public void test1() {
        xmlParser.parse("/opower/my/tictactoe/src/test/resources/test.xml", null);
    }

}
