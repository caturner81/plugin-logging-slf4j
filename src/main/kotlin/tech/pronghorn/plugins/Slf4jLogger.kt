package tech.pronghorn.plugins

import org.slf4j.LoggerFactory
import tech.pronghorn.logging.Logger

class Slf4jLogger(override val name: String) : Logger() {
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

    override fun trace(message: String) = logger.trace(message)
    override fun debug(message: String) = logger.debug(message)
    override fun info(message: String) = logger.info(message)
    override fun warn(message: String) = logger.warn(message)
    override fun error(message: String) = logger.error(message)
}
