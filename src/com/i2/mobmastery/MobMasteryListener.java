package com.i2.mobmastery;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Snowball;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class MobMasteryListener implements Listener {

    Map<Integer, Integer> mobHealth = new HashMap<Integer, Integer>();
    public MobMastery plugin;

    public MobMasteryListener(MobMastery plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent e) {
        if (e.getDamager().getType().equals(EntityType.PIG)) {
            if (this.plugin.getConfig().getInt("MobMastery.Pig.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.Pig.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.PIG)) {
            if (this.plugin.getConfig().getInt("MobMastery.Cow.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.Cow.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.SPIDER)) {
            if (this.plugin.getConfig().getInt("MobMastery.Spider.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.Spider.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.CAVE_SPIDER)) {
            if (this.plugin.getConfig().getInt("MobMastery.CaveSpider.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.CaveSpider.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.ZOMBIE)) {
            if (this.plugin.getConfig().getInt("MobMastery.Zombie.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.Zombie.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.ARROW)) {
            Arrow b = (Arrow) e.getDamager();
            if (b.getShooter().getType().equals(EntityType.SKELETON)) {
                if (this.plugin.getConfig().getInt("MobMastery.Skeleton.Damage") != -1) {
                    e.setDamage(this.plugin.getConfig().getInt("MobMastery.Skeleton.Damage"));
                }
            }
        }
        if (e.getDamager().getType().equals(EntityType.CREEPER)) {
            if (this.plugin.getConfig().getInt("MobMastery.Creeper.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.Creeper.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.OCELOT)) {
            if (this.plugin.getConfig().getInt("MobMastery.Ocelot.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.Ocelot.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.BAT)) {
            if (this.plugin.getConfig().getInt("MobMastery.Bat.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.Bat.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.CHICKEN)) {
            if (this.plugin.getConfig().getInt("MobMastery.Chicken.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.Chicken.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.MUSHROOM_COW)) {
            if (this.plugin.getConfig().getInt("MobMastery.Mooshroom.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.Mooshroom.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.SHEEP)) {
            if (this.plugin.getConfig().getInt("MobMastery.Sheep.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.Sheep.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.SQUID)) {
            if (this.plugin.getConfig().getInt("MobMastery.Squid.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.Squid.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.VILLAGER)) {
            if (this.plugin.getConfig().getInt("MobMastery.Villager.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.Villager.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.ENDERMAN)) {
            if (this.plugin.getConfig().getInt("MobMastery.Enderman.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.Enderman.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.WOLF)) {
            if (this.plugin.getConfig().getInt("MobMastery.Wolf.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.Wolf.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.PIG_ZOMBIE)) {
            if (this.plugin.getConfig().getInt("MobMastery.ZombiePigman.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.ZombiePigman.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.BLAZE)) {
            if (this.plugin.getConfig().getInt("MobMastery.Blaze.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.Blaze.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.GHAST)) {
            if (this.plugin.getConfig().getInt("MobMastery.Ghast.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.Ghast.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.MAGMA_CUBE)) {
            if (this.plugin.getConfig().getInt("MobMastery.MagmaCube.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.MagmaCube.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.SILVERFISH)) {
            if (this.plugin.getConfig().getInt("MobMastery.Silverfish.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.Silverfish.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.SLIME)) {
            if (this.plugin.getConfig().getInt("MobMastery.Slime.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.Slime.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.WITCH)) {
            if (this.plugin.getConfig().getInt("MobMastery.Witch.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.Witch.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.WITHER_SKULL)) {
            if (this.plugin.getConfig().getInt("MobMastery.WitherSkeleton.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.WitherSkeleton.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.IRON_GOLEM)) {
            if (this.plugin.getConfig().getInt("MobMastery.IronGolem.Damage") != -1) {
                e.setDamage(this.plugin.getConfig().getInt("MobMastery.IronGolem.Damage"));
            }
        }
        if (e.getDamager().getType().equals(EntityType.SNOWBALL)) {
            Snowball b = (Snowball) e.getDamager();
            if (b.getShooter().getType().equals(EntityType.SNOWMAN)) {
                if (this.plugin.getConfig().getInt("MobMastery.SnowGolem.Damage") != -1) {
                    e.setDamage(this.plugin.getConfig().getInt("MobMastery.SnowGolem.Damage"));
                }
            }
        }
    }

    public void addEntity(EntityDamageEvent e) {

        if (!mobHealth.containsKey(e.getEntity().getEntityId())) {
            if (e.getEntityType().equals(EntityType.COW)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.Cow.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.Cow.Health"));

                }
            }

            if (e.getEntityType().equals(EntityType.PIG)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.Pig.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.Pig.Health"));
                }
            }

            if (e.getEntityType().equals(EntityType.SPIDER)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.Spider.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.Spider.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.CAVE_SPIDER)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.CaveSpider.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.CaveSpider.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.ZOMBIE)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.Zombie.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.Zombie.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.SKELETON)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.Skeleton.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.Skeleton.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.CREEPER)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.Creeper.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.Creeper.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.OCELOT)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.Ocelot.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.Ocelot.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.BAT)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.Bat.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.Bat.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.CHICKEN)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.Chicken.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.Chicken.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.MUSHROOM_COW)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.Mooshroom.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.Mooshroom.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.SHEEP)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.Sheep.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.Sheep.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.SQUID)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.Squid.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.Squid.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.VILLAGER)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.Villager.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.Villager.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.ENDERMAN)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.Enderman.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.Enderman.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.WOLF)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.Wolf.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.Wolf.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.PIG_ZOMBIE)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.ZombiePigman.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.ZombiePigman.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.BLAZE)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.Blaze.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.Blaze.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.GHAST)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.Ghast.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.Ghast.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.MAGMA_CUBE)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.MagmaCube.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.MagmaCube.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.SILVERFISH)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.Silverfish.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.Silverfish.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.SLIME)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.Slime.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.Slime.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.WITCH)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.Witch.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.Witch.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.WITHER_SKULL)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.WitherSkeleton.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.WitherSkeleton.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.IRON_GOLEM)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.IronGolem.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.IronGolem.Health"));

                }
            }
            if (e.getEntityType().equals(EntityType.SNOWMAN)) {
                if (!e.isCancelled() && this.plugin.getConfig().getInt("MobMastery.SnowGolem.Health") != -1) {
                    mobHealth.put(e.getEntity().getEntityId(), this.plugin.getConfig().getInt("MobMastery.SnowGolem.Health"));
                }
            }
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onDamage2(EntityDamageEvent e) {
        addEntity(e);




        if (((e.getEntityType().equals(EntityType.PIG)) && this.plugin.getConfig().getInt("MobMastery.Pig.Health") != -1)
                || ((e.getEntityType().equals(EntityType.COW)) && this.plugin.getConfig().getInt("MobMastery.Cow.Health") != -1)
                || ((e.getEntityType().equals(EntityType.SPIDER)) && this.plugin.getConfig().getInt("MobMastery.Spider.Health") != -1)
                || ((e.getEntityType().equals(EntityType.CAVE_SPIDER)) && this.plugin.getConfig().getInt("MobMastery.Cavepider.Health") != -1)
                || ((e.getEntityType().equals(EntityType.ZOMBIE)) && this.plugin.getConfig().getInt("MobMastery.Zombie.Health") != -1)
                || ((e.getEntityType().equals(EntityType.SKELETON)) && this.plugin.getConfig().getInt("MobMastery.Skeleton.Health") != -1)
                || ((e.getEntityType().equals(EntityType.CREEPER)) && this.plugin.getConfig().getInt("MobMastery.Creeper.Health") != -1)
                || ((e.getEntityType().equals(EntityType.OCELOT)) && this.plugin.getConfig().getInt("MobMastery.Ocelot.Health") != -1)
                || ((e.getEntityType().equals(EntityType.BAT)) && this.plugin.getConfig().getInt("MobMastery.Bat.Health") != -1)
                || ((e.getEntityType().equals(EntityType.CHICKEN)) && this.plugin.getConfig().getInt("MobMastery.Chicken.Health") != -1)
                || ((e.getEntityType().equals(EntityType.MUSHROOM_COW)) && this.plugin.getConfig().getInt("MobMastery.Mooshroom.Health") != -1)
                || ((e.getEntityType().equals(EntityType.SHEEP)) && this.plugin.getConfig().getInt("MobMastery.Sheep.Health") != -1)
                || ((e.getEntityType().equals(EntityType.SQUID)) && this.plugin.getConfig().getInt("MobMastery.Squid.Health") != -1)
                || ((e.getEntityType().equals(EntityType.VILLAGER)) && this.plugin.getConfig().getInt("MobMastery.Villager.Health") != -1)
                || ((e.getEntityType().equals(EntityType.ENDERMAN)) && this.plugin.getConfig().getInt("MobMastery.Enderman.Health") != -1)
                || ((e.getEntityType().equals(EntityType.WOLF)) && this.plugin.getConfig().getInt("MobMastery.Wolf.Health") != -1)
                || ((e.getEntityType().equals(EntityType.PIG_ZOMBIE)) && this.plugin.getConfig().getInt("MobMastery.ZombiePigman.Health") != -1)
                || ((e.getEntityType().equals(EntityType.BLAZE)) && this.plugin.getConfig().getInt("MobMastery.Blaze.Health") != -1)
                || ((e.getEntityType().equals(EntityType.GHAST)) && this.plugin.getConfig().getInt("MobMastery.Ghast.Health") != -1)
                || ((e.getEntityType().equals(EntityType.MAGMA_CUBE)) && this.plugin.getConfig().getInt("MobMastery.MagmaCube.Health") != -1)
                || ((e.getEntityType().equals(EntityType.SILVERFISH)) && this.plugin.getConfig().getInt("MobMastery.Silverfish.Health") != -1)
                || ((e.getEntityType().equals(EntityType.SLIME)) && this.plugin.getConfig().getInt("MobMastery.Slime.Health") != -1)
                || ((e.getEntityType().equals(EntityType.WITCH)) && this.plugin.getConfig().getInt("MobMastery.Witch.Health") != -1)
                || ((e.getEntityType().equals(EntityType.WITHER_SKULL)) && this.plugin.getConfig().getInt("MobMastery.WitherSkeleton.Health") != -1)
                || ((e.getEntityType().equals(EntityType.IRON_GOLEM)) && this.plugin.getConfig().getInt("MobMastery.IronGolem.Health") != -1)) {
            int q = mobHealth.get(e.getEntity().getEntityId());

            if (q - e.getDamage() > 0) {

                mobHealth.put(e.getEntity().getEntityId(), q - e.getDamage());
                e.setDamage(0);
            }
            if (q - e.getDamage() < 1) {
                e.setDamage(1000000);
                mobHealth.remove(e.getEntity().getEntityId());
            }
        }



    }
}