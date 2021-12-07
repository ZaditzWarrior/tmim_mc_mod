
package net.mcreator.tmom.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.tmom.item.GreenRupeeItem;
import net.mcreator.tmom.TmimModElements;

@TmimModElements.ModElement.Tag
public class ModItemsItemGroup extends TmimModElements.ModElement {
	public ModItemsItemGroup(TmimModElements instance) {
		super(instance, 352);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmod_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GreenRupeeItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
