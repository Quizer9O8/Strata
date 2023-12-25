package com.quizer9o8.strata.objects.blocks;

import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class StrataButtonBlock extends ButtonBlock
{
   public StrataButtonBlock(Properties propertiesIn, BlockSetType blockSetTypeIn, int ticksToStayPressed, boolean arrowsCanPress) {
        super(propertiesIn, blockSetTypeIn, ticksToStayPressed, arrowsCanPress);
    }
}
