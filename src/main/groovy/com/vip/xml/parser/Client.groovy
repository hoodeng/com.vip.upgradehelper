package com.vip.xml.parser

import com.vip.jar.MathTest

/**
 * Created by wudeng on 17/6/1.
 */
class Client {

    static final def sArray = ['h1' ,'h2', 'h3' ,'h4'] as String[];

    public static void main(String[] args) {
        System.out.println("hello client")
        sArray.each {
            println it
        }

        MathTest test = new MathTest();
        int r = test.add(2,3);
        println 'r---> ' + r
    }


}
