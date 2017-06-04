package com.vip.xml.parser

import org.xml.sax.Attributes
import org.xml.sax.SAXException
import org.xml.sax.helpers.DefaultHandler

/**
 * Created by wudeng on 17/6/1.
 */
class XmlParseService extends DefaultHandler{
    private static final boolean DEBUG = false;
    private String mFileName;
    private List<ViewNode> mNodes;

    public XmlParseService(String fileName) {
        mFileName = fileName;
    }

    public List<ViewNode> getViewNodes() {
        return mNodes;
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
        mNodes = new ArrayList<>();
    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument();

        if (DEBUG) {
            for (ViewNode node : mNodes) {
                System.out.println("name= " + node.name + "  id= " + node.id);
            }
        }

    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        if (DEBUG) {
            System.out.println("attributes ---> " + localName + "  qName =  " + qName + "  " + attributes.getValue("android:id"));
        }
        String id = attributes.getValue("android:id");
        if (id != null && id.length() > 0 && id.startsWith("@+id/")) {
            ViewNode node = new ViewNode(mFileName, qName, id.substring(5));
            mNodes.add(node);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
    }
}
