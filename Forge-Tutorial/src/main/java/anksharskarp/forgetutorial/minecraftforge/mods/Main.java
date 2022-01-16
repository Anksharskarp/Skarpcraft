package anksharskarp.forgetutorial.minecraftforge.mods;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main {
    public static final String MODID = "myMods";
    public static final String VERSION = "1.0";
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new BlockBreakMessage());
        MinecraftForge.EVENT_BUS.register(new ExplodingMinecarts());
        MinecraftForge.EVENT_BUS.register(new ExplodingAnvils());
        MinecraftForge.EVENT_BUS.register(new DiamondOreTrap());
        MinecraftForge.EVENT_BUS.register(new BiggerTNTExplosion());
        MinecraftForge.EVENT_BUS.register(new BetterLoot());
        MinecraftForge.EVENT_BUS.register(new StrongerHostileMobs());
        MinecraftForge.EVENT_BUS.register(new PreparePlayer());
        MinecraftForge.EVENT_BUS.register(new CreeperReinforcements());
        MinecraftForge.EVENT_BUS.register(new SuperJump());
        MinecraftForge.EVENT_BUS.register(new BouncySponges());
        MinecraftForge.EVENT_BUS.register(new Parachute());
        FMLCommonHandler.instance().bus().register(new Parachute());
        MinecraftForge.EVENT_BUS.register(new BlockFillerPositionSelector());
    }

    @Mod.EventHandler
    public void registerCommands(FMLServerStartingEvent event) {
        event.registerServerCommand(new SpawnFlamingMobs());
        event.registerServerCommand(new BlockFillCommand());
    }
}
