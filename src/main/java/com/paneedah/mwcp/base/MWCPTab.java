package com.paneedah.mwcp.base;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MWCPTab extends CreativeTabs {

    ItemStack tabIcon;
    public MWCPTab(String registryName) {
        super(CreativeTabs.getNextID(), registryName);
    }

    public void setTabIcon(Block tabIcon) {
        this.tabIcon = new ItemStack(tabIcon);
    }

    public void setTabIcon(Item tabIcon) {
        this.tabIcon = new ItemStack(tabIcon);
    }

    @Override
    public ItemStack createIcon() {
        return tabIcon;
    }
}
