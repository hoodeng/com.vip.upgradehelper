package com.vip.upgrade.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by wudeng on 17/6/1.
 */
class UpgradePlugin implements Plugin<Project> {
    void apply(Project project) {
        project.task("scan", type: ScanTask.class)
    }
}
