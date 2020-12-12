package com.maideniles.maidensmaterials.block;

import net.minecraft.block.*;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class FairyGlowCup extends CocoaBlock implements IGrowable {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_0_2;

    protected static final VoxelShape[] GLOW_CUP_EAST_AABB = new VoxelShape[]{Block.makeCuboidShape(0.6875D, 0.4375D, 0.375D, 0.9375D, 0.75D, 0.625D),
            Block.makeCuboidShape(0.5625D, 0.3125D, 0.3125D, 0.9375D, 0.75D, 0.6875D), Block.makeCuboidShape(0.4375D, 0.1875D, 0.25D, 0.9375D, 0.75D, 0.75D)};


    protected static final VoxelShape[] GLOW_CUP_WEST_AABB = new VoxelShape[]{Block.makeCuboidShape(0.0625D, 0.4375D, 0.375D, 0.3125D, 0.75D, 0.625D),
            Block.makeCuboidShape(0.0625D, 0.3125D, 0.3125D, 0.4375D, 0.75D, 0.6875D), Block.makeCuboidShape(0.0625D, 0.1875D, 0.25D, 0.5625D, 0.75D, 0.75D)};


    protected static final VoxelShape[] GLOW_CUP_NORTH_AABB = new VoxelShape[]{Block.makeCuboidShape(0.375D, 0.4375D, 0.0625D, 0.625D, 0.75D, 0.3125D),
            Block.makeCuboidShape(0.3125D, 0.3125D, 0.0625D, 0.6875D, 0.75D, 0.4375D), Block.makeCuboidShape(0.25D, 0.1875D, 0.0625D, 0.75D, 0.75D, 0.5625D)};


    protected static final VoxelShape[] GLOW_CUP_SOUTH_AABB = new VoxelShape[]{Block.makeCuboidShape(0.375D, 0.4375D, 0.6875D, 0.625D, 0.75D, 0.9375D),
            Block.makeCuboidShape(0.3125D, 0.3125D, 0.5625D, 0.6875D, 0.75D, 0.9375D), Block.makeCuboidShape(0.25D, 0.1875D, 0.4375D, 0.75D, 0.75D, 0.9375D)};

    public FairyGlowCup(Block.Properties properties) {
        super(properties);
        this.setDefaultState(this.stateContainer.getBaseState().with(HORIZONTAL_FACING, Direction.NORTH).with(AGE, Integer.valueOf(0)));

    }

    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
        if (true) {
            int i = state.get(AGE);
            if (i < 2 && net.minecraftforge.common.ForgeHooks.onCropsGrowPre(worldIn, pos, state, worldIn.rand.nextInt(5) == 0)) {
                worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(i + 1)), 2);
                net.minecraftforge.common.ForgeHooks.onCropsGrowPost(worldIn, pos, state);
            }
        }

    }

    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
        Block block = worldIn.getBlockState(pos.offset(state.get(HORIZONTAL_FACING))).getBlock();
        return block.isIn(BlockTags.LOGS);
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        int i = state.get(AGE);
        switch((Direction)state.get(HORIZONTAL_FACING)) {
            case SOUTH:
                return GLOW_CUP_SOUTH_AABB[i];
            case NORTH:
            default:
                return GLOW_CUP_NORTH_AABB[i];
            case WEST:
                return GLOW_CUP_WEST_AABB[i];
            case EAST:
                return GLOW_CUP_EAST_AABB[i];
        }
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockState blockstate = this.getDefaultState();
        IWorldReader iworldreader = context.getWorld();
        BlockPos blockpos = context.getPos();

        for(Direction direction : context.getNearestLookingDirections()) {
            if (direction.getAxis().isHorizontal()) {
                blockstate = blockstate.with(HORIZONTAL_FACING, direction);
                if (blockstate.isValidPosition(iworldreader, blockpos)) {
                    return blockstate;
                }
            }
        }

        return null;
    }

    /**
     * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
     * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
     * returns its solidified counterpart.
     * Note that this method should ideally consider only the specific face passed in.
     */
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        return facing == stateIn.get(HORIZONTAL_FACING) && !stateIn.isValidPosition(worldIn, currentPos) ? Blocks.AIR.getDefaultState() : super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
    }

    /**
     * Whether this IGrowable can grow
     */
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return state.get(AGE) < 2;
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return true;
    }

    public void grow(World worldIn, Random rand, BlockPos pos, BlockState state) {
        worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(state.get(AGE) + 1)), 2);
    }

    @Override
    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
        return (new ItemStack(Items.GLOWSTONE_DUST));
    }



    /**
     * Gets the render layer this block will render on. SOLID for solid blocks, CUTOUT or CUTOUT_MIPPED for on-off
     * transparency (glass, reeds), TRANSLUCENT for fully blended transparency (stained glass)
     */
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(HORIZONTAL_FACING, AGE);
    }

    @Override
    public boolean ticksRandomly(BlockState state) {
        return true;
    }
}