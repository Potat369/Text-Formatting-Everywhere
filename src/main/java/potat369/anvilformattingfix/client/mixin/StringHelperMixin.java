package potat369.anvilformattingfix.client.mixin;

import net.minecraft.util.StringHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(StringHelper.class)
public abstract class StringHelperMixin {
    @Inject(method = "isValidChar(C)Z", at = @At("RETURN"), cancellable = true)
    private static void injectIsValidChar(char c, CallbackInfoReturnable<Boolean> ci) {
        ci.setReturnValue(c != 167  ? ci.getReturnValue() : true);
    }
}