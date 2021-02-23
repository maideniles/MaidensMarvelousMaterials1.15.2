package com.maideniles.maidensmaterials.world.gen.decorator.tree;

import com.maideniles.maidensmaterials.world.gen.decorator.tree.leaf.CrabappleLeavesVineTreeDecorator;
import com.maideniles.maidensmaterials.world.gen.decorator.tree.trunk.CrabappleTrunkVineTreeDecorator;
import net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

public class MaidensTreeDecoratorTypes {

    public static final TreeDecoratorType<CrabappleTrunkVineTreeDecorator> MAIDENS_TRUNK_VINE = new TreeDecoratorType<>(CrabappleTrunkVineTreeDecorator::new);
    public static final TreeDecoratorType<CrabappleLeavesVineTreeDecorator> MAIDENS_LEAF_VINE = new TreeDecoratorType<>(CrabappleLeavesVineTreeDecorator::new);

}
