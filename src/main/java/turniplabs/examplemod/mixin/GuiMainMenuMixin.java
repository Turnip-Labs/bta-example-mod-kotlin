package turniplabs.examplemod.mixin;

import net.minecraft.client.gui.GuiMainMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import turniplabs.examplemod.ExampleMod;

@Mixin(value = GuiMainMenu.class, remap = false)
public class GuiMainMenuMixin {
    @Inject(method = "<clinit>", at = @At("HEAD"))
    private static void examplemod$onClinit(CallbackInfo ci) {
        ExampleMod.LOGGER.info("This line is printed by the example Mixin!");
    }
}
