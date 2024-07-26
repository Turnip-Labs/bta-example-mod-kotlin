package turniplabs.examplemod

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import turniplabs.halplibe.util.GameStartEntrypoint
import turniplabs.halplibe.util.RecipeEntrypoint

object ExampleMod: ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
	const val MODID: String = "examplemod"

	@JvmField
	val LOGGER: Logger = LoggerFactory.getLogger(MODID)

	override fun onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

		LOGGER.info("Hello Fabric world!")
	}

	override fun beforeGameStart() {

	}

	override fun afterGameStart() {

	}

	override fun onRecipesReady() {

	}

	override fun initNamespaces() {

	}
}
