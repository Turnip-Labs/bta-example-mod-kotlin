package turniplabs.examplemod

import net.fabricmc.api.ModInitializer
import net.java.games.input.Component.Identifier.Key.T
import org.checkerframework.common.returnsreceiver.qual.This
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object ExampleMod: ModInitializer {
    @JvmField
    val MODID: String = "examplemod"

    @JvmField
    val LOGGER: Logger = LoggerFactory.getLogger(MODID)

    override fun onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Hello Fabric world!")
    }

}
