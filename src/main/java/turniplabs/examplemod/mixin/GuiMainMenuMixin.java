package turniplabs.examplemod.mixin;

import net.minecraft.src.GuiMainMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static turniplabs.halplibe.HalpLibe.LOGGER;

@Mixin(value = GuiMainMenu.class, remap = false)
public class GuiMainMenuMixin {
    @Inject(method = "<clinit>", at = @At("HEAD"))
    private static void examplemod$onClinit(CallbackInfo ci) {
        LOGGER.info("This line is printed by the example Mixin!");
    }
}
