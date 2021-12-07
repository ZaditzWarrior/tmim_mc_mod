package net.mcreator.tmom.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

import net.mcreator.tmom.item.IceShardItem;
import net.mcreator.tmom.item.GlassshardItem;
import net.mcreator.tmom.TmimMod;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Drop_Items_Glass_ShardsProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TmimMod.LOGGER.warn("Failed to load dependency world for procedure Drop_Items_Glass_Shards!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TmimMod.LOGGER.warn("Failed to load dependency x for procedure Drop_Items_Glass_Shards!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TmimMod.LOGGER.warn("Failed to load dependency y for procedure Drop_Items_Glass_Shards!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TmimMod.LOGGER.warn("Failed to load dependency z for procedure Drop_Items_Glass_Shards!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		{
			List<? extends PlayerEntity> _players = new ArrayList<>(world.getPlayers());
			for (Entity entityiterator : _players) {
				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.GLASS) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(GlassshardItem.block));
						entityToSpawn.setPickupDelay((int) 5);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(GlassshardItem.block));
						entityToSpawn.setPickupDelay((int) 5);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(GlassshardItem.block));
						entityToSpawn.setPickupDelay((int) 5);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(GlassshardItem.block));
						entityToSpawn.setPickupDelay((int) 5);
						world.addEntity(entityToSpawn);
					}
					world.playEvent(2001, new BlockPos((int) x, (int) y, (int) z), Block.getStateId(Blocks.GLASS.getDefaultState()));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				}
				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.ICE) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(IceShardItem.block));
						entityToSpawn.setPickupDelay((int) 5);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(IceShardItem.block));
						entityToSpawn.setPickupDelay((int) 5);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(IceShardItem.block));
						entityToSpawn.setPickupDelay((int) 5);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(IceShardItem.block));
						entityToSpawn.setPickupDelay((int) 5);
						world.addEntity(entityToSpawn);
					}
					world.playEvent(2001, new BlockPos((int) x, (int) y, (int) z), Block.getStateId(Blocks.ICE.getDefaultState()));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				}
				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.PACKED_ICE) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(IceShardItem.block));
						entityToSpawn.setPickupDelay((int) 5);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(IceShardItem.block));
						entityToSpawn.setPickupDelay((int) 5);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(IceShardItem.block));
						entityToSpawn.setPickupDelay((int) 5);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(IceShardItem.block));
						entityToSpawn.setPickupDelay((int) 5);
						world.addEntity(entityToSpawn);
					}
					world.playEvent(2001, new BlockPos((int) x, (int) y, (int) z), Block.getStateId(Blocks.PACKED_ICE.getDefaultState()));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				}
				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.FROSTED_ICE) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(IceShardItem.block));
						entityToSpawn.setPickupDelay((int) 5);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(IceShardItem.block));
						entityToSpawn.setPickupDelay((int) 5);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(IceShardItem.block));
						entityToSpawn.setPickupDelay((int) 5);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(IceShardItem.block));
						entityToSpawn.setPickupDelay((int) 5);
						world.addEntity(entityToSpawn);
					}
					world.playEvent(2001, new BlockPos((int) x, (int) y, (int) z), Block.getStateId(Blocks.FROSTED_ICE.getDefaultState()));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				}
				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.BLUE_ICE) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(IceShardItem.block));
						entityToSpawn.setPickupDelay((int) 5);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(IceShardItem.block));
						entityToSpawn.setPickupDelay((int) 5);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(IceShardItem.block));
						entityToSpawn.setPickupDelay((int) 5);
						world.addEntity(entityToSpawn);
					}
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(IceShardItem.block));
						entityToSpawn.setPickupDelay((int) 5);
						world.addEntity(entityToSpawn);
					}
					world.playEvent(2001, new BlockPos((int) x, (int) y, (int) z), Block.getStateId(Blocks.BLUE_ICE.getDefaultState()));
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
				}
			}
		}
	}
}
