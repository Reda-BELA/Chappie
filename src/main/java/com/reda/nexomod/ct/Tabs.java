package com.reda.nexomod.ct;

import com.reda.nexomod.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class Tabs extends CreativeTabs
{
    public Tabs(String label, int tab) {
        super(label);
        //this.setBackgroundImageName("main.png");
    }



    @Override
    public ItemStack getTabIconItem() { return new ItemStack(ItemInit.PALLADIUM_RING);}
}

