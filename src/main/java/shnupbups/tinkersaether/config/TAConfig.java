package shnupbups.tinkersaether.config;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import shnupbups.tinkersaether.TinkersAether;

@Config(modid = TinkersAether.modid)
@Config.LangKey("tinkersaether.config.title")
public class TAConfig extends Configuration {

    @Config.Comment("Whether Skyroot is enabled or not.")
    @Config.RequiresMcRestart
    public static boolean skyroot = true;

    @Config.Comment("Whether Holystone is enabled or not.")
    @Config.RequiresMcRestart
    public static boolean holystone = true;

    @Config.Comment("Whether Zanite is enabled or not.")
    @Config.RequiresMcRestart
    public static boolean zanite = true;

    @Config.Comment("Whether Gravitite is enabled or not.")
    @Config.RequiresMcRestart
    public static boolean gravitite = true;

    @Config.Comment("Whether Golden Amber is enabled or not.")
    @Config.RequiresMcRestart
    public static boolean goldenamber = true;

    @Config.Comment("Whether Valkyrie Metal is enabled or not.")
    @Config.RequiresMcRestart
    public static boolean valkyrie = true;

    @Config.Comment("Whether Swet is enabled or not.")
    @Config.RequiresMcRestart
    public static boolean swet = true;

    @Config.Comment("Whether Candy Cane is enabled or not.")
    @Config.RequiresMcRestart
    public static boolean candycane = true;

    @Config.Comment("Whether Blue Aercloud is enabled or not.")
    @Config.RequiresMcRestart
    public static boolean aercloudBlue = true;

    @Config.Comment("Whether Cold Aercloud is enabled or not.")
    @Config.RequiresMcRestart
    public static boolean aercloudCold = true;

    @Config.Comment("Whether Gold Aercloud is enabled or not.")
    @Config.RequiresMcRestart
    public static boolean aercloudGold = true;

    @Config.Comment("Whether Darts and Dart Shooters are enabled or not.")
    @Config.RequiresMcRestart
    public static boolean darts = true;

    @Config.Comment("Whether Gravitite can be used to make a tool forge.")
    @Config.RequiresMcRestart
    public static boolean gravititeForge = true;

    @Config.Comment("Whether Valkyrie Metal (if enabled) can be used to make a tool forge.")
    @Config.RequiresMcRestart
    public static boolean valkyrieForge = true;

    @Mod.EventBusSubscriber(modid = TinkersAether.modid)
    private static class EventHandler {
        @SubscribeEvent
        public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(TinkersAether.modid)) {
                ConfigManager.sync(TinkersAether.modid, Config.Type.INSTANCE);
            }
        }
    }
}
