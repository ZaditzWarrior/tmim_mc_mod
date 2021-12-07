
package net.mcreator.tmom.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.tmom.item.BlockReplacerV1Item;
import net.mcreator.tmom.TmimModElements;

@TmimModElements.ModElement.Tag
public class BlockReplacersItemGroup extends TmimModElements.ModElement {
	public BlockReplacersItemGroup(TmimModElements instance) {
		super(instance, 622);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabblock_replacers") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BlockReplacerV1Item.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
