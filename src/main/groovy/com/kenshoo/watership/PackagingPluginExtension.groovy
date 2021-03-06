/*
* Copyright 2012 Kenshoo.com
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

import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory

class PackagingPluginExtension {
    @Input
    def dependencies = []

    @Input
    def prefix

    @Input
    def filesArgs

    @Input
    def baseDir

    @OutputDirectory
    def packageDir

    @Input
    def extraOptions

    def extraFlags

    boolean force
}
