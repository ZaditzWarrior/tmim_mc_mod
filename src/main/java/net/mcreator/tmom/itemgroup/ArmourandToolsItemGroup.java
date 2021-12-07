
package net.mcreator.tmom.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.tmom.item.RedDiamondPickaxeItem;
import net.mcreator.tmom.TmimModElements;

@TmimModElements.ModElement.Tag
public class ArmourandToolsItemGroup extends TmimModElements.ModElement {
	public ArmourandToolsItemGroup(TmimModElements instance) {
		super(instance, 353);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabarmourand_tools") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RedDiamondPickaxeItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
