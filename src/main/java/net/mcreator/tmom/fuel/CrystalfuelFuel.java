
package net.mcreator.tmom.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.tmom.block.EnergonCrystalBlock;

@Mod.EventBusSubscriber
public class CrystalfuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == EnergonCrystalBlock.block.asItem())
			event.setBurnTime(5000);
	}
}
