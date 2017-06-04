package com.vip.upgrade.plugin

import org.gradle.api.tasks.TaskAction

/**
 * Created by wudeng on 17/6/1.
 */
public class TestTask {
    @TaskAction
    public void hello(){
        println('hello,task');
    }
}

