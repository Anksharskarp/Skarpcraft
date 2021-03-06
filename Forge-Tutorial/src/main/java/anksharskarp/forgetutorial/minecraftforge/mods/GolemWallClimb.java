package anksharskarp.forgetutorial.minecraftforge.mods;

import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GolemWallClimb {
    @SubscribeEvent
    public void climbWall(LivingEvent.LivingUpdateEvent event) {
        if (!(event.entity instanceof EntitySnowman)
                && !(event.entity instanceof EntityIronGolem)) {
            return;
        }

        if(!event.entity.isCollidedHorizontally) {
            return;
        }

        event.entity.motionY = 0.5;
    }
}
