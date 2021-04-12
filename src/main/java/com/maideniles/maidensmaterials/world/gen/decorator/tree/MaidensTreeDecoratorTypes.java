package com.maideniles.maidensmaterials.world.gen.decorator.tree;


import com.maideniles.maidensmaterials.world.gen.decorator.tree.leaf.MaidenLeavesVineTreeDecorator;
import com.maideniles.maidensmaterials.world.gen.decorator.tree.mushroom.MushroomTreeDecorator;
import com.maideniles.maidensmaterials.world.gen.decorator.tree.trunk.MaidenTrunkVineTreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

public class MaidensTreeDecoratorTypes {

    public static final TreeDecoratorType<MaidenTrunkVineTreeDecorator> MAIDENS_TRUNK_VINE = new TreeDecoratorType<>(MaidenTrunkVineTreeDecorator::new);
    public static final TreeDecoratorType<MaidenLeavesVineTreeDecorator> MAIDENS_LEAF_VINE = new TreeDecoratorType<>(MaidenLeavesVineTreeDecorator::new);
    public static final TreeDecoratorType<MushroomTreeDecorator> MAIDENS_MUSHROOM = new TreeDecoratorType<>(MushroomTreeDecorator::new);

}
