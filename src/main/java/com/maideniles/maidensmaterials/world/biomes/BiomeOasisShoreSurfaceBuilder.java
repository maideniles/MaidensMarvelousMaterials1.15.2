package com.maideniles.maidensmaterials.world.biomes;

import com.maideniles.maidensmaterials.init.ModBlocks;
import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

import java.util.Random;
import java.util.function.Function;

public class BiomeOasisShoreSurfaceBuilder extends SurfaceBuilder<SurfaceBuilderConfig> {

    public BiomeOasisShoreSurfaceBuilder(Function<Dynamic<?>, ? extends SurfaceBuilderConfig> function) {
        super(function);
    }

    @Override
    public void buildSurface(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise,
                             BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
        Random rd = new Random();
        int i = rd.nextInt(1);
        if (i == 0) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock,
                    defaultFluid, seaLevel, seed,
                    new SurfaceBuilderConfig(ModBlocks.sparklingSand.get().getDefaultState(),
                            Blocks.SAND.getDefaultState(), Blocks.SANDSTONE.getDefaultState()));
        } else {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock,
                    defaultFluid, seaLevel, seed,
                    new SurfaceBuilderConfig(
                            i == 1 ? ModBlocks.sparklingSand.get().getDefaultState()
                                    : ModBlocks.sparklingSand.get().getDefaultState(),
                            Blocks.SAND.getDefaultState(), Blocks.SANDSTONE.getDefaultState()));
        }
    }
}
