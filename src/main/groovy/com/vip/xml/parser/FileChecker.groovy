package com.vip.xml.parser

/**
 * Created by wudeng on 17/6/1.
 */
class FileChecker {
    private static final String sSrcPath = "/Users/wudeng/workspace/vip/app/src/main/res/layout";

    private static final String[] sSubmodulePaths = [
            "/Users/wudeng/workspace/vip/libraries/VIP_SDK/acs_service/src/main/res/layout",
            "/Users/wudeng/workspace/vip/libraries/VIP_SDK/cart/src/main/res/layout",
            "/Users/wudeng/workspace/vip/libraries/VIP_SDK/cordova/src/main/res/layout",
            "/Users/wudeng/workspace/vip/libraries/VIP_SDK/pay/src/main/res/layout",
            "/Users/wudeng/workspace/vip/libraries/VIP_SDK/session/src/main/res/layout",
            "/Users/wudeng/workspace/vip/libraries/VIP_SDK/share_agent/src/main/res/layout",
            "/Users/wudeng/workspace/vip/libraries/VIP_SDK/ui-custom/src/main/res/layout",
            "/Users/wudeng/workspace/vip/libraries/VIP_SDK/warehouse/src/main/res/layout",
            "/Users/wudeng/workspace/vip/libraries/VIP_SDK/ui_lib/src/main/res/layout"
    ];

    public static void main(String[] args) {
        File srcDir = new File(sSrcPath);
        File[] files = srcDir.listFiles();
        boolean flag = false;

        XmlComparer xmlComparer = new XmlComparer();
        for (File file : files) {
            flag = false;
            for (String path : sSubmodulePaths) {
                File subDir = new File(path);
                File[] subFiles = subDir.listFiles();
                for (File subFile : subFiles) {
                    if (file.getName().equals(subFile.getName())) {
//                        System.out.println("======" + file.getName());

                        xmlComparer.compare(file, subFile);
                        flag = true;
                        break;
                    }
                }

                if (flag) {
                    break;
                }
            }
        }
    }

    public void start(){
        File srcDir = new File(sSrcPath);
        File[] files = srcDir.listFiles();
        boolean flag = false;

        XmlComparer xmlComparer = new XmlComparer();
        for (File file : files) {
            flag = false;
            for (String path : sSubmodulePaths) {
                File subDir = new File(path);
                File[] subFiles = subDir.listFiles();
                for (File subFile : subFiles) {
                    if (file.getName().equals(subFile.getName())) {
//                        System.out.println("======" + file.getName());

                        xmlComparer.compare(file, subFile);
                        flag = true;
                        break;
                    }
                }

                if (flag) {
                    break;
                }
            }
        }
    }
}

