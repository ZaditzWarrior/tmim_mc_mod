
package net.mcreator.tmom.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.tmom.itemgroup.ModItemsItemGroup;
import net.mcreator.tmom.TmimModElements;

@TmimModElements.ModElement.Tag
public class YellowCrystalItem extends TmimModElements.ModElement {
	@ObjectHolder("tmim:yellow_crystal")
	public static final Item block = null;

	public YellowCrystalItem(TmimModElements instance) {
		super(instance, 308);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ModItemsItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON));
			setRegistryName("yellow_crystal");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
