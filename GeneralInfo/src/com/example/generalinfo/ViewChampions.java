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
            	}else if(message.equals("Diana")){
            		i = 15;
            	}else if(message.equals("Dr. Mundo")){
            		i = 16;
            	}else if(message.equals("Draven")){
            		i = 17;
            	}else if(message.equals("Elise")){
            		i = 18;
            	}else if(message.equals("Evelynn")){
            		i = 19;
            	}else if(message.equals("Ezreal")){
            		i = 20;
            	}else if(message.equals("Fiddlesticks")){
            		i = 21;
            	}else if(message.equals("Fiora")){
            		i = 22;
            	}else if(message.equals("Fizz")){
            		i = 23;
            	}else if(message.equals("Galio")){
            		i = 24;
            	}else if(message.equals("Gangplank")){
            		i = 25;
            	}else if(message.equals("Garen")){
            		i = 26;
            	}else if(message.equals("Gragas")){
            		i = 27;
            	}else if(message.equals("Graves")){
            		i = 28;
            	}else if(message.equals("Hecarim")){
            		i = 29;
            	}else if(message.equals("Heimerdinger")){
            		i = 30;
            	}else if(message.equals("Irelia")){
            		i = 31;
            	}else if(message.equals("Janna")){
            		i = 32;
            	}else if(message.equals("Jarvan IV")){
            		i = 33;
            	}else if(message.equals("Jax")){
            		i = 34;
            	}else if(message.equals("Jayce")){
            		i = 35;
            	}else if(message.equals("Jinx")){
            		i = 36;
            	}else if(message.equals("Karma")){
            		i = 37;
            	}else if(message.equals("Karthus")){
            		i = 38;
            	}else if(message.equals("Kassadin")){
            		i = 39;
            	}else if(message.equals("Katarina")){
            		i = 40;
            	}else if(message.equals("Kayle")){
            		i = 41;
            	}else if(message.equals("Kennen")){
            		i = 42;
            	}else if(message.equals("Kha'Zix")){
            		i = 43;
            	}else if(message.equals("Kog'Maw")){
            		i = 44;
            	}else if(message.equals("LeBlanc")){
            		i = 45;
            	}else if(message.equals("Lee Sin")){
            		i = 46;
            	}else if(message.equals("Leona")){
            		i = 47;
            	}else if(message.equals("Lissandra")){
            		i = 48;
            	}else if(message.equals("Lucian")){
            		i = 49;
            	}else if(message.equals("Lulu")){
            		i = 50;
            	}else if(message.equals("Lux")){
            		i = 51;
            	}else if(message.equals("Malphite")){
            		i = 52;
            	}else if(message.equals("Malzahar")){
            		i = 53;
            	}else if(message.equals("Maokai")){
            		i = 54;
            	}else if(message.equals("Master Yi")){
            		i = 55;
            	}else if(message.equals("Miss Fortune")){
            		i = 56;
            	}else if(message.equals("Mordekaiser")){
            		i = 57;
            	}else if(message.equals("Morgana")){
            		i = 58;
            	}else if(message.equals("Nami")){
            		i = 59;
            	}else if(message.equals("Nasus")){
            		i = 60;
            	}else if(message.equals("Nautilus")){
            		i = 61;
            	}else if(message.equals("Nidalee")){
            		i = 62;
            	}else if(message.equals("Nocturne")){
            		i = 63;
            	}else if(message.equals("Nunu")){
            		i = 64;
            	}else if(message.equals("Olaf")){
            		i = 65;
            	}else if(message.equals("Orianna")){
            		i = 66;
            	}else if(message.equals("Pantheon")){
            		i = 67;
            	}else if(message.equals("Poppy")){
            		i = 68;
            	}else if(message.equals("Quinn")){
            		i = 69;
            	}else if(message.equals("Rammus")){
            		i = 70;
            	}else if(message.equals("Renekton")){
            		i = 71;
            	}else if(message.equals("Rengar")){
            		i = 72;
            	}else if(message.equals("Riven")){
            		i = 73;
            	}else if(message.equals("Rumble")){
            		i = 74;
            	}else if(message.equals("Ryze")){
            		i = 75;
            	}else if(message.equals("Sejuani")){
            		i = 76;
            	}else if(message.equals("Shaco")){
            		i = 77;
            	}else if(message.equals("Shen")){
            		i = 78;
            	}else if(message.equals("Shyvana")){
            		i = 79;
            	}else if(message.equals("Singed")){
            		i = 80;
            	}else if(message.equals("Sion")){
            		i = 81;
            	}else if(message.equals("Sivir")){
            		i = 82;
            	}else if(message.equals("Skarner")){
            		i = 83;
            	}else if(message.equals("Sona")){
            		i = 84;
            	}else if(message.equals("Soraka")){
            		i = 85;
            	}else if(message.equals("Swain")){
            		i = 86;
            	}else if(message.equals("Syndra")){
            		i = 87;
            	}else if(message.equals("Talon")){
            		i = 88;
            	}else if(message.equals("Taric")){
            		i = 89;
            	}else if(message.equals("Teemo")){
            		i = 90;
            	}else if(message.equals("Thresh")){
            		i = 91;
            	}else if(message.equals("Tristana")){
            		i = 92;
            	}else if(message.equals("Trundle")){
            		i = 93;
            	}else if(message.equals("Tryndamere")){
            		i = 94;
            	}else if(message.equals("Twisted Fate")){
            		i = 95;
            	}else if(message.equals("Twitch")){
            		i = 96;
            	}else if(message.equals("Udyr")){
            		i = 97;
            	}else if(message.equals("Urgot")){
            		i = 98;
            	}else if(message.equals("Varus")){
            		i = 99;
            	}else if(message.equals("Vayne")){
            		i = 100;
            	}else if(message.equals("Veigar")){
            		i = 101;
            	}else if(message.equals("Vel'Koz")){
            		i = 102;
            	}else if(message.equals("Vi")){
            		i = 103;
            	}else if(message.equals("Viktor")){
            		i = 104;
            	}else if(message.equals("Vladimir")){
            		i = 105;
            	}else if(message.equals("Volibear")){
            		i = 106;
            	}else if(message.equals("Warwick")){
            		i = 107;
            	}else if(message.equals("Wukong")){
            		i = 108;
            	}else if(message.equals("Xerath")){
            		i = 109;
            	}else if(message.equals("Xin Zhao")){
            		i = 110;
            	}else if(message.equals("Yasuo")){
            		i = 111;
            	}else if(message.equals("Yorick")){
            		i = 112;
            	}else if(message.equals("Zac")){
            		i = 113;
            	}else if(message.equals("Zed")){
            		i = 114;
            	}else if(message.equals("Ziggs")){
            		i = 115;
            	}else if(message.equals("Zilean")){
            		i = 116;
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
						
     			case 14: icon.setImageResource(R.drawable.darius);
     					spell0.setImageResource(R.drawable.darius0);
     					spell1.setImageResource(R.drawable.darius1);
     					spell2.setImageResource(R.drawable.darius2);
     					spell3.setImageResource(R.drawable.darius3);
     					spell4.setImageResource(R.drawable.darius4);
     					break;						
     			case 15: icon.setImageResource(R.drawable.diana);
						spell0.setImageResource(R.drawable.diana0);
						spell1.setImageResource(R.drawable.diana1);
						spell2.setImageResource(R.drawable.diana2);
						spell3.setImageResource(R.drawable.diana3);
						spell4.setImageResource(R.drawable.diana4);
						break;						
     			case 16: icon.setImageResource(R.drawable.drmundo);
						spell0.setImageResource(R.drawable.drmundo0);
						spell1.setImageResource(R.drawable.drmundo1);
						spell2.setImageResource(R.drawable.drmundo2);
						spell3.setImageResource(R.drawable.drmundo3);
						spell4.setImageResource(R.drawable.drmundo4);
						break;						
     			case 17: icon.setImageResource(R.drawable.draven);
						spell0.setImageResource(R.drawable.draven0);
						spell1.setImageResource(R.drawable.draven1);
						spell2.setImageResource(R.drawable.draven2);
						spell3.setImageResource(R.drawable.draven3);
						spell4.setImageResource(R.drawable.draven4);
						break;						
     			case 18: icon.setImageResource(R.drawable.elise);
						spell0.setImageResource(R.drawable.elise0);
						spell1.setImageResource(R.drawable.elise1);
						spell2.setImageResource(R.drawable.elise2);
						spell3.setImageResource(R.drawable.elise3);
						spell4.setImageResource(R.drawable.elise4);
						break;						
     			case 19: icon.setImageResource(R.drawable.evelynn);
						spell0.setImageResource(R.drawable.evelynn0);
						spell1.setImageResource(R.drawable.evelynn1);
						spell2.setImageResource(R.drawable.evelynn2);
						spell3.setImageResource(R.drawable.evelynn3);
						spell4.setImageResource(R.drawable.evelynn4);
						break;						
     			case 20: icon.setImageResource(R.drawable.ezreal);
						spell0.setImageResource(R.drawable.ezreal0);
						spell1.setImageResource(R.drawable.ezreal1);
						spell2.setImageResource(R.drawable.ezreal2);
						spell3.setImageResource(R.drawable.ezreal3);
						spell4.setImageResource(R.drawable.ezreal4);
						break;						
     			case 21: icon.setImageResource(R.drawable.fiddlesticks);
						spell0.setImageResource(R.drawable.fiddlesticks0);
						spell1.setImageResource(R.drawable.fiddlesticks1);
						spell2.setImageResource(R.drawable.fiddlesticks2);
						spell3.setImageResource(R.drawable.fiddlesticks3);
						spell4.setImageResource(R.drawable.fiddlesticks4);
						break;						
     			case 22: icon.setImageResource(R.drawable.fiora);
						spell0.setImageResource(R.drawable.fiora0);
						spell1.setImageResource(R.drawable.fiora1);
						spell2.setImageResource(R.drawable.fiora2);
						spell3.setImageResource(R.drawable.fiora3);
						spell4.setImageResource(R.drawable.fiora4);
						break;						
     			case 23: icon.setImageResource(R.drawable.fizz);
						spell0.setImageResource(R.drawable.fizz0);
						spell1.setImageResource(R.drawable.fizz1);
						spell2.setImageResource(R.drawable.fizz2);
						spell3.setImageResource(R.drawable.fizz3);
						spell4.setImageResource(R.drawable.fizz4);
						break;						
     			case 24: icon.setImageResource(R.drawable.galio);
						spell0.setImageResource(R.drawable.galio0);
						spell1.setImageResource(R.drawable.galio1);
						spell2.setImageResource(R.drawable.galio2);
						spell3.setImageResource(R.drawable.galio3);
						spell4.setImageResource(R.drawable.galio4);
						break;						
     			case 25: icon.setImageResource(R.drawable.gangplank);
						spell0.setImageResource(R.drawable.gangplank0);
						spell1.setImageResource(R.drawable.gangplank1);
						spell2.setImageResource(R.drawable.gangplank2);
						spell3.setImageResource(R.drawable.gangplank3);
						spell4.setImageResource(R.drawable.gangplank4);
						break;						
     			case 26: icon.setImageResource(R.drawable.garen);
						spell0.setImageResource(R.drawable.garen0);
						spell1.setImageResource(R.drawable.garen1);
						spell2.setImageResource(R.drawable.garen2);
						spell3.setImageResource(R.drawable.garen3);
						spell4.setImageResource(R.drawable.garen4);
						break;						
     			case 27: icon.setImageResource(R.drawable.gragas);
						spell0.setImageResource(R.drawable.gragas0);
						spell1.setImageResource(R.drawable.gragas1);
						spell2.setImageResource(R.drawable.gragas2);
						spell3.setImageResource(R.drawable.gragas3);
						spell4.setImageResource(R.drawable.gragas4);
						break;						
     			case 28: icon.setImageResource(R.drawable.graves);
						spell0.setImageResource(R.drawable.graves0);
						spell1.setImageResource(R.drawable.graves1);
						spell2.setImageResource(R.drawable.graves2);
						spell3.setImageResource(R.drawable.graves3);
						spell4.setImageResource(R.drawable.graves4);
						break;						
     			case 29: icon.setImageResource(R.drawable.hecarim);
						spell0.setImageResource(R.drawable.hecarim0);
						spell1.setImageResource(R.drawable.hecarim1);
						spell2.setImageResource(R.drawable.hecarim2);
						spell3.setImageResource(R.drawable.hecarim3);
						spell4.setImageResource(R.drawable.hecarim4);
						break;						
     			case 30: icon.setImageResource(R.drawable.heimerdinger);
						spell0.setImageResource(R.drawable.heimerdinger0);
						spell1.setImageResource(R.drawable.heimerdinger1);
						spell2.setImageResource(R.drawable.heimerdinger2);
						spell3.setImageResource(R.drawable.heimerdinger3);
						spell4.setImageResource(R.drawable.heimerdinger4);
						break;						
     			case 31: icon.setImageResource(R.drawable.irelia);
						spell0.setImageResource(R.drawable.irelia0);
						spell1.setImageResource(R.drawable.irelia1);
						spell2.setImageResource(R.drawable.irelia2);
						spell3.setImageResource(R.drawable.irelia3);
						spell4.setImageResource(R.drawable.irelia4);
						break;						
     			case 32: icon.setImageResource(R.drawable.janna);
						spell0.setImageResource(R.drawable.janna0);
						spell1.setImageResource(R.drawable.janna1);
						spell2.setImageResource(R.drawable.janna2);
						spell3.setImageResource(R.drawable.janna3);
						spell4.setImageResource(R.drawable.janna4);
						break;						
     			case 33: icon.setImageResource(R.drawable.jarvaniv);
						spell0.setImageResource(R.drawable.jarvaniv0);
						spell1.setImageResource(R.drawable.jarvaniv1);
						spell2.setImageResource(R.drawable.jarvaniv2);
						spell3.setImageResource(R.drawable.jarvaniv3);
						spell4.setImageResource(R.drawable.jarvaniv4);
						break;						
     			case 34: icon.setImageResource(R.drawable.jax);
						spell0.setImageResource(R.drawable.jax0);
						spell1.setImageResource(R.drawable.jax1);
						spell2.setImageResource(R.drawable.jax2);
						spell3.setImageResource(R.drawable.jax3);
						spell4.setImageResource(R.drawable.jax4);
						break;						
     			case 35: icon.setImageResource(R.drawable.jayce);
						spell0.setImageResource(R.drawable.jayce0);
						spell1.setImageResource(R.drawable.jayce1);
						spell2.setImageResource(R.drawable.jayce2);
						spell3.setImageResource(R.drawable.jayce3);
						spell4.setImageResource(R.drawable.jayce4);
						break;						
     			case 36: icon.setImageResource(R.drawable.jinx);
						spell0.setImageResource(R.drawable.jinx0);
						spell1.setImageResource(R.drawable.jinx1);
						spell2.setImageResource(R.drawable.jinx2);
						spell3.setImageResource(R.drawable.jinx3);
						spell4.setImageResource(R.drawable.jinx4);
						break;						
     			case 37: icon.setImageResource(R.drawable.karma);
						spell0.setImageResource(R.drawable.karma0);
						spell1.setImageResource(R.drawable.karma1);
						spell2.setImageResource(R.drawable.karma2);
						spell3.setImageResource(R.drawable.karma3);
						spell4.setImageResource(R.drawable.karma4);
						break;
     			case 38: icon.setImageResource(R.drawable.karthus);
						spell0.setImageResource(R.drawable.karthus0);
						spell1.setImageResource(R.drawable.karthus1);
						spell2.setImageResource(R.drawable.karthus2);
						spell3.setImageResource(R.drawable.karthus3);
						spell4.setImageResource(R.drawable.karthus4);
						break;
     			case 39: icon.setImageResource(R.drawable.kassadin);
						spell0.setImageResource(R.drawable.kassadin0);
						spell1.setImageResource(R.drawable.kassadin1);
						spell2.setImageResource(R.drawable.kassadin2);
						spell3.setImageResource(R.drawable.kassadin3);
						spell4.setImageResource(R.drawable.kassadin4);
						break;     	
     			case 40: icon.setImageResource(R.drawable.katarina);
						spell0.setImageResource(R.drawable.katarina0);
						spell1.setImageResource(R.drawable.katarina1);
						spell2.setImageResource(R.drawable.katarina2);
						spell3.setImageResource(R.drawable.katarina3);
						spell4.setImageResource(R.drawable.katarina4);
						break;     	
     			case 41: icon.setImageResource(R.drawable.kayle);
						spell0.setImageResource(R.drawable.kayle0);
						spell1.setImageResource(R.drawable.kayle1);
						spell2.setImageResource(R.drawable.kayle2);
						spell3.setImageResource(R.drawable.kayle3);
						spell4.setImageResource(R.drawable.kayle4);
						break;     	
     			case 42: icon.setImageResource(R.drawable.kennen);
						spell0.setImageResource(R.drawable.kennen0);
						spell1.setImageResource(R.drawable.kennen1);
						spell2.setImageResource(R.drawable.kennen2);
						spell3.setImageResource(R.drawable.kennen3);
						spell4.setImageResource(R.drawable.kennen4);
						break;     	
     			case 43: icon.setImageResource(R.drawable.khazix);
						spell0.setImageResource(R.drawable.khazix0);
						spell1.setImageResource(R.drawable.khazix1);
						spell2.setImageResource(R.drawable.khazix2);
						spell3.setImageResource(R.drawable.khazix3);
						spell4.setImageResource(R.drawable.khazix4);
						break;     	
     			case 44: icon.setImageResource(R.drawable.kogmaw);
						spell0.setImageResource(R.drawable.kogmaw0);
						spell1.setImageResource(R.drawable.kogmaw1);
						spell2.setImageResource(R.drawable.kogmaw2);
						spell3.setImageResource(R.drawable.kogmaw3);
						spell4.setImageResource(R.drawable.kogmaw4);
						break;     	
     			case 45: icon.setImageResource(R.drawable.leblanc);
						spell0.setImageResource(R.drawable.leblanc0);
						spell1.setImageResource(R.drawable.leblanc1);
						spell2.setImageResource(R.drawable.leblanc2);
						spell3.setImageResource(R.drawable.leblanc3);
						spell4.setImageResource(R.drawable.leblanc4);
						break;     	
     			case 46: icon.setImageResource(R.drawable.leesin);
						spell0.setImageResource(R.drawable.leesin0);
						spell1.setImageResource(R.drawable.leesin1);
						spell2.setImageResource(R.drawable.leesin2);
						spell3.setImageResource(R.drawable.leesin3);
						spell4.setImageResource(R.drawable.leesin4);
						break;     	
     			case 47: icon.setImageResource(R.drawable.leona);
						spell0.setImageResource(R.drawable.leona0);
						spell1.setImageResource(R.drawable.leona1);
						spell2.setImageResource(R.drawable.leona2);
						spell3.setImageResource(R.drawable.leona3);
						spell4.setImageResource(R.drawable.leona4);
						break;     	
     			case 48: icon.setImageResource(R.drawable.lissandra);
						spell0.setImageResource(R.drawable.lissandra0);
						spell1.setImageResource(R.drawable.lissandra1);
						spell2.setImageResource(R.drawable.lissandra2);
						spell3.setImageResource(R.drawable.lissandra3);
						spell4.setImageResource(R.drawable.lissandra4);
						break;     	
     			case 49: icon.setImageResource(R.drawable.lucian);
						spell0.setImageResource(R.drawable.lucian0);
						spell1.setImageResource(R.drawable.lucian1);
						spell2.setImageResource(R.drawable.lucian2);
						spell3.setImageResource(R.drawable.lucian3);
						spell4.setImageResource(R.drawable.lucian4);
						break;     	
     			case 50: icon.setImageResource(R.drawable.lulu);
						spell0.setImageResource(R.drawable.lulu0);
						spell1.setImageResource(R.drawable.lulu1);
						spell2.setImageResource(R.drawable.lulu2);
						spell3.setImageResource(R.drawable.lulu3);
						spell4.setImageResource(R.drawable.lulu4);
						break;     	
     			case 51: icon.setImageResource(R.drawable.lux);
						spell0.setImageResource(R.drawable.lux0);
						spell1.setImageResource(R.drawable.lux1);
						spell2.setImageResource(R.drawable.lux2);
						spell3.setImageResource(R.drawable.lux3);
						spell4.setImageResource(R.drawable.lux4);
						break;     	
     			case 52: icon.setImageResource(R.drawable.malphite);
						spell0.setImageResource(R.drawable.malphite0);
						spell1.setImageResource(R.drawable.malphite1);
						spell2.setImageResource(R.drawable.malphite2);
						spell3.setImageResource(R.drawable.malphite3);
						spell4.setImageResource(R.drawable.malphite4);
						break;     	
     			case 53: icon.setImageResource(R.drawable.malzahar);
						spell0.setImageResource(R.drawable.malzahar0);
						spell1.setImageResource(R.drawable.malzahar1);
						spell2.setImageResource(R.drawable.malzahar2);
						spell3.setImageResource(R.drawable.malzahar3);
						spell4.setImageResource(R.drawable.malzahar4);
						break;     	
     			case 54: icon.setImageResource(R.drawable.maokai);
						spell0.setImageResource(R.drawable.maokai0);
						spell1.setImageResource(R.drawable.maokai1);
						spell2.setImageResource(R.drawable.maokai2);
						spell3.setImageResource(R.drawable.maokai3);
						spell4.setImageResource(R.drawable.maokai4);
						break;     	
     			case 55: icon.setImageResource(R.drawable.masteryi);
						spell0.setImageResource(R.drawable.masteryi0);
						spell1.setImageResource(R.drawable.masteryi1);
						spell2.setImageResource(R.drawable.masteryi2);
						spell3.setImageResource(R.drawable.masteryi3);
						spell4.setImageResource(R.drawable.masteryi4);
						break;     	
     			case 56: icon.setImageResource(R.drawable.missfortune);
						spell0.setImageResource(R.drawable.missfortune0);
						spell1.setImageResource(R.drawable.missfortune1);
						spell2.setImageResource(R.drawable.missfortune2);
						spell3.setImageResource(R.drawable.missfortune3);
						spell4.setImageResource(R.drawable.missfortune4);
						break;     	
     			case 57: icon.setImageResource(R.drawable.mordekaiser);
						spell0.setImageResource(R.drawable.mordekaiser0);
						spell1.setImageResource(R.drawable.mordekaiser1);
						spell2.setImageResource(R.drawable.mordekaiser2);
						spell3.setImageResource(R.drawable.mordekaiser3);
						spell4.setImageResource(R.drawable.mordekaiser4);
						break;     	
     			case 58: icon.setImageResource(R.drawable.morgana);
						spell0.setImageResource(R.drawable.morgana0);
						spell1.setImageResource(R.drawable.morgana1);
						spell2.setImageResource(R.drawable.morgana2);
						spell3.setImageResource(R.drawable.morgana3);
						spell4.setImageResource(R.drawable.morgana4);
						break;     	
     			case 59: icon.setImageResource(R.drawable.nami);
						spell0.setImageResource(R.drawable.nami0);
						spell1.setImageResource(R.drawable.nami1);
						spell2.setImageResource(R.drawable.nami2);
						spell3.setImageResource(R.drawable.nami3);
						spell4.setImageResource(R.drawable.nami4);
						break;     	
     			case 60: icon.setImageResource(R.drawable.nasus);
						spell0.setImageResource(R.drawable.nasus0);
						spell1.setImageResource(R.drawable.nasus1);
						spell2.setImageResource(R.drawable.nasus2);
						spell3.setImageResource(R.drawable.nasus3);
						spell4.setImageResource(R.drawable.nasus4);
						break;     	
     			case 61: icon.setImageResource(R.drawable.nautilus);
						spell0.setImageResource(R.drawable.nautilus0);
						spell1.setImageResource(R.drawable.nautilus1);
						spell2.setImageResource(R.drawable.nautilus2);
						spell3.setImageResource(R.drawable.nautilus3);
						spell4.setImageResource(R.drawable.nautilus4);
						break;     	
     			case 62: icon.setImageResource(R.drawable.nidalee);
						spell0.setImageResource(R.drawable.nidalee0);
						spell1.setImageResource(R.drawable.nidalee1);
						spell2.setImageResource(R.drawable.nidalee2);
						spell3.setImageResource(R.drawable.nidalee3);
						spell4.setImageResource(R.drawable.nidalee4);
						break;     	
     			case 63: icon.setImageResource(R.drawable.nocturne);
						spell0.setImageResource(R.drawable.nocturne0);
						spell1.setImageResource(R.drawable.nocturne1);
						spell2.setImageResource(R.drawable.nocturne2);
						spell3.setImageResource(R.drawable.nocturne3);
						spell4.setImageResource(R.drawable.nocturne4);
						break;     	
     			case 64: icon.setImageResource(R.drawable.nunu);
						spell0.setImageResource(R.drawable.nunu0);
						spell1.setImageResource(R.drawable.nunu1);
						spell2.setImageResource(R.drawable.nunu2);
						spell3.setImageResource(R.drawable.nunu3);
						spell4.setImageResource(R.drawable.nunu4);
						break;     	
     			case 65: icon.setImageResource(R.drawable.olaf);
						spell0.setImageResource(R.drawable.olaf0);
						spell1.setImageResource(R.drawable.olaf1);
						spell2.setImageResource(R.drawable.olaf2);
						spell3.setImageResource(R.drawable.olaf3);
						spell4.setImageResource(R.drawable.olaf4);
						break;     	
     			case 66: icon.setImageResource(R.drawable.orianna);
						spell0.setImageResource(R.drawable.orianna0);
						spell1.setImageResource(R.drawable.orianna1);
						spell2.setImageResource(R.drawable.orianna2);
						spell3.setImageResource(R.drawable.orianna3);
						spell4.setImageResource(R.drawable.orianna4);
						break;     	
     			case 67: icon.setImageResource(R.drawable.pantheon);
						spell0.setImageResource(R.drawable.pantheon0);
						spell1.setImageResource(R.drawable.pantheon1);
						spell2.setImageResource(R.drawable.pantheon2);
						spell3.setImageResource(R.drawable.pantheon3);
						spell4.setImageResource(R.drawable.pantheon4);
						break;     	
     			case 68: icon.setImageResource(R.drawable.poppy);
						spell0.setImageResource(R.drawable.poppy0);
						spell1.setImageResource(R.drawable.poppy1);
						spell2.setImageResource(R.drawable.poppy2);
						spell3.setImageResource(R.drawable.poppy3);
						spell4.setImageResource(R.drawable.poppy4);
						break;     	
     			case 69: icon.setImageResource(R.drawable.quinn);
						spell0.setImageResource(R.drawable.quinn0);
						spell1.setImageResource(R.drawable.quinn1);
						spell2.setImageResource(R.drawable.quinn2);
						spell3.setImageResource(R.drawable.quinn3);
						spell4.setImageResource(R.drawable.quinn4);
						break;     	
     			case 70: icon.setImageResource(R.drawable.rammus);
						spell0.setImageResource(R.drawable.rammus0);
						spell1.setImageResource(R.drawable.rammus1);
						spell2.setImageResource(R.drawable.rammus2);
						spell3.setImageResource(R.drawable.rammus3);
						spell4.setImageResource(R.drawable.rammus4);
						break;     	
     			case 71: icon.setImageResource(R.drawable.renekton);
						spell0.setImageResource(R.drawable.renekton0);
						spell1.setImageResource(R.drawable.renekton1);
						spell2.setImageResource(R.drawable.renekton2);
						spell3.setImageResource(R.drawable.renekton3);
						spell4.setImageResource(R.drawable.renekton4);
						break;     	
     			case 72: icon.setImageResource(R.drawable.rengar);
						spell0.setImageResource(R.drawable.rengar0);
						spell1.setImageResource(R.drawable.rengar1);
						spell2.setImageResource(R.drawable.rengar2);
						spell3.setImageResource(R.drawable.rengar3);
						spell4.setImageResource(R.drawable.rengar4);
						break;     	
     			case 73: icon.setImageResource(R.drawable.riven);
						spell0.setImageResource(R.drawable.riven0);
						spell1.setImageResource(R.drawable.riven1);
						spell2.setImageResource(R.drawable.riven2);
						spell3.setImageResource(R.drawable.riven3);
						spell4.setImageResource(R.drawable.riven4);
						break;     	
     			case 74: icon.setImageResource(R.drawable.rumble);
						spell0.setImageResource(R.drawable.rumble0);
						spell1.setImageResource(R.drawable.rumble1);
						spell2.setImageResource(R.drawable.rumble2);
						spell3.setImageResource(R.drawable.rumble3);
						spell4.setImageResource(R.drawable.rumble4);
						break;     	
     			case 75: icon.setImageResource(R.drawable.ryze);
						spell0.setImageResource(R.drawable.ryze0);
						spell1.setImageResource(R.drawable.ryze1);
						spell2.setImageResource(R.drawable.ryze2);
						spell3.setImageResource(R.drawable.ryze3);
						spell4.setImageResource(R.drawable.ryze4);
						break;     	
     			case 76: icon.setImageResource(R.drawable.sejuani);
						spell0.setImageResource(R.drawable.sejuani0);
						spell1.setImageResource(R.drawable.sejuani1);
						spell2.setImageResource(R.drawable.sejuani2);
						spell3.setImageResource(R.drawable.sejuani3);
						spell4.setImageResource(R.drawable.sejuani4);
						break;     	
     			case 77: icon.setImageResource(R.drawable.shaco);
						spell0.setImageResource(R.drawable.shaco0);
						spell1.setImageResource(R.drawable.shaco1);
						spell2.setImageResource(R.drawable.shaco2);
						spell3.setImageResource(R.drawable.shaco3);
						spell4.setImageResource(R.drawable.shaco4);
						break; 		
		     			
     			case 78: icon.setImageResource(R.drawable.shen);
						spell0.setImageResource(R.drawable.shen0);
						spell1.setImageResource(R.drawable.shen1);
						spell2.setImageResource(R.drawable.shen2);
						spell3.setImageResource(R.drawable.shen3);
						spell4.setImageResource(R.drawable.shen4);
						break;     			
     			case 79: icon.setImageResource(R.drawable.shyvana);
						spell0.setImageResource(R.drawable.shyvana0);
						spell1.setImageResource(R.drawable.shyvana1);
						spell2.setImageResource(R.drawable.shyvana2);
						spell3.setImageResource(R.drawable.shyvana3);
						spell4.setImageResource(R.drawable.shyvana4);
						break;     			
     			case 80: icon.setImageResource(R.drawable.singed);
						spell0.setImageResource(R.drawable.singed0);
						spell1.setImageResource(R.drawable.singed1);
						spell2.setImageResource(R.drawable.singed2);
						spell3.setImageResource(R.drawable.singed3);
						spell4.setImageResource(R.drawable.singed4);
						break;     			
     			case 81: icon.setImageResource(R.drawable.sion);
						spell0.setImageResource(R.drawable.sion0);
						spell1.setImageResource(R.drawable.sion1);
						spell2.setImageResource(R.drawable.sion2);
						spell3.setImageResource(R.drawable.sion3);
						spell4.setImageResource(R.drawable.sion4);
						break;     			
     			case 82: icon.setImageResource(R.drawable.sivir);
						spell0.setImageResource(R.drawable.sivir0);
						spell1.setImageResource(R.drawable.sivir1);
						spell2.setImageResource(R.drawable.sivir2);
						spell3.setImageResource(R.drawable.sivir3);
						spell4.setImageResource(R.drawable.sivir4);
						break;     			
     			case 83: icon.setImageResource(R.drawable.skarner);
						spell0.setImageResource(R.drawable.skarner0);
						spell1.setImageResource(R.drawable.skarner1);
						spell2.setImageResource(R.drawable.skarner2);
						spell3.setImageResource(R.drawable.skarner3);
						spell4.setImageResource(R.drawable.skarner4);
						break;     			
     			case 84: icon.setImageResource(R.drawable.sona);
						spell0.setImageResource(R.drawable.sona0);
						spell1.setImageResource(R.drawable.sona1);
						spell2.setImageResource(R.drawable.sona2);
						spell3.setImageResource(R.drawable.sona3);
						spell4.setImageResource(R.drawable.sona4);
						break;     			
     			case 85: icon.setImageResource(R.drawable.soraka);
						spell0.setImageResource(R.drawable.soraka0);
						spell1.setImageResource(R.drawable.soraka1);
						spell2.setImageResource(R.drawable.soraka2);
						spell3.setImageResource(R.drawable.soraka3);
						spell4.setImageResource(R.drawable.soraka4);
						break;     			
     			case 86: icon.setImageResource(R.drawable.swain);
						spell0.setImageResource(R.drawable.swain0);
						spell1.setImageResource(R.drawable.swain1);
						spell2.setImageResource(R.drawable.swain2);
						spell3.setImageResource(R.drawable.swain3);
						spell4.setImageResource(R.drawable.swain4);
						break;     			
     			case 87: icon.setImageResource(R.drawable.syndra);
						spell0.setImageResource(R.drawable.syndra0);
						spell1.setImageResource(R.drawable.syndra1);
						spell2.setImageResource(R.drawable.syndra2);
						spell3.setImageResource(R.drawable.syndra3);
						spell4.setImageResource(R.drawable.syndra4);
						break;     			
     			case 88: icon.setImageResource(R.drawable.talon);
						spell0.setImageResource(R.drawable.talon0);
						spell1.setImageResource(R.drawable.talon1);
						spell2.setImageResource(R.drawable.talon2);
						spell3.setImageResource(R.drawable.talon3);
						spell4.setImageResource(R.drawable.talon4);
						break;     			
     			case 89: icon.setImageResource(R.drawable.taric);
						spell0.setImageResource(R.drawable.taric0);
						spell1.setImageResource(R.drawable.taric1);
						spell2.setImageResource(R.drawable.taric2);
						spell3.setImageResource(R.drawable.taric3);
						spell4.setImageResource(R.drawable.taric4);
						break;     			
     			case 90: icon.setImageResource(R.drawable.teemo);
						spell0.setImageResource(R.drawable.teemo0);
						spell1.setImageResource(R.drawable.teemo1);
						spell2.setImageResource(R.drawable.teemo2);
						spell3.setImageResource(R.drawable.teemo3);
						spell4.setImageResource(R.drawable.teemo4);
						break;     			
     			case 91: icon.setImageResource(R.drawable.thresh);
						spell0.setImageResource(R.drawable.thresh0);
						spell1.setImageResource(R.drawable.thresh1);
						spell2.setImageResource(R.drawable.thresh2);
						spell3.setImageResource(R.drawable.thresh3);
						spell4.setImageResource(R.drawable.thresh4);
						break;     			
     			case 92: icon.setImageResource(R.drawable.tristana);
						spell0.setImageResource(R.drawable.tristana0);
						spell1.setImageResource(R.drawable.tristana1);
						spell2.setImageResource(R.drawable.tristana2);
						spell3.setImageResource(R.drawable.tristana3);
						spell4.setImageResource(R.drawable.tristana4);
						break;     			
     			case 93: icon.setImageResource(R.drawable.trundle);
						spell0.setImageResource(R.drawable.trundle0);
						spell1.setImageResource(R.drawable.trundle1);
						spell2.setImageResource(R.drawable.trundle2);
						spell3.setImageResource(R.drawable.trundle3);
						spell4.setImageResource(R.drawable.trundle4);
						break;     			
     			case 94: icon.setImageResource(R.drawable.tryndamere);
						spell0.setImageResource(R.drawable.tryndamere0);
						spell1.setImageResource(R.drawable.tryndamere1);
						spell2.setImageResource(R.drawable.tryndamere2);
						spell3.setImageResource(R.drawable.tryndamere3);
						spell4.setImageResource(R.drawable.tryndamere4);
						break;     			
     			case 95: icon.setImageResource(R.drawable.twistedfate);
						spell0.setImageResource(R.drawable.twistedfate0);
						spell1.setImageResource(R.drawable.twistedfate1);
						spell2.setImageResource(R.drawable.twistedfate2);
						spell3.setImageResource(R.drawable.twistedfate3);
						spell4.setImageResource(R.drawable.twistedfate4);
						break;     			
     			case 96: icon.setImageResource(R.drawable.twitch);
						spell0.setImageResource(R.drawable.twitch0);
						spell1.setImageResource(R.drawable.twitch1);
						spell2.setImageResource(R.drawable.twitch2);
						spell3.setImageResource(R.drawable.twitch3);
						spell4.setImageResource(R.drawable.twitch4);
						break;     			
     			case 97: icon.setImageResource(R.drawable.udyr);
						spell0.setImageResource(R.drawable.udyr0);
						spell1.setImageResource(R.drawable.udyr1);
						spell2.setImageResource(R.drawable.udyr2);
						spell3.setImageResource(R.drawable.udyr3);
						spell4.setImageResource(R.drawable.udyr4);
						break;     			
     			case 98: icon.setImageResource(R.drawable.urgot);
						spell0.setImageResource(R.drawable.urgot0);
						spell1.setImageResource(R.drawable.urgot1);
						spell2.setImageResource(R.drawable.urgot2);
						spell3.setImageResource(R.drawable.urgot3);
						spell4.setImageResource(R.drawable.urgot4);
						break;     			
     			case 99: icon.setImageResource(R.drawable.varus);
						spell0.setImageResource(R.drawable.varus0);
						spell1.setImageResource(R.drawable.varus1);
						spell2.setImageResource(R.drawable.varus2);
						spell3.setImageResource(R.drawable.varus3);
						spell4.setImageResource(R.drawable.varus4);
						break;     			
     			case 100: icon.setImageResource(R.drawable.vayne);
						spell0.setImageResource(R.drawable.vayne0);
						spell1.setImageResource(R.drawable.vayne1);
						spell2.setImageResource(R.drawable.vayne2);
						spell3.setImageResource(R.drawable.vayne3);
						spell4.setImageResource(R.drawable.vayne4);
						break;     			
     			case 101: icon.setImageResource(R.drawable.veigar);
						spell0.setImageResource(R.drawable.veigar0);
						spell1.setImageResource(R.drawable.veigar1);
						spell2.setImageResource(R.drawable.veigar2);
						spell3.setImageResource(R.drawable.veigar3);
						spell4.setImageResource(R.drawable.veigar4);
						break;     			
     			case 102: icon.setImageResource(R.drawable.velkoz);
						spell0.setImageResource(R.drawable.velkoz0);
						spell1.setImageResource(R.drawable.velkoz1);
						spell2.setImageResource(R.drawable.velkoz2);
						spell3.setImageResource(R.drawable.velkoz3);
						spell4.setImageResource(R.drawable.velkoz4);
						break;     			
     			case 103: icon.setImageResource(R.drawable.vi);
						spell0.setImageResource(R.drawable.vi0);
						spell1.setImageResource(R.drawable.vi1);
						spell2.setImageResource(R.drawable.vi2);
						spell3.setImageResource(R.drawable.vi3);
						spell4.setImageResource(R.drawable.vi4);
						break;     			
     			case 104: icon.setImageResource(R.drawable.viktor);
						spell0.setImageResource(R.drawable.viktor0);
						spell1.setImageResource(R.drawable.viktor1);
						spell2.setImageResource(R.drawable.viktor2);
						spell3.setImageResource(R.drawable.viktor3);
						spell4.setImageResource(R.drawable.viktor4);
						break;     			
     			case 105: icon.setImageResource(R.drawable.vladimir);
						spell0.setImageResource(R.drawable.vladimir0);
						spell1.setImageResource(R.drawable.vladimir1);
						spell2.setImageResource(R.drawable.vladimir2);
						spell3.setImageResource(R.drawable.vladimir3);
						spell4.setImageResource(R.drawable.vladimir4);
						break;     			
     			case 106: icon.setImageResource(R.drawable.volibear);
						spell0.setImageResource(R.drawable.volibear0);
						spell1.setImageResource(R.drawable.volibear1);
						spell2.setImageResource(R.drawable.volibear2);
						spell3.setImageResource(R.drawable.volibear3);
						spell4.setImageResource(R.drawable.volibear4);
						break;     			
     			case 107: icon.setImageResource(R.drawable.warwick);
						spell0.setImageResource(R.drawable.warwick0);
						spell1.setImageResource(R.drawable.warwick1);
						spell2.setImageResource(R.drawable.warwick2);
						spell3.setImageResource(R.drawable.warwick3);
						spell4.setImageResource(R.drawable.warwick4);
						break;     			
     			case 108: icon.setImageResource(R.drawable.wukong);
						spell0.setImageResource(R.drawable.wukong0);
						spell1.setImageResource(R.drawable.wukong1);
						spell2.setImageResource(R.drawable.wukong2);
						spell3.setImageResource(R.drawable.wukong3);
						spell4.setImageResource(R.drawable.wukong4);
						break;     			
     			case 109: icon.setImageResource(R.drawable.xerath);
						spell0.setImageResource(R.drawable.xerath0);
						spell1.setImageResource(R.drawable.xerath1);
						spell2.setImageResource(R.drawable.xerath2);
						spell3.setImageResource(R.drawable.xerath3);
						spell4.setImageResource(R.drawable.xerath4);
						break;     			
     			case 110: icon.setImageResource(R.drawable.xinzhao);
						spell0.setImageResource(R.drawable.xinzhao0);
						spell1.setImageResource(R.drawable.xinzhao1);
						spell2.setImageResource(R.drawable.xinzhao2);
						spell3.setImageResource(R.drawable.xinzhao3);
						spell4.setImageResource(R.drawable.xinzhao4);
						break;     			
     			case 111: icon.setImageResource(R.drawable.yasuo);
						spell0.setImageResource(R.drawable.yasuo0);
						spell1.setImageResource(R.drawable.yasuo1);
						spell2.setImageResource(R.drawable.yasuo2);
						spell3.setImageResource(R.drawable.yasuo3);
						spell4.setImageResource(R.drawable.yasuo4);
						break;     			
     			case 112: icon.setImageResource(R.drawable.yorick);
						spell0.setImageResource(R.drawable.yorick0);
						spell1.setImageResource(R.drawable.yorick1);
						spell2.setImageResource(R.drawable.yorick2);
						spell3.setImageResource(R.drawable.yorick3);
						spell4.setImageResource(R.drawable.yorick4);
						break;     			
     			case 113: icon.setImageResource(R.drawable.zac);
						spell0.setImageResource(R.drawable.zac0);
						spell1.setImageResource(R.drawable.zac1);
						spell2.setImageResource(R.drawable.zac2);
						spell3.setImageResource(R.drawable.zac3);
						spell4.setImageResource(R.drawable.zac4);
						break;     			
     			case 114: icon.setImageResource(R.drawable.zed);
						spell0.setImageResource(R.drawable.zed0);
						spell1.setImageResource(R.drawable.zed1);
						spell2.setImageResource(R.drawable.zed2);
						spell3.setImageResource(R.drawable.zed3);
						spell4.setImageResource(R.drawable.zed4);
						break;     			
     			case 115: icon.setImageResource(R.drawable.ziggs);
						spell0.setImageResource(R.drawable.ziggs0);
						spell1.setImageResource(R.drawable.ziggs1);
						spell2.setImageResource(R.drawable.ziggs2);
						spell3.setImageResource(R.drawable.ziggs3);
						spell4.setImageResource(R.drawable.ziggs4);
						break;     			
     			case 116: icon.setImageResource(R.drawable.zilean);
						spell0.setImageResource(R.drawable.zilean0);
						spell1.setImageResource(R.drawable.zilean1);
						spell2.setImageResource(R.drawable.zilean2);
						spell3.setImageResource(R.drawable.zilean3);
						spell4.setImageResource(R.drawable.zilean4);
						break;     			
     			case 117: icon.setImageResource(R.drawable.zyra);
						spell0.setImageResource(R.drawable.zyra0);
						spell1.setImageResource(R.drawable.zyra1);
						spell2.setImageResource(R.drawable.zyra2);
						spell3.setImageResource(R.drawable.zyra3);
						spell4.setImageResource(R.drawable.zyra4);
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
