package turniplabs.examplemod

import org.slf4j.Logger
import org.slf4j.LoggerFactory

val MODID: String = "examplemod"
val LOGGER: Logger = LoggerFactory.getLogger(MODID)

@Suppress("unused")
fun init() {
    // This code runs as soon as Minecraft is in a mod-load-ready state.
    // However, some things (like resources) may still be uninitialized.
    // Proceed with mild caution.

    LOGGER.info("Hello Fabric world!")
}
