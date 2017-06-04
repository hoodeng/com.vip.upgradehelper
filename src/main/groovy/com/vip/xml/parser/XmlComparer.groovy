package com.vip.xml.parser

/**
 * Created by wudeng on 17/6/1.
 */
class XmlComparer {
    private XmlParser mXmlParesr;

    public XmlComparer() {
        mXmlParesr = new XmlParser();
    }

    public void compare(File f1, File f2) {
        List<ViewNode> nodes1 = mXmlParesr.parse(f1);
        List<ViewNode> nodes2 = mXmlParesr.parse(f2);

        boolean hit;
        for(ViewNode node2 : nodes2){
            hit = false;
            for(ViewNode node1 : nodes1){
                if(node2.id.equals(node1.id)){
                    hit = true;
                    break;
                }
            }

            if(!hit){
                System.out.println("hit ---- >" +node2.toString());
            }
        }
    }

    public void compare(String filePath1,String filePath2){
        compare(new File(filePath1),new File(filePath2));
    }
}
