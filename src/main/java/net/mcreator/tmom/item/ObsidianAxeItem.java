
package net.mcreator.tmom.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.tmom.itemgroup.ArmourandToolsItemGroup;
import net.mcreator.tmom.TmimModElements;

@TmimModElements.ModElement.Tag
public class ObsidianAxeItem extends TmimModElements.ModElement {
	@ObjectHolder("tmim:obsidian_axe")
	public static final Item block = null;

	public ObsidianAxeItem(TmimModElements instance) {
		super(instance, 196);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2750;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ArmourandToolsItemGroup.tab)) {
		}.setRegistryName("obsidian_axe"));
	}
}
