
package net.mcreator.tmom.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.tmom.block.CopperOreBlock;
import net.mcreator.tmom.TmimModElements;

@TmimModElements.ModElement.Tag
public class ModBlocksItemGroup extends TmimModElements.ModElement {
	public ModBlocksItemGroup(TmimModElements instance) {
		super(instance, 351);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmod_blocks") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CopperOreBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
