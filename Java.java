	@EventHandler
	public void onDeath(PlayerDeathEvent e) {
		e.setDeathMessage(null);
	    Player p = e.getEntity();
	    if ((p.getKiller() instanceof Player)) {
	    	
	    	Player k = p.getKiller();
	    	Location l = k.getLocation();
	    	Location lp = p.getLocation();
			p.sendMessage("");
			p.sendMessage("§aWinNetwork §r§7Voce morreu para o §a" + k.getName());
			p.sendMessage("");
	    	p.playSound(lp, Sound.CREEPER_DEATH, 10.0F, 1.0F);
	    	
	    	Main.getMain().economia.removeMoney(p.getName(), 25.0);
	    	
	    	killstreak.put(p, 0);
	    	killstreak.put(k, killstreak.get(k) + 1);
	    	
	    	if (killstreak.get(k) == 5) {
	    		Bukkit.broadcastMessage("§aWinNetwork §r§7O §a" + k.getName() + " §r§7 esta com um killstreak de §a5");
	    	}
	    	if (killstreak.get(k) == 10) {
	    		Bukkit.broadcastMessage("§aWinNetwork §r§7O §a" + k.getName() + " §r§7 esta com um killstreak de §a10");
	    	}
	    	if (killstreak.get(k) == 15) {
	    		Bukkit.broadcastMessage("§aWinNetwork §r§7O §a" + k.getName() + " §r§7 esta com um killstreak de §a15");
	    	}
	    	if (killstreak.get(k) == 20) {
	    		Bukkit.broadcastMessage("§aWinNetwork §r§7O §a" + k.getName() + " §r§7 esta com um killstreak de §a20");
	    	}
	    	if (killstreak.get(k) == 25) {
	    		Bukkit.broadcastMessage("§aWinNetwork §r§7O §a" + k.getName() + " §r§7 esta com um killstreak de §a25");
	    	}
	    	if (killstreak.get(k) == 30) {
	    		Bukkit.broadcastMessage("§aWinNetwork §r§7O §a" + k.getName() + " §r§7 esta com um killstreak de §a30");
	    	}
	    	if (killstreak.get(k) == 35) {
	    		Bukkit.broadcastMessage("§aWinNetwork §r§7O §a" + k.getName() + " §r§7 esta com um killstreak de §a35");
	    	}
	    	if (killstreak.get(k) == 40) {
	    		Bukkit.broadcastMessage("§aWinNetwork §r§7O §a" + k.getName() + " §r§7 esta com um killstreak de §a40");
	    	}
	    	if (killstreak.get(k) == 45) {
	    		Bukkit.broadcastMessage("§aWinNetwork §r§7O §a" + k.getName() + " §r§7 esta com um killstreak de §a45");
	    	}
	    	if (killstreak.get(k) == 50) {
	    		Bukkit.broadcastMessage("§aWinNetwork §r§7O §a" + k.getName() + " §r§7 esta com um killstreak de §a50");
	    	}
	    	
			k.sendMessage("");
			k.sendMessage("§aWinNetwork §r§7Voce matou o §a" + p.getName());
			k.sendMessage("");
	    	k.playSound(l, Sound.FIREWORK_LAUNCH, 10.0F, 1.0F);
	    	
	    	Main.getMain().economia.addMoney(k.getName(), 25.0);
	    	
	    	Array.ArrayRemoveKits(p);
	    	
	    	Addons.PegandoOutroKit(p);
	    	
	    	dtHabilidade.removeAbility(p);
	    } else {
	    	
			p.sendMessage("");
			p.sendMessage("§aWinNetwork §r§7Voce morreu");
			p.sendMessage("");
			
			Array.ArrayRemoveKits(p);
			
			Addons.PegandoOutroKit(p);
			
	    	dtHabilidade.removeAbility(p);
	    }
	}
