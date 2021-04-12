package com.maideniles.maidensmaterials.world.gen.decorator.tree.leaf;

import com.google.common.collect.ImmutableMap;
import com.maideniles.maidensmaterials.block.CustomVineBlock;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.world.gen.decorator.tree.MaidensTreeDecoratorTypes;
import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import java.util.List;
import java.util.Random;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.VineBlock;
import net.minecraft.state.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

public class MaidenLeavesVineTreeDecorator extends TreeDecorator {
    public MaidenLeavesVineTreeDecorator() {
        super(MaidensTreeDecoratorTypes.MAIDENS_LEAF_VINE);
    }

    public <T> MaidenLeavesVineTreeDecorator(Dynamic<T> p_i225870_1_) {
        this();
    }


    public void func_225576_a_(IWorld p_225576_1_, Random p_225576_2_, List<BlockPos> p_225576_3_, List<BlockPos> p_225576_4_, Set<BlockPos> p_225576_5_, MutableBoundingBox p_225576_6_) {
        p_225576_4_.forEach((p_227421_5_) -> {

            Block vine = Blocks.VINE;
            if (!p_225576_3_.isEmpty())  {
                Block leaf = p_225576_1_.getBlockState(p_225576_3_.get(0)).getBlock();
                if (leaf == ModBlocks.crabappleLeaves.get()) {
                    vine = ModBlocks.crabappleVine.get();
                }
                if( leaf == ModBlocks.poincianaLeaves.get()) {
                    vine = ModBlocks.poincianaVine.get();
                }

            }

            if (p_225576_2_.nextInt(4) == 0) {
                BlockPos blockpos = p_227421_5_.west();
                if (AbstractTreeFeature.isAir(p_225576_1_, blockpos)) {
                    this.growVines(p_225576_1_, blockpos, VineBlock.EAST, p_225576_5_, p_225576_6_,vine);

                }
            }

            if (p_225576_2_.nextInt(4) == 0) {
                BlockPos blockpos1 = p_227421_5_.east();
                if (AbstractTreeFeature.isAir(p_225576_1_, blockpos1)) {
                    this.growVines(p_225576_1_, blockpos1, VineBlock.WEST, p_225576_5_, p_225576_6_,vine);
                }
            }

            if (p_225576_2_.nextInt(4) == 0) {
                BlockPos blockpos2 = p_227421_5_.north();
                if (AbstractTreeFeature.isAir(p_225576_1_, blockpos2)) {
                    this.growVines(p_225576_1_, blockpos2, VineBlock.SOUTH, p_225576_5_, p_225576_6_,vine);
                }
            }

            if (p_225576_2_.nextInt(4) == 0) {
                BlockPos blockpos3 = p_227421_5_.south();
                if (AbstractTreeFeature.isAir(p_225576_1_, blockpos3)) {
                    this.growVines(p_225576_1_, blockpos3, VineBlock.NORTH, p_225576_5_, p_225576_6_,vine);


                }
            }

        });
    }

    private void placeVine(IWorld iWorld, BlockPos blockpos3, BooleanProperty north, Set<BlockPos> posSet, MutableBoundingBox box, Block vine) {

        this.func_227423_a_(iWorld, blockpos3, vine.getDefaultState().with(north, Boolean.valueOf(true)), posSet, box);
    }

    private void growVines(IWorld world, BlockPos blockPos, BooleanProperty north, Set<BlockPos> setPos, MutableBoundingBox box, Block vine) {
        this.placeVine(world, blockPos, north, setPos, box, vine);
        int i = 4;

        for(BlockPos blockpos = blockPos.down(); AbstractTreeFeature.isAir(world, blockpos) && i > 0; --i) {
            this.placeVine(world, blockpos, north, setPos, box, vine);
            blockpos = blockpos.down();
        }

    }

    public <T> T serialize(DynamicOps<T> p_218175_1_) {
        return (new Dynamic<>(p_218175_1_, p_218175_1_.createMap(ImmutableMap.of(p_218175_1_.createString("type"), p_218175_1_.createString(Registry.TREE_DECORATOR_TYPE.getKey(this.field_227422_a_).toString()))))).getValue();
    }
}
