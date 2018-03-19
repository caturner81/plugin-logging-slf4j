/*
 * Copyright 2017 Pronghorn Technology LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tech.pronghorn.plugins

import org.slf4j.LoggerFactory
import tech.pronghorn.logging.Logger

public class Slf4jLogger(override val name: String) : Logger() {
    private val logger = LoggerFactory.getLogger(name)

    override val isTraceEnabled: Boolean
        get() = logger.isTraceEnabled
    override val isDebugEnabled: Boolean
        get() = logger.isDebugEnabled
    override val isInfoEnabled: Boolean
        get() = logger.isInfoEnabled
    override val isWarnEnabled: Boolean
        get() = logger.isWarnEnabled
    override val isErrorEnabled: Boolean
        get() = logger.isErrorEnabled

    override fun traceImpl(message: String) = logger.trace(message)
    override fun debugImpl(message: String) = logger.debug(message)
    override fun infoImpl(message: String) = logger.info(message)
    override fun warnImpl(message: String) = logger.warn(message)
    override fun errorImpl(message: String) = logger.error(message)
}
