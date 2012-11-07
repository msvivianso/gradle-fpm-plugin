/*
* Copyright 2011 Kenshoo.com
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.kenshoo.watership

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import spock.lang.Specification

/**
 * User: lior
 * Date: 11/6/12
 * Time: 3:27 PM
 */
class PackagingPluginTest extends Specification{
        def 'packaginPluginAdsDebianTaskToProject'() {
        given:
            Project project = ProjectBuilder.builder().build()
            project.apply plugin:  'java'
        when:
           project.apply plugin: 'fpm-packaging'
        then:
            project.tasks.debian instanceof DebianTask
            project.tasks.debian.stageDir != null
    }
}