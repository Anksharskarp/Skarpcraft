package anksharskarp.forgetutorial.minecraftforge.mods;

import net.minecraft.entity.monster.*;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class StrongerHostileMobs {
    @SubscribeEvent
    public void armoredZombies(EntityJoinWorldEvent event) {
        if(!(event.entity instanceof EntityZombie)) {
            return;
        }

        EntityZombie zombie = (EntityZombie) event.entity;

        zombie.setCurrentItemOrArmor(0, new ItemStack(Items.diamond_axe));
        zombie.setCurrentItemOrArmor(1, new ItemStack(Items.diamond_chestplate));
        zombie.setCurrentItemOrArmor(2, new ItemStack(Items.diamond_leggings));
        zombie.setCurrentItemOrArmor(3, new ItemStack(Items.diamond_boots));
        zombie.setCurrentItemOrArmor(4, new ItemStack(Items.diamond_helmet));
        zombie.addPotionEffect(new PotionEffect(5, 10000000, 2));
        zombie.addPotionEffect(new PotionEffect(1, 10000000, 2));
    }

    public void armoredSkeletons(EntityJoinWorldEvent event) {
        if(!(event.entity instanceof EntitySkeleton)) {
            return;
        }

        EntitySkeleton skeleton = (EntitySkeleton) event.entity;

        skeleton.setCurrentItemOrArmor(0, new ItemStack(Items.bow));
        skeleton.setCurrentItemOrArmor(1, new ItemStack(Items.diamond_chestplate));
        skeleton.setCurrentItemOrArmor(2, new ItemStack(Items.diamond_leggings));
        skeleton.setCurrentItemOrArmor(3, new ItemStack(Items.diamond_boots));
        skeleton.setCurrentItemOrArmor(4, new ItemStack(Items.diamond_helmet));
        skeleton.addPotionEffect(new PotionEffect(5, 10000000, 2));
        skeleton.addPotionEffect(new PotionEffect(1, 10000000, 2));
    }

    public void toughCreepers(EntityJoinWorldEvent event) {
        if(!(event.entity instanceof EntityCreeper)) {
            return;
        }

        EntityCreeper creeper = (EntityCreeper) event.entity;

        creeper.addPotionEffect(new PotionEffect(1, 10000000, 2));
        creeper.addPotionEffect(new PotionEffect(14, 10000000));
    }

    public void toughEndermen(EntityJoinWorldEvent event) {
        if(!(event.entity instanceof EntityEnderman)) {
            return;
        }

        EntityEnderman enderman = (EntityEnderman) event.entity;

        enderman.addPotionEffect(new PotionEffect(1, 10000000, 2));
        enderman.addPotionEffect(new PotionEffect(14, 10000000));
    }

    public void toughSpiders(EntityJoinWorldEvent event) {
        if(!(event.entity instanceof EntitySpider)) {
            return;
        }

        EntitySpider spider = (EntitySpider) event.entity;

        spider.addPotionEffect(new PotionEffect(1, 10000000, 2));
        spider.addPotionEffect(new PotionEffect(14, 10000000));
    }

    public void toughCaveSpiders(EntityJoinWorldEvent event) {
        if(!(event.entity instanceof EntitySpider)) {
            return;
        }

        EntityCaveSpider caveSpider = (EntityCaveSpider) event.entity;

        caveSpider.addPotionEffect(new PotionEffect(1, 10000000, 2));
        caveSpider.addPotionEffect(new PotionEffect(14, 10000000));
    }
}
