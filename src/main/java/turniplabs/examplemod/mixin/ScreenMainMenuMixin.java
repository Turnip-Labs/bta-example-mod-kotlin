package turniplabs.examplemod.mixin;

import net.minecraft.client.gui.ScreenMainMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import turniplabs.examplemod.ExampleMod;

@Mixin(value = ScreenMainMenu.class, remap = false)
public abstract class ScreenMainMenuMixin {
    @Inject(method = "<clinit>", at = @At("HEAD"))
    private static void examplemod$onClinit(CallbackInfo ci) {
        ExampleMod.INSTANCE.getLOGGER().info("This line is printed by the example mod's mixin!");
    }
}
