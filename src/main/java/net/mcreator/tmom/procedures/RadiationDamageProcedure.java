package net.mcreator.tmom.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.tmom.TmimMod;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class RadiationDamageProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TmimMod.LOGGER.warn("Failed to load dependency world for procedure RadiationDamage!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TmimMod.LOGGER.warn("Failed to load dependency entity for procedure RadiationDamage!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		double Wait_Time = 0;
		{
			List<? extends PlayerEntity> _players = new ArrayList<>(world.getPlayers());
			for (Entity entityiterator : _players) {
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).attackEntityFrom(new DamageSource("Radiation").setDamageBypassesArmor(), (float) 0.2);
				}
			}
		}
	}
}
