
package net.mcreator.tmom.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.tmom.item.EnergonShardItem;

@Mod.EventBusSubscriber
public class ShardOfEnergonFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == EnergonShardItem.block)
			event.setBurnTime(2300);
	}
}
