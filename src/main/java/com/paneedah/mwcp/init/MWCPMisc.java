package com.paneedah.mwcp.init;

import com.paneedah.mwcp.base.MWCPTab;
import net.minecraft.creativetab.CreativeTabs;

public class MWCPMisc {

    public static MWCPTab propsTab;
    public static void init() {
        propsTab = new MWCPTab("props_tab");
    }
}
