package com.i2.mobdamage;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

public class MobDamageListener implements Listener {
	
	Map<Integer, Integer> mobHealth = new HashMap<Integer, Integer>();
	public MobDamage plugin;
        
        public MobDamageListener(MobDamage plugin) {
            this.plugin = plugin;
        }
        
	@EventHandler
	public void onDamage(EntityDamageByEntityEvent e) {
		if(e.getDamager().getType().equals(EntityType.PIG)) {
			if(this.plugin.getConfig().getInt("MobDamage.Pig") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.Pig"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.PIG)) {
			if(this.plugin.getConfig().getInt("MobDamage.Cow") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.Cow"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.SPIDER)) {
			if(this.plugin.getConfig().getInt("MobDamage.Spider") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.Spider"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.CAVE_SPIDER)) {
			if(this.plugin.getConfig().getInt("MobDamage.CaveSpider") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.CaveSpider"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.ZOMBIE)) {
			if(this.plugin.getConfig().getInt("MobDamage.Zombie") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.Zombie"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.ARROW)) {
			Arrow b = (Arrow) e.getDamager();
			if(b.getShooter().getType().equals(EntityType.SKELETON)) {		
				if(this.plugin.getConfig().getInt("MobDamage.Skeleton") != -1) {
                                e.setDamage(this.plugin.getConfig().getInt("MobDamage.Skeleton"));
                            }
			}
		}
		if(e.getDamager().getType().equals(EntityType.CREEPER)) {
			if(this.plugin.getConfig().getInt("MobDamage.Creeper") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.Creeper"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.OCELOT)) {
			if(this.plugin.getConfig().getInt("MobDamage.Ocelot") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.Ocelot"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.BAT)) {
			if(this.plugin.getConfig().getInt("MobDamage.Bat") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.Bat"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.CHICKEN)) {
			if(this.plugin.getConfig().getInt("MobDamage.Chicken") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.Chicken"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.MUSHROOM_COW)) {
			if(this.plugin.getConfig().getInt("MobDamage.Mooshroom") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.Mooshroom"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.SHEEP)) {
			if(this.plugin.getConfig().getInt("MobDamage.Sheep") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.Sheep"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.SQUID)) {
			if(this.plugin.getConfig().getInt("MobDamage.Squid") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.Squid"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.VILLAGER)) {
			if(this.plugin.getConfig().getInt("MobDamage.Villager") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.Villager"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.ENDERMAN)) {
			if(this.plugin.getConfig().getInt("MobDamage.Enderman") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.Enderman"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.WOLF)) {
			if(this.plugin.getConfig().getInt("MobDamage.Wolf") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.Wolf"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.PIG_ZOMBIE)) {
			if(this.plugin.getConfig().getInt("MobDamage.ZombiePigman") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.ZombiePigman"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.BLAZE)) {
			if(this.plugin.getConfig().getInt("MobDamage.Blaze") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.Blaze"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.GHAST)) {
			if(this.plugin.getConfig().getInt("MobDamage.Ghast") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.Ghast"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.MAGMA_CUBE)) {
			if(this.plugin.getConfig().getInt("MobDamage.MagmaCube") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.MagmaCube"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.SILVERFISH)) {
			if(this.plugin.getConfig().getInt("MobDamage.Silverfish") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.Silverfish"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.SLIME)) {
			if(this.plugin.getConfig().getInt("MobDamage.Slime") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.Slime"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.WITCH)) {
			if(this.plugin.getConfig().getInt("MobDamage.Witch") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.Witch"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.WITHER_SKULL)) {
			if(this.plugin.getConfig().getInt("MobDamage.WitherSkeleton") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.WitherSkeleton"));
                    }
		}
		if(e.getDamager().getType().equals(EntityType.IRON_GOLEM)) {
			if(this.plugin.getConfig().getInt("MobDamage.IronGolem") != -1) {
                        e.setDamage(this.plugin.getConfig().getInt("MobDamage.IronGolem"));
                    }
		}
	}
	

	public void addEntity(EntityDamageEvent e) {
		
		if(!mobHealth.containsKey(e.getEntity().getEntityId())) {
		if(e.getEntityType().equals(EntityType.COW)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.Cow") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.Cow"));
				
			}
		}
		
		if(e.getEntityType().equals(EntityType.PIG)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.Pig") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.Pig"));
			}
		}
		
		if(e.getEntityType().equals(EntityType.SPIDER)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.Spider") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.Spider"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.CAVE_SPIDER)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.CaveSpider") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.CaveSpider"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.ZOMBIE)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.Zombie") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.Zombie"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.SKELETON)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.Skeleton") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.Skeleton"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.CREEPER)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.Creeper") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.Creeper"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.OCELOT)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.Ocelot") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.Ocelot"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.BAT)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.Bat") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.Bat"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.CHICKEN)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.Chicken") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.Chicken"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.MUSHROOM_COW)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.Mooshroom") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.Mooshroom"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.SHEEP)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.Sheep") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.Sheep"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.SQUID)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.Squid") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.Squid"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.VILLAGER)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.Villager") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.Villager"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.ENDERMAN)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.Enderman") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.Enderman"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.WOLF)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.Wolf") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.Wolf"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.PIG_ZOMBIE)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.ZombiePigman") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.ZombiePigman"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.BLAZE)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.Blaze") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.Blaze"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.GHAST)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.Ghast") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.Ghast"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.MAGMA_CUBE)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.MagmaCube") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.MagmaCube"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.SILVERFISH)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.Silverfish") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.Silverfish"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.SLIME)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.Slime") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.Slime"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.WITCH)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.Witch") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.Witch"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.WITHER_SKULL)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.WitherSkeleton") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.WitherSkeleton"));
				
			}
		}
		if(e.getEntityType().equals(EntityType.IRON_GOLEM)) {
			if(!e.isCancelled() && this.plugin.getConfig().getInt("MobHealth.IronGolem") != -1) {
				mobHealth.put(e.getEntity().getEntityId(),this.plugin.getConfig().getInt("MobHealth.IronGolem"));
				
			}
		}
	}
	}
	
	
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onDamage2(EntityDamageEvent e) {
		addEntity(e);
		
		
	
		
		if(((e.getEntityType().equals(EntityType.PIG)) && this.plugin.getConfig().getInt("MobHealth.Pig") != -1)
				|| ((e.getEntityType().equals(EntityType.COW)) && this.plugin.getConfig().getInt("MobHealth.Cow") != -1)
				|| ((e.getEntityType().equals(EntityType.SPIDER)) && this.plugin.getConfig().getInt("MobHealth.Spider") != -1)
				|| ((e.getEntityType().equals(EntityType.CAVE_SPIDER)) && this.plugin.getConfig().getInt("MobHealth.Cavepider") != -1)
				|| ((e.getEntityType().equals(EntityType.ZOMBIE)) && this.plugin.getConfig().getInt("MobHealth.Zombie") != -1)
				|| ((e.getEntityType().equals(EntityType.SKELETON)) && this.plugin.getConfig().getInt("MobHealth.Skeleton") != -1)
				|| ((e.getEntityType().equals(EntityType.CREEPER)) && this.plugin.getConfig().getInt("MobHealth.Creeper") != -1)
				|| ((e.getEntityType().equals(EntityType.OCELOT)) && this.plugin.getConfig().getInt("MobHealth.Ocelot") != -1)
				|| ((e.getEntityType().equals(EntityType.BAT)) && this.plugin.getConfig().getInt("MobHealth.Bat") != -1)
				|| ((e.getEntityType().equals(EntityType.CHICKEN)) && this.plugin.getConfig().getInt("MobHealth.Chicken") != -1)
				|| ((e.getEntityType().equals(EntityType.MUSHROOM_COW)) && this.plugin.getConfig().getInt("MobHealth.Mooshroom") != -1)
				|| ((e.getEntityType().equals(EntityType.SHEEP)) && this.plugin.getConfig().getInt("MobHealth.Sheep") != -1)
				|| ((e.getEntityType().equals(EntityType.SQUID)) && this.plugin.getConfig().getInt("MobHealth.Squid") != -1)
				|| ((e.getEntityType().equals(EntityType.VILLAGER)) && this.plugin.getConfig().getInt("MobHealth.Villager") != -1)
				|| ((e.getEntityType().equals(EntityType.ENDERMAN)) && this.plugin.getConfig().getInt("MobHealth.Enderman") != -1)
				|| ((e.getEntityType().equals(EntityType.WOLF)) && this.plugin.getConfig().getInt("MobHealth.Wolf") != -1)
				|| ((e.getEntityType().equals(EntityType.PIG_ZOMBIE)) && this.plugin.getConfig().getInt("MobHealth.ZombiePigman") != -1)
				|| ((e.getEntityType().equals(EntityType.BLAZE)) && this.plugin.getConfig().getInt("MobHealth.Blaze") != -1)
				|| ((e.getEntityType().equals(EntityType.GHAST)) && this.plugin.getConfig().getInt("MobHealth.Ghast") != -1)
				|| ((e.getEntityType().equals(EntityType.MAGMA_CUBE)) && this.plugin.getConfig().getInt("MobHealth.MagmaCube") != -1)
				|| ((e.getEntityType().equals(EntityType.SILVERFISH)) && this.plugin.getConfig().getInt("MobHealth.Silverfish") != -1)
				|| ((e.getEntityType().equals(EntityType.SLIME)) && this.plugin.getConfig().getInt("MobHealth.Slime") != -1)
				|| ((e.getEntityType().equals(EntityType.WITCH)) && this.plugin.getConfig().getInt("MobHealth.Witch") != -1)
				|| ((e.getEntityType().equals(EntityType.WITHER_SKULL)) && this.plugin.getConfig().getInt("MobHealth.WitherSkeleton") != -1)
				|| ((e.getEntityType().equals(EntityType.IRON_GOLEM)) && this.plugin.getConfig().getInt("MobHealth.IronGolem") != -1)
				
				){
			int q = mobHealth.get(e.getEntity().getEntityId());
			
			if( q-e.getDamage()>0 ) {
				
				mobHealth.put(e.getEntity().getEntityId(), q-e.getDamage() );
				e.setDamage(0);
			}
			if(q-e.getDamage()<1) {
				e.setDamage(1000000);
				mobHealth.remove(e.getEntity().getEntityId());
			}
		}
		

		
	}
	
}