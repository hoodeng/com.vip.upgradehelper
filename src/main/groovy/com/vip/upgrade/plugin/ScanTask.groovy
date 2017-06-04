package com.vip.upgrade.plugin

import com.vip.xml.parser.FileChecker

import org.gradle.api.Action
import org.gradle.api.DefaultTask
import org.gradle.api.Task
import org.gradle.api.tasks.TaskAction

/**
 * Created by wudeng on 17/6/1.
 */
class ScanTask extends DefaultTask {
    @TaskAction
    public void scan() {
        println("scan start ---------")
        FileChecker fileChecker = new FileChecker();
        fileChecker.start();
    }
}
