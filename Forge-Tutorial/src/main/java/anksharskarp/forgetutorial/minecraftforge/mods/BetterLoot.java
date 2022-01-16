package anksharskarp.forgetutorial.minecraftforge.mods;

import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

public class BetterLoot {
    @SubscribeEvent
    public void dropDiamonds(LivingDeathEvent event) {
        if(!(event.entity instanceof EntityPig)) {
            return;
        }

        Random random = new Random();

        if(!event.entity.worldObj.isRemote) {
            event.entity.dropItem(Items.diamond, random.nextInt(3));
        }


    }

    @SubscribeEvent
    public void dropIron(LivingDeathEvent event) {
        if(!(event.entity instanceof EntityCow)) {
            return;
        }

        Random random = new Random();

        if(!event.entity.worldObj.isRemote) {
            event.entity.dropItem(Items.iron_ingot, random.nextInt(5));
        }
    }

    @SubscribeEvent
    public void dropGold(LivingDeathEvent event) {
        if(!(event.entity instanceof EntityCow)) {
            return;
        }

        Random random = new Random();

        if(!event.entity.worldObj.isRemote) {
            event.entity.dropItem(Items.gold_ingot, random.nextInt(5));
        }
    }

    @SubscribeEvent
    public void dropExperience(LivingDeathEvent event) {
        if(!(event.entity instanceof EntityCow)) {
            return;
        }

        Random random = new Random();

        if(!event.entity.worldObj.isRemote) {
            event.entity.dropItem(Items.experience_bottle, random.nextInt(40));
        }
    }
}
