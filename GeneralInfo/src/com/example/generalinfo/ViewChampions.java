package com.example.generalinfo;


import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.os.Build;

public class ViewChampions extends ActionBarActivity {

	 
     
     @Override
     protected void onCreate(Bundle savedInstanceState) {
             super.onCreate(savedInstanceState);
             setContentView(R.layout.activity_viewchampions);
             
             
             //final TextView display1 = (TextView)findViewById(R.id.textView1);
             int i = 0;
             
             Intent intent = getIntent();
             String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
     			//display1.setText(message);
             
             ImageView icon = (ImageView) findViewById(R.id.icon);
             ImageView spell0 = (ImageView) findViewById(R.id.spell0);
             ImageView spell1 = (ImageView) findViewById(R.id.spell1);
             ImageView spell2 = (ImageView) findViewById(R.id.spell2);
             ImageView spell3 = (ImageView) findViewById(R.id.spell3);
             ImageView spell4 = (ImageView) findViewById(R.id.spell4);



             
     			ChampionDatabase champs = new ChampionDatabase();
     			if(message.equals("Aatrox")){
                    i = 0;
     			}else if(message.equals("Ahri")){
                    i = 1;
            	}else if(message.equals("Akali")){
                    i = 2;
            	}else if(message.equals("Alistar")){
            		i = 3;
            	}else if(message.equals("Amumu")){
            		i = 4;
            	}else if(message.equals("Anivia")){
            		i = 5;
            	}else if(message.equals("Annie")){
            		i = 6;
            	}else if(message.equals("Ashe")){
                    i = 7;
            	}else if(message.equals("Blitzcrank")){
                    i = 8;
            	}else if(message.equals("Brand")){
                    i = 9;
            	}else if(message.equals("Caitlyn")){
            		i = 10;
            	}else if(message.equals("Cassiopeia")){
            		i = 11;
            	}else if(message.equals("Cho Gath")){
            		i = 12;
            	}else if(message.equals("Corki")){
            		i = 13;
            	}else if(message.equals("Darius")){
            		i = 14;
            	}else{
            		i=117;
            	}
			     				
     			switch(i){
     			case 0: icon.setImageResource(R.drawable.aatrox);
     					spell0.setImageResource(R.drawable.aatrox0);
     					spell1.setImageResource(R.drawable.aatrox1);
     					spell2.setImageResource(R.drawable.aatrox2);
     					spell3.setImageResource(R.drawable.aatrox4);
     					spell4.setImageResource(R.drawable.aatrox5);
     					break;
     			case 1: icon.setImageResource(R.drawable.ahri);
     					spell0.setImageResource(R.drawable.ahri0);
						spell1.setImageResource(R.drawable.ahri1);
						spell2.setImageResource(R.drawable.ahri2);
						spell3.setImageResource(R.drawable.ahri3);
						spell4.setImageResource(R.drawable.ahri4);
						break;
     			case 2: icon.setImageResource(R.drawable.akali);
     					spell0.setImageResource(R.drawable.akali0);
						spell1.setImageResource(R.drawable.akali1);
						spell2.setImageResource(R.drawable.akali2);
						spell3.setImageResource(R.drawable.akali3);
						spell4.setImageResource(R.drawable.akali4);
						break;
     			case 3: icon.setImageResource(R.drawable.alistar);
						spell0.setImageResource(R.drawable.alistar0);
						spell1.setImageResource(R.drawable.alistar1);
						spell2.setImageResource(R.drawable.alistar2);
						spell3.setImageResource(R.drawable.alistar3);
						spell4.setImageResource(R.drawable.alistar4);
						break;
     			case 4: icon.setImageResource(R.drawable.amumu);
     					spell0.setImageResource(R.drawable.amumu0);
     					spell1.setImageResource(R.drawable.amumu1);
     					spell2.setImageResource(R.drawable.amumu2);
     					spell3.setImageResource(R.drawable.amumu3);
     					spell4.setImageResource(R.drawable.amumu4);
     					break;
     			case 5: icon.setImageResource(R.drawable.anivia);
     					spell0.setImageResource(R.drawable.anivia0);
     					spell1.setImageResource(R.drawable.anivia1);
     					spell2.setImageResource(R.drawable.anivia2);
     					spell3.setImageResource(R.drawable.anivia3);
     					spell4.setImageResource(R.drawable.anivia4);
     					break;
     			case 6: icon.setImageResource(R.drawable.annie);
     					spell0.setImageResource(R.drawable.annie0);
     					spell1.setImageResource(R.drawable.annie1);
     					spell2.setImageResource(R.drawable.annie2);
     					spell3.setImageResource(R.drawable.annie3);
     					spell4.setImageResource(R.drawable.annie4);
     					break;
     			case 7: icon.setImageResource(R.drawable.ashe);
     					spell0.setImageResource(R.drawable.ashe0);
     					spell1.setImageResource(R.drawable.ashe1);
     					spell2.setImageResource(R.drawable.ashe2);
     					spell3.setImageResource(R.drawable.ashe3);
     					spell4.setImageResource(R.drawable.ashe4);
     					break;
     			case 8: icon.setImageResource(R.drawable.blitzcrank);
     					spell0.setImageResource(R.drawable.blitzcrank0);
     					spell1.setImageResource(R.drawable.blitzcrank1);
     					spell2.setImageResource(R.drawable.blitzcrank2);
     					spell3.setImageResource(R.drawable.blitzcrank3);
     					spell4.setImageResource(R.drawable.blitzcrank4);
     					break;
     			case 9: icon.setImageResource(R.drawable.brand);
     					spell0.setImageResource(R.drawable.brand0);
     					spell1.setImageResource(R.drawable.brand1);
     					spell2.setImageResource(R.drawable.brand2);
     					spell3.setImageResource(R.drawable.brand3);
     					spell4.setImageResource(R.drawable.brand4);
     					break;
     			case 10: icon.setImageResource(R.drawable.caitlyn);
     					spell0.setImageResource(R.drawable.caitlyn0);
     					spell1.setImageResource(R.drawable.caitlyn1);
     					spell2.setImageResource(R.drawable.caitlyn2);
     					spell3.setImageResource(R.drawable.caitlyn3);
     					spell4.setImageResource(R.drawable.caitlyn4);
     					break;
     			case 11: icon.setImageResource(R.drawable.cassiopeia);
     					spell0.setImageResource(R.drawable.cassiopeia0);
     					spell1.setImageResource(R.drawable.cassiopeia1);
     					spell2.setImageResource(R.drawable.cassiopeia2);
     					spell3.setImageResource(R.drawable.cassiopeia3);
     					spell4.setImageResource(R.drawable.cassiopeia4);
     					break;
     			case 12: icon.setImageResource(R.drawable.chogath);
     					spell0.setImageResource(R.drawable.chogath0);
     					spell1.setImageResource(R.drawable.chogath1);
     					spell2.setImageResource(R.drawable.chogath2);
     					spell3.setImageResource(R.drawable.chogath3);
     					spell4.setImageResource(R.drawable.chogath4);
     					break;
     			case 13: icon.setImageResource(R.drawable.corki);
     					spell0.setImageResource(R.drawable.corki0);
						spell1.setImageResource(R.drawable.corki1);
						spell2.setImageResource(R.drawable.corki2);
						spell3.setImageResource(R.drawable.corki3);
						spell4.setImageResource(R.drawable.corki4);
						break;
     			case 14: icon.setImageResource(R.drawable.darius);
     					spell0.setImageResource(R.drawable.darius0);
     					spell1.setImageResource(R.drawable.darius1);
     					spell2.setImageResource(R.drawable.darius2);
     					spell3.setImageResource(R.drawable.darius3);
     					spell4.setImageResource(R.drawable.darius4);
     					break;
     			
				
				
				default: break;
     			}

     			// Name, Title, and Roles
     			String name = champs.getChampList()[i].getName();
     			String title = champs.getChampList()[i].getTitle();
     			String primary = champs.getChampList()[i].getPrimary();
     			String secondary = champs.getChampList()[i].getSecondary();

     			//Stats
     			double armor = champs.getChampList()[i].getArmor();
     			double attackDam = champs.getChampList()[i].getAttackDam();
     			double attackSpeed = champs.getChampList()[i].getAttackSpeed();
     			double range = champs.getChampList()[i].getRange();
     			String rangeType = champs.getChampList()[i].getRangeType();
     			double health = champs.getChampList()[i].getHealth();
     			double healthRegen = champs.getChampList()[i].getHealthRegen();
     			double movespeed = champs.getChampList()[i].getMoveSpeed();
     			double mana = champs.getChampList()[i].getMana();
     			double manaRegen = champs.getChampList()[i].getManaRegen();
     			double magicRes = champs.getChampList()[i].getMagicRes();

     			//Per Level Stats
     			double armorPerLevel = champs.getChampList()[i].getArmorPerLevel();
     			double attackDamPerLevel = champs.getChampList()[i].getAttackDamPerLevel();
     			double attackSpeedPerLevel = champs.getChampList()[i].getAttackSpeedPerLevel();
     			double healthPerLevel = champs.getChampList()[i].getHealthPerLevel();
     			double healthRegenPerLevel = champs.getChampList()[i].getHealthRegenPerLevel();
     			String typeOfMana = champs.getChampList()[i].getTypeOfMana(); //could be energy or mana
     			double manaPerLevel = champs.getChampList()[i].getManaPerLevel();
     			double manaRegenPerLevel = champs.getChampList()[i].getManaRegenPerLevel();
     			double magicResPerLevel = champs.getChampList()[i].getMagicResPerLevel();

     			// Skill Rankings
     			int attack = champs.getChampList()[i].getAttack();
     			int defense = champs.getChampList()[i].getDefense();
     			int difficulty = champs.getChampList()[i].getDifficulty();
     			int magicAbility = champs.getChampList()[i].getMagicOrAbility();

     			/*
     			//Spells
     			//Have yet to figure out the correct way to implement these on the champion screen
     			//spell #'s vary from champion to champion and spell info varies a lot too
     			//may need to create separate spell details page?
     			SpellInfo[] spells = new SpellInfo [champs.getChampList()[i].getSpells().length];
     			for(int j = 0; j < spells.length; j++)
     			{
     				spells[j] = champs.getChampList()[i].getSpells()[j];
     			}
     			*/
     			/*
     			//Attributes
     			//These are a part of the Champion, but are unneeded for this page
     			int[] attributes = new int[champs.getChampList()[i].getAttributes().length];
     			for(int j = 0; j < attributes.length; j++)
     			{
     				attributes[j] = champs.getChampList()[i].getAttributes()[j];
     			}
     			*/
     			
     			
     			TextView nameText = (TextView)findViewById(R.id.nameDis);
     			nameText.setText(name);
     			TextView titleText = (TextView)findViewById(R.id.titleDis);
     			TextView primaryText = (TextView)findViewById(R.id.primaryDis);
     			TextView secondaryText = (TextView)findViewById(R.id.secondaryDis);
     			
     			TextView attackText = (TextView)findViewById(R.id.attackDis);
     			TextView defenseText = (TextView)findViewById(R.id.defenseDis);
     			TextView difficultyText = (TextView)findViewById(R.id.difficultyDis);
     			TextView magicAbilityText = (TextView)findViewById(R.id.magicAbilityDis);
     			
     			TextView healthText = (TextView)findViewById(R.id.healthDis);
     			TextView healthRegenText = (TextView)findViewById(R.id.healthRegenDis);
     			TextView manaText = (TextView)findViewById(R.id.manaDis);
     			TextView manaRegenText = (TextView)findViewById(R.id.manaRegenDis);
     			TextView rangeText = (TextView)findViewById(R.id.rangeDis);
     			TextView attackDamText = (TextView)findViewById(R.id.attackDamDis);
     			TextView attackSpeedText = (TextView)findViewById(R.id.attackSpeedDis);
     			TextView armorText = (TextView)findViewById(R.id.armorDis);
     			TextView magicResText = (TextView)findViewById(R.id.magicResDis);
     			TextView movespeedText = (TextView)findViewById(R.id.movespeedDis);
     		
     			//Need to figure out way to display all spell info
     			//TextView spellsText = (TextView)findViewById(R.id.spellsDis);
     			
     			


     			//Setting Text for TextViews
     			
     			titleText.setText(title);
     			
     			primaryText.setText("Primary: " + primary);
     			
     			if(secondary.equals(""))
     			{
     				secondaryText.setText("");
     			}
     			else
     			{
     				secondaryText.setText("Secondary: " + secondary);
     			}
     			
     			attackText.setText("Attack Power: " + attack);
     			defenseText.setText("Defense Power: " + defense);
     			difficultyText.setText("Difficulty: " + difficulty);
     			magicAbilityText.setText("Ability Power: " + magicAbility);
     			
     			healthText.setText("Health: " + health + "(+" + healthPerLevel + ")");
     			healthRegenText.setText("Health Regen.: " + healthRegen + "(+" + healthRegenPerLevel + ")");
     			
     			if(typeOfMana.equals("No Resource") || typeOfMana.equals("Uses Health"))
     			{
     				manaText.setText(typeOfMana);
     				manaRegenText.setText("");		
     			}
     			else if(typeOfMana.equals("Fury") || typeOfMana.equals("Ferocity"))
     			{
     				manaText.setText(typeOfMana + ": " + mana);
     				manaRegenText.setText("");		
     			}
     			else
     			{
     				manaText.setText(typeOfMana + ": " + mana + "(+" + manaPerLevel + ")");
     				manaRegenText.setText(typeOfMana +" Regen.: " + manaRegen + "(+" + manaRegenPerLevel + ")");		
     			}
     			
     			
     			if(rangeType.equals(""))
     			{
     				rangeText.setText("Range: " + range);
     			}
     			else
     			{
     				rangeText.setText("Range: " + range + "(" + rangeType + ")");
     			}
     			
     			
     			attackDamText.setText("Attack Damage: " + attackDam + "(+" + attackDamPerLevel + ")");
     			attackSpeedText.setText("Attack Speed: " + attackSpeed + "(+" + attackSpeedPerLevel + ")");
     			armorText.setText("Armor: " + armor + "(+"+ armorPerLevel + ")");
     			magicResText.setText("Magic Res.: " + magicRes + "(+" + magicResPerLevel + ")");
     			movespeedText.setText("Move Speed: " + movespeed);
     			
             
     }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	

}
