package com.maideniles.maidensmaterials.world.feature.tree;

import com.maideniles.maidensmaterials.block.CustomVineBlock;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.mojang.datafixers.Dynamic;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CocoaBlock;
import net.minecraft.block.material.Material;
import net.minecraft.state.BooleanProperty;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.IWorldWriter;
import net.minecraft.world.gen.IWorldGenerationBaseReader;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;
import java.util.Set;
import java.util.function.Function;





    public class MaidensTreeFeatureVines extends AbstractTreeFeature<NoFeatureConfig> {
        private static final BlockState DEFAULT_TRUNK = Blocks.OAK_LOG.getDefaultState();
        private static final BlockState DEFAULT_LEAF = Blocks.OAK_LEAVES.getDefaultState();
        private static final BlockState DEFAULT_VINE = Blocks.VINE.getDefaultState();
        protected final int minTreeHeight;
        private final boolean vinesGrow;
        private final BlockState trunk;
        private final BlockState leaf;
        private final BlockState vine;
        private final boolean useExtraRandomHeight;

        public MaidensTreeFeatureVines(Function<Dynamic<?>, ? extends NoFeatureConfig> configFactoryIn, boolean doBlockNotifyOnPlace, boolean extraRandomHeightIn) {
            this(configFactoryIn, doBlockNotifyOnPlace, 4, true, DEFAULT_TRUNK,  DEFAULT_LEAF, DEFAULT_VINE,true);
        }

        public MaidensTreeFeatureVines(Function<Dynamic<?>, ? extends NoFeatureConfig> configFactoryIn, boolean doBlockNotifyOnPlace, int minTreeHeightIn, boolean extraRandomHeightIn, BlockState trunkState, BlockState leafState, BlockState vineState, boolean vinesGrowIn) {
            super(configFactoryIn, doBlockNotifyOnPlace);
            this.minTreeHeight = minTreeHeightIn;
            this.trunk = trunkState;
            this.leaf = leafState;
            this.vine = vineState;
            this.vinesGrow = vinesGrowIn;
            this.useExtraRandomHeight = extraRandomHeightIn;

    }


        protected static boolean isAir(IWorldGenerationBaseReader worldIn, BlockPos pos) {
            if (!(worldIn instanceof net.minecraft.world.IBlockReader)) // FORGE: Redirect to state method when possible
                return worldIn.hasBlockState(pos, BlockState::isAir);
            else return worldIn.hasBlockState(pos, state -> state.isAir((net.minecraft.world.IBlockReader)worldIn, pos));
        }

        protected static boolean isDirt(IWorldGenerationBaseReader worldIn, BlockPos pos) {
            return worldIn.hasBlockState(pos, (p_214590_0_) -> {
                return Block.isDirt(p_214590_0_.getBlock());
            });
        }

        protected static boolean isWater(IWorldGenerationBaseReader worldIn, BlockPos pos) {
            return worldIn.hasBlockState(pos, (p_214583_0_) -> {
                return p_214583_0_.getBlock() == Blocks.WATER;
            });
        }

        protected static boolean isLeaves(IWorldGenerationBaseReader worldIn, BlockPos pos) {
            return worldIn.hasBlockState(pos, (p_214579_0_) -> {
                return p_214579_0_.isIn(BlockTags.LEAVES);
            });
        }

        protected static boolean isAirOrLeaves(IWorldGenerationBaseReader worldIn, BlockPos pos) {
            if (!(worldIn instanceof net.minecraft.world.IWorldReader)) // FORGE: Redirect to state method when possible
                return worldIn.hasBlockState(pos, (p_214581_0_) -> {
                    return p_214581_0_.isAir() || p_214581_0_.isIn(BlockTags.LEAVES);
                });
            else return worldIn.hasBlockState(pos, state -> state.canBeReplacedByLeaves((net.minecraft.world.IWorldReader)worldIn, pos));
        }

        @Deprecated //Forge: moved to isSoil
        protected static boolean isDirtOrGrassBlock(IWorldGenerationBaseReader worldIn, BlockPos pos) {
            return worldIn.hasBlockState(pos, (p_214582_0_) -> {
                Block block = p_214582_0_.getBlock();
                return Block.isDirt(block) || block == Blocks.GRASS_BLOCK || block == ModBlocks.ornamentalGrass.get();
            });
        }

        protected static boolean isSoil(IWorldGenerationBaseReader reader, BlockPos pos, net.minecraftforge.common.IPlantable sapling) {
            if (!(reader instanceof net.minecraft.world.IBlockReader) || sapling == null)
                return isDirtOrGrassBlock(reader, pos);
            return reader.hasBlockState(pos, state -> state.canSustainPlant((net.minecraft.world.IBlockReader)reader, pos, Direction.UP, sapling));
        }

        @Deprecated //Forge: moved to isSoilOrFarm
        protected static boolean isDirtOrGrassBlockOrFarmland(IWorldGenerationBaseReader worldIn, BlockPos pos) {
            return worldIn.hasBlockState(pos, (p_214586_0_) -> {
                Block block = p_214586_0_.getBlock();
                return Block.isDirt(block) || block == Blocks.GRASS_BLOCK || block == Blocks.FARMLAND || block == ModBlocks.ornamentalGrass.get();
            });
        }

        protected static boolean isSoilOrFarm(IWorldGenerationBaseReader reader, BlockPos pos, net.minecraftforge.common.IPlantable sapling) {
            if (!(reader instanceof net.minecraft.world.IBlockReader) || sapling == null)
                return isDirtOrGrassBlockOrFarmland(reader, pos);
            return reader.hasBlockState(pos, state -> state.canSustainPlant((net.minecraft.world.IBlockReader)reader, pos, Direction.UP, sapling));
        }

        protected static boolean func_214576_j(IWorldGenerationBaseReader p_214576_0_, BlockPos p_214576_1_) {
            return p_214576_0_.hasBlockState(p_214576_1_, (p_214588_0_) -> {
                Material material = p_214588_0_.getMaterial();
                return material == Material.TALL_PLANTS;
            });
        }

        @Deprecated //Forge: moved to setDirtAt
        protected void func_214584_a(IWorldGenerationReader p_214584_1_, BlockPos p_214584_2_) {
            if (!isDirt(p_214584_1_, p_214584_2_)) {
                this.setBlockState(p_214584_1_, p_214584_2_, Blocks.DIRT.getDefaultState());
            }


        }


    public boolean place(Set<BlockPos> changedBlocks, IWorldGenerationReader worldIn, Random rand, BlockPos position, MutableBoundingBox p_208519_5_) {
        int i = this.getHeight(rand);
        if (this.useExtraRandomHeight) {
            i += rand.nextInt(10);
        }
        boolean flag = true;
        if (position.getY() >= 1 && position.getY() + i + 1 <= worldIn.getMaxHeight()) {
            for(int j = position.getY(); j <= position.getY() + 1 + i; ++j) {
                int k = 1;
                if (j == position.getY()) {
                    k = 0;
                }

                if (j >= position.getY() + 1 + i - 2) {
                    k = 2;
                }

                BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

                for(int l = position.getX() - k; l <= position.getX() + k && flag; ++l) {
                    for(int i1 = position.getZ() - k; i1 <= position.getZ() + k && flag; ++i1) {
                        if (j >= 0 && j < worldIn.getMaxHeight()) {
                            if (!func_214587_a(worldIn, blockpos$mutableblockpos.setPos(l, j, i1))) {
                                flag = false;
                            }
                        } else {
                            flag = false;
                        }
                    }
                }
            }

            if (!flag) {
                return false;
            } else if (isSoil(worldIn, position.down(), getSapling()) && position.getY() < worldIn.getMaxHeight() - i - 1) {
                this.setDirtAt(worldIn, position.down(), position);
                int j2 = 3;
                int k2 = 0;

                for(int l2 = position.getY() - 3 + i; l2 <= position.getY() + i; ++l2) {
                    int l3 = l2 - (position.getY() + i);
                    int j4 = 1 - l3 / 2;

                    for(int j1 = position.getX() - j4; j1 <= position.getX() + j4; ++j1) {
                        int k1 = j1 - position.getX();

                        for(int l1 = position.getZ() - j4; l1 <= position.getZ() + j4; ++l1) {
                            int i2 = l1 - position.getZ();
                            if (Math.abs(k1) != j4 || Math.abs(i2) != j4 || rand.nextInt(2) != 0 && l3 != 0) {
                                BlockPos blockpos = new BlockPos(j1, l2, l1);
                                if (isAirOrLeaves(worldIn, blockpos) || func_214576_j(worldIn, blockpos)) {
                                    this.setLogState(changedBlocks, worldIn, blockpos, this.leaf, p_208519_5_);
                                }
                            }
                        }
                    }
                }

                for(int i3 = 0; i3 < i; ++i3) {
                    if (isAirOrLeaves(worldIn, position.up(i3)) || func_214576_j(worldIn, position.up(i3))) {
                        this.setLogState(changedBlocks, worldIn, position.up(i3), this.trunk, p_208519_5_);
                        if (this.vinesGrow && i3 > 0) {
                            if (rand.nextInt(3) > 0 && isAir(worldIn, position.add(-1, i3, 0))) {
                                this.addVine(worldIn, position.add(-1, i3, 0), CustomVineBlock.EAST);
                            }

                            if (rand.nextInt(3) > 0 && isAir(worldIn, position.add(1, i3, 0))) {
                                this.addVine(worldIn, position.add(1, i3, 0), CustomVineBlock.WEST);
                            }

                            if (rand.nextInt(3) > 0 && isAir(worldIn, position.add(0, i3, -1))) {
                                this.addVine(worldIn, position.add(0, i3, -1), CustomVineBlock.SOUTH);
                            }

                            if (rand.nextInt(3) > 0 && isAir(worldIn, position.add(0, i3, 1))) {
                                this.addVine(worldIn, position.add(0, i3, 1), CustomVineBlock.NORTH);
                            }
                        }
                    }
                }

                if (this.vinesGrow) {
                    for(int j3 = position.getY() - 3 + i; j3 <= position.getY() + i; ++j3) {
                        int i4 = j3 - (position.getY() + i);
                        int k4 = 2 - i4 / 2;
                        BlockPos.MutableBlockPos blockpos$mutableblockpos1 = new BlockPos.MutableBlockPos();


                        for(int l4 = position.getX() - k4; l4 <= position.getX() + k4; ++l4) {
                            for(int i5 = position.getZ() - k4; i5 <= position.getZ() + k4; ++i5) {
                                blockpos$mutableblockpos1.setPos(l4, j3, i5);
                                if (isLeaves(worldIn, blockpos$mutableblockpos1)) {
                                    BlockPos blockpos3 = blockpos$mutableblockpos1.west();
                                    BlockPos blockpos4 = blockpos$mutableblockpos1.east();
                                    BlockPos blockpos1 = blockpos$mutableblockpos1.north();
                                    BlockPos blockpos2 = blockpos$mutableblockpos1.south();
                                    if (rand.nextInt(4) == 0 && isAir(worldIn, blockpos3)) {
                                        this.addHangingVine(worldIn, blockpos3, CustomVineBlock.EAST);
                                    }

                                    if (rand.nextInt(4) == 0 && isAir(worldIn, blockpos4)) {
                                        this.addHangingVine(worldIn, blockpos4, CustomVineBlock.WEST);
                                    }

                                    if (rand.nextInt(4) == 0 && isAir(worldIn, blockpos1)) {
                                        this.addHangingVine(worldIn, blockpos1, CustomVineBlock.SOUTH);
                                    }

                                    if (rand.nextInt(4) == 0 && isAir(worldIn, blockpos2)) {
                                        this.addHangingVine(worldIn, blockpos2, CustomVineBlock.NORTH);
                                    }
                                }
                            }
                        }
                    }

                    if (rand.nextInt(5) == 0 && i > 5) {
                        for(int k3 = 0; k3 < 2; ++k3) {
                            for(Direction direction : Direction.Plane.HORIZONTAL) {
                                if (rand.nextInt(4 - k3) == 0) {
                                    Direction direction1 = direction.getOpposite();
                                    this.placeCocoa(worldIn, rand.nextInt(3), position.add(direction1.getXOffset(), i - 5 + k3, direction1.getZOffset()), direction);
                                }
                            }
                        }
                    }
                }

                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    protected int getHeight(Random random) {
        return this.minTreeHeight + random.nextInt(3);
    }

    private void placeCocoa(IWorldGenerationReader worldIn, int age, BlockPos pos, Direction side) {
        this.setBlockState(worldIn, pos, ModBlocks.fairyGlowCup.get().getDefaultState().with(CocoaBlock.AGE, Integer.valueOf(age)).with(CocoaBlock.HORIZONTAL_FACING, side));
    }

    private void addVine(IWorldWriter worldIn, BlockPos pos, BooleanProperty prop) {
        this.setBlockState(worldIn, pos, vine.with(prop, Boolean.valueOf(true)));
    }

    private void addHangingVine(IWorldGenerationReader worldIn, BlockPos pos, BooleanProperty prop) {
        this.addVine(worldIn, pos, prop);
        int i = 4;

        for(BlockPos blockpos = pos.down(); isAir(worldIn, blockpos) && i > 0; --i) {
            this.addVine(worldIn, blockpos, prop);
            blockpos = blockpos.down();
        }

    }
}