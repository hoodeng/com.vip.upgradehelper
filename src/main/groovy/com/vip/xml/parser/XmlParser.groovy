package com.vip.xml.parser

import org.xml.sax.SAXException

import javax.xml.parsers.ParserConfigurationException
import javax.xml.parsers.SAXParser
import javax.xml.parsers.SAXParserFactory

/**
 * Created by wudeng on 17/6/1.
 */
class XmlParser {
    public List<ViewNode> parse(File file) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = null;
        try {
            parser = factory.newSAXParser();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        XmlParseService handler = new XmlParseService(file.getName());
        try {
            parser.parse(inputStream, handler);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return handler.getViewNodes();
    }

    public List<ViewNode> parse() {
        InputStream inputStream = null;
        File file = new File("./text.xml");
        return parse(file);
    }
}
