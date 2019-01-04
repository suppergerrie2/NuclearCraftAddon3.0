package nca.blocks;

import nca.tab.NCAddonTab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class BunkerBlocks extends Block {

	public BunkerBlocks(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHarvestLevel("Pickaxe", 1);
		setSoundType(blockSoundType.STONE); 
		this.setHardness(3F); 
	}
}



