package com.vip.xml.parser

/**
 * Created by wudeng on 17/6/1.
 */
class ViewNode {
    public String fileName;
    public String name;
    public String id;

    public ViewNode(String fileName, String name, String id) {
        this.fileName = fileName;
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "fileName = " + fileName + "   name= " + name + "   id= " + id;
    }
}
