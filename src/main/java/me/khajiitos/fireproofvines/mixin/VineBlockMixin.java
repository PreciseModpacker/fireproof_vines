package me.khajiitos.fireproofvines.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.VineBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.extensions.IForgeBlock;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(VineBlock.class)
public abstract class VineBlockMixin implements IForgeBlock {

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return false;
    }
}
