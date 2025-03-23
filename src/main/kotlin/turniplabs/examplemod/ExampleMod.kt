package turniplabs.examplemod

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import turniplabs.halplibe.util.GameStartEntrypoint
import turniplabs.halplibe.util.RecipeEntrypoint

object ExampleMod : ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
	const val MOD_ID: String = "examplemod"
	@JvmField val LOGGER: Logger = LoggerFactory.getLogger(MOD_ID)

	override fun onInitialize() {
		LOGGER.info("ExampleMod initialized.")
	}

	override fun onRecipesReady() {

	}

	override fun initNamespaces() {

	}

	override fun beforeGameStart() {

	}

	override fun afterGameStart() {

	}
}
