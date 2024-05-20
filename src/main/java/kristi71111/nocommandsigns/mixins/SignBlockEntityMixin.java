package kristi71111.nocommandsigns.mixins;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = SignBlockEntity.class)
public abstract class SignBlockEntityMixin {
    /**
     * @author kristi
     * @reason We don't do that here
     */
    @Overwrite
    public boolean canExecuteClickCommands(boolean pIsFrontText, Player pPlayer) {
        return false;
    }
    /**
     * @author kristi
     * @reason We don't do that here
     */
    @Overwrite
    public boolean executeClickCommandsIfPresent(Player pPlayer, Level pLevel, BlockPos pPos, boolean pFrontText) {
        return false;
    }
}
