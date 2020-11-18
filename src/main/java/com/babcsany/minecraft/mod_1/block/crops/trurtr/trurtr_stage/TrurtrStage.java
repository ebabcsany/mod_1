package com.babcsany.minecraft.mod_1.block.crops.trurtr.trurtr_stage;

import com.babcsany.minecraft.mod_1.init.BlockInit;
import com.babcsany.minecraft.mod_1.state.ModBlockStateProperties;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.RavagerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class TrurtrStage extends BushBlock implements IGrowable {
   public static final IntegerProperty AGE = ModBlockStateProperties.AGE_0_512;
   private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.03125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.03125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.0625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.09375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.0125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.15625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.1875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.21875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.25D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.28125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.3125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.34375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.40625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.4375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.46875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.5D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.53125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.5625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.59375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.5125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.65625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.6875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.71875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.75D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.78125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.8125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.84375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.90625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.9375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 0.96875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.03125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.0625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.09375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.0125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.15625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.1875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.21875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.25D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.28125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.3125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.34375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.40625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.4375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.46875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.5D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.53125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.5625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.59375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.5125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.65625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.6875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.71875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.75D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.78125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.8125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.84375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.90625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.9375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 1.96875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.03125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.09375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.15625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.1875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.21875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.25D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.28125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.3125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.34375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.40625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.4375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.46875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.5D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.53125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.5625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.59375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.5125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.65625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.6875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.71875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.75D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.78125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.8125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.84375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.90625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.9375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.96875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.03125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.0625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.09375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.0125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.15625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.1875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.21875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.25D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.28125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.3125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.34375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.40625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.4375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.46875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.5D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.53125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.5625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.59375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.5125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.65625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.6875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.71875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.75D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.78125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.8125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.84375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.90625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.9375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.96875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.03125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.09375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.15625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.1875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.21875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.25D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.28125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.3125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.34375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.40625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.4375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.46875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.5D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.53125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.5625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.59375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.5125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.65625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.6875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.71875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.75D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.78125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.8125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.84375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.90625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.9375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.96875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.03125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.0625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.09375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.0125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.15625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.1875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.21875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.25D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.28125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.3125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.34375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.40625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.4375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.46875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.5D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.53125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.5625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.59375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.5125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.65625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.6875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.71875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.75D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.78125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.8125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.84375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.90625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.9375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.96875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.03125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.09375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.15625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.1875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.21875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.25D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.28125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.3125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.34375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.40625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.4375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.46875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.5D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.53125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.5625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.59375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.5125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.65625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.6875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.71875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.75D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.78125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.8125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.84375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.90625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.9375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.96875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.03125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.0625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.09375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.0125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.15625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.1875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.21875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.25D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.28125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.3125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.34375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.40625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.4375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.46875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.5D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.53125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.5625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.59375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.5125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.65625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.6875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.71875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.75D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.78125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.8125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.84375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.90625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.9375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.96875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.03125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.09375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.15625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.1875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.21875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.25D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.28125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.3125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.34375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.40625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.4375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.46875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.5D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.53125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.5625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.59375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.5125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.65625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.6875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.71875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.75D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.78125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.8125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.84375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.90625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.9375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.96875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.03125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.0625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.09375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.0125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.15625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.1875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.21875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.25D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.28125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.3125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.34375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.40625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.4375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.46875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.5D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.53125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.5625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.59375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.5125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.65625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.6875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.71875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.75D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.78125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.8125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.84375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.90625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.9375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.96875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.03125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.0625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.09375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.0125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.15625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.1875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.21875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.25D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.28125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.3125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.34375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.40625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.4375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.46875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.5D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.53125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.5625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.59375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.5125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.65625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.6875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.71875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.75D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.78125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.8125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.84375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.90625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.9375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.96875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.0D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.03125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.0625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.09375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.0125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.15625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.1875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.21875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.25D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.28125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.3125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.34375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.40625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.4375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.46875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.5D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.53125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.5625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.59375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.5125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.65625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.6875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.71875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.75D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.78125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.8125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.84375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.90625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.9375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.96875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.03125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.09375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.15625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.1875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.21875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.25D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.28125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.3125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.34375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.40625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.4375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.46875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.5D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.53125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.5625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.59375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.5125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.65625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.6875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.71875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.75D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.78125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.8125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.84375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.90625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.9375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.96875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.0D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.03125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.0625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.09375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.0125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.15625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.1875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.21875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.25D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.28125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.3125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.34375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.40625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.4375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.46875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.5D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.53125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.5625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.59375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.5125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.65625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.6875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.71875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.75D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.78125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.8125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.84375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.90625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.9375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 13.96875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.03125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.0625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.09375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.0125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.15625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.1875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.21875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.25D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.28125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.3125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.34375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.40625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.4375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.46875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.5D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.53125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.5625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.59375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.5125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.65625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.6875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.71875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.75D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.78125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.8125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.84375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.90625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.9375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.96875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.0D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.03125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.0625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.09375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.0125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.15625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.1875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.21875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.25D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.28125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.3125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.34375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.40625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.4375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.46875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.5D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.53125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.5625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.59375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.5125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.65625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.6875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.71875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.75D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.78125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.8125D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.84375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.90625D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.9375D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.96875D, 16.0D),
           Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)
   };

   public TrurtrStage(Properties builder) {
      super(builder);
      this.setDefaultState(this.stateContainer.getBaseState().with(this.getAgeProperty(), Integer.valueOf(0)));
   }

   public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
      return SHAPE_BY_AGE[state.get(this.getAgeProperty())];
   }

   protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
      return state.getBlock() == Blocks.FARMLAND;
   }

   public IntegerProperty getAgeProperty() {
      return AGE;
   }

   public int getMaxAge() {
      return 512;
   }

   protected int getAge(BlockState state) {
      return state.get(this.getAgeProperty());
   }

   public BlockState withAge(int age) {
      return this.getDefaultState().with(this.getAgeProperty(), Integer.valueOf(age));
   }

   public boolean isMaxAge(BlockState state) {
      return state.get(this.getAgeProperty()) >= this.getMaxAge();
   }

   public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
      super.tick(state, worldIn, pos, rand);
      if (!worldIn.isAreaLoaded(pos, 1)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light
      if (worldIn.getLightSubtracted(pos, 0) >= 9) {
         int i = this.getAge(state);
         if (i < this.getMaxAge()) {
            float f = getGrowthChance(this, worldIn, pos);
            if (net.minecraftforge.common.ForgeHooks.onCropsGrowPre(worldIn, pos, state, rand.nextInt((int)(25.0F / f) + 1) == 0)) {
               worldIn.setBlockState(pos, this.withAge(i + 1), 2);
               net.minecraftforge.common.ForgeHooks.onCropsGrowPost(worldIn, pos, state);
            }
         }
      }

   }

   public void grow(World worldIn, BlockPos pos, BlockState state) {
      int i = this.getAge(state) + this.getBonemealAgeIncrease(worldIn);
      int j = this.getMaxAge();
      if (i > j) {
         i = j;
      }

      worldIn.setBlockState(pos, this.withAge(i), 2);
   }

   protected int getBonemealAgeIncrease(World worldIn) {
      return MathHelper.nextInt(worldIn.rand, 2, 5);
   }

   protected static float getGrowthChance(Block blockIn, IBlockReader worldIn, BlockPos pos) {
      float f = 1.0F;
      BlockPos blockpos = pos.down();

      for(int i = -1; i <= 1; ++i) {
         for(int j = -1; j <= 1; ++j) {
            float f1 = 0.0F;
            BlockState blockstate = worldIn.getBlockState(blockpos.add(i, 0, j));
            if (blockstate.canSustainPlant(worldIn, blockpos.add(i, 0, j), net.minecraft.util.Direction.UP, (net.minecraftforge.common.IPlantable)blockIn)) {
               f1 = 1.0F;
               if (blockstate.isFertile(worldIn, blockpos.add(i, 0, j))) {
                  f1 = 3.0F;
               }
            }

            if (i != 0 || j != 0) {
               f1 /= 4.0F;
            }

            f += f1;
         }
      }

      BlockPos blockpos1 = pos.north();
      BlockPos blockpos2 = pos.south();
      BlockPos blockpos3 = pos.west();
      BlockPos blockpos4 = pos.east();
      boolean flag = blockIn == worldIn.getBlockState(blockpos3).getBlock() || blockIn == worldIn.getBlockState(blockpos4).getBlock();
      boolean flag1 = blockIn == worldIn.getBlockState(blockpos1).getBlock() || blockIn == worldIn.getBlockState(blockpos2).getBlock();
      if (flag && flag1) {
         f /= 2.0F;
      } else {
         boolean flag2 = blockIn == worldIn.getBlockState(blockpos3.north()).getBlock() || blockIn == worldIn.getBlockState(blockpos4.north()).getBlock() || blockIn == worldIn.getBlockState(blockpos4.south()).getBlock() || blockIn == worldIn.getBlockState(blockpos3.south()).getBlock();
         if (flag2) {
            f /= 2.0F;
         }
      }

      return f;
   }

   public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
      return (worldIn.getLightSubtracted(pos, 0) >= 8 || worldIn.canSeeSky(pos)) && super.isValidPosition(state, worldIn, pos);
   }

   public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
      if (entityIn instanceof RavagerEntity && net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(worldIn, entityIn)) {
         worldIn.destroyBlock(pos, true, entityIn);
      }

      super.onEntityCollision(state, worldIn, pos, entityIn);
   }

   protected IItemProvider getSeedsItem() {
      return BlockInit.TRURTR_STAGE.get();
   }

   public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
      return new ItemStack(this.getSeedsItem());
   }

   /**
    * Whether this IGrowable can grow
    */
   public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
      return !this.isMaxAge(state);
   }

   public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
      return true;
   }

   public void grow(ServerWorld worldIn, Random rand, BlockPos pos, BlockState state) {
      this.grow(worldIn, pos, state);
   }

   protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
      builder.add(AGE);
   }
}