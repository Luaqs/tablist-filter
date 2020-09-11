package cc.luaq.tablist.listeners;

import cc.luaq.tablist.TablistFilter;
import cc.luaq.tablist.gui.TablistGui;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

/**
 * TabList Filter Mod was created and distributed by Luaq.
 * Please do not redistribute as one's own regardless of the
 * situation, this project (code and all), belongs to Luaq.
 */
public class KeyListener {

    @SubscribeEvent
    public void playerListChecking(TickEvent.ClientTickEvent event) {
        Minecraft mc = TablistFilter.INSTANCE.getMinecraft();
        boolean pressed = mc.gameSettings.keyBindPlayerList.isKeyDown();
        if (mc.theWorld != null && mc.currentScreen == null) {
            if ((pressed && Keyboard.isKeyDown(28) && !mc.isIntegratedServerRunning() && mc.thePlayer.sendQueue.getPlayerInfoMap().size() > 1)) {
                mc.currentScreen = null;
                mc.displayGuiScreen(new TablistGui(mc));
            }
        }
    }

}
