package com.example.generalinfo;


public class ChampionDatabase {


	private ChampionInfo[] champions = new ChampionInfo[118];

	public ChampionDatabase()
	{
		/*
		for(int i = 0; i < champSpells.length; i++)
		{
			champSpells[i] = spells.getSpellArray()[i];
		}
		*/
		
		
		ChampionInfo Aatrox = new ChampionInfo();
		Aatrox.setNameTitle("Aatrox", "the Darkin Blade");
		Aatrox.setTypes("Fighter", "Tank");
		Aatrox.setInfo(8, 4, 3, 6);
		Aatrox.setAttackDam(55, 3.2);
		Aatrox.setAttackSpeed(0.651, 3);
		Aatrox.setArmor(18, 3.8);
		Aatrox.setRange(150, "Melee");
		Aatrox.setMoveSpeed(345);
		Aatrox.setHealthInfo(395, 85, 5.75, 0.5);
		Aatrox.setManaInfo(0, 0, 0, 0, "Health"); //Uses Health as resource
		Aatrox.setMagicRes(30, 1.25);
		//Aatrox.setSpells(champSpells[0]);
		champions[0] = Aatrox;

		ChampionInfo Ahri = new ChampionInfo();
		Ahri.setNameTitle("Ahri", "the Nine-Tailed Fox");
		Ahri.setTypes("Mage", "Assassin");
		Ahri.setInfo(3, 4, 8, 8);
		Ahri.setAttackDam(50, 3);
		Ahri.setAttackSpeed(0.668, 2);
		Ahri.setArmor(15, 3.5);
		Ahri.setRange(550, "Ranged");
		Ahri.setMoveSpeed(330);
		Ahri.setHealthInfo(360, 80 , 5.5, 0.6);
		Ahri.setManaInfo(250, 50, 7, 0.6, "Mana");
		Ahri.setMagicRes(30, 0);
		//Ahri.setSpells(champSpells[1]);
		champions[1] = Ahri;

		ChampionInfo Akali = new ChampionInfo();
		Akali.setNameTitle("Akali", "the Fist of Shadow");
		Akali.setTypes("Assassin", "");
		Akali.setInfo(5, 3, 8, 6);
		Akali.setAttackDam(53, 3.2);
		Akali.setAttackSpeed(0.694, 3.1);
		Akali.setArmor(20.5, 3.5);
		Akali.setRange(125, "Melee");
		Akali.setMoveSpeed(350);
		Akali.setHealthInfo(445, 85, 7.25, 0.65);
		Akali.setManaInfo(200, 0, 50, 0, "Energy"); //Uses Energy as resource
		Akali.setMagicRes(30, 1.25);
		//Akali.setSpells(champSpells[2]);
		champions[2] = Akali;

		ChampionInfo Alistar = new ChampionInfo();
		Alistar.setNameTitle("Alistar", "the Minotaur");
		Alistar.setTypes("Tank", "");
		Alistar.setInfo(6, 9, 5, 8);
		Alistar.setAttackDam(55.03, 3.62);
		Alistar.setAttackSpeed(0.625, 2.125);
		Alistar.setArmor(18.5, 3.5);
		Alistar.setRange(125, "Melee");
		Alistar.setMoveSpeed(330);
		Alistar.setHealthInfo(442, 102, 7.25, 0.85);
		Alistar.setManaInfo(215, 38, 6.45, 0.45, "Mana");
	        Alistar.setMagicRes(30, 1.25);
		//Alistar.setSpells(champSpells[3]);
		champions[3] = Alistar;

		ChampionInfo Amumu = new ChampionInfo();
		Amumu.setNameTitle("Amumu", "the Sad Mummy");
		Amumu.setTypes("Tank", "Mage");
		Amumu.setInfo(2, 6, 8, 4);
		Amumu.setAttackDam(47, 3.8);
		Amumu.setAttackSpeed(0.638, 2.18);
		Amumu.setArmor(22, 3.3);
		Amumu.setRange(125, "Melee");
		Amumu.setMoveSpeed(335);
		Amumu.setHealthInfo(472, 84, 7.45, 0.85);
		Amumu.setManaInfo(220, 40, 6.5, 0.525, "Mana");
		Amumu.setMagicRes(30, 1.25);
		//Amumu.setSpells(champSpells[4]);
		champions[4] = Amumu;

		ChampionInfo Anivia = new ChampionInfo();
		Anivia.setNameTitle("Anivia", "the Cryophoenix");
		Anivia.setTypes("Mage", "Support");
		Anivia.setInfo(1, 4, 10, 8);
		Anivia.setAttackDam(48, 3.2);
		Anivia.setAttackSpeed(0.625, 1.68);
		Anivia.setArmor(14.5, 4);
		Anivia.setRange(600, "Ranged");
		Anivia.setMoveSpeed(325);
		Anivia.setHealthInfo(350, 70, 4.65, 0.55);
		Anivia.setManaInfo(257, 53, 7, 0.6, "Mana");
	        Anivia.setMagicRes(30, 0);
		//Anivia.setSpells(champSpells[5]);
		champions[5] = Anivia;

		ChampionInfo Annie = new ChampionInfo();
		Annie.setNameTitle("Annie", "the Dark Child");
		Annie.setTypes("Mage", "");
		Annie.setInfo(2, 3, 10, 4);
		Annie.setAttackDam(48, 2.625);
		Annie.setAttackSpeed(0.579, 1.36);
		Annie.setArmor(12.5, 4);
		Annie.setRange(625, "Ranged");
		Annie.setMoveSpeed(335);
		Annie.setHealthInfo(384, 76, 4.5, 0.6);
		Annie.setManaInfo(250, 50, 6.9, 0.6, "Mana");
	        Annie.setMagicRes(30, 0);
		//Annie.setSpells(champSpells[6]);
		champions[6] = Annie;

		ChampionInfo Ashe = new ChampionInfo();
		Ashe.setNameTitle("Ashe", "the Frost Archer");
		Ashe.setTypes("Marksman", "Support");
		Ashe.setInfo(7, 3, 2, 4);
		Ashe.setAttackDam(46.3, 2.85);
		Ashe.setAttackSpeed(0.658, 4);
		Ashe.setArmor(15.5, 3.4);
		Ashe.setRange(600, "Ranged");
		Ashe.setMoveSpeed(325);
		Ashe.setHealthInfo(395, 79, 4.5, 0.55);
		Ashe.setManaInfo(173, 35, 6.3, 0.4, "Mana");
		Ashe.setMagicRes(30, 0);
		//Ashe.setSpells(champSpells[7]);
		champions[7] = Ashe;

		ChampionInfo Blitzcrank = new ChampionInfo();
		Blitzcrank.setNameTitle("Blitzcrank", "the Great Steam Golem");
		Blitzcrank.setTypes("Tank", "Fighter");
		Blitzcrank.setInfo(4, 8, 5, 6);
		Blitzcrank.setAttackDam(55.66, 3.5);
		Blitzcrank.setAttackSpeed(0.625, 1.13);
		Blitzcrank.setArmor(18.5, 3.5);
		Blitzcrank.setRange(125, "Melee");
		Blitzcrank.setMoveSpeed(325);
		Blitzcrank.setHealthInfo(423, 95, 7.25, 0.75);
		Blitzcrank.setManaInfo(200, 40, 6.6, 0.5, "Mana");
		Blitzcrank.setMagicRes(30, 1.25);
		//Blitzcrank.setSpells(champSpells[8]);
		champions[8] = Blitzcrank;

		ChampionInfo Brand = new ChampionInfo();
		Brand.setNameTitle("Brand", "the Burning Vengeance");
		Brand.setTypes("Mage", "");
		Brand.setInfo(2, 2, 9, 6);
		Brand.setAttackDam(52, 3);
		Brand.setAttackSpeed(0.625, 1.36);
		Brand.setArmor(16, 3.5);
		Brand.setRange(550, "Ranged");
		Brand.setMoveSpeed(340);
		Brand.setHealthInfo(380, 76, 4.5, 0.55);
		Brand.setManaInfo(250, 45, 7, 0.6, "Mana");
		Brand.setMagicRes(30, 0);
		//Brand.setSpells(champSpells[9]);
		champions[9] = Brand;

		ChampionInfo Caitlyn = new ChampionInfo();
		Caitlyn.setNameTitle("Caitlyn", "the Sheriff of Piltover");
		Caitlyn.setTypes("Marksman", "");
		Caitlyn.setInfo(8, 2, 2, 4);
		Caitlyn.setAttackDam(47, 3);
		Caitlyn.setAttackSpeed(0.625, 4);
		Caitlyn.setArmor(17, 3.5);
		Caitlyn.setRange(650, "Ranged");
		Caitlyn.setMoveSpeed(325);
		Caitlyn.setHealthInfo(390, 80, 4.75, 0.55);
		Caitlyn.setManaInfo(255, 35, 6.5, 0.55, "Mana");
	        Caitlyn.setMagicRes(30, 0);
		//Caitlyn.setSpells(champSpells[10]);
		champions[10] = Caitlyn;

		ChampionInfo Cassiopeia = new ChampionInfo();
		Cassiopeia.setNameTitle("Cassiopeia", "the Serpent's Embrace");
		Cassiopeia.setTypes("Mage", "");
		Cassiopeia.setInfo(2, 3, 9, 10);
		Cassiopeia.setAttackDam(47, 3.2);
		Cassiopeia.setAttackSpeed(0.647, 1.68);
		Cassiopeia.setArmor(15.5, 4);
		Cassiopeia.setRange(550, "Ranged");
		Cassiopeia.setMoveSpeed(335);
		Cassiopeia.setHealthInfo(380, 75, 4.85, 0.5);
		Cassiopeia.setManaInfo(250, 50, 7.1, 0.75, "Mana");
	        Cassiopeia.setMagicRes(30, 0);
		//Cassiopeia.setSpells(champSpells[11]);
		champions[11] = Cassiopeia;	
		
		ChampionInfo ChoGath = new ChampionInfo();
		ChoGath.setNameTitle("Cho'Gath", "the Terror of the Void");
		ChoGath.setTypes("Tank", "Mage");
		ChoGath.setInfo(3, 7, 7, 7);
		ChoGath.setAttackDam(54.1, 4.2);
		ChoGath.setAttackSpeed(0.625, 1.44);
		ChoGath.setArmor(23, 3.5);
		ChoGath.setRange(125, "Melee");
		ChoGath.setMoveSpeed(345);
		ChoGath.setHealthInfo(440, 80, 7.5, 0.85);
		ChoGath.setManaInfo(205, 40, 6.45, 0.45, "Mana");
	        ChoGath.setMagicRes(30, 1.25);
		//ChoGath.setSpells(champSpells[12]);
		champions[12] = ChoGath;
		
		ChampionInfo Corki = new ChampionInfo();
		Corki.setNameTitle("Corki", "the Daring Bombardier");
		Corki.setTypes("Marksman", "");
		Corki.setInfo(8, 3, 6, 7);
		Corki.setAttackDam(48.2, 3);
		Corki.setAttackSpeed(0.625, 2.3);
		Corki.setArmor(17.5, 3.5);
		Corki.setRange(550, "Ranged");
		Corki.setMoveSpeed(325);
		Corki.setHealthInfo(375,  82, 4.5, 0.55);
		Corki.setManaInfo(243, 37, 6.5, 0.55, "Mana");
	        Corki.setMagicRes(30, 0);
		//Corki.setSpells(champSpells[13]);
		champions[13] = Corki;

		ChampionInfo Darius = new ChampionInfo();
		Darius.setNameTitle("Darius", "the Hand of Noxus");
		Darius.setTypes("Fighter", "Tank");
		Darius.setInfo(9, 5, 1 ,4);
		Darius.setAttackDam(50, 3.5);
		Darius.setAttackSpeed(0.679, 2.65);
		Darius.setArmor(24, 3.5);
		Darius.setRange(125, "Melee");
		Darius.setMoveSpeed(340);
		Darius.setHealthInfo(426, 93, 8.25, 0.95);
		Darius.setManaInfo(200, 37.5, 6, 0.35, "Mana");
	        Darius.setMagicRes(30, 1.25);
	    //    Darius.setSpells(champSpells[14]);
		champions[14] = Darius;
/*
		ChampionInfo Diana = new ChampionInfo();
		Diana.setNameTitle("Diana", "Scorn of the Moon");
		Diana.setTypes("Fighter", "Mage");
		Diana.setInfo(7, 6, 8, 4);
		Diana.setAttackDam(48, 3);
		Diana.setAttackSpeed(0.625, 2.25);
		Diana.setArmor(20, 3.6);
		Diana.setRange(150, "Melee");
		Diana.setMoveSpeed(345);
		Diana.setHealthInfo(438, 90, 6, 0.85);
		Diana.setManaInfo(230, 40, 7, 0.6, "Mana");
	        Diana.setMagicRes(30, 1.25);
	        Diana.setSpells(champSpells[15]);
		champions[15] = Diana;

		ChampionInfo DrMundo = new ChampionInfo();
		DrMundo.setNameTitle("Dr. Mundo", "the Madman of Zaun");
		DrMundo.setTypes("Fighter", "Tank");
		DrMundo.setInfo(5, 7, 6, 4);
		DrMundo.setAttackDam(56.23, 3);
		DrMundo.setAttackSpeed(0.625, 2.8);
		DrMundo.setArmor(21, 3.5);
		DrMundo.setRange(125, "Melee");
		DrMundo.setMoveSpeed(345);
		DrMundo.setHealthInfo(433, 89, 6.5, 0.75);
		DrMundo.setManaInfo(0, 0, 0, 0, "Health"); //Uses Health as resource
	        DrMundo.setMagicRes(30, 1.25);
	        DrMundo.setSpells(champSpells[16]);
		champions[16] = DrMundo;

		ChampionInfo Draven = new ChampionInfo();
		Draven.setNameTitle("Draven", "the Glorious Executioner");
		Draven.setTypes("Marksman", "");
		Draven.setInfo(9, 3, 1 ,10);
		Draven.setAttackDam(46.5, 3.5);
		Draven.setAttackSpeed(0.679, 2.7);
		Draven.setArmor(20, 3.3);
		Draven.setRange(550, "Ranged");
		Draven.setMoveSpeed(330);
		Draven.setHealthInfo(420, 82, 5, 0.7);
		Draven.setManaInfo(240, 42, 6.95, 0.65, "Mana");
		Draven.setMagicRes(30, 0);
		Draven.setSpells(champSpells[17]);
		champions[17] = Draven;

		ChampionInfo Elise = new ChampionInfo();
		Elise.setNameTitle("Elise", "the Spider Queen");
		Elise.setTypes("Mage", "Fighter");
		Elise.setInfo(6, 5, 7, 8);
		Elise.setAttackDam(47.5, 3);
		Elise.setAttackSpeed(0.625, 1.75);
		Elise.setArmor(16.5, 3.35);
		Elise.setRange(550, "Ranged");
		Elise.setMoveSpeed(335);
		Elise.setHealthInfo(395, 80, 4.7, 0.6);
		Elise.setManaInfo(240, 50, 6.8, 0.65, "Mana");
		Elise.setMagicRes(30, 0);
		Elise.setSpells(champSpells[18]);
		champions[18] = Elise;

		ChampionInfo Evelynn = new ChampionInfo();
		Evelynn.setNameTitle("Evelynn", "the Widowmaker");
		Evelynn.setTypes("Assassin", "Mage");
		Evelynn.setInfo(4, 2, 7, 8);
		Evelynn.setAttackDam(48, 3.5);
		Evelynn.setAttackSpeed(0.625, 3.6);
		Evelynn.setArmor(16, 4);
		Evelynn.setRange(125, "Melee");
		Evelynn.setMoveSpeed(340);
		Evelynn.setHealthInfo(380, 90, 8.9, 0.55);
		Evelynn.setManaInfo(190, 45, 7.1, 0.6, "Mana");
	        Evelynn.setMagicRes(30, 1.25);
	        Evelynn.setSpells(champSpells[19]);
		champions[19] = Evelynn;

		ChampionInfo Ezreal = new ChampionInfo();
		Ezreal.setNameTitle("Ezreal", "the Prodigal Explorer");
		Ezreal.setTypes("Marksman", "Mage");
		Ezreal.setInfo(7, 2, 6, 8);
		Ezreal.setAttackDam(47.2, 3);
		Ezreal.setAttackSpeed(0.625, 2.8);
		Ezreal.setArmor(16, 3.5);
		Ezreal.setRange(550, "Ranged");
		Ezreal.setMoveSpeed(325);
		Ezreal.setHealthInfo(350, 80, 5.5, 0.55);
		Ezreal.setManaInfo(235, 45, 7, 0.65, "Mana");
	        Ezreal.setMagicRes(30, 0);
	        Ezreal.setSpells(champSpells[20]);
		champions[20] = Ezreal;

		ChampionInfo Fiddlesticks = new ChampionInfo();
		Fiddlesticks.setNameTitle("Fiddlesticks", "the Harbinger of Doom");
		Fiddlesticks.setTypes("Mage", "Support");
		Fiddlesticks.setInfo(2, 3, 9, 5);
		Fiddlesticks.setAttackDam(45.95, 2.625);
		Fiddlesticks.setAttackSpeed(0.625, 2.11);
		Fiddlesticks.setArmor(15, 3.5);
		Fiddlesticks.setRange(480, "Ranged");
		Fiddlesticks.setMoveSpeed(335);
		Fiddlesticks.setHealthInfo(390, 80, 4.6, 0.6);
		Fiddlesticks.setManaInfo(251, 59, 6.9, 0.65, "Mana");
	        Fiddlesticks.setMagicRes(30, 0);

		ChampionInfo Fiora = new ChampionInfo();
		Fiora.setNameTitle("Fiora", "the Grand Duelist");
		Fiora.setTypes("Fighter", "Assassin");
		Fiora.setInfo(10, 4, 2, 5);
		Fiora.setAttackDam(54.5, 3.2);
		Fiora.setAttackSpeed(0.672, 3);
		Fiora.setArmor(19, 3.5);
		Fiora.setRange(125, "Melee");
		Fiora.setMoveSpeed(350);
		Fiora.setHealthInfo(450, 85, 5.5, 0.8);
		Fiora.setManaInfo(220, 40, 6.75, 0.5, "Mana");
	        Fiora.setMagicRes(30, 1.25);

		ChampionInfo Fizz = new ChampionInfo();
		Fizz.setNameTitle("Fizz", "the Tidal Trickster");
		Fizz.setTypes("Assassin", "Fighter");
		Fizz.setInfo(6, 4, 7, 8);
		Fizz.setAttackDam(53, 3);
		Fizz.setAttackSpeed(0.658, 3.1);
		Fizz.setArmor(16.7, 3.4);
		Fizz.setRange(175, "Melee");
		Fizz.setMoveSpeed(335);
		Fizz.setHealthInfo(414, 86, 7, 0.7);
		Fizz.setManaInfo(200, 40, 6.1, 0.45, "Mana");
		Fizz.setMagicRes(30, 1.25);

		ChampionInfo Galio = new ChampionInfo();
		Galio.setNameTitle("Galio", "the Sentinel's Sorrow");
		Galio.setTypes("Tank", "Mage");
		Galio.setInfo(3, 7, 6, 4);
		Galio.setAttackDam(56.3, 3.375);
		Galio.setAttackSpeed(0.638, 1.2);
		Galio.setArmor(21, 3.5);
		Galio.setRange(125, "Melee");
		Galio.setMoveSpeed(335);
		Galio.setHealthInfo(435, 85, 7.45, 0.75);
		Galio.setManaInfo(235, 50, 7, 0.7, "Mana");
	        Galio.setMagicRes(30, 0);

		ChampionInfo Gangplank = new ChampionInfo();
		Gangplank.setNameTitle("Gangplank", "the Saltwater Scourge");
		Gangplank.setTypes("Fighter", "Support");
		Gangplank.setInfo(7, 6, 4 ,5);
		Gangplank.setAttackDam(54, 3);
		Gangplank.setAttackSpeed(0.651, 2.75);
		Gangplank.setArmor(20.5, 3.3);
		Gangplank.setRange(125, "Melee");
		Gangplank.setMoveSpeed(345);
		Gangplank.setHealthInfo(495, 81, 4.25, 0.75);
		Gangplank.setManaInfo(215, 40, 6.5, 0.7, "Mana");
	        Gangplank.setMagicRes(30, 1.25);

		ChampionInfo Garen = new ChampionInfo();
		Garen.setNameTitle("Garen", "the Might of Demacia");
		Garen.setTypes("Fighter", "Tank");
		Garen.setInfo(7, 7, 1, 2);
		Garen.setAttackDam(52, 3.5);
		Garen.setAttackSpeed(0.625, 2.9);
		Garen.setArmor(23, 2.7);
		Garen.setRange(125, "Melee");
		Garen.setMoveSpeed(345);
		Garen.setHealthInfo(455, 96, 7, 0.5);
		Garen.setManaInfo(0, 0, 0, 0, "Health"); //Uses Health as resource
		Garen.setMagicRes(30, 1.25);

		ChampionInfo Gragas = new ChampionInfo();
		Gragas.setNameTitle("Gragas", "the Rabble Rouser");
		Gragas.setTypes("Mage", "Fighter");
		Gragas.setInfo(5, 6, 7, 6);
		Gragas.setAttackDam(55.78, 3.375);
		Gragas.setAttackSpeed(0.651, 2.05);
		Gragas.setArmor(20, 3.6);
		Gragas.setRange(125, "Melee");
		Gragas.setMoveSpeed(330);
		Gragas.setHealthInfo(434, 89, 7.25, 0.85);
		Gragas.setManaInfo(221, 47, 6.45, 0.45, "Mana");

		ChampionInfo Graves = new ChampionInfo();
		Graves.setNameTitle("Graves", "the Outlaw");
		Graves.setTypes("Marksman", "");
		Graves.setInfo(8, 5, 3, 4);
		Graves.setAttackDam(51, 3.1);
		Graves.setAttackSpeed(0.625, 2.9);
		Graves.setArmor(19, 3.2);
		Graves.setRange(525, "Ranged");
		Graves.setMoveSpeed(330);
		Graves.setHealthInfo(410, 84, 5.5, 0.7);
		Graves.setManaInfo(255, 40, 6.75, 0.7, "Mana");
	        Graves.setMagicRes(30, 0);

		ChampionInfo Hecarim = new ChampionInfo();
		Hecarim.setNameTitle("Hecarim", "the Shadow of War");
		Hecarim.setTypes("Fighter", "Tank");
		Hecarim.setInfo(8, 6, 4, 5);
		Hecarim.setAttackDam(56, 3.2);
		Hecarim.setAttackSpeed(0.67, 3.2);
		Hecarim.setArmor(20, 4);
		Hecarim.setRange(175, "Melee");
		Hecarim.setMoveSpeed(345);
		Hecarim.setHealthInfo(440, 95, 8, 0.75);
		Hecarim.setManaInfo(210, 40, 6.5, 0.6, "Mana");
		Hecarim.setMagicRes(30, 1.25);

		ChampionInfo Heimerdinger = new ChampionInfo();
		Heimerdinger.setNameTitle("Heimerdinger", "the Revered Inventor");
		Heimerdinger.setTypes("Mage", "Support");
		Heimerdinger.setInfo(2, 6, 8, 4);
		Heimerdinger.setAttackDam(53, 2.7);
		Heimerdinger.setAttackSpeed(0.625, 1.36);
		Heimerdinger.setArmor(14, 3);
		Heimerdinger.setRange(550, "Ranged");
		Heimerdinger.setMoveSpeed(340);
		Heimerdinger.setHealthInfo(350, 75, 0, 0.6);
		Heimerdinger.setManaInfo(240, 40, 6, 0.6, "Mana");
	        Heimerdinger.setMagicRes(30, 0);

		ChampionInfo Irelia = new ChampionInfo();
		Irelia.setNameTitle("Irelia", "the Will of the Blades");
		Irelia.setTypes("Fighter", "Assassin");
		Irelia.setInfo(7, 4, 5, 5);
		Irelia.setAttackDam(56, 3.3);
		Irelia.setAttackSpeed(0.665, 3.2);
		Irelia.setArmor(19, 3.75);
		Irelia.setRange(125, "Melee");
		Irelia.setMoveSpeed(340);
		Irelia.setHealthInfo(456, 90, 7.5, 0.65);
		Irelia.setManaInfo(230, 35, 7, 0.65, "Mana");
	        Irelia.setMagicRes(30, 1.25);

		ChampionInfo Janna = new ChampionInfo();
		Janna.setNameTitle("Janna", "the Storm's Fury");
		Janna.setTypes("Support", "Mage");
		Janna.setInfo(3, 5, 7, 9);
		Janna.setAttackDam(49, 2.95);
		Janna.setAttackSpeed(0.625, 2.61);
		Janna.setArmor(13, 3.8);
		Janna.setRange(475, "Ranged");
		Janna.setMoveSpeed(335);
		Janna.setHealthInfo(356, 78, 4.5, 0.55);
		Janna.setManaInfo(302, 64, 6.9, 0.6, "Mana");
		Janna.setMagicRes(30, 0);

		ChampionInfo JarvanIV = new ChampionInfo();
		JarvanIV.setNameTitle("Jarvan IV", "the Exemplar of Demacia");
		JarvanIV.setTypes("Tank", "Fighter");
		JarvanIV.setInfo(6, 8, 3, 5);
		JarvanIV.setAttackDam(50, 3.4);
		JarvanIV.setAttackSpeed(0.658, 2.5);
		JarvanIV.setArmor(18, 3.6);
		JarvanIV.setRange(175, "Melee");
		JarvanIV.setMoveSpeed(340);
		JarvanIV.setHealthInfo(420, 90, 7, 0.7);
		JarvanIV.setManaInfo(235, 40, 6, 0.45, "Mana");
		JarvanIV.setMagicRes(30, 1.25);

		ChampionInfo Jax = new ChampionInfo();
		Jax.setNameTitle("Jax", "Grandmaster at Arms");
		Jax.setTypes("Fighter", "Assassin");
		Jax.setInfo(7, 5, 7, 6);
		Jax.setAttackDam(56.3, 3.375);
		Jax.setAttackSpeed(0.638, 3.4);
		Jax.setArmor(22, 3.5);
		Jax.setRange(125, "Melee");
		Jax.setMoveSpeed(350);
		Jax.setHealthInfo(463, 98, 7.45, 0.55);
		Jax.setManaInfo(230, 35, 6.4, 0.7, "Mana");
	        Jax.setMagicRes(30, 1.25);

		ChampionInfo Jayce = new ChampionInfo();
		Jayce.setNameTitle("Jayce", "the Defender of Tomorrow");
		Jayce.setTypes("Fighter", "Marksman");
		Jayce.setInfo(8, 4, 3, 8);
		Jayce.setAttackDam(46.5, 3.5);
		Jayce.setAttackSpeed(0.658, 3);
		Jayce.setArmor(16.5, 3.5);
		Jayce.setRange(125, "Melee");
		Jayce.setMoveSpeed(340);
		Jayce.setHealthInfo(420, 90, 6, 0.8);
		Jayce.setManaInfo(240, 40, 7, 0.7, "Mana");
	        Jayce.setMagicRes(30, 0);

		ChampionInfo Jinx = new ChampionInfo();
		Jinx.setNameTitle("Jinx", "the Loose Cannon");
		Jinx.setTypes("Marksman", "");
		Jinx.setInfo(9, 2, 4, 9);
		Jinx.setAttackDam(50, 3);
		Jinx.setAttackSpeed(0.625, 1);
		Jinx.setArmor(17, 3.5);
		Jinx.setRange(525, "Ranged");
		Jinx.setMoveSpeed(325);
		Jinx.setHealthInfo(380, 82, 5, 0.5);
		Jinx.setManaInfo(170, 45, 5, 1, "Mana");
	        Jinx.setMagicRes(30, 0);

		ChampionInfo Karma = new ChampionInfo();
		Karma.setNameTitle("Karma", "the Enlightened One");
		Karma.setTypes("Mage", "Support");
		Karma.setInfo(1, 7, 8, 8);
		Karma.setAttackDam(50, 3.3);
		Karma.setAttackSpeed(0.625, 2.3);
		Karma.setArmor(14, 3.8);
		Karma.setRange(525, "Ranged");
		Karma.setMoveSpeed(335);
		Karma.setHealthInfo(383, 83, 4.7, 0.55);
		Karma.setManaInfo(290, 50, 6.8, 0.65, "Mana");
		Karma.setMagicRes(30, 0);

		ChampionInfo Karthus = new ChampionInfo();
		Karthus.setNameTitle("Karthus", "the Deathsinger");
		Karthus.setTypes("Mage", "");
		Karthus.setInfo(2, 2, 10, 8);
		Karthus.setAttackDam(42.2, 3.25);
		Karthus.setAttackSpeed(0.625, 2.11);
		Karthus.setArmor(15, 3.5);
		Karthus.setRange(450, "Ranged");
		Karthus.setMoveSpeed(335);
		Karthus.setHealthInfo(390, 75, 5.5, 0.55);
		Karthus.setManaInfo(270, 61, 6.5, 0.6, "Mana");
	        Karthus.setMagicRes(30, 0);

		ChampionInfo Kassadin = new ChampionInfo();
		Kassadin.setNameTitle("Kassadin", "the Void Walker");
		Kassadin.setTypes("Assassin", "Mage");
		Kassadin.setInfo(3, 5, 8, 8);
		Kassadin.setAttackDam(52.3,  3.9);
		Kassadin.setAttackSpeed(0.64, 3.7);
		Kassadin.setArmor(14, 3.2);
		Kassadin.setRange(150, "Melee");
		Kassadin.setMoveSpeed(340);
		Kassadin.setHealthInfo(433,  78 , 6.95, 0.5);
		Kassadin.setManaInfo(230, 45, 6.9, 0.6, "Mana");
		Kassadin.setMagicRes(30, 0 );
		//I need to add his spells later.
		//also maybe have id number for him 
		//giant array?
		
		ChampionInfo Katarina = new ChampionInfo();
		Katarina.setNameTitle("Katarina", "the Sinister Blade");
		Katarina.setTypes("Assassin", "Mage");
		Katarina.setInfo(4, 3, 9, 5);
		Katarina.setAttackDam(53, 3.2);
		Katarina.setAttackSpeed(0.658, 2.74);
		Katarina.setArmor(21, 3.5);
		Katarina.setRange(125, "Melee");
		Katarina.setMoveSpeed(345);
		Katarina.setHealthInfo(425, 80, 6.95, 0.55);
		Katarina.setManaInfo(0,0,0,0, null);
		Katarina.setMagicRes( 30, 1.25);
		//.setSpells
		
		ChampionInfo Kayle = new ChampionInfo();
		Kayle.setNameTitle("Kayle", "the Judicator");
		Kayle.setTypes("Fighter", "Support");
		Kayle.setInfo(6, 6, 7, 5);
		Kayle.setAttackDam(53.3, 2.8);
		Kayle.setAttackSpeed(0.638, 2.5);
		Kayle.setArmor(21, 3.5);
		Kayle.setRange(125, "Melee");
		Kayle.setMoveSpeed(335);
		Kayle.setHealthInfo(418, 93, 7, 0.75);
		Kayle.setManaInfo(255, 40, 6.9, 0.525, "Mana");
		Kayle.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Kennen = new ChampionInfo();
		Kennen.setNameTitle("Kennen", "The Heart of the Tempest");
		Kennen.setTypes("Mage", "Marksman");
		Kennen.setInfo(6, 4, 7, 5);
		Kennen.setAttackDam(47, 3.3);
		Kennen.setAttackSpeed(0.69, 3.4);
		Kennen.setArmor(18, 3.75);
		Kennen.setRange(550, "Ranged");
		Kennen.setMoveSpeed(335);
		Kennen.setHealthInfo(403, 79, 4.5, 0.65);
		Kennen.setManaInfo(200, 0, 50, 0, "Energy");
		Kennen.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo KhaZix= new ChampionInfo();
		KhaZix.setNameTitle("Kha'Zix", "the Voidreaver");
		KhaZix.setTypes("Assassin", null);
		KhaZix.setInfo(9, 4, 3, 7);
		KhaZix.setAttackDam(50, 3.1);
		KhaZix.setAttackSpeed(0.668, 2.7);
		KhaZix.setArmor(19, 3);
		KhaZix.setRange(125, "Melee");
		KhaZix.setMoveSpeed(350);
		KhaZix.setHealthInfo(430, 85, 6.25, 0.75);
		KhaZix.setManaInfo(260, 40, 6.75, 0.5, "Mana");
		KhaZix.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo KogMaw = new ChampionInfo();
		KogMaw.setNameTitle("Kog'Maw", "the Mouth of the Abyss");
		KogMaw.setTypes("Marksman", "Mage");
		KogMaw.setInfo(8, 2, 5, 8);
		KogMaw.setAttackDam(46, 3);
		KogMaw.setAttackSpeed(0.665, 2.65);
		KogMaw.setArmor(14, 3.5);
		KogMaw.setRange(500, "Ranged");
		KogMaw.setMoveSpeed(330);
		KogMaw.setHealthInfo(440, 84, 5, 0.55);
		KogMaw.setManaInfo(255, 40, 7.5, 0.7, "Mana");
		KogMaw.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo LeBlanc = new ChampionInfo();
		LeBlanc.setNameTitle("LeBlanc", "the Deceiver");
		LeBlanc.setTypes("Assassin","Mage");
		LeBlanc.setInfo(1, 4, 10, 9);
		LeBlanc.setAttackDam(51, 3.5);
		LeBlanc.setAttackSpeed(0.625, 1.4);
		LeBlanc.setArmor(16, 3.5);
		LeBlanc.setRange(525, "Ranged");
		LeBlanc.setMoveSpeed(335);
		LeBlanc.setHealthInfo(390, 75, 6.5, 0.55);
		LeBlanc.setManaInfo(250, 50, 6.9, 0.6, "Mana");
		LeBlanc.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo LeeSin = new ChampionInfo();
		LeeSin.setNameTitle("Lee Sin", "the Blind Monk");
		LeeSin.setTypes("Fighter", "Assassin");
		LeeSin.setInfo(8, 5, 3, 9);
		LeeSin.setAttackDam(55.8, 3.2);
		LeeSin.setAttackSpeed(0.651, 3);
		LeeSin.setArmor(20, 3.7);
		LeeSin.setRange(125, "Melee");
		LeeSin.setMoveSpeed(350);
		LeeSin.setHealthInfo(428, 85, 6.25, 0.7);
		LeeSin.setManaInfo(200, 0, 50, 0, "Energy");
		LeeSin.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Leona = new ChampionInfo();
		Leona.setNameTitle("Leona", "the Radiant Dawn");
		Leona.setTypes("Tank", "Support");
		Leona.setInfo(4, 8, 3, 4);
		Leona.setAttackDam(55, 3);
		Leona.setAttackSpeed(0.625, 2.9);
		Leona.setArmor(22, 3.1);
		Leona.setRange(125, "Melee");
		Leona.setMoveSpeed(335);
		Leona.setHealthInfo(430, 87, 7, 0.85);
		Leona.setManaInfo(235, 40, 7, 0.7, "Mana");
		Leona.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Lissandra = new ChampionInfo();
		Lissandra.setNameTitle("Lissandra", "the Ice Witch");
		Lissandra.setTypes("Mage", null);
		Lissandra.setInfo(2, 5, 8, 8);
		Lissandra.setAttackDam(48, 2.7);
		Lissandra.setAttackSpeed(0.625, 1.36);
		Lissandra.setArmor(14, 3.7);
		Lissandra.setRange(550, "Ranged");
		Lissandra.setMoveSpeed(325);
		Lissandra.setHealthInfo(365, 84, 6, 0.55);
		Lissandra.setManaInfo(220, 50, 5, 0.4, "Mana");
		Lissandra.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Lucian = new ChampionInfo();
		Lucian.setNameTitle("Lucian", "the Purifier");
		Lucian.setTypes("Marksman", null);
		Lucian.setInfo(8, 5, 3, 8);
		Lucian.setAttackDam(46, 3);
		Lucian.setAttackSpeed(0.638, 3.3);
		Lucian.setArmor(19, 3);
		Lucian.setRange(550, "Ranged");
		Lucian.setMoveSpeed(330);
		Lucian.setHealthInfo(390, 80, 5.1, 0.65);
		Lucian.setManaInfo(230, 41, 7, 0.7, "Mana");
		Lucian.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Lulu = new ChampionInfo();
		Lulu.setNameTitle("Lulu", "the Fae Sorceress");
		Lulu.setTypes("Support", "Mage");
		Lulu.setInfo(4, 5, 7, 7);
		Lulu.setAttackDam(44, 2.6);
		Lulu.setAttackSpeed(0.625, 2.25);
		Lulu.setArmor(13, 3.7);
		Lulu.setRange(550, "Ranged");
		Lulu.setMoveSpeed(325);
		Lulu.setHealthInfo(415, 82, 5, 0.6);
		Lulu.setManaInfo(200, 55, 5, 0.5, "Mana");
		Lulu.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Lux = new ChampionInfo();
		Lux.setNameTitle("Lux", "the Lady of Luminosity");
		Lux.setTypes("Mage", "Support");
		Lux.setInfo(2, 4, 9, 6);
		Lux.setAttackDam(50, 3.3);
		Lux.setAttackSpeed(0.625, 1.36);
		Lux.setArmor(12, 4);
		Lux.setRange(550, "Ranged");
		Lux.setMoveSpeed(330);
		Lux.setHealthInfo(345, 79, 4.5, 0.55);
		Lux.setManaInfo(250, 50, 6, 0.6, "Mana");
		Lux.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Malphite = new ChampionInfo();
		Malphite.setNameTitle("Malphite", "Shard of the Monolith");
		Malphite.setTypes("Tank", "Fighter");
		Malphite.setInfo(5, 9, 7, 3);
		Malphite.setAttackDam(56.3, 3.375);
		Malphite.setAttackSpeed(0.638, 3.4);
		Malphite.setArmor(22, 3.75);
		Malphite.setRange(125, "Melee");
		Malphite.setMoveSpeed(335);
		Malphite.setHealthInfo(423, 90, 7.45, 0.55);
		Malphite.setManaInfo(215, 40, 6.4, 0.55, "Mana");
		Malphite.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Malzahar = new ChampionInfo();
		Malzahar.setNameTitle("Malzahar", "the Prophet of the Void");
		Malzahar.setTypes("Mage", "Assassin");
		Malzahar.setInfo(2, 2, 9, 6);
		Malzahar.setAttackDam(51.66, 3);
		Malzahar.setAttackSpeed(0.625, 1.36);
		Malzahar.setArmor(16, 3.5);
		Malzahar.setRange(550, "Ranged");
		Malzahar.setMoveSpeed(340);
		Malzahar.setHealthInfo(380, 80, 4.5, 0.55);
		Malzahar.setManaInfo(250, 45, 7, 0.6, "Mana");
		Malzahar.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Maokai = new ChampionInfo();
		Maokai.setNameTitle("Maokai", "the Twisted Treant");
		Maokai.setTypes("Tank", "Mage");
		Maokai.setInfo(3, 8, 6, 4);
		Maokai.setAttackDam(58, 3.3);
		Maokai.setAttackSpeed(0.694, 2.125);
		Maokai.setArmor(22, 4);
		Maokai.setRange(125, "Melee");
		Maokai.setMoveSpeed(335);
		Maokai.setHealthInfo(421, 90, 7.25, 0.85);
		Maokai.setManaInfo(250, 46, 6.45, 0.45, "Mana");
		Maokai.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo MasterYi = new ChampionInfo();
		MasterYi.setNameTitle("Master Yi", "the Wuju Bladesman");
		MasterYi.setTypes("Asassin", "Fighter");
		MasterYi.setInfo(10, 4, 2, 2);
		MasterYi.setAttackDam(55, 3);
		MasterYi.setAttackSpeed(0.679, 2);
		MasterYi.setArmor(19, 3);
		MasterYi.setRange(125, "Melee");
		MasterYi.setMoveSpeed(355);
		MasterYi.setHealthInfo(444, 92, 6.5, 0.65);
		MasterYi.setManaInfo(180, 42, 6.5, 0.45, "Mana");
		MasterYi.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo MissFortune = new ChampionInfo();
		MissFortune.setNameTitle("Miss Fortune", "the Bounty Hunter");
		MissFortune.setTypes("Marksman", null);
		MissFortune.setInfo(8, 2,5,3);
		MissFortune.setAttackDam(46.5, 3);
		MissFortune.setAttackSpeed(0.656, 3.01);
		MissFortune.setArmor(19, 3);
		MissFortune.setRange(550, "Ranged");
		MissFortune.setMoveSpeed(325);
		MissFortune.setHealthInfo(435, 85, 5.1, 0.65);
		MissFortune.setManaInfo(212, 38, 6.95, 0.65, "Mana");
		MissFortune.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Mordekaiser = new ChampionInfo();
		Mordekaiser.setNameTitle("Mordekaiser", "the Master of Metal");
		Mordekaiser.setTypes("Fighter", "Mage");
		Mordekaiser.setInfo(4, 6,7,3);
		Mordekaiser.setAttackDam(51.7, 3.5);
		Mordekaiser.setAttackSpeed(0.694, 3);
		Mordekaiser.setArmor(19, 3.5);
		Mordekaiser.setRange(125, "Melee");
		Mordekaiser.setMoveSpeed(340);
		Mordekaiser.setHealthInfo(421, 80, 7.45, 0.55);
		Mordekaiser.setManaInfo(0,0,0,0, null);
		Mordekaiser.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Morgana = new ChampionInfo();
		Morgana.setNameTitle("Morgana", "Fallen Angel");
		Morgana.setTypes("Mage", "Support");
		Morgana.setInfo(1, 6, 8, 6);
		Morgana.setAttackDam(51.58, 3.5);
		Morgana.setAttackSpeed(0.625, 1.53);
		Morgana.setArmor(19, 3.8);
		Morgana.setRange(450, "Ranged");
		Morgana.setMoveSpeed(335);
		Morgana.setHealthInfo(403, 86, 4.7, 0.6);
		Morgana.setManaInfo(240, 60, 6.8, 0.65, "Mana");
		Morgana.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Nami = new ChampionInfo();
		Nami.setNameTitle("Nami", "the Tidecaller");
		Nami.setTypes("Support", "Mage");
		Nami.setInfo(4, 3, 7, 8);
		Nami.setAttackDam(48, 3.1);
		Nami.setAttackSpeed(0.644, 2.61);
		Nami.setArmor(13, 4);
		Nami.setRange(550, "Ranged");
		Nami.setMoveSpeed(340);
		Nami.setHealthInfo(365, 74, 4.5, 0.55);
		Nami.setManaInfo(305, 43, 6.9, 0.6, "Mana");
		Nami.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Nasus = new ChampionInfo();
		Nasus.setNameTitle("Nasus", "the Curator of the Sands");
		Nasus.setTypes("Fighter", "Tank");
		Nasus.setInfo(7, 5 ,6, 2);
		Nasus.setAttackDam(53.3, 3.5);
		Nasus.setAttackSpeed(0.638, 3.48);
		Nasus.setArmor(19, 3.5);
		Nasus.setRange(125, "Melee");
		Nasus.setMoveSpeed(350);
		Nasus.setHealthInfo(410, 90, 7.5, 0.9);
		Nasus.setManaInfo(200, 45 ,6.6, 0.5, "Mana");
		Nasus.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Nautilus = new ChampionInfo();
		Nautilus.setNameTitle("Nautilus", "the Titan of the Depths");
		Nautilus.setTypes("Tank", "Fighter");
		Nautilus.setInfo(4, 6, 6, 6);
		Nautilus.setAttackDam(52, 3.3);
		Nautilus.setAttackSpeed(0.613, 1);
		Nautilus.setArmor(20, 3.25);
		Nautilus.setRange(175, "Melee");
		Nautilus.setMoveSpeed(325);
		Nautilus.setHealthInfo(432, 86, 7.45, 0.55);
		Nautilus.setManaInfo(200, 50, 7.45, 0.7, "Mana");
		Nautilus.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Nidalee = new ChampionInfo();
		Nidalee.setNameTitle("Nidalee", "the Bestial Huntress");
		Nidalee.setTypes("Assassin", "Support");
		Nidalee.setInfo(5, 4, 7, 7);
		Nidalee.setAttackDam(49, 3.5);
		Nidalee.setAttackSpeed(0.67, 3.22);
		Nidalee.setArmor(15, 3.5);
		Nidalee.setRange(525, "Ranged");
		Nidalee.setMoveSpeed(335);
		Nidalee.setHealthInfo(370, 90, 5, 0.6);
		Nidalee.setManaInfo(220, 45, 7, 0.5, "Mana");
		Nidalee.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Nocturne = new ChampionInfo();
		Nocturne.setNameTitle("Nocturne", "the Eternal Nightmare");
		Nocturne.setTypes("Assassin", "Fighter");
		Nocturne.setInfo(9, 5, 2, 6);
		Nocturne.setAttackDam(54, 3.1);
		Nocturne.setAttackSpeed(0.668, 2.7);
		Nocturne.setArmor(21, 3.5);
		Nocturne.setRange(125, "Melee");
		Nocturne.setMoveSpeed(345);
		Nocturne.setHealthInfo(440, 85, 7, 0.75);
		Nocturne.setManaInfo(215, 35, 6, 0.45, "Mana");
		Nocturne.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Nunu = new ChampionInfo();
		Nunu.setNameTitle("Nunu", "the Yeti Rider");
		Nunu.setTypes("Support", "Fighter");
		Nunu.setInfo(4, 6, 7,1);
		Nunu.setAttackDam(51.06, 3.45);
		Nunu.setAttackSpeed(0.625, 2.25);
		Nunu.setArmor(20.5, 3.5);
		Nunu.setRange(125, "Melee");
		Nunu.setMoveSpeed(350);
		Nunu.setHealthInfo(437, 96, 7.05, 0.8);
		Nunu.setManaInfo(213, 42, 6.6, 0.5, "Mana");
		Nunu.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Olaf = new ChampionInfo();
		Olaf.setNameTitle("Olaf", "the Beserker");
		Olaf.setTypes("Fighter", "Tank");
		Olaf.setInfo(9,5, 3, 4);
		Olaf.setAttackDam(54.1, 3.5);
		Olaf.setAttackSpeed(0.694, 2.7);
		Olaf.setArmor(21, 3);
		Olaf.setRange(125, "Melee");
		Olaf.setMoveSpeed(350);
		Olaf.setHealthInfo(441, 93, 7, 0.9);
		Olaf.setManaInfo(190, 45, 6.5, 0.575, "Mana");
		Olaf.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Orianna = new ChampionInfo();
		Orianna.setNameTitle("Orianna", "the Lady of Clockwork");
		Orianna.setTypes("Mage", "Support");
		Orianna.setInfo(4, 3, 9, 10);
		Orianna.setAttackDam(44, 2.6);
		Orianna.setAttackSpeed(0.658, 3.5);
		Orianna.setArmor(12, 3);
		Orianna.setRange(525, "Ranged");
		Orianna.setMoveSpeed(325);
		Orianna.setHealthInfo(385, 79, 5.95, 0.55);
		Orianna.setManaInfo(250, 50, 7, 0.5, "Mana");
		Orianna.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Pantheon = new ChampionInfo();
		Pantheon.setNameTitle("Pantheon", "the Artisan of War");
		Pantheon.setTypes("Fighter", "Assasin");
		Pantheon.setInfo(9, 4, 3, 5);
		Pantheon.setAttackDam(50.7, 2.9);
		Pantheon.setAttackSpeed(0.679, 2.95);
		Pantheon.setArmor(21.1, 3.9);
		Pantheon.setRange(150, "Melee");
		Pantheon.setMoveSpeed(355);
		Pantheon.setHealthInfo(433, 87, 6.75, 0.65);
		Pantheon.setManaInfo(210, 34, 6.6, 0.45, "Mana");
		Pantheon.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Poppy = new ChampionInfo();
		Poppy.setNameTitle("Poppy", "the Iron Ambassador");
		Poppy.setTypes("Fighter", "Assassin");
		Poppy.setInfo(6, 6, 5, 7);
		Poppy.setAttackDam(56.3, 3.375);
		Poppy.setAttackSpeed(0.638, 3.35);
		Poppy.setArmor(22, 4);
		Poppy.setRange(125, "Melee");
		Poppy.setMoveSpeed(345);
		Poppy.setHealthInfo(423, 81, 7.45, 0.55);
		Poppy.setManaInfo(185, 30, 6.4, 0.45, "Mana");
		Poppy.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Quinn = new ChampionInfo();
		Quinn.setNameTitle("Quinn", "Demacia's Wings");
		Quinn.setTypes("Marksman", "Fighter");
		Quinn.setInfo(9, 4, 2, 7);
		Quinn.setAttackDam(48, 3);
		Quinn.setAttackSpeed(0.668, 3.1);
		Quinn.setArmor(17.5, 3.5);
		Quinn.setRange(525, "Ranged");
		Quinn.setMoveSpeed(335);
		Quinn.setHealthInfo(390, 85, 4.5, 0.55);
		Quinn.setManaInfo(210, 35, 6.3, 0.4, "Mana");
		Quinn.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Rammus = new ChampionInfo();
		Rammus.setNameTitle("Rammus", "the Armordillo");
		Rammus.setTypes("Tank", "Fighter");
		Rammus.setInfo(4, 10, 5, 5);
		Rammus.setAttackDam(50, 3.5);
		Rammus.setAttackSpeed(0.625, 2.215);
		Rammus.setArmor(25, 3.8);
		Rammus.setRange(125, "Melee");
		Rammus.setMoveSpeed(335);
		Rammus.setHealthInfo(420,86, 7, 0.55);
		Rammus.setManaInfo(255, 33, 7, 0.5, "Mana");
		Rammus.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Renekton = new ChampionInfo();
		Renekton.setNameTitle("Renekton", "the Butcher of the Sands");
		Renekton.setTypes("Fighter", "Tank");
		Renekton.setInfo(8,5,2,3);
		Renekton.setAttackDam(53.12, 3.1);
		Renekton.setAttackSpeed(0.665, 2.65);
		Renekton.setArmor(19.2, 3.8);
		Renekton.setRange(125, "Melee");
		Renekton.setMoveSpeed(345);
		Renekton.setHealthInfo(426,87, 6.7, 0.75);
		Renekton.setManaInfo(100, 0,0,0,"Fury");
		Renekton.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Rengar = new ChampionInfo();
		Rengar.setNameTitle("Rengar", "the Pridestalker");
		Rengar.setTypes("Assassin", "Fighter");
		Rengar.setInfo(7,4,2,5);
		Rengar.setAttackDam(55, 3);
		Rengar.setAttackSpeed(0.679,2.85);
		Rengar.setArmor(20,3.5);
		Rengar.setRange(125, "Melee");
		Rengar.setMoveSpeed(345);
		Rengar.setHealthInfo(435,90,3.6,0.4);
		Rengar.setManaInfo(5,0,0,0,"Ferocity");
		Rengar.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Riven = new ChampionInfo();
		Riven.setNameTitle("Riven", "the Exile");
		Riven.setTypes("Fighter", "Assassin");
		Riven.setInfo(8, 5,1,4);
		Riven.setAttackDam(51, 3);
		Riven.setAttackSpeed(0.625, 3.5);
		Riven.setArmor(19,3.2);
		Riven.setRange(125,"Melee");
		Riven.setMoveSpeed(345);
		Riven.setHealthInfo(414,86,2.5,0.5);
		Riven.setManaInfo(0,0,0,0, null);
		Riven.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Rumble= new ChampionInfo();
		Rumble.setNameTitle("Rumble", "the Mechanized Menace");
		Rumble.setTypes("Fighter", "Mage");
		Rumble.setInfo(3, 6, 8, 8);
		Rumble.setAttackDam(55.66,3.2);
		Rumble.setAttackSpeed(0.644, 1.85);
		Rumble.setArmor(20,3.5);
		Rumble.setRange(125,"Melee");
		Rumble.setMoveSpeed(345);
		Rumble.setHealthInfo(450,80,7,0.6);
		Rumble.setManaInfo(100,0,0,0,"Heat");
		Rumble.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Ryze = new ChampionInfo();
		Ryze.setNameTitle("Ryze", "the Rogue Mage");
		Ryze.setTypes("Mage", "Fighter");
		Ryze.setInfo(2, 2, 10, 3);
		Ryze.setAttackDam(52,3);
		Ryze.setAttackSpeed(0.625,2.112);
		Ryze.setArmor(15,3.9);
		Ryze.setRange(550,"Ranged");
		Ryze.setMoveSpeed(340);
		Ryze.setHealthInfo(414,86,4.35,0.55);
		Ryze.setManaInfo(250,55,7,0.6, "Mana");
		Ryze.setMagicRes(30, 0);
		//.setSpells
		
		ChampionInfo Sejuani = new ChampionInfo();
		Sejuani.setNameTitle("Sejuani", "the Winter's Wrath");
		Sejuani.setTypes("Tank","Fighter");
		Sejuani.setInfo(5, 7, 6, 4);
		Sejuani.setAttackDam(52,3.3);
		Sejuani.setAttackSpeed(0.67,1.44);
		Sejuani.setArmor(24.5,3);
		Sejuani.setRange(125,"Melee");
		Sejuani.setMoveSpeed(340);
		Sejuani.setHealthInfo(440,95,7.25,0.85);
		Sejuani.setManaInfo(220,40,6.45,0.45, "Mana");
		Sejuani.setMagicRes(30, 1.25);
		//.setSpells
		
		ChampionInfo Shaco = new ChampionInfo();
		Shaco.setNameTitle("Shaco", "the Demon Jester");
		Shaco.setTypes("Assasin", null);
		Shaco.setInfo(8, 4, 6, 9);
		Shaco.setAttackDam(51.7,3.5);
		Shaco.setAttackSpeed(0.694,3);
		Shaco.setArmor(19,3.5);
		Shaco.setRange(125,"Melee");
		Shaco.setMoveSpeed(350);
		Shaco.setHealthInfo(441,84,7.45,0.55);
		Shaco.setManaInfo(230,40,6.4,0.45,"Mana");
		Shaco.setMagicRes(30, 1.25);
		//.setSpells


		/*
		 * 
		 * Section 3 Champions
		 * 
		 * - Must include spell file
		 * spellInfo  champSpells[78-117]
		 * 
		*/
		
		//.setAttributes(new int[] {H, S, P, C, W, D, Y, B, E, L});
		/*
		ChampionInfo Shen = new ChampionInfo();
		Shen.setNameTitle("Shen", "Eye of Twilight");
		Shen.setTypes("Tank", "Fighter");
		Shen.setInfo(3, 9, 3, 3);
		Shen.setAttackDam(54.5, 3.375);
		Shen.setAttackSpeed(0.651, 3.4);
		Shen.setArmor(19, 4);
		Shen.setRange(125, "Melee");
		Shen.setMoveSpeed(335);
		Shen.setHealthInfo(428, 85, 7.45, 0.55);
		Shen.setManaInfo(200, 0, 50, 0, "Energy");
		Shen.setMagicRes(30, 0);
		Shen.setSpells(champSpells[78]);
		Shen.setAttributes(new int[] {20, 20, 10, 20, 10, 0, 0, 0, 10, 10});
		champions[78] = Shen;
		
		ChampionInfo Shyvana = new ChampionInfo();
		Shyvana.setNameTitle("Shyvana", "the Half-Dragon"); // Should we capitalize the the?
		Shyvana.setTypes("Fighter", "Tank");
		Shyvana.setInfo(8, 6, 3, 4);
		Shyvana.setAttackDam(55, 3.4);
		Shyvana.setAttackSpeed(0.658, 2.5);
		Shyvana.setArmor(22, 3.35);
		Shyvana.setRange(125, "Melee");
		Shyvana.setMoveSpeed(350);
		Shyvana.setHealthInfo(435, 95, 7.25, 0.8);
		Shyvana.setManaInfo(100, 0, 0, 0, "Fury");  // How do we handle lack of info?
		Shyvana.setMagicRes(30, 1.25);
		Shyvana.setSpells(champSpells[79]);
		Shyvana.setAttributes(new int[] {20, 10, 0, 20, 10, 0, 0, 0, 10, 10});
		champions[79] = Shyvana;
		
		ChampionInfo Singed = new ChampionInfo();
		Singed.setNameTitle("Singed", "the Mad Chemist");
		Singed.setTypes("Tank", "Fighter");
		Singed.setInfo(4, 8, 7, 5);
		Singed.setAttackDam(56.65, 3.375);
		Singed.setAttackSpeed(0.613, 1.81);
		Singed.setArmor(22, 3.5);
		Singed.setRange(125, "Melee");
		Singed.setMoveSpeed(345);
		Singed.setHealthInfo(405, 82, 7.1, 0.55);
		Singed.setManaInfo(215, 45, 6.6, 0.55, "Mana");
		Singed.setMagicRes(30, 0);
		Singed.setSpells(champSpells[80]);
		Singed.setAttributes(new int[] {20, 20, 0, 20, 10, 0, 0, 0, 10, 10});
		champions[80] = Singed;
		
		ChampionInfo Sion = new ChampionInfo();
		Sion.setNameTitle("Sion", "the Undead Champion");
		Sion.setTypes("Fighter", "Mage");
		Sion.setInfo(5, 8, 7, 4);
		Sion.setAttackDam(55.52, 3.188);
		Sion.setAttackSpeed(0.625, 1.63);
		Sion.setArmor(21.75, 3.25);
		Sion.setRange(125, "Melee");
		Sion.setMoveSpeed(345);
		Sion.setHealthInfo(403, 104, 7.9, 0.95);
		Sion.setManaInfo(200, 40, 6.3, 0.4, "Mana");
		Sion.setMagicRes(30, 1.25);
		Sion.setSpells(champSpells[81]);
		Sion.setAttributes(new int[] {10, 0, 0, 20, 10, 0, 0, 0, 10, 10});
		champions[81] = Sion;
		
		ChampionInfo Sivir = new ChampionInfo();
		Sivir.setNameTitle("Sivir", "the Battle Mistress");
		Sivir.setTypes("Marksman", ""); // How do we handle one type?
		Sivir.setInfo(9, 3, 1, 3);
		Sivir.setAttackDam(49, 3);
		Sivir.setAttackSpeed(0.658, 1.6);
		Sivir.setArmor(16.75, 3.25);
		Sivir.setRange(500, "Ranged");
		Sivir.setMoveSpeed(335);
		Sivir.setHealthInfo(378, 82, 4.25, 0.55);
		Sivir.setManaInfo(203, 43, 6.5, 0.5, "Mana");
		Sivir.setMagicRes(30, 0);
		Sivir.setSpells(champSpells[82]);
		Sivir.setAttributes(new int[] {10, 0, 20, 10, 10, 0, 0, 0, 10, 10});
		champions[82] = Sivir;
		
		ChampionInfo Skarner = new ChampionInfo();
		Skarner.setNameTitle("Skarner", "the Crystal Vanguard");
		Skarner.setTypes("Fighter", "Tank");
		Skarner.setInfo(7, 6, 5, 5);
		Skarner.setAttackDam(54.1, 4.2);
		Skarner.setAttackSpeed(0.625, 2.1);
		Skarner.setArmor(23, 3.8);
		Skarner.setRange(125, "Melee");
		Skarner.setMoveSpeed(345);
		Skarner.setHealthInfo(440, 96, 7.5, 0.85);
		Skarner.setManaInfo(205, 40, 6.45, 0.45, "Mana");
		Skarner.setMagicRes(30, 1.25);
		Skarner.setSpells(champSpells[83]);
		Skarner.setAttributes(new int[] {10, 0, 0, 20, 0, 0, 0, 0, 10, 10});
		champions[83] = Skarner;
		
		ChampionInfo Sona = new ChampionInfo();
		Sona.setNameTitle("Sona", "Maven of the Strings");
		Sona.setTypes("Support", "Mage");
		Sona.setInfo(5, 2, 8, 1);
		Sona.setAttackDam(47, 3);
		Sona.setAttackSpeed(0.644, 2.3);
		Sona.setArmor(12, 3.3);
		Sona.setRange(550, "Ranged");
		Sona.setMoveSpeed(330);
		Sona.setHealthInfo(380, 70, 4.5, 0.55);
		Sona.setManaInfo(265, 45, 7, 0.65, "Mana");
		Sona.setMagicRes(30, 0);
		Sona.setSpells(champSpells[84]);
		Sona.setAttributes(new int[] {20, 10, 20, 20, 20, 0, 0, 0, 10, 10});
		champions[84] = Sona;
		
		ChampionInfo Soraka = new ChampionInfo();
		Soraka.setNameTitle("Soraka", "the Starchild");
		Soraka.setTypes("Support", "Mage");
		Soraka.setInfo(2, 5, 7, 3);
		Soraka.setAttackDam(48.8, 3);
		Soraka.setAttackSpeed(0.625, 2.14);
		Soraka.setArmor(17, 3.8);
		Soraka.setRange(550, "Ranged");
		Soraka.setMoveSpeed(340);
		Soraka.setHealthInfo(405, 76, 4.5, 0.55);
		Soraka.setManaInfo(240, 60, 6.8, 0.65, "Mana");
		Soraka.setMagicRes(30, 0);
		Soraka.setSpells(champSpells[85]);
		Soraka.setAttributes(new int[] {0, 0, 10, 10, 10, 0, 0, 0, 10, 10});
		champions[85] = Soraka;
		
		ChampionInfo Swain = new ChampionInfo();
		Swain.setNameTitle("Swain", "the Master Tactician");
		Swain.setTypes("Mage", "Fighter");
		Swain.setInfo(2, 6, 9, 5);
		Swain.setAttackDam(49, 3);
		Swain.setAttackSpeed(0.625, 2.11);
		Swain.setArmor(16, 4);
		Swain.setRange(500, "Ranged");
		Swain.setMoveSpeed(335);
		Swain.setHealthInfo(385, 78, 6.75, 0.65);
		Swain.setManaInfo(240, 50, 6.8, 0.65, "Mana");
		Swain.setMagicRes(30, 0);
		Swain.setSpells(champSpells[86]);
		Swain.setAttributes(new int[] {20, 10, 10, 20, 10, 0, 0, 0, 10, 10});
		champions[86] = Swain;
		
		ChampionInfo Syndra = new ChampionInfo();
		Syndra.setNameTitle("Syndra", "the Dark Sovereign");
		Syndra.setTypes("Mage", "Support");
		Syndra.setInfo(2, 3, 9, 10);
		Syndra.setAttackDam(51, 2.9);
		Syndra.setAttackSpeed(0.625, 2);
		Syndra.setArmor(19, 3.4);
		Syndra.setRange(550, "Ranged");
		Syndra.setMoveSpeed(330);
		Syndra.setHealthInfo(380, 78, 5.5, 0.6);
		Syndra.setManaInfo(250, 50, 6.9, 0.6, "Mana");
		Syndra.setMagicRes(30, 0);
		Syndra.setSpells(champSpells[87]);
		Syndra.setAttributes(new int[] {0, 20, 20, 20, 10, 0, 0, 0, 10, 10});
		champions[87] = Syndra;
		
		ChampionInfo Talon = new ChampionInfo();
		Talon.setNameTitle("Talon", "the Blade's Shadow");
		Talon.setTypes("Assassin", "Fighter");
		Talon.setInfo(9, 3, 1, 6);
		Talon.setAttackDam(50, 3.1);
		Talon.setAttackSpeed(0.668, 2.7);
		Talon.setArmor(21, 3.5);
		Talon.setRange(125, "Melee");
		Talon.setMoveSpeed(350);
		Talon.setHealthInfo(440, 85, 7.25, 0.75);
		Talon.setManaInfo(260, 40, 6.75, 0.5, "Mana");
		Talon.setMagicRes(30, 1.25);
		Talon.setSpells(champSpells[88]);
		Talon.setAttributes(new int[] {20, 0, 10, 20, 10, 0, 0, 0, 10, 10});
		champions[88] = Talon;
		
		ChampionInfo Taric = new ChampionInfo();
		Taric.setNameTitle("Taric", "the Gem Knight");
		Taric.setTypes("Support", "Fighter");
		Taric.setInfo(4, 8, 5, 3);
		Taric.setAttackDam(52, 3.5);
		Taric.setAttackSpeed(0.625, 2.02);
		Taric.setArmor(20.5, 3.2);
		Taric.setRange(125, "Melee");
		Taric.setMoveSpeed(340);
		Taric.setHealthInfo(468, 90, 7.1, 0.5);
		Taric.setManaInfo(255, 56, 4.1, 0.4, "Mana");
		Taric.setMagicRes(30, 1.25);
		Taric.setSpells(champSpells[89]);
		Taric.setAttributes(new int[] {10, 0, 10, 10, 10, 0, 0, 0, 10, 10});
		champions[89] = Taric;
		
		ChampionInfo Teemo = new ChampionInfo();
		Teemo.setNameTitle("Teemo", "the Swift Scout");
		Teemo.setTypes("Marksman", "Assassin");
		Teemo.setInfo(5, 3, 7, 4);
		Teemo.setAttackDam(44.5, 3);
		Teemo.setAttackSpeed(0.69, 3.38);
		Teemo.setArmor(18, 3.75);
		Teemo.setRange(500, "Ranged");
		Teemo.setMoveSpeed(330);
		Teemo.setHealthInfo(378, 82, 4.65, 0.65);
		Teemo.setManaInfo(200, 40, 6.45, 0.45, "Mana");
		Teemo.setMagicRes(30, 0);
		Teemo.setSpells(champSpells[90]);
		Teemo.setAttributes(new int[] {0, 20, 10, 10, 0, 0, 20, 0, 20, 10});
		champions[90] = Teemo;
		
		ChampionInfo Thresh = new ChampionInfo();
		Thresh.setNameTitle("Thresh", "the Chain Warden");
		Thresh.setTypes("Support", "Fighter");
		Thresh.setInfo(5, 6, 6, 7);
		Thresh.setAttackDam(46, 2.2);
		Thresh.setAttackSpeed(0.625, 3.5);
		Thresh.setArmor(16, 0);
		Thresh.setRange(450, "Ranged");
		Thresh.setMoveSpeed(335);
		Thresh.setHealthInfo(411, 89, 6, 0.55);
		Thresh.setManaInfo(200, 44, 5, 0.7, "Mana");
		Thresh.setMagicRes(30, 0);
		Thresh.setSpells(champSpells[91]);
		Thresh.setAttributes(new int[] {20, 20, 0, 20, 10, 0, 0, 0, 10, 10});
		champions[91] = Thresh;
		
		ChampionInfo Tristana = new ChampionInfo();
		Tristana.setNameTitle("Tristana", "the Megling Gunner");
		Tristana.setTypes("Marksman", "Assassin");
		Tristana.setInfo(9, 3, 5, 3);
		Tristana.setAttackDam(46.5, 3);
		Tristana.setAttackSpeed(0.656, 4);
		Tristana.setArmor(19, 3);
		Tristana.setRange(550, "Ranged");
		Tristana.setMoveSpeed(325);
		Tristana.setHealthInfo(415, 82, 5.1, 0.65);
		Tristana.setManaInfo(193, 32, 6.45, 0.45, "Mana");
		Tristana.setMagicRes(30, 0);
		Tristana.setSpells(champSpells[92]);
		Tristana.setAttributes(new int[] {0, 20, 20, 10, 10, 20, 20, 0, 10, 20});
		champions[92] = Tristana;
		
		ChampionInfo Trundle = new ChampionInfo();
		Trundle.setNameTitle("Trundle", "the Troll King");
		Trundle.setTypes("Fighter", "Tank");
		Trundle.setInfo(7, 6, 2, 5);
		Trundle.setAttackDam(55, 3);
		Trundle.setAttackSpeed(0.67, 2.9);
		Trundle.setArmor(23, 2.7);
		Trundle.setRange(125, "Melee");
		Trundle.setMoveSpeed(350);
		Trundle.setHealthInfo(455, 96, 8, 0.85);
		Trundle.setManaInfo(206, 45, 6.5, 0.6, "Mana");
		Trundle.setMagicRes(30, 1.25);
		Trundle.setSpells(champSpells[93]);
		Trundle.setAttributes(new int[] {20, 20, 0, 20, 0, 0, 0, 0, 10, 10});
		champions[93] = Trundle;
		
		ChampionInfo Tryndamere = new ChampionInfo();
		Tryndamere.setNameTitle("Tryndamere", "the Barbarian King");
		Tryndamere.setTypes("Fighter", "Assassin");
		Tryndamere.setInfo(10, 5, 2, 6);
		Tryndamere.setAttackDam(56, 3.2);
		Tryndamere.setAttackSpeed(0.67, 2.9);
		Tryndamere.setArmor(18.9, 3.1);
		Tryndamere.setRange(125, "Melee");
		Tryndamere.setMoveSpeed(345);
		Tryndamere.setHealthInfo(461, 98, 7, 0.9);
		Tryndamere.setManaInfo(100, 0, 0, 0, "Fury");
		Tryndamere.setMagicRes(30, 1.25);
		Tryndamere.setSpells(champSpells[94]);
		Tryndamere.setAttributes(new int[] {20, 20, 0, 10, 0, 0, 0, 0, 0, 20});
		champions[94] = Tryndamere;
		
		ChampionInfo TwistedFate = new ChampionInfo();
		TwistedFate.setNameTitle("Twisted Fate", "the Card Master");
		TwistedFate.setTypes("Mage", "");
		TwistedFate.setInfo(6, 2, 6, 9);
		TwistedFate.setAttackDam(46.41, 3.3);
		TwistedFate.setAttackSpeed(0.651, 3.22);
		TwistedFate.setArmor(15.25, 3.15);
		TwistedFate.setRange(525, "Ranged");
		TwistedFate.setMoveSpeed(330);
		TwistedFate.setHealthInfo(384, 82, 4.5, 0.6);
		TwistedFate.setManaInfo(202, 38, 6.5, 0.5, "Mana");
		TwistedFate.setMagicRes(30, 0);
		TwistedFate.setSpells(champSpells[95]);
		TwistedFate.setAttributes(new int[] {10, 20, 20, 20, 0, 0, 0, 0, 10, 10});
		champions[95] = TwistedFate;
		
		ChampionInfo Twitch = new ChampionInfo();
		Twitch.setNameTitle("Twitch", "the Plague Rat");
		Twitch.setTypes("Marksman", "Assassin");
		Twitch.setInfo(9, 2, 3, 8);
		Twitch.setAttackDam(49, 3);
		Twitch.setAttackSpeed(0.679, 3.38);
		Twitch.setArmor(18, 3);
		Twitch.setRange(550, "Ranged");
		Twitch.setMoveSpeed(330);
		Twitch.setHealthInfo(389, 81, 5, 0.6);
		Twitch.setManaInfo(220, 40, 6.5, 0.45, "Mana");
		Twitch.setMagicRes(30, 0);
		Twitch.setSpells(champSpells[96]);
		Twitch.setAttributes(new int[] {10, 0, 20, 10, 20, 0, 0, 0, 10, 10});
		champions[96] = Twitch;
		
		ChampionInfo Udyr = new ChampionInfo();
		Udyr.setNameTitle("Udyr", "the Spirit Walker");
		Udyr.setTypes("Fighter", "Tank");
		Udyr.setInfo(8, 7, 4, 5);
		Udyr.setAttackDam(52.91, 3.2);
		Udyr.setAttackSpeed(0.658, 2.67);
		Udyr.setArmor(18.75, 4);
		Udyr.setRange(125, "Melee");
		Udyr.setMoveSpeed(345);
		Udyr.setHealthInfo(427, 99, 7.45, 0.75);
		Udyr.setManaInfo(220, 30, 6.75, 0.45, "Mana");
		Udyr.setMagicRes(30, 1.25);
		Udyr.setSpells(champSpells[97]);
		Udyr.setAttributes(new int[] {20, 10, 0, 20, 0, 0, 0, 0, 10, 10});
		champions[97] = Udyr;
		
		ChampionInfo Urgot = new ChampionInfo();
		Urgot.setNameTitle("Urgot", "the Headsman's Pride");
		Urgot.setTypes("Marksman", "Tank");
		Urgot.setInfo(8, 5, 3, 8);
		Urgot.setAttackDam(48, 3.6);
		Urgot.setAttackSpeed(0.644, 2.9);
		Urgot.setArmor(19, 3.3);
		Urgot.setRange(425, "Ranged");
		Urgot.setMoveSpeed(335);
		Urgot.setHealthInfo(437, 89, 5.5, 0.6);
		Urgot.setManaInfo(220, 55, 7.5, 0.65, "Mana");
		Urgot.setMagicRes(30, 0);
		Urgot.setSpells(champSpells[98]);
		Urgot.setAttributes(new int[] {10, 0, 20, 20, 0, 0, 0, 0, 10, 10});
		champions[98] = Urgot;
		
		ChampionInfo Varus = new ChampionInfo();
		Varus.setNameTitle("Varus", "the Arrow of Retribution");
		Varus.setTypes("Marksman", "Mage");
		Varus.setInfo(7, 3, 4, 6);
		Varus.setAttackDam(46, 3);
		Varus.setAttackSpeed(0.658, 3);
		Varus.setArmor(17.5, 3.4);
		Varus.setRange(575, "Ranged");
		Varus.setMoveSpeed(330);
		Varus.setHealthInfo(400, 82, 4.5, 0.55);
		Varus.setManaInfo(250, 36, 6.5, 0.5, "Mana");
		Varus.setMagicRes(30, 0);
		Varus.setSpells(champSpells[99]);
		Varus.setAttributes(new int[] {20, 0, 20, 10, 20, 0, 0, 0, 10, 10});
		champions[99] = Varus;
		
		ChampionInfo Vayne = new ChampionInfo();
		Vayne.setNameTitle("Vayne", "the Night Hunter");
		Vayne.setTypes("Marksman", "Assassin");
		Vayne.setInfo(10, 1, 1, 7);
		Vayne.setAttackDam(50, 3.25);
		Vayne.setAttackSpeed(0.658, 3.1);
		Vayne.setArmor(13.3, 3.4);
		Vayne.setRange(550, "Ranged");
		Vayne.setMoveSpeed(330);
		Vayne.setHealthInfo(359, 83, 4.5, 0.55);
		Vayne.setManaInfo(173, 35, 6.3, 0.4, "Mana");
		Vayne.setMagicRes(30, 0);
		Vayne.setSpells(champSpells[100]);
		Vayne.setAttributes(new int[] {10, 20, 10, 20, 0, 0, 0, 0, 0, 20});
		champions[100] = Vayne;
		
		ChampionInfo Veigar = new ChampionInfo();
		Veigar.setNameTitle("Veigar", "the Tiny Master of Evil");
		Veigar.setTypes("Mage", "");
		Veigar.setInfo(2, 2, 10, 6);
		Veigar.setAttackDam(48.3, 2.625);
		Veigar.setAttackSpeed(0.625, 2.24);
		Veigar.setArmor(16.25, 3.75);
		Veigar.setRange(525, "Ranged");
		Veigar.setMoveSpeed(340);
		Veigar.setHealthInfo(355, 82, 4.5, 0.55);
		Veigar.setManaInfo(250, 55, 6.9, 0.6, "Mana");
		Veigar.setMagicRes(30, 0);
		Veigar.setSpells(champSpells[101]);
		Veigar.setAttributes(new int[] {10, 10, 10, 20, 10, 0, 20, 0, 0, 20});
		champions[101] = Veigar;
		
		ChampionInfo Velkoz = new ChampionInfo();
		Velkoz.setNameTitle("Vel'koz", "the Eye of the Void");
		Velkoz.setTypes("Mage", "");
		Velkoz.setInfo(2, 2, 10, 8);
		Velkoz.setAttackDam(51.66, 3.142);
		Velkoz.setAttackSpeed(0.625, 1.36);
		Velkoz.setArmor(16, 3.5);
		Velkoz.setRange(525, "Ranged");
		Velkoz.setMoveSpeed(340);
		Velkoz.setHealthInfo(380, 76, 4.5, 0.55);
		Velkoz.setManaInfo(250, 45, 7, 0.6, "Mana");
		Velkoz.setMagicRes(30, 0);
		Velkoz.setSpells(champSpells[102]);
		Velkoz.setAttributes(new int[] {10, 10, 20, 10, 20, 0, 0, 0, 10, 10});
		champions[102] = Velkoz;
		
		ChampionInfo Vi = new ChampionInfo();
		Vi.setNameTitle("Vi", "the Piltover Enforcer");
		Vi.setTypes("Fighter", "Assassin");
		Vi.setInfo(8, 5, 3, 5);
		Vi.setAttackDam(50, 3.5);
		Vi.setAttackSpeed(0.644, 2.5);
		Vi.setArmor(20, 3.5);
		Vi.setRange(125, "Melee");
		Vi.setMoveSpeed(350);
		Vi.setHealthInfo(440, 85, 7.5, 0.9);
		Vi.setManaInfo(220, 45, 7, 0.65, "Mana");
		Vi.setMagicRes(30, 1.25);
		Vi.setSpells(champSpells[103]);
		Vi.setAttributes(new int[] {20, 0, 0, 20, 10, 0, 0, 0, 10, 10});
		champions[103] = Vi;
		
		ChampionInfo Viktor = new ChampionInfo();
		Viktor.setNameTitle("Viktor", "the Machine Herald");
		Viktor.setTypes("Mage", "");
		Viktor.setInfo(2, 5, 9, 9);
		Viktor.setAttackDam(49, 3);
		Viktor.setAttackSpeed(0.625, 2.11);
		Viktor.setArmor(16, 4);
		Viktor.setRange(525, "Ranged");
		Viktor.setMoveSpeed(335);
		Viktor.setHealthInfo(385, 78, 6.75, 0.65);
		Viktor.setManaInfo(240, 50, 6.9, 0.45, "Mana");
		Viktor.setMagicRes(30, 0);
		Viktor.setSpells(champSpells[104]);
		Viktor.setAttributes(new int[] {0, 10, 20, 20, 20, 0, 0, 0, 10, 10});
		champions[104] = Viktor;
		
		ChampionInfo Vladimir = new ChampionInfo();
		Vladimir.setNameTitle("Vladimir", "the Crimson Reaper");
		Vladimir.setTypes("Mage", "Tank");
		Vladimir.setInfo(2, 6, 8, 2);
		Vladimir.setAttackDam(45, 3);
		Vladimir.setAttackSpeed(0.658, 2);
		Vladimir.setArmor(16, 3.5);
		Vladimir.setRange(450, "Ranged");
		Vladimir.setMoveSpeed(335);
		Vladimir.setHealthInfo(400, 85, 6, 0.6);
		Vladimir.setManaInfo(0, 0, 0, 0, "Health"); // another tricky one
		Vladimir.setMagicRes(30, 0);
		Vladimir.setSpells(champSpells[105]);
		Vladimir.setAttributes(new int[] {0, 10, 10, 0, 20, 0, 0, 0, 10, 10});
		champions[105] = Vladimir;
		
		ChampionInfo Volibear = new ChampionInfo();
		Volibear.setNameTitle("Volibear", "the Thunder's Roar");
		Volibear.setTypes("Fighter", "Tank");
		Volibear.setInfo(7, 7, 4, 2);
		Volibear.setAttackDam(54, 3.3);
		Volibear.setAttackSpeed(0.658, 2.67);
		Volibear.setArmor(20.5, 3.5);
		Volibear.setRange(125, "Melee");
		Volibear.setMoveSpeed(345);
		Volibear.setHealthInfo(440, 86, 7, 0.65);
		Volibear.setManaInfo(220, 30, 7, 0.65, "Mana");
		Volibear.setMagicRes(30, 1.25);
		Volibear.setSpells(champSpells[106]);
		Volibear.setAttributes(new int[] {20, 0, 0, 20, 10, 0, 0, 0, 10, 10});
		champions[106] = Volibear;
		
		ChampionInfo Warwick = new ChampionInfo(); 
		Warwick.setNameTitle("Warwick", "the Blood Hunter");
		Warwick.setTypes("Fighter", "Tank");
		Warwick.setInfo(7, 4, 4, 2);
		Warwick.setAttackDam(56.76, 3.375);
		Warwick.setAttackSpeed(0.679, 2.88);
		Warwick.setArmor(20, 3.5);
		Warwick.setRange(125, "Melee");
		Warwick.setMoveSpeed(345);
		Warwick.setHealthInfo(428, 98, 7.05, 0.8);
		Warwick.setManaInfo(190, 30, 7.1, 0.6, "Mana");
		Warwick.setMagicRes(30, 1.25);
		Warwick.setSpells(champSpells[107]);
		Warwick.setAttributes(new int[] {10, 20, 0, 20, 0, 0, 0, 0, 10, 10});
		champions[107] = Warwick;
		
		ChampionInfo Wukong = new ChampionInfo(); 
		Wukong.setNameTitle("Wukong", "the Monkey King");
		Wukong.setTypes("Fighter", "Tank");
		Wukong.setInfo(8, 5, 2, 3);
		Wukong.setAttackDam(54.5, 3.2);
		Wukong.setAttackSpeed(0.658, 3);
		Wukong.setArmor(19, 3.5);
		Wukong.setRange(175, ""); // no range type
		Wukong.setMoveSpeed(345);
		Wukong.setHealthInfo(435, 85, 5.1, 0.65);
		Wukong.setManaInfo(202, 38, 6.95, 0.65, "Mana");
		Wukong.setMagicRes(30, 1.25);
		Wukong.setSpells(champSpells[108]);
		Wukong.setAttributes(new int[] {20, 10, 0, 20, 20, 0, 0, 0, 10, 10});
		champions[108] = Wukong;
		
		ChampionInfo Xerath = new ChampionInfo(); 
		Xerath.setNameTitle("Xerath", "the Mague Ascendant");
		Xerath.setTypes("Mage", "Assassin");
		Xerath.setInfo(1, 3, 10, 6);
		Xerath.setAttackDam(51.66, 3);
		Xerath.setAttackSpeed(0.625, 1.36);
		Xerath.setArmor(16, 3.5);
		Xerath.setRange(525, "Ranged");
		Xerath.setMoveSpeed(340);
		Xerath.setHealthInfo(380, 80, 4.5, 0.55);
		Xerath.setManaInfo(238, 47, 6, 0.65, "Mana");
		Xerath.setMagicRes(30, 0);
		Xerath.setSpells(champSpells[109]);
		Xerath.setAttributes(new int[] {10, 0, 20, 0, 0, 10, 10, 10, 0, 0});
		champions[109] = Xerath;

		ChampionInfo XinZhao = new ChampionInfo(); 
		XinZhao.setNameTitle("Xin Zhao", "the Seneschal of Demacia");
		XinZhao.setTypes("Fighter", "Assassin");
		XinZhao.setInfo(8, 6, 3, 3);
		XinZhao.setAttackDam(52, 3.3);
		XinZhao.setAttackSpeed(0.672, 2.6);
		XinZhao.setArmor(20, 3.5);
		XinZhao.setRange(175, "");
		XinZhao.setMoveSpeed(345);
		XinZhao.setHealthInfo(445, 87, 7, 0.7);
		XinZhao.setManaInfo(215, 35, 6.5, 0.45, "Mana");
		XinZhao.setMagicRes(30, 1.25);
		XinZhao.setSpells(champSpells[110]);
		XinZhao.setAttributes(new int[] {20, 20, 0, 20, 0, 0, 0, 0, 10, 10});
		champions[110] = XinZhao;
		
		ChampionInfo Yasuo = new ChampionInfo(); 
		Yasuo.setNameTitle("Yasuo", "the Unforgiven");
		Yasuo.setTypes("Fighter", "Assassin");
		Yasuo.setInfo(8, 4, 4, 8);
		Yasuo.setAttackDam(50, 3.2);
		Yasuo.setAttackSpeed(0.658, 3.2);
		Yasuo.setArmor(19, 3.4);
		Yasuo.setRange(175, "Melee");
		Yasuo.setMoveSpeed(350);
		Yasuo.setHealthInfo(430, 82, 5, 0.9);
		Yasuo.setManaInfo(0, 0, 0, 0, "No Resource");
		Yasuo.setMagicRes(30, 0);
		Yasuo.setSpells(champSpells[111]);
		Yasuo.setAttributes(new int[] {20, 20, 20, 20, 20, 20, 0, 0, 10, 10});
		champions[111] = Yasuo;
		
		ChampionInfo Yorick = new ChampionInfo(); 
		Yorick.setNameTitle("Yorick", "the Gravedigger");
		Yorick.setTypes("Fighter", "Mage");
		Yorick.setInfo(6, 6, 6, 3);
		Yorick.setAttackDam(51.7, 3.5);
		Yorick.setAttackSpeed(0.625, 3);
		Yorick.setArmor(19, 3.6);
		Yorick.setRange(125, "");
		Yorick.setMoveSpeed(345);
		Yorick.setHealthInfo(421, 85, 7, 0.7);
		Yorick.setManaInfo(235, 35, 6, 0.45, "Mana");
		Yorick.setMagicRes(30, 1.25);
		Yorick.setSpells(champSpells[112]);
		Yorick.setAttributes(new int[] {10, 20, 20, 0, 10, 0, 0, 20, 20, 10});
		champions[112] = Yorick;
		
		ChampionInfo Zac = new ChampionInfo(); 
		Zac.setNameTitle("Zac", "the Secret Weapon");
		Zac.setTypes("Tank", "Fighter");
		Zac.setInfo(3, 7, 7, 6);
		Zac.setAttackDam(54, 3.375);
		Zac.setAttackSpeed(0.638, 1.6);
		Zac.setArmor(18, 3.5);
		Zac.setRange(125, "Melee");
		Zac.setMoveSpeed(335);
		Zac.setHealthInfo(455, 95, 7, 0.55);
		Zac.setManaInfo(0, 0, 0, 0, "Health");
		Zac.setMagicRes(30, 1.25);
		Zac.setSpells(champSpells[113]);
		Zac.setAttributes(new int[] {20, 10, 0, 20, 20, 20, 0, 20, 10, 10});
		champions[113] = Zac;
		
		ChampionInfo Zed = new ChampionInfo(); 
		Zed.setNameTitle("Zed", "the Master of Shadows");
		Zed.setTypes("Assassin", "Fighter");
		Zed.setInfo(9, 2, 1, 9);
		Zed.setAttackDam(49, 3.4);
		Zed.setAttackSpeed(0.658, 3.1);
		Zed.setArmor(21, 3.5);
		Zed.setRange(125, "Melee");
		Zed.setMoveSpeed(345);
		Zed.setHealthInfo(445, 80, 6, 0.65);
		Zed.setManaInfo(200, 0, 50, 0, "Energy");
		Zed.setMagicRes(30, 1.25);
		Zed.setSpells(champSpells[114]);
		Zed.setAttributes(new int[] {10, 20, 10, 20, 10, 0, 0, 0, 10, 10});
		champions[114] = Zed;
		
		ChampionInfo Ziggs = new ChampionInfo(); 
		Ziggs.setNameTitle("Ziggs", "the Hexplosives Expert");
		Ziggs.setTypes("Mage", "");
		Ziggs.setInfo(2, 4, 9, 6);
		Ziggs.setAttackDam(51, 3.1);
		Ziggs.setAttackSpeed(0.656, 2);
		Ziggs.setArmor(16, 3.3);
		Ziggs.setRange(550, "Ranged");
		Ziggs.setMoveSpeed(330);
		Ziggs.setHealthInfo(390, 80, 5.25, 0.6);
		Ziggs.setManaInfo(250, 50, 6.75, 0.6, "Mana");
		Ziggs.setMagicRes(30, 0);
		Ziggs.setSpells(champSpells[115]);
		Ziggs.setAttributes(new int[] {10, 10, 20, C, 20, 0, 20, 0, 10, 10});
		champions[115] = Ziggs;
		
		ChampionInfo Zilean = new ChampionInfo(); 
		Zilean.setNameTitle("Zilean", "the Chronokeeper");
		Zilean.setTypes("Support", "Mage");
		Zilean.setInfo(2, 5, 8, 4);
		Zilean.setAttackDam(48.6, 3);
		Zilean.setAttackSpeed(0.625, 2.13);
		Zilean.setArmor(10.75, 3.8);
		Zilean.setRange(600, "Ranged");
		Zilean.setMoveSpeed(335);
		Zilean.setHealthInfo(380, 71, 4.6, 0.5);
		Zilean.setManaInfo(260, 60, 6.95, 0.65, "Mana");
		Zilean.setMagicRes(30, 0);
		Zilean.setSpells(champSpells[116]);
		Zilean.setAttributes(new int[] {10, 10, 10, 20, 10, 0, 0, 20, 10, 10});
		champions[116] = Zilean;
		
		ChampionInfo Zyra = new ChampionInfo(); 
		Zyra.setNameTitle("Zyra", "Rise of the Thorns");
		Zyra.setTypes("Mage", "Support");
		Zyra.setInfo(4, 3, 8, 7);
		Zyra.setAttackDam(50, 3.2);
		Zyra.setAttackSpeed(0.625, 2.11);
		Zyra.setArmor(15, 3);
		Zyra.setRange(575, "Ranged");
		Zyra.setMoveSpeed(325);
		Zyra.setHealthInfo(355, 74, 4.85, 0.5);
		Zyra.setManaInfo(250, 50, 7.1, 0.75, "Mana");
		Zyra.setMagicRes(30,0);
		Zyra.setSpells(champSpells[117]);
		Zyra.setAttributes(new int[] {10, 20, 10, 20, 20, 0, 0, 0, 10, 10});
		champions[117] = Zyra;
		*/
	}

	public ChampionInfo[] getChampList()
	{
		return champions;
	}

}
