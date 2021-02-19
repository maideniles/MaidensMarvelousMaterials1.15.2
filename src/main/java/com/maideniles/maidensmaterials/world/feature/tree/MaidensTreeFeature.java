package com.maideniles.maidensmaterials.world.feature.tree;

import java.util.Optional;

import com.maideniles.maidensmaterials.init.ModBlocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraftforge.common.IPlantable;

public class MaidensTreeFeature extends TreeFeature {
    public MaidensTreeFeature() {
        super(TreeFeatureConfig::func_227338_a_); // Note in 1.16 this will switch to codecs.
    }

    @Override
    public Optional<BlockPos> func_227212_a_(IWorldGenerationReader world, int height, int trunkHeight, int foliage, BlockPos pos, TreeFeatureConfig config) {

        BlockPos blockpos;
        if (!config.forcePlacement) {
            int oceanFloorHeight = world.getHeight(Heightmap.Type.OCEAN_FLOOR, pos).getY();
            int surfaceHeight = world.getHeight(Heightmap.Type.WORLD_SURFACE, pos).getY();
            blockpos = new BlockPos(pos.getX(), oceanFloorHeight, pos.getZ());
            if (surfaceHeight - oceanFloorHeight > config.maxWaterDepth) {
                return Optional.empty();
            }
        } else {
            blockpos = pos;
        }

        if (blockpos.getY() >= 1 && blockpos.getY() + height + 1 <= world.getMaxHeight()) {
            for(int yOffset = 0; yOffset <= height + 1; ++yOffset) {
                int width = config.foliagePlacer.func_225570_a_(trunkHeight, height, foliage, yOffset);
                BlockPos.Mutable mutablePos = new BlockPos.Mutable();

                for(int xOffset = -width; xOffset <= width; ++xOffset) {
                    int zOffset = -width;

                    while(zOffset <= width) {
                        if (yOffset + blockpos.getY() >= 0 && yOffset + blockpos.getY() < world.getMaxHeight()) {
                            mutablePos.setPos(xOffset + blockpos.getX(), yOffset + blockpos.getY(), zOffset + blockpos.getZ());
                            if (canBeReplacedByLogs(world, mutablePos) && (config.ignoreVines || !isVine(world, mutablePos))) {
                                ++zOffset;
                                continue;
                            }

                            return Optional.empty();
                        }

                        return Optional.empty();
                    }
                }
            }

            boolean soil = this.isMaidenSoil(world, blockpos.down(), config.getSapling());
            return soil && blockpos.getY() < world.getMaxHeight() - height - 1 ? Optional.of(blockpos) : Optional.empty();
        } else {
            return Optional.empty();
        }
    }

    private boolean isMaidenSoil(IWorldGenerationReader world, BlockPos soilPos, IPlantable sapling) {
        return isSoilOrFarm(world, soilPos, sapling) || world.hasBlockState(soilPos, state -> state.getBlock() == ModBlocks.ornamentalGrass.get());
    }
}
