
package net.mcreator.tmom.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.tmom.itemgroup.ArmourandToolsItemGroup;
import net.mcreator.tmom.TmimModElements;

@TmimModElements.ModElement.Tag
public class PalladiumpickaxeItem extends TmimModElements.ModElement {
	@ObjectHolder("tmim:palladiumpickaxe")
	public static final Item block = null;

	public PalladiumpickaxeItem(TmimModElements instance) {
		super(instance, 362);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1750;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ArmourandToolsItemGroup.tab)) {
		}.setRegistryName("palladiumpickaxe"));
	}
}
