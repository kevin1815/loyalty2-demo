package com.shuyun.loalty.recognize.xml;


import com.shuyun.loalty.recognize.Component;
import com.shuyun.loalty.recognize.flow.ProcessTree;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.FileInputStream;
import java.io.InputStream;

public abstract class XmlParser {
    public static ProcessTree<Component> parse(String configFile) throws Exception {
        validate(configFile);
        SAXReader reader = new SAXReader();
        InputStream inputStream = new FileInputStream(configFile);
        Document document = reader.read(inputStream);
        Element root = document.getRootElement();
        inputStream.close();
        return null;
    }

    private static void validate(String configFile) {
    }

}
