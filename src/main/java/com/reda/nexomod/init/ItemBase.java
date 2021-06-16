package com.reda.nexomod.init;


import com.reda.nexomod.Main;
import com.reda.nexomod.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.nexotabs);

        ItemInit.ITEMS.add(this);
    }


    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this,0,"inventory");

    }
}
