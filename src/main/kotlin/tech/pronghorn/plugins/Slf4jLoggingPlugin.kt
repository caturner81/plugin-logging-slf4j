package tech.pronghorn.plugins

import tech.pronghorn.logging.Logger
import tech.pronghorn.plugins.logging.LoggingPlugin

object Slf4jLoggingPlugin: LoggingPlugin {
    override fun get(name: String): Logger = Slf4jLogger(name)
}
