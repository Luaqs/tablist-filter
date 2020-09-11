package cc.luaq.tablist;

import cc.luaq.tablist.listeners.KeyListener;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * TabList Filter Mod was created and distributed by Luaq.
 * Please do not redistribute as one's own regardless of the
 * situation, this project (code and all), belongs to Luaq.
 */
@Mod(modid = "TablistFilter", version = "1.0")
public class TablistFilter {

    @Mod.Instance
    public static TablistFilter INSTANCE;
    private Minecraft minecraft;

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        INSTANCE = this;
        minecraft = Minecraft.getMinecraft();
        registerListeners();
    }

    private void registerListeners() {
        MinecraftForge.EVENT_BUS.register(new KeyListener());
    }

    public Minecraft getMinecraft() {
        return minecraft;
    }

}
