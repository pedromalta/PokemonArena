package util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Random;

import model.Specie;
import net.clubedocomputador.PokemonArena.R;
import enums.Attacks;
import enums.Growth;
import enums.Types;

public class GenerateSpecies {

	Random randomGenerator = new Random();

	public Specie[] getSpecies() {
		Specie[] species = new Specie[133];
		species[0] = bulbasaur();
		species[1] = ivysaur();
		species[2] = venusaur();
		species[3] = charmander();
		species[4] = charmeleon();
		species[5] = charizard();
		species[6] = squirtle();
		species[7] = wartortle();
		species[8] = blastoise();
		species[9] = caterpie();
		species[10] = metapod();
		species[11] = butterfree();
		species[12] = weedle();
		species[13] = kakuna();
		species[14] = beedrill();
		species[15] = pidgey();
		species[16] = pidgeot();
		species[17] = pidgeotto();
		species[18] = rattata();
		species[19] = raticate();
		species[20] = spearow();
		species[21] = fearow();
		species[22] = ekans();
		species[23] = arbok();
		species[24] = pikachu();
		species[25] = raichu();
		species[26] = sandshrew();
		species[27] = sandslash();
		species[28] = nidoranf();
		species[29] = nidorina();
		species[30] = nidoqueen();
		species[31] = nidoranm();
		species[32] = nidorino();
		species[33] = nidoking();
		species[34] = clefairy();
		species[35] = clefable();
		species[36] = vulpix();
		species[37] = ninetales();
		species[38] = jigglypuff();
		species[39] = wigglytuff();
		species[40] = zubat();
		species[41] = golbat();
		species[42] = oddish();
		species[43] = gloom();
		species[44] = vileplume();
		species[45] = paras();
		species[46] = parasect();
		species[47] = venonat();
		species[48] = venomoth();
		species[49] = digglet();
		species[50] = dugtrio();
		species[51] = meowth();
		species[52] = persian();
		species[53] = psyduck();
		species[54] = golduck();
		species[55] = mankey();
		species[56] = primeape();
		species[57] = growlithe();
		species[58] = arcanine();
		species[59] = poliwag();
		species[60] = poliwhirl();
		species[61] = poliwrath();
		species[62] = abra();
		species[63] = kadabra();
		species[64] = alakazam();
		species[65] = machop();
		species[66] = machoke();
		species[67] = machamp();
		species[68] = bellsprout();
		species[69] = weepinbell();
		species[70] = victreebel();
		species[71] = tentacool();
		species[72] = tentacruel();
		species[73] = geodude();
		species[74] = graveler();
		species[75] = golem();
		species[76] = ponyta();
		species[77] = rapidash();
		species[78] = slowpoke();
		species[79] = slowbro();
		species[80] = magnemite();
		species[81] = magneton();
		species[82] = farfetchd();
		species[83] = doduo();
		species[84] = dodrio();
		species[85] = seel();
		species[86] = dewgong();
		species[87] = grimer();
		species[88] = muk();
		species[89] = shellder();
		species[90] = cloyster();
		species[91] = Gastly();
		species[92] = haunter();
		species[93] = gengar();
		species[94] = onix();
		species[95] = drowzee();
		species[96] = hypno();
		species[97] = krabby();
		species[98] = kingler();
		species[99] = voltorb();
		species[100] = electrode();
		species[101] = exeggcute();
		species[102] = exeggutor();
		species[103] = cubone();
		species[104] = marowak();
		species[105] = hitmonlee();
		species[106] = hitmonchan();
		species[107] = lickitung();
		species[108] = koffing();
		species[109] = weezing();
		species[110] = rhyhorn();
		species[111] = rhydon();
		species[112] = chansey();
		species[113] = tangela();
		species[114] = kangaskhan();
		species[115] = horsea();
		species[116] = seadra();
		species[117] = goldeen();
		species[118] = seaking();
		species[119] = staryu();
		species[120] = starmie();
		species[121] = mrmime();
		species[122] = scyther();
		species[123] = jynx();
		species[124] = electabuzz();
		species[125] = magmar();
		species[126] = pinsir();
		species[127] = tauros();
		species[128] = magikarp();
		species[129] = gyarados();
		species[130] = lapras();
		species[131] = ditto();
		species[132] = eevee();
				
		return species;
	}

	public Specie getSpecie(Integer id) {
		switch (id) {
		case 1:
			return bulbasaur();
		case 2:
			return ivysaur();
		case 3:
			return venusaur();
		case 4:
			return charmander();
		case 5:
			return charmeleon();
		case 6:
			return charizard();
		case 7:
			return squirtle();
		case 8:
			return wartortle();
		case 9:
			return blastoise();
		case 10:
			return caterpie();
		case 11:
			return metapod();
		case 12:
			return butterfree();
		case 13:
			return weedle();
		case 14:
			return kakuna();
		case 15:
			return beedrill();
		case 16:
			return pidgey();
		case 17:
			return pidgeot();
		case 18:
			return pidgeotto();
		case 19:
			return rattata();
		case 20:
			return raticate();
		case 21:
			return spearow();
		case 22:
			return fearow();
		case 23:
			return ekans();
		case 24:
			return arbok();
		case 25:
			return pikachu();
		case 26:
			return raichu();
		case 27:
			return sandshrew();
		case 28:
			return sandslash();
		case 29:
			return nidoranf();
		case 30:
			return nidorina();
		case 31:
			return nidoqueen();
		case 32:
			return nidoranm();
		case 33:
			return nidorino();
		case 34:
			return nidoking();
		case 35:
			return clefairy();
		case 36:
			return clefable();
		case 37:
			return vulpix();
		case 38:
			return ninetales();
		case 39:
			return jigglypuff();
		case 40:
			return wigglytuff();
		case 41:
			return zubat();
		case 42:
			return golbat();
		case 43:
			return oddish();
		case 44:
			return gloom();
		case 45:
			return vileplume();
		case 46:
			return paras();
		case 47:
			return parasect();
		case 48:
			return venonat();
		case 49:
			return venomoth();
		case 50:
			return digglet();
		case 51:
			return dugtrio();
		case 52:
			return meowth();
		case 53:
			return persian();
		case 54:
			return psyduck();
		case 55:
			return golduck();
		case 56:
			return mankey();
		case 57:
			return primeape();
		case 58:
			return growlithe();
		case 59:
			return arcanine();
		case 60:
			return poliwag();
		case 61:
			return poliwhirl();
		case 62:
			return poliwrath();
		case 63:
			return abra();
		case 64:
			return kadabra();
		case 65:
			return alakazam();
		case 66:
			return machop();
		case 67:
			return machoke();
		case 68:
			return machamp();
		case 69:
			return bellsprout();
		case 70:
			return weepinbell();
		case 71:
			return victreebel();
		case 72:
			return tentacool();
		case 73:
			return tentacruel();
		case 74:
			return geodude();
		case 75:
			return graveler();
		case 76:
			return golem();
		case 77:
			return ponyta();
		case 78:
			return rapidash();
		case 79:
			return slowpoke();
		case 80:
			return slowbro();
		case 81:
			return magnemite();
		case 82:
			return magneton();
		case 83:
			return farfetchd();
		case 84:
			return doduo();
		case 85:
			return dodrio();
		case 86:
			return seel();
		case 87:
			return dewgong();
		case 88:
			return grimer();
		case 89:
			return muk();
		case 90:
			return shellder();
		case 91:
			return cloyster();
		case 92:
			return Gastly();
		case 93:
			return haunter();
		case 94:
			return gengar();
		case 95:
			return onix();
		case 96:
			return drowzee();
		case 97:
			return hypno();
		case 98:
			return krabby();
		case 99:
			return kingler();
		case 100:
			return voltorb();
		case 101:
			return electrode();
		case 102:
			return exeggcute();
		case 103:
			return exeggutor();
		case 104:
			return cubone();
		case 105:
			return marowak();
		case 106:
			return hitmonlee();
		case 107:
			return hitmonchan();
		case 108:
			return lickitung();
		case 109:
			return koffing();
		case 110:
			return weezing();
		case 111:
			return rhyhorn();
		case 112:
			return rhydon();
		case 113:
			return chansey();
		case 114:
			return tangela();
		case 115:
			return kangaskhan();
		case 116:
			return horsea();
		case 117:
			return seadra();
		case 118:
			return goldeen();
		case 119:
			return seaking();
		case 120:
			return staryu();
		case 121:
			return starmie();
		case 122:
			return mrmime();
		case 123:
			return scyther();
		case 124:
			return jynx();
		case 125:
			return electabuzz();
		case 126:
			return magmar();
		case 127:
			return pinsir();
		case 128:
			return tauros();
		case 129:
			return magikarp();
		case 130:
			return gyarados();
		case 131:
			return lapras();
		case 132:
			return ditto();
		case 133:
			return eevee();

		default:
			return null;
		}
	}

	private Specie bulbasaur() {
		Specie spc = new Specie();
		spc.setId("001");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Grass);
		spc.getTypes().add(Types.Poison);
		spc.setName("Bulbasaur");
		spc.setImage(R.drawable.p1);
		spc.setImageBack(R.drawable.b1);
		spc.setImagePremium(R.drawable.s1);
		spc.setImagePremiumBack(R.drawable.e1);
		spc.setImageBig(R.drawable.w1);
		spc.setPointCost(1000);
		spc.setMaxHP(293);
		spc.setMaxAttack(196);
		spc.setMaxDefense(196);
		spc.setMaxSpeed(188);
		spc.setMaxSpecial(228);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());

		spc.getMappedAttacks().put(201, Attacks.Cut);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(133, Attacks.Reflect);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(122, Attacks.Solarbeam);
		spc.getMappedAttacks().put(121, Attacks.MegaDrain);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(108, Attacks.BodySlam);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(103, Attacks.SwordsDance);
		spc.getMappedAttacks().put(48, Attacks.Solarbeam);
		spc.getMappedAttacks().put(41, Attacks.SleepPowder);
		spc.getMappedAttacks().put(34, Attacks.Growth);
		spc.getMappedAttacks().put(12, Attacks.Poisonpowder); //20
		spc.getMappedAttacks().put(10, Attacks.VineWhip);
		spc.getMappedAttacks().put(7, Attacks.LeechSeed);
		spc.getMappedAttacks().put(1, Attacks.Growl);
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("002");

		spc.setEvolutionLevel(16);
		return spc;

	}

	private Specie ivysaur() {
		Specie spc = new Specie();
		spc.setId("002");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Grass);
		spc.getTypes().add(Types.Poison);
		spc.setName("Ivysaur");
		spc.setImage(R.drawable.p2);
		spc.setImageBack(R.drawable.b2);
		spc.setImagePremium(R.drawable.s2);
		spc.setImagePremiumBack(R.drawable.e2);
		spc.setImageBig(R.drawable.w2);
		spc.setPointCost(5000);
		spc.setMaxHP(323);
		spc.setMaxAttack(222);
		spc.setMaxDefense(224);
		spc.setMaxSpeed(218);
		spc.setMaxSpecial(258);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());

		spc.getMappedAttacks().put(201, Attacks.Cut);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(133, Attacks.Reflect);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(122, Attacks.Solarbeam);
		spc.getMappedAttacks().put(121, Attacks.MegaDrain);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(108, Attacks.BodySlam);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(103, Attacks.SwordsDance);
		spc.getMappedAttacks().put(48, Attacks.Solarbeam);
		spc.getMappedAttacks().put(41, Attacks.SleepPowder);
		spc.getMappedAttacks().put(34, Attacks.Growth);
		spc.getMappedAttacks().put(12, Attacks.Poisonpowder); //20
		spc.getMappedAttacks().put(10, Attacks.VineWhip);
		spc.getMappedAttacks().put(7, Attacks.LeechSeed);
		spc.getMappedAttacks().put(1, Attacks.Growl);
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("003");

		spc.setEvolutionLevel(32);
		return spc;

	}

	private Specie venusaur() {
		Specie spc = new Specie();
		spc.setId("003");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Grass);
		spc.getTypes().add(Types.Poison);
		spc.setName("Venusaur");
		spc.setImage(R.drawable.p3);
		spc.setImageBack(R.drawable.b3);
		spc.setImagePremium(R.drawable.s3);
		spc.setImagePremiumBack(R.drawable.e3);
		spc.setImageBig(R.drawable.w3);
		spc.setPointCost(10000);
		spc.setMaxHP(363);
		spc.setMaxAttack(262);
		spc.setMaxDefense(264);
		spc.setMaxSpeed(258);
		spc.setMaxSpecial(298);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());

		spc.getMappedAttacks().put(201, Attacks.Cut);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(133, Attacks.Reflect);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(122, Attacks.Solarbeam);
		spc.getMappedAttacks().put(121, Attacks.MegaDrain);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(108, Attacks.BodySlam);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(103, Attacks.SwordsDance);
		spc.getMappedAttacks().put(48, Attacks.Solarbeam);
		spc.getMappedAttacks().put(41, Attacks.SleepPowder);
		spc.getMappedAttacks().put(34, Attacks.Growth);
		spc.getMappedAttacks().put(12, Attacks.Poisonpowder); //20
		spc.getMappedAttacks().put(10, Attacks.VineWhip);
		spc.getMappedAttacks().put(7, Attacks.LeechSeed);
		spc.getMappedAttacks().put(1, Attacks.Growl);
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;

	}

	private Specie charmander() {
		Specie spc = new Specie();
		spc.setId("004");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Fire);
		spc.setName("Charmander");
		spc.setImage(R.drawable.p4);
		spc.setImageBack(R.drawable.b4);
		spc.setImagePremium(R.drawable.s4);
		spc.setImagePremiumBack(R.drawable.e4);
		spc.setImageBig(R.drawable.w4);
		spc.setPointCost(1000);
		spc.setMaxHP(281);
		spc.setMaxAttack(202);
		spc.setMaxDefense(184);
		spc.setMaxSpeed(228);
		spc.setMaxSpecial(198);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		
		spc.getMappedAttacks().put(204, Attacks.Strength);
		spc.getMappedAttacks().put(201, Attacks.Cut);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(140, Attacks.SkullBash);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(138, Attacks.FireBlast);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(133, Attacks.Reflect);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(128, Attacks.Dig);
		spc.getMappedAttacks().put(123, Attacks.DragonRage);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(119, Attacks.SeismicToss);
		spc.getMappedAttacks().put(118, Attacks.Counter);
		spc.getMappedAttacks().put(117, Attacks.Submission);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(108, Attacks.BodySlam);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(105, Attacks.MegaKick);
		spc.getMappedAttacks().put(103, Attacks.SwordsDance);
		spc.getMappedAttacks().put(101, Attacks.MegaPunch);
		spc.getMappedAttacks().put(46, Attacks.FireSpin);
		spc.getMappedAttacks().put(38, Attacks.Flamethrower);
		spc.getMappedAttacks().put(30, Attacks.Slash);
		spc.getMappedAttacks().put(22, Attacks.Rage);
		spc.getMappedAttacks().put(15, Attacks.Leer);
		spc.getMappedAttacks().put(9, Attacks.Ember);
		spc.getMappedAttacks().put(1, Attacks.Growl);
		spc.getMappedAttacks().put(0, Attacks.Scratch);

		spc.setEvolution("005");
		spc.setEvolutionLevel(16);
		return spc;

	}

	private Specie charmeleon() {
		Specie spc = new Specie();
		spc.setId("005");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Fire);
		spc.setName("Charmeleon");
		spc.setImage(R.drawable.p5);
		spc.setImageBack(R.drawable.b5);
		spc.setImagePremium(R.drawable.s5);
		spc.setImagePremiumBack(R.drawable.e5);
		spc.setImageBig(R.drawable.w5);
		spc.setPointCost(5000);
		spc.setMaxHP(319);
		spc.setMaxAttack(226);
		spc.setMaxDefense(214);
		spc.setMaxSpeed(258);
		spc.setMaxSpecial(228);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());

		spc.getMappedAttacks().put(204, Attacks.Strength);
		spc.getMappedAttacks().put(201, Attacks.Cut);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(140, Attacks.SkullBash);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(138, Attacks.FireBlast);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(133, Attacks.Reflect);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(128, Attacks.Dig);
		spc.getMappedAttacks().put(123, Attacks.DragonRage);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(119, Attacks.SeismicToss);
		spc.getMappedAttacks().put(118, Attacks.Counter);
		spc.getMappedAttacks().put(117, Attacks.Submission);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(108, Attacks.BodySlam);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(105, Attacks.MegaKick);
		spc.getMappedAttacks().put(103, Attacks.SwordsDance);
		spc.getMappedAttacks().put(101, Attacks.MegaPunch);
		spc.getMappedAttacks().put(46, Attacks.FireSpin);
		spc.getMappedAttacks().put(38, Attacks.Flamethrower);
		spc.getMappedAttacks().put(30, Attacks.Slash);
		spc.getMappedAttacks().put(22, Attacks.Rage);
		spc.getMappedAttacks().put(15, Attacks.Leer);
		spc.getMappedAttacks().put(9, Attacks.Ember);
		spc.getMappedAttacks().put(1, Attacks.Growl);
		spc.getMappedAttacks().put(0, Attacks.Scratch);
		
		spc.setEvolution("006");

		spc.setEvolutionLevel(36);
		return spc;

	}

	private Specie charizard() {
		Specie spc = new Specie();
		spc.setId("006");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Fire);
		spc.getTypes().add(Types.Flying);
		spc.setName("Charizard");
		spc.setImage(R.drawable.p6);
		spc.setImageBack(R.drawable.b6);
		spc.setImagePremium(R.drawable.s6);
		spc.setImagePremiumBack(R.drawable.e6);
		spc.setImageBig(R.drawable.w6);
		spc.setPointCost(10000);
		spc.setMaxHP(359);
		spc.setMaxAttack(266);
		spc.setMaxDefense(254);
		spc.setMaxSpeed(298);
		spc.setMaxSpecial(268);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());

		spc.getMappedAttacks().put(204, Attacks.Strength);
		spc.getMappedAttacks().put(201, Attacks.Cut);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(140, Attacks.SkullBash);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(138, Attacks.FireBlast);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(133, Attacks.Reflect);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(128, Attacks.Dig);
		spc.getMappedAttacks().put(123, Attacks.DragonRage);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(119, Attacks.SeismicToss);
		spc.getMappedAttacks().put(118, Attacks.Counter);
		spc.getMappedAttacks().put(117, Attacks.Submission);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(108, Attacks.BodySlam);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(105, Attacks.MegaKick);
		spc.getMappedAttacks().put(103, Attacks.SwordsDance);
		spc.getMappedAttacks().put(101, Attacks.MegaPunch);
		spc.getMappedAttacks().put(46, Attacks.FireSpin);
		spc.getMappedAttacks().put(38, Attacks.Flamethrower);
		spc.getMappedAttacks().put(30, Attacks.Slash);
		spc.getMappedAttacks().put(22, Attacks.Rage);
		spc.getMappedAttacks().put(15, Attacks.Leer);
		spc.getMappedAttacks().put(9, Attacks.Ember);
		spc.getMappedAttacks().put(1, Attacks.Growl);
		spc.getMappedAttacks().put(0, Attacks.Scratch);

		return spc;

	}

	private Specie squirtle() {
		Specie spc = new Specie();
		spc.setId("007");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.setName("Squirtle");
		spc.setImage(R.drawable.p7);
		spc.setImageBack(R.drawable.b7);
		spc.setImagePremium(R.drawable.s7);
		spc.setImagePremiumBack(R.drawable.e7);
		spc.setImageBig(R.drawable.w7);
		spc.setPointCost(1000);
		spc.setMaxHP(291);
		spc.setMaxAttack(194);
		spc.setMaxDefense(228);
		spc.setMaxSpeed(184);
		spc.setMaxSpecial(198);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());


		spc.getMappedAttacks().put(204, Attacks.Strength);
		spc.getMappedAttacks().put(203, Attacks.Surf);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(140, Attacks.SkullBash);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(138, Attacks.FireBlast);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(133, Attacks.Reflect);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(128, Attacks.Dig);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(119, Attacks.SeismicToss);
		spc.getMappedAttacks().put(118, Attacks.Counter);
		spc.getMappedAttacks().put(117, Attacks.Submission);
		spc.getMappedAttacks().put(114, Attacks.Blizzard);
		spc.getMappedAttacks().put(113, Attacks.IceBeam);
		spc.getMappedAttacks().put(112, Attacks.WaterGun);
		spc.getMappedAttacks().put(111, Attacks.Bubblebeam);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(108, Attacks.BodySlam);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(105, Attacks.MegaKick);
		spc.getMappedAttacks().put(101, Attacks.MegaPunch);
		spc.getMappedAttacks().put(42, Attacks.HydroPump);
		spc.getMappedAttacks().put(35, Attacks.SkullBash);
		spc.getMappedAttacks().put(28, Attacks.Withdraw);
		spc.getMappedAttacks().put(22, Attacks.Bite);
		spc.getMappedAttacks().put(15, Attacks.WaterGun);
		spc.getMappedAttacks().put(8, Attacks.Bubble);
		spc.getMappedAttacks().put(1, Attacks.TailWhip);
		spc.getMappedAttacks().put(0, Attacks.Tackle);


		spc.setEvolution("008");

		spc.setEvolutionLevel(16);
		return spc;

	}

	private Specie wartortle() {
		Specie spc = new Specie();
		spc.setId("008");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.setName("Wartortle");
		spc.setImage(R.drawable.p8);
		spc.setImageBack(R.drawable.b8);
		spc.setImagePremium(R.drawable.s8);
		spc.setImagePremiumBack(R.drawable.e8);
		spc.setImageBig(R.drawable.w8);
		spc.setPointCost(5000);
		spc.setMaxHP(321);
		spc.setMaxAttack(224);
		spc.setMaxDefense(258);
		spc.setMaxSpeed(214);
		spc.setMaxSpecial(228);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		
		spc.getMappedAttacks().put(204, Attacks.Strength);
		spc.getMappedAttacks().put(203, Attacks.Surf);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(140, Attacks.SkullBash);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(138, Attacks.FireBlast);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(133, Attacks.Reflect);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(128, Attacks.Dig);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(119, Attacks.SeismicToss);
		spc.getMappedAttacks().put(118, Attacks.Counter);
		spc.getMappedAttacks().put(117, Attacks.Submission);
		spc.getMappedAttacks().put(114, Attacks.Blizzard);
		spc.getMappedAttacks().put(113, Attacks.IceBeam);
		spc.getMappedAttacks().put(112, Attacks.WaterGun);
		spc.getMappedAttacks().put(111, Attacks.Bubblebeam);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(108, Attacks.BodySlam);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(105, Attacks.MegaKick);
		spc.getMappedAttacks().put(101, Attacks.MegaPunch);
		spc.getMappedAttacks().put(42, Attacks.HydroPump);
		spc.getMappedAttacks().put(35, Attacks.SkullBash);
		spc.getMappedAttacks().put(28, Attacks.Withdraw);
		spc.getMappedAttacks().put(22, Attacks.Bite);
		spc.getMappedAttacks().put(15, Attacks.WaterGun);
		spc.getMappedAttacks().put(8, Attacks.Bubble);
		spc.getMappedAttacks().put(1, Attacks.TailWhip);
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("009");

		spc.setEvolutionLevel(36);
		return spc;

	}

	private Specie blastoise() {
		Specie spc = new Specie();
		spc.setId("009");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.setName("Blastoise");
		spc.setImage(R.drawable.p9);
		spc.setImageBack(R.drawable.b9);
		spc.setImagePremium(R.drawable.s9);
		spc.setImagePremiumBack(R.drawable.e9);
		spc.setImageBig(R.drawable.w9);
		spc.setPointCost(10000);
		spc.setMaxHP(361);
		spc.setMaxAttack(264);
		spc.setMaxDefense(298);
		spc.setMaxSpeed(254);
		spc.setMaxSpecial(268);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());

		spc.getMappedAttacks().put(204, Attacks.Strength);
		spc.getMappedAttacks().put(203, Attacks.Surf);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(140, Attacks.SkullBash);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(138, Attacks.FireBlast);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(133, Attacks.Reflect);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(128, Attacks.Dig);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(119, Attacks.SeismicToss);
		spc.getMappedAttacks().put(118, Attacks.Counter);
		spc.getMappedAttacks().put(117, Attacks.Submission);
		spc.getMappedAttacks().put(114, Attacks.Blizzard);
		spc.getMappedAttacks().put(113, Attacks.IceBeam);
		spc.getMappedAttacks().put(112, Attacks.WaterGun);
		spc.getMappedAttacks().put(111, Attacks.Bubblebeam);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(108, Attacks.BodySlam);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(105, Attacks.MegaKick);
		spc.getMappedAttacks().put(101, Attacks.MegaPunch);
		spc.getMappedAttacks().put(42, Attacks.HydroPump);
		spc.getMappedAttacks().put(35, Attacks.SkullBash);
		spc.getMappedAttacks().put(28, Attacks.Withdraw);
		spc.getMappedAttacks().put(22, Attacks.Bite);
		spc.getMappedAttacks().put(15, Attacks.WaterGun);
		spc.getMappedAttacks().put(8, Attacks.Bubble);
		spc.getMappedAttacks().put(1, Attacks.TailWhip);
		spc.getMappedAttacks().put(0, Attacks.Tackle);


		return spc;

	}

	private Specie caterpie() {
		Specie spc = new Specie();
		spc.setId("010");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Bug);
		spc.setName("Caterpie");
		spc.setImage(R.drawable.p10);
		spc.setImageBack(R.drawable.b10);
		spc.setImagePremium(R.drawable.s10);
		spc.setImagePremiumBack(R.drawable.e10);
		spc.setImageBig(R.drawable.w10);
		spc.setPointCost(1000);
		spc.setMaxHP(293);
		spc.setMaxAttack(158);
		spc.setMaxDefense(168);
		spc.setMaxSpeed(188);
		spc.setMaxSpecial(138);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(1, Attacks.Tackle);
		spc.getMappedAttacks().put(0, Attacks.StringShot);

		spc.setEvolution("011");

		spc.setEvolutionLevel(11);
		return spc;

	}

	private Specie metapod() {
		Specie spc = new Specie();
		spc.setId("011");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Bug);
		spc.setName("Metapod");
		spc.setImage(R.drawable.p11);
		spc.setImageBack(R.drawable.b11);
		spc.setImagePremium(R.drawable.s11);
		spc.setImagePremiumBack(R.drawable.e11);
		spc.setImageBig(R.drawable.w11);
		spc.setPointCost(1000);
		spc.setMaxHP(303);
		spc.setMaxAttack(138);
		spc.setMaxDefense(208);
		spc.setMaxSpeed(158);
		spc.setMaxSpecial(148);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(11, Attacks.Harden);

		spc.setEvolution("012");

		spc.setEvolutionLevel(13);
		return spc;

	}

	private Specie butterfree() {
		Specie spc = new Specie();
		spc.setId("012");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Bug);
		spc.getTypes().add(Types.Flying);
		spc.setName("Butterfree");
		spc.setImage(R.drawable.p12);
		spc.setImageBack(R.drawable.b12);
		spc.setImagePremium(R.drawable.s12);
		spc.setImagePremiumBack(R.drawable.e12);
		spc.setImageBig(R.drawable.w12);
		spc.setPointCost(5000);
		spc.setMaxHP(323);
		spc.setMaxAttack(188);
		spc.setMaxDefense(198);
		spc.setMaxSpeed(238);
		spc.setMaxSpecial(258);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(204, Attacks.Strength);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(146, Attacks.Psywave);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(133, Attacks.Reflect);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(130, Attacks.Teleport);
		spc.getMappedAttacks().put(129, Attacks.Psychic);
		spc.getMappedAttacks().put(122, Attacks.Solarbeam);
		spc.getMappedAttacks().put(121, Attacks.MegaDrain);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(115, Attacks.HyperBeam);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(104, Attacks.Whirlwind);
		spc.getMappedAttacks().put(102, Attacks.RazorWind);
		spc.getMappedAttacks().put(31, Attacks.Psybeam);
		spc.getMappedAttacks().put(28, Attacks.Gust);
		spc.getMappedAttacks().put(23, Attacks.Whirlwind);
		spc.getMappedAttacks().put(18, Attacks.Supersonic);
		spc.getMappedAttacks().put(16, Attacks.SleepPowder);
		spc.getMappedAttacks().put(15, Attacks.StunSpore);
		spc.getMappedAttacks().put(14, Attacks.Poisonpowder);
		spc.getMappedAttacks().put(13, Attacks.Confusion);
		spc.getMappedAttacks().put(1, Attacks.Tackle);
		spc.getMappedAttacks().put(0, Attacks.StringShot);

		return spc;

	}

	private Specie weedle() {
		Specie spc = new Specie();
		spc.setId("013");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Bug);
		spc.getTypes().add(Types.Poison);
		spc.setName("Weedle");
		spc.setImage(R.drawable.p13);
		spc.setImageBack(R.drawable.b13);
		spc.setImagePremium(R.drawable.s13);
		spc.setImagePremiumBack(R.drawable.e13);
		spc.setImageBig(R.drawable.w13);
		spc.setPointCost(1000);
		spc.setMaxHP(283);
		spc.setMaxAttack(168);
		spc.setMaxDefense(158);
		spc.setMaxSpeed(198);
		spc.setMaxSpecial(138);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(1, Attacks.StringShot);
		spc.getMappedAttacks().put(0, Attacks.PoisonSting);

		spc.setEvolution("014");

		spc.setEvolutionLevel(11);
		return spc;

	}

	private Specie kakuna() {
		Specie spc = new Specie();
		spc.setId("014");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Bug);
		spc.getTypes().add(Types.Poison);
		spc.setName("Kakuna");
		spc.setImage(R.drawable.p14);
		spc.setImageBack(R.drawable.b14);
		spc.setImagePremium(R.drawable.s14);
		spc.setImagePremiumBack(R.drawable.e14);
		spc.setImageBig(R.drawable.w14);
		spc.setPointCost(1000);
		spc.setMaxHP(293);
		spc.setMaxAttack(148);
		spc.setMaxDefense(198);
		spc.setMaxSpeed(168);
		spc.setMaxSpecial(148);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(11, Attacks.Harden);

		spc.setEvolution("015");

		spc.setEvolutionLevel(13);

		return spc;

	}

	private Specie beedrill() {
		Specie spc = new Specie();
		spc.setId("015");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Bug);
		spc.getTypes().add(Types.Poison);
		spc.setName("Beedrill");
		spc.setImage(R.drawable.p15);
		spc.setImageBack(R.drawable.b15);
		spc.setImagePremium(R.drawable.s15);
		spc.setImagePremiumBack(R.drawable.e15);
		spc.setImageBig(R.drawable.w15);
		spc.setPointCost(5000);
		spc.setMaxHP(333);
		spc.setMaxAttack(258);
		spc.setMaxDefense(178);
		spc.setMaxSpeed(248);
		spc.setMaxSpecial(188);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(201, Attacks.Cut);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(140, Attacks.SkullBash);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(133, Attacks.Reflect);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(121, Attacks.MegaDrain);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(115, Attacks.HyperBeam);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(103, Attacks.SwordsDance);
		spc.getMappedAttacks().put(35, Attacks.Agility);
		spc.getMappedAttacks().put(30, Attacks.PinMissile);
		spc.getMappedAttacks().put(25, Attacks.Rage);
		spc.getMappedAttacks().put(20, Attacks.Twineedle);
		spc.getMappedAttacks().put(16, Attacks.FocusEnergy);
		spc.getMappedAttacks().put(13, Attacks.FuryAttack);

		return spc;

	}

	private Specie pidgey() {
		Specie spc = new Specie();
		spc.setId("016");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.getTypes().add(Types.Flying);
		spc.setName("Pidgey");
		spc.setImage(R.drawable.p16);
		spc.setImageBack(R.drawable.b16);
		spc.setImagePremium(R.drawable.s16);
		spc.setImagePremiumBack(R.drawable.e16);
		spc.setImageBig(R.drawable.w16);
		spc.setPointCost(1000);
		spc.setMaxHP(283);
		spc.setMaxAttack(188);
		spc.setMaxDefense(178);
		spc.setMaxSpeed(210);
		spc.setMaxSpecial(168);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(202, Attacks.Fly);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(143, Attacks.SkyAttack);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(133, Attacks.Reflect);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(104, Attacks.Whirlwind);
		spc.getMappedAttacks().put(102, Attacks.RazorWind);
		spc.getMappedAttacks().put(44, Attacks.MirrorMove);
		spc.getMappedAttacks().put(36, Attacks.Agility);
		spc.getMappedAttacks().put(28, Attacks.WingAttack);
		spc.getMappedAttacks().put(19, Attacks.Whirlwind);
		spc.getMappedAttacks().put(12, Attacks.QuickAttack);
		spc.getMappedAttacks().put(5, Attacks.SandAttack);
		spc.getMappedAttacks().put(0, Attacks.Gust);

		spc.setEvolution("017");

		spc.setEvolutionLevel(18);

		return spc;

	}

	private Specie pidgeotto() {
		Specie spc = new Specie();
		spc.setId("017");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.getTypes().add(Types.Flying);
		spc.setName("Pidgeotto");
		spc.setImage(R.drawable.p17);
		spc.setImageBack(R.drawable.b17);
		spc.setImagePremium(R.drawable.s17);
		spc.setImagePremiumBack(R.drawable.e17);
		spc.setImageBig(R.drawable.w17);
		spc.setPointCost(5000);
		spc.setMaxHP(329);
		spc.setMaxAttack(218);
		spc.setMaxDefense(208);
		spc.setMaxSpeed(240);
		spc.setMaxSpecial(198);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(202, Attacks.Fly);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(143, Attacks.SkyAttack);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(133, Attacks.Reflect);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(104, Attacks.Whirlwind);
		spc.getMappedAttacks().put(102, Attacks.RazorWind);
		spc.getMappedAttacks().put(49, Attacks.MirrorMove);
		spc.getMappedAttacks().put(40, Attacks.Agility);
		spc.getMappedAttacks().put(31, Attacks.WingAttack);
		spc.getMappedAttacks().put(21, Attacks.Whirlwind);
		spc.getMappedAttacks().put(12, Attacks.QuickAttack);
		spc.getMappedAttacks().put(1, Attacks.SandAttack);
		spc.getMappedAttacks().put(0, Attacks.Gust);

		spc.setEvolution("018");

		spc.setEvolutionLevel(36);

		return spc;

	}

	private Specie pidgeot() {
		Specie spc = new Specie();
		spc.setId("018");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.getTypes().add(Types.Flying);
		spc.setName("Pidgeot");
		spc.setImage(R.drawable.p18);
		spc.setImageBack(R.drawable.b18);
		spc.setImagePremium(R.drawable.s18);
		spc.setImagePremiumBack(R.drawable.e18);
		spc.setImageBig(R.drawable.w18);
		spc.setPointCost(10000);
		spc.setMaxHP(369);
		spc.setMaxAttack(258);
		spc.setMaxDefense(248);
		spc.setMaxSpeed(280);
		spc.setMaxSpecial(238);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(202, Attacks.Fly);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(143, Attacks.SkyAttack);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(133, Attacks.Reflect);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(104, Attacks.Whirlwind);
		spc.getMappedAttacks().put(102, Attacks.RazorWind);
		spc.getMappedAttacks().put(54, Attacks.MirrorMove);
		spc.getMappedAttacks().put(44, Attacks.Agility);
		spc.getMappedAttacks().put(31, Attacks.WingAttack);
		spc.getMappedAttacks().put(21, Attacks.Whirlwind);
		spc.getMappedAttacks().put(2, Attacks.QuickAttack);
		spc.getMappedAttacks().put(1, Attacks.SandAttack);
		spc.getMappedAttacks().put(0, Attacks.Gust);

		return spc;

	}

	private Specie rattata() {
		Specie spc = new Specie();
		spc.setId("019");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.setName("Rattata");
		spc.setImage(R.drawable.p19);
		spc.setImageBack(R.drawable.b19);
		spc.setImagePremium(R.drawable.s19);
		spc.setImagePremiumBack(R.drawable.e19);
		spc.setImageBig(R.drawable.w19);
		spc.setPointCost(1000);
		spc.setMaxHP(263);
		spc.setMaxAttack(210);
		spc.setMaxDefense(168);
		spc.setMaxSpeed(242);
		spc.setMaxSpecial(148);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(140, Attacks.SkullBash);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(128, Attacks.Dig);
		spc.getMappedAttacks().put(125, Attacks.Thunder);
		spc.getMappedAttacks().put(124, Attacks.Thunderbolt);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(114, Attacks.Blizzard);
		spc.getMappedAttacks().put(112, Attacks.WaterGun);
		spc.getMappedAttacks().put(111, Attacks.Bubblebeam);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(108, Attacks.BodySlam);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(34, Attacks.SuperFang);
		spc.getMappedAttacks().put(23, Attacks.FocusEnergy);
		spc.getMappedAttacks().put(14, Attacks.HyperFang);
		spc.getMappedAttacks().put(7, Attacks.QuickAttack);
		spc.getMappedAttacks().put(1, Attacks.TailWhip);
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("020");

		spc.setEvolutionLevel(20);

		return spc;

	}

	private Specie raticate() {
		Specie spc = new Specie();
		spc.setId("020");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.setName("Raticate");
		spc.setImage(R.drawable.p20);
		spc.setImageBack(R.drawable.b20);
		spc.setImagePremium(R.drawable.s20);
		spc.setImagePremiumBack(R.drawable.e20);
		spc.setImageBig(R.drawable.w20);
		spc.setPointCost(5000);
		spc.setMaxHP(313);
		spc.setMaxAttack(260);
		spc.setMaxDefense(218);
		spc.setMaxSpeed(292);
		spc.setMaxSpecial(198);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(140, Attacks.SkullBash);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(128, Attacks.Dig);
		spc.getMappedAttacks().put(125, Attacks.Thunder);
		spc.getMappedAttacks().put(124, Attacks.Thunderbolt);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(114, Attacks.Blizzard);
		spc.getMappedAttacks().put(112, Attacks.WaterGun);
		spc.getMappedAttacks().put(111, Attacks.Bubblebeam);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(108, Attacks.BodySlam);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(41, Attacks.SuperFang);
		spc.getMappedAttacks().put(27, Attacks.FocusEnergy);
		spc.getMappedAttacks().put(14, Attacks.HyperFang);
		spc.getMappedAttacks().put(2, Attacks.QuickAttack);
		spc.getMappedAttacks().put(1, Attacks.TailWhip);
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;

	}

	private Specie spearow() {
		Specie spc = new Specie();
		spc.setId("021");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.getTypes().add(Types.Flying);
		spc.setName("Spearow");
		spc.setImage(R.drawable.p21);
		spc.setImageBack(R.drawable.b21);
		spc.setImagePremium(R.drawable.s21);
		spc.setImagePremiumBack(R.drawable.e21);
		spc.setImageBig(R.drawable.w21);
		spc.setPointCost(5000);
		spc.setMaxHP(283);
		spc.setMaxAttack(218);
		spc.setMaxDefense(158);
		spc.setMaxSpeed(238);
		spc.setMaxSpecial(160);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(202, Attacks.Fly);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(143, Attacks.SkyAttack);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(104, Attacks.Whirlwind);
		spc.getMappedAttacks().put(102, Attacks.RazorWind);
		spc.getMappedAttacks().put(36, Attacks.Agility);
		spc.getMappedAttacks().put(29, Attacks.DrillPeck);
		spc.getMappedAttacks().put(22, Attacks.MirrorMove);
		spc.getMappedAttacks().put(15, Attacks.FuryAttack);
		spc.getMappedAttacks().put(9, Attacks.Leer);
		spc.getMappedAttacks().put(1, Attacks.Growl);
		spc.getMappedAttacks().put(0, Attacks.Peck);

		spc.setEvolution("021");

		spc.setEvolutionLevel(20);

		return spc;
	}

	private Specie fearow() {
		Specie spc = new Specie();
		spc.setId("022");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.getTypes().add(Types.Flying);
		spc.setName("Fearow");
		spc.setImage(R.drawable.p22);
		spc.setImageBack(R.drawable.b22);
		spc.setImagePremium(R.drawable.s22);
		spc.setImagePremiumBack(R.drawable.e22);
		spc.setImageBig(R.drawable.w22);
		spc.setPointCost(10000);
		spc.setMaxHP(333);
		spc.setMaxAttack(278);
		spc.setMaxDefense(228);
		spc.setMaxSpeed(298);
		spc.setMaxSpecial(220);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(202, Attacks.Fly);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(143, Attacks.SkyAttack);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(104, Attacks.Whirlwind);
		spc.getMappedAttacks().put(102, Attacks.RazorWind);
		spc.getMappedAttacks().put(43, Attacks.Agility);
		spc.getMappedAttacks().put(34, Attacks.DrillPeck);
		spc.getMappedAttacks().put(25, Attacks.MirrorMove);
		spc.getMappedAttacks().put(15, Attacks.FuryAttack);
		spc.getMappedAttacks().put(2, Attacks.Leer);
		spc.getMappedAttacks().put(1, Attacks.Growl);
		spc.getMappedAttacks().put(0, Attacks.Peck);

		return spc;
	}

	private Specie ekans() {
		Specie spc = new Specie();
		spc.setId("023");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Poison);
		spc.setName("Ekans");
		spc.setImage(R.drawable.p23);
		spc.setImageBack(R.drawable.b23);
		spc.setImagePremium(R.drawable.s23);
		spc.setImagePremiumBack(R.drawable.e23);
		spc.setImageBig(R.drawable.w23);
		spc.setPointCost(5000);
		spc.setMaxHP(273);
		spc.setMaxAttack(218);
		spc.setMaxDefense(186);
		spc.setMaxSpeed(208);
		spc.setMaxSpecial(178);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(204, Attacks.Strength);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(148, Attacks.RockSlide);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(140, Attacks.SkullBash);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(128, Attacks.Dig);
		spc.getMappedAttacks().put(127, Attacks.Fissure);
		spc.getMappedAttacks().put(126, Attacks.Earthquake);
		spc.getMappedAttacks().put(121, Attacks.MegaDrain);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(38, Attacks.Acid);
		spc.getMappedAttacks().put(31, Attacks.Screech);
		spc.getMappedAttacks().put(24, Attacks.Glare);
		spc.getMappedAttacks().put(17, Attacks.Bite);
		spc.getMappedAttacks().put(10, Attacks.PoisonSting);
		spc.getMappedAttacks().put(1, Attacks.Leer);
		spc.getMappedAttacks().put(0, Attacks.Wrap);

		spc.setEvolution("024");

		spc.setEvolutionLevel(22);

		return spc;
	}

	private Specie arbok() {
		Specie spc = new Specie();
		spc.setId("024");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Poison);
		spc.setName("Arbok");
		spc.setImage(R.drawable.p24);
		spc.setImageBack(R.drawable.b24);
		spc.setImagePremium(R.drawable.s24);
		spc.setImagePremiumBack(R.drawable.e24);
		spc.setImageBig(R.drawable.w24);
		spc.setPointCost(10000);
		spc.setMaxHP(323);
		spc.setMaxAttack(268);
		spc.setMaxDefense(236);
		spc.setMaxSpeed(258);
		spc.setMaxSpecial(228);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(204, Attacks.Strength);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(148, Attacks.RockSlide);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(140, Attacks.SkullBash);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(128, Attacks.Dig);
		spc.getMappedAttacks().put(127, Attacks.Fissure);
		spc.getMappedAttacks().put(126, Attacks.Earthquake);
		spc.getMappedAttacks().put(121, Attacks.MegaDrain);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(47, Attacks.Acid);
		spc.getMappedAttacks().put(36, Attacks.Screech);
		spc.getMappedAttacks().put(27, Attacks.Glare);
		spc.getMappedAttacks().put(17, Attacks.Bite);
		spc.getMappedAttacks().put(2, Attacks.PoisonSting);
		spc.getMappedAttacks().put(1, Attacks.Leer);
		spc.getMappedAttacks().put(0, Attacks.Wrap);

		return spc;
	}

	private Specie pikachu() {
		Specie spc = new Specie();
		spc.setId("025");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Electric);
		spc.setName("Pikachu");
		spc.setImage(R.drawable.p25);
		spc.setImageBack(R.drawable.b25);
		spc.setImagePremium(R.drawable.s25);
		spc.setImagePremiumBack(R.drawable.e25);
		spc.setImageBig(R.drawable.w25);
		spc.setPointCost(1000);
		spc.setMaxHP(273);
		spc.setMaxAttack(208);
		spc.setMaxDefense(158);
		spc.setMaxSpeed(278);
		spc.setMaxSpecial(198);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(205, Attacks.Flash);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(145, Attacks.ThunderWave);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(140, Attacks.SkullBash);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(133, Attacks.Reflect);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(125, Attacks.Thunder);
		spc.getMappedAttacks().put(124, Attacks.Thunderbolt);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(119, Attacks.SeismicToss);
		spc.getMappedAttacks().put(117, Attacks.Submission);
		spc.getMappedAttacks().put(116, Attacks.PayDay);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(108, Attacks.BodySlam);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(105, Attacks.MegaKick);
		spc.getMappedAttacks().put(101, Attacks.MegaPunch);
		spc.getMappedAttacks().put(50, Attacks.LightScreen);
		spc.getMappedAttacks().put(41, Attacks.Thunder);
		spc.getMappedAttacks().put(33, Attacks.Agility);
		spc.getMappedAttacks().put(26, Attacks.Thunderbolt);
		spc.getMappedAttacks().put(25, Attacks.Swift);
		spc.getMappedAttacks().put(20, Attacks.Slam);
		spc.getMappedAttacks().put(15, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(11, Attacks.QuickAttack);
		spc.getMappedAttacks().put(8, Attacks.ThunderWave);
		spc.getMappedAttacks().put(6, Attacks.TailWhip);
		spc.getMappedAttacks().put(1, Attacks.Growl);
		spc.getMappedAttacks().put(0, Attacks.Thundershock);

		spc.setEvolution("026");

		spc.setEvolutionLevel(-1);
		return spc;

	}

	private Specie raichu() {
		Specie spc = new Specie();
		spc.setId("026");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Electric);
		spc.setName("Raichu");
		spc.setImage(R.drawable.p26);
		spc.setImageBack(R.drawable.b26);
		spc.setImagePremium(R.drawable.s26);
		spc.setImagePremiumBack(R.drawable.e26);
		spc.setImageBig(R.drawable.w26);
		spc.setPointCost(7500);
		spc.setMaxHP(323);
		spc.setMaxAttack(278);
		spc.setMaxDefense(208);
		spc.setMaxSpeed(298);
		spc.setMaxSpecial(278);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(205, Attacks.Flash);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(145, Attacks.ThunderWave);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(140, Attacks.SkullBash);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(133, Attacks.Reflect);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(125, Attacks.Thunder);
		spc.getMappedAttacks().put(124, Attacks.Thunderbolt);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(119, Attacks.SeismicToss);
		spc.getMappedAttacks().put(117, Attacks.Submission);
		spc.getMappedAttacks().put(116, Attacks.PayDay);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(108, Attacks.BodySlam);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(105, Attacks.MegaKick);
		spc.getMappedAttacks().put(101, Attacks.MegaPunch);
		spc.getMappedAttacks().put(2, Attacks.ThunderWave);
		spc.getMappedAttacks().put(1, Attacks.Growl);
		spc.getMappedAttacks().put(0, Attacks.Thundershock);

		return spc;

	}

	private Specie sandshrew() {
		Specie spc = new Specie();
		spc.setId("027");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Ground);
		spc.setName("Sandshrew");
		spc.setImage(R.drawable.p27);
		spc.setImageBack(R.drawable.b27);
		spc.setImagePremium(R.drawable.s27);
		spc.setImagePremiumBack(R.drawable.e27);
		spc.setImageBig(R.drawable.w27);
		spc.setPointCost(5000);
		spc.setMaxHP(303);
		spc.setMaxAttack(248);
		spc.setMaxDefense(268);
		spc.setMaxSpeed(178);
		spc.setMaxSpecial(158);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(204, Attacks.Strength);
		spc.getMappedAttacks().put(201, Attacks.Cut);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(148, Attacks.RockSlide);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(140, Attacks.SkullBash);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(128, Attacks.Dig);
		spc.getMappedAttacks().put(127, Attacks.Fissure);
		spc.getMappedAttacks().put(126, Attacks.Earthquake);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(119, Attacks.SeismicToss);
		spc.getMappedAttacks().put(117, Attacks.Submission);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(108, Attacks.BodySlam);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(103, Attacks.SwordsDance);
		spc.getMappedAttacks().put(38, Attacks.FurySwipes);
		spc.getMappedAttacks().put(31, Attacks.Swift);
		spc.getMappedAttacks().put(24, Attacks.PoisonSting);
		spc.getMappedAttacks().put(17, Attacks.Slash);
		spc.getMappedAttacks().put(10, Attacks.SandAttack);
		spc.getMappedAttacks().put(0, Attacks.Scratch);

		spc.setEvolution("028");

		spc.setEvolutionLevel(22);

		return spc;
	}

	private Specie sandslash() {
		Specie spc = new Specie();
		spc.setId("028");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Ground);
		spc.setName("Sandslash");
		spc.setImage(R.drawable.p28);
		spc.setImageBack(R.drawable.b28);
		spc.setImagePremium(R.drawable.s28);
		spc.setImagePremiumBack(R.drawable.e28);
		spc.setImageBig(R.drawable.w28);
		spc.setPointCost(10000);
		spc.setMaxHP(353);
		spc.setMaxAttack(298);
		spc.setMaxDefense(318);
		spc.setMaxSpeed(228);
		spc.setMaxSpecial(208);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(204, Attacks.Strength);
		spc.getMappedAttacks().put(201, Attacks.Cut);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(148, Attacks.RockSlide);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(140, Attacks.SkullBash);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(128, Attacks.Dig);
		spc.getMappedAttacks().put(127, Attacks.Fissure);
		spc.getMappedAttacks().put(126, Attacks.Earthquake);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(119, Attacks.SeismicToss);
		spc.getMappedAttacks().put(117, Attacks.Submission);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(108, Attacks.BodySlam);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(103, Attacks.SwordsDance);
		spc.getMappedAttacks().put(47, Attacks.FurySwipes);
		spc.getMappedAttacks().put(36, Attacks.Swift);
		spc.getMappedAttacks().put(27, Attacks.PoisonSting);
		spc.getMappedAttacks().put(17, Attacks.Slash);
		spc.getMappedAttacks().put(10, Attacks.SandAttack);
		spc.getMappedAttacks().put(0, Attacks.Scratch);

		return spc;
	}

	private Specie nidoranf() {
		Specie spc = new Specie();
		spc.setId("029");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Poison);
		spc.setName("Nidoran♀");
		spc.setImage(R.drawable.p29);
		spc.setImageBack(R.drawable.b29);
		spc.setImagePremium(R.drawable.s29);
		spc.setImagePremiumBack(R.drawable.e29);
		spc.setImageBig(R.drawable.w29);
		spc.setPointCost(1000);
		spc.setMaxHP(313);
		spc.setMaxAttack(192);
		spc.setMaxDefense(202);
		spc.setMaxSpeed(180);
		spc.setMaxSpecial(178);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(140, Attacks.SkullBash);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(133, Attacks.Reflect);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(125, Attacks.Thunder);
		spc.getMappedAttacks().put(124, Attacks.Thunderbolt);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(114, Attacks.Blizzard);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(108, Attacks.BodySlam);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(38, Attacks.FurySwipes);
		spc.getMappedAttacks().put(30, Attacks.Bite);
		spc.getMappedAttacks().put(23, Attacks.TailWhip);
		spc.getMappedAttacks().put(17, Attacks.PoisonSting);
		spc.getMappedAttacks().put(12, Attacks.DoubleKick);
		spc.getMappedAttacks().put(8, Attacks.Scratch);
		spc.getMappedAttacks().put(1, Attacks.Tackle);
		spc.getMappedAttacks().put(0, Attacks.Growl);

		spc.setEvolution("030");

		spc.setEvolutionLevel(16);

		return spc;
	}

	private Specie nidorina() {
		Specie spc = new Specie();
		spc.setId("030");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Poison);
		spc.setName("Nidorina");
		spc.setImage(R.drawable.p30);
		spc.setImageBack(R.drawable.b30);
		spc.setImagePremium(R.drawable.s30);
		spc.setImagePremiumBack(R.drawable.e30);
		spc.setImageBig(R.drawable.w30);
		spc.setPointCost(5000);
		spc.setMaxHP(343);
		spc.setMaxAttack(222);
		spc.setMaxDefense(232);
		spc.setMaxSpeed(210);
		spc.setMaxSpecial(208);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(140, Attacks.SkullBash);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(133, Attacks.Reflect);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(125, Attacks.Thunder);
		spc.getMappedAttacks().put(124, Attacks.Thunderbolt);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(114, Attacks.Blizzard);
		spc.getMappedAttacks().put(113, Attacks.IceBeam);
		spc.getMappedAttacks().put(112, Attacks.WaterGun);
		spc.getMappedAttacks().put(111, Attacks.Bubblebeam);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(108, Attacks.BodySlam);
		spc.getMappedAttacks().put(107, Attacks.HornDrill);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(46, Attacks.FurySwipes);
		spc.getMappedAttacks().put(36, Attacks.Bite);
		spc.getMappedAttacks().put(27, Attacks.TailWhip);
		spc.getMappedAttacks().put(19, Attacks.PoisonSting);
		spc.getMappedAttacks().put(12, Attacks.DoubleKick);
		spc.getMappedAttacks().put(8, Attacks.Scratch);
		spc.getMappedAttacks().put(1, Attacks.Tackle);
		spc.getMappedAttacks().put(0, Attacks.Growl);

		spc.setEvolution("031");

		spc.setEvolutionLevel(-1);

		return spc;
	}

	private Specie nidoqueen() {
		Specie spc = new Specie();
		spc.setId("031");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Poison);
		spc.getTypes().add(Types.Ground);
		spc.setName("Nidoqueen");
		spc.setImage(R.drawable.p31);
		spc.setImageBack(R.drawable.b31);
		spc.setImagePremium(R.drawable.s31);
		spc.setImagePremiumBack(R.drawable.e31);
		spc.setImageBig(R.drawable.w31);
		spc.setPointCost(10000);
		spc.setMaxHP(383);
		spc.setMaxAttack(262);
		spc.setMaxDefense(272);
		spc.setMaxSpeed(250);
		spc.setMaxSpecial(248);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(204, Attacks.Strength);
		spc.getMappedAttacks().put(203, Attacks.Surf);
		spc.getMappedAttacks().put(150, Attacks.Substitute);
		spc.getMappedAttacks().put(148, Attacks.RockSlide);
		spc.getMappedAttacks().put(144, Attacks.Rest);
		spc.getMappedAttacks().put(140, Attacks.SkullBash);
		spc.getMappedAttacks().put(139, Attacks.Swift);
		spc.getMappedAttacks().put(138, Attacks.FireBlast);
		spc.getMappedAttacks().put(134, Attacks.Bide);
		spc.getMappedAttacks().put(133, Attacks.Reflect);
		spc.getMappedAttacks().put(132, Attacks.DoubleTeam);
		spc.getMappedAttacks().put(131, Attacks.Mimic);
		spc.getMappedAttacks().put(127, Attacks.Fissure);
		spc.getMappedAttacks().put(126, Attacks.Earthquake);
		spc.getMappedAttacks().put(125, Attacks.Thunder);
		spc.getMappedAttacks().put(124, Attacks.Thunderbolt);
		spc.getMappedAttacks().put(120, Attacks.Rage);
		spc.getMappedAttacks().put(119, Attacks.SeismicToss);
		spc.getMappedAttacks().put(118, Attacks.Counter);
		spc.getMappedAttacks().put(117, Attacks.Submission);
		spc.getMappedAttacks().put(116, Attacks.PayDay);
		spc.getMappedAttacks().put(115, Attacks.HyperBeam);
		spc.getMappedAttacks().put(114, Attacks.Blizzard);
		spc.getMappedAttacks().put(113, Attacks.IceBeam);
		spc.getMappedAttacks().put(112, Attacks.WaterGun);
		spc.getMappedAttacks().put(111, Attacks.Bubblebeam);
		spc.getMappedAttacks().put(110, Attacks.DoubleEdge);
		spc.getMappedAttacks().put(109, Attacks.TakeDown);
		spc.getMappedAttacks().put(108, Attacks.BodySlam);
		spc.getMappedAttacks().put(107, Attacks.HornDrill);
		spc.getMappedAttacks().put(106, Attacks.Toxic);
		spc.getMappedAttacks().put(105, Attacks.MegaKick);
		spc.getMappedAttacks().put(101, Attacks.MegaPunch);
		spc.getMappedAttacks().put(23, Attacks.BodySlam);
		spc.getMappedAttacks().put(14, Attacks.PoisonSting);
		spc.getMappedAttacks().put(12, Attacks.DoubleKick);
		spc.getMappedAttacks().put(3, Attacks.TailWhip);
		spc.getMappedAttacks().put(2, Attacks.Scratch);
		spc.getMappedAttacks().put(1, Attacks.Tackle);

		return spc;
	}

	private Specie nidoranm() {
		Specie spc = new Specie();
		spc.setId("032");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Poison);
		spc.setName("Nidoran♂");
		spc.setImage(R.drawable.p32);
		spc.setImageBack(R.drawable.b32);
		spc.setImagePremium(R.drawable.s32);
		spc.setImagePremiumBack(R.drawable.e32);
		spc.setImageBig(R.drawable.w32);
		spc.setPointCost(1000);
		spc.setMaxHP(295);
		spc.setMaxAttack(212);
		spc.setMaxDefense(178);
		spc.setMaxSpeed(198);
		spc.setMaxSpecial(178);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("033");

		spc.setEvolutionLevel(16);

		return spc;
	}

	private Specie nidorino() {
		Specie spc = new Specie();
		spc.setId("033");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Poison);
		spc.setName("Nidorino");
		spc.setImage(R.drawable.p33);
		spc.setImageBack(R.drawable.b33);
		spc.setImagePremium(R.drawable.s33);
		spc.setImagePremiumBack(R.drawable.e33);
		spc.setImageBig(R.drawable.w33);
		spc.setPointCost(5000);
		spc.setMaxHP(325);
		spc.setMaxAttack(242);
		spc.setMaxDefense(212);
		spc.setMaxSpeed(228);
		spc.setMaxSpecial(208);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("034");

		spc.setEvolutionLevel(-1);

		return spc;
	}

	private Specie nidoking() {
		Specie spc = new Specie();
		spc.setId("034");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Poison);
		spc.getTypes().add(Types.Ground);
		spc.setName("Nidoking");
		spc.setImage(R.drawable.p34);
		spc.setImageBack(R.drawable.b34);
		spc.setImagePremium(R.drawable.s34);
		spc.setImagePremiumBack(R.drawable.e34);
		spc.setImageBig(R.drawable.w34);
		spc.setPointCost(10000);
		spc.setMaxHP(365);
		spc.setMaxAttack(282);
		spc.setMaxDefense(252);
		spc.setMaxSpeed(268);
		spc.setMaxSpecial(248);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie clefairy() {
		Specie spc = new Specie();
		spc.setId("035");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.setName("Clefairy");
		spc.setImage(R.drawable.p35);
		spc.setImageBack(R.drawable.b35);
		spc.setImagePremium(R.drawable.s35);
		spc.setImagePremiumBack(R.drawable.e35);
		spc.setImageBig(R.drawable.w35);
		spc.setPointCost(5000);
		spc.setMaxHP(343);
		spc.setMaxAttack(188);
		spc.setMaxDefense(194);
		spc.setMaxSpeed(168);
		spc.setMaxSpecial(218);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("036");

		spc.setEvolutionLevel(-1);

		return spc;
	}

	private Specie clefable() {
		Specie spc = new Specie();
		spc.setId("036");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.setName("Clefable");
		spc.setImage(R.drawable.p36);
		spc.setImageBack(R.drawable.b36);
		spc.setImagePremium(R.drawable.s36);
		spc.setImagePremiumBack(R.drawable.e36);
		spc.setImageBig(R.drawable.w36);
		spc.setPointCost(10000);
		spc.setMaxHP(393);
		spc.setMaxAttack(238);
		spc.setMaxDefense(244);
		spc.setMaxSpeed(218);
		spc.setMaxSpecial(268);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie vulpix() {
		Specie spc = new Specie();
		spc.setId("037");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Fire);
		spc.setName("Vulpix");
		spc.setImage(R.drawable.p37);
		spc.setImageBack(R.drawable.b37);
		spc.setImagePremium(R.drawable.s37);
		spc.setImagePremiumBack(R.drawable.e37);
		spc.setImageBig(R.drawable.w37);
		spc.setPointCost(5000);
		spc.setMaxHP(279);
		spc.setMaxAttack(180);
		spc.setMaxDefense(178);
		spc.setMaxSpeed(228);
		spc.setMaxSpecial(228);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("038");

		spc.setEvolutionLevel(-1);

		return spc;
	}

	private Specie ninetales() {
		Specie spc = new Specie();
		spc.setId("038");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Fire);
		spc.setName("Ninetales");
		spc.setImage(R.drawable.p38);
		spc.setImageBack(R.drawable.b38);
		spc.setImagePremium(R.drawable.s38);
		spc.setImagePremiumBack(R.drawable.e38);
		spc.setImageBig(R.drawable.w38);		
		spc.setPointCost(10000);
		spc.setMaxHP(349);
		spc.setMaxAttack(250);
		spc.setMaxDefense(248);
		spc.setMaxSpeed(298);
		spc.setMaxSpecial(298);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie jigglypuff() {
		Specie spc = new Specie();
		spc.setId("039");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.setName("Jigglypuff");
		spc.setImage(R.drawable.p39);
		spc.setImageBack(R.drawable.b39);
		spc.setImagePremium(R.drawable.s39);
		spc.setImagePremiumBack(R.drawable.e39);
		spc.setImageBig(R.drawable.w39);
		spc.setPointCost(5000);
		spc.setMaxHP(433);
		spc.setMaxAttack(188);
		spc.setMaxDefense(138);
		spc.setMaxSpeed(138);
		spc.setMaxSpecial(148);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("040");

		spc.setEvolutionLevel(-1);

		return spc;
	}

	private Specie wigglytuff() {
		Specie spc = new Specie();
		spc.setId("040");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.setName("Wigglytuff");
		spc.setImage(R.drawable.p40);
		spc.setImageBack(R.drawable.b40);
		spc.setImagePremium(R.drawable.s40);
		spc.setImagePremiumBack(R.drawable.e40);
		spc.setImageBig(R.drawable.w40);
		spc.setPointCost(10000);
		spc.setMaxHP(483);
		spc.setMaxAttack(238);
		spc.setMaxDefense(188);
		spc.setMaxSpeed(188);
		spc.setMaxSpecial(198);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie zubat() {
		Specie spc = new Specie();
		spc.setId("041");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Poison);
		spc.getTypes().add(Types.Flying);
		spc.setName("Zubat");
		spc.setImage(R.drawable.p41);
		spc.setImageBack(R.drawable.b41);
		spc.setImagePremium(R.drawable.s41);
		spc.setImagePremiumBack(R.drawable.e41);
		spc.setImageBig(R.drawable.w41);
		spc.setPointCost(5000);
		spc.setMaxHP(283);
		spc.setMaxAttack(188);
		spc.setMaxDefense(168);
		spc.setMaxSpeed(208);
		spc.setMaxSpecial(178);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("041");

		spc.setEvolutionLevel(22);

		return spc;
	}

	private Specie golbat() {
		Specie spc = new Specie();
		spc.setId("042");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Poison);
		spc.getTypes().add(Types.Flying);
		spc.setName("Golbat");
		spc.setImage(R.drawable.p42);
		spc.setImageBack(R.drawable.b42);
		spc.setImagePremium(R.drawable.s42);
		spc.setImagePremiumBack(R.drawable.e42);
		spc.setImageBig(R.drawable.w42);
		spc.setPointCost(15000);
		spc.setMaxHP(353);
		spc.setMaxAttack(258);
		spc.setMaxDefense(238);
		spc.setMaxSpeed(278);
		spc.setMaxSpecial(248);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie oddish() {
		Specie spc = new Specie();
		spc.setId("043");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Grass);
		spc.getTypes().add(Types.Poison);
		spc.setName("Oddish");
		spc.setImage(R.drawable.p43);
		spc.setImageBack(R.drawable.b43);
		spc.setImagePremium(R.drawable.s43);
		spc.setImagePremiumBack(R.drawable.e43);
		spc.setImageBig(R.drawable.w43);
		spc.setPointCost(5000);
		spc.setMaxHP(293);
		spc.setMaxAttack(198);
		spc.setMaxDefense(208);
		spc.setMaxSpeed(158);
		spc.setMaxSpecial(248);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("043");

		spc.setEvolutionLevel(21);

		return spc;
	}

	private Specie gloom() {
		Specie spc = new Specie();
		spc.setId("044");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Grass);
		spc.getTypes().add(Types.Poison);
		spc.setName("Gloom");
		spc.setImage(R.drawable.p44);
		spc.setImageBack(R.drawable.b44);
		spc.setImagePremium(R.drawable.s44);
		spc.setImagePremiumBack(R.drawable.e44);
		spc.setImageBig(R.drawable.w44);
		spc.setPointCost(10000);
		spc.setMaxHP(323);
		spc.setMaxAttack(228);
		spc.setMaxDefense(238);
		spc.setMaxSpeed(178);
		spc.setMaxSpecial(268);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("045");

		spc.setEvolutionLevel(-1);

		return spc;
	}

	private Specie vileplume() {
		Specie spc = new Specie();
		spc.setId("045");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Grass);
		spc.getTypes().add(Types.Poison);
		spc.setName("Vileplume");
		spc.setImage(R.drawable.p45);
		spc.setImageBack(R.drawable.b45);
		spc.setImagePremium(R.drawable.s45);
		spc.setImagePremiumBack(R.drawable.e45);
		spc.setImageBig(R.drawable.w45);
		spc.setPointCost(30000);
		spc.setMaxHP(353);
		spc.setMaxAttack(258);
		spc.setMaxDefense(268);
		spc.setMaxSpeed(198);
		spc.setMaxSpecial(298);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie paras() {
		Specie spc = new Specie();
		spc.setId("046");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Bug);
		spc.getTypes().add(Types.Grass);
		spc.setName("Paras");
		spc.setImage(R.drawable.p46);
		spc.setImageBack(R.drawable.b46);
		spc.setImagePremium(R.drawable.s46);
		spc.setImagePremiumBack(R.drawable.e46);
		spc.setImageBig(R.drawable.w46);
		spc.setPointCost(5000);
		spc.setMaxHP(273);
		spc.setMaxAttack(238);
		spc.setMaxDefense(208);
		spc.setMaxSpeed(148);
		spc.setMaxSpecial(208);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("047");

		spc.setEvolutionLevel(24);

		return spc;
	}

	private Specie parasect() {
		Specie spc = new Specie();
		spc.setId("047");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Bug);
		spc.getTypes().add(Types.Grass);
		spc.setName("Parasect");
		spc.setImage(R.drawable.p47);
		spc.setImageBack(R.drawable.b47);
		spc.setImagePremium(R.drawable.s47);
		spc.setImagePremiumBack(R.drawable.e47);
		spc.setImageBig(R.drawable.w47);
		spc.setPointCost(15000);
		spc.setMaxHP(323);
		spc.setMaxAttack(288);
		spc.setMaxDefense(258);
		spc.setMaxSpeed(158);
		spc.setMaxSpecial(258);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie venonat() {
		Specie spc = new Specie();
		spc.setId("048");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Bug);
		spc.getTypes().add(Types.Poison);
		spc.setName("Venonat");
		spc.setImage(R.drawable.p48);
		spc.setImageBack(R.drawable.b48);
		spc.setImagePremium(R.drawable.s48);
		spc.setImagePremiumBack(R.drawable.e48);
		spc.setImageBig(R.drawable.w48);
		spc.setPointCost(10000);
		spc.setMaxHP(323);
		spc.setMaxAttack(208);
		spc.setMaxDefense(198);
		spc.setMaxSpeed(188);
		spc.setMaxSpecial(178);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("049");

		spc.setEvolutionLevel(31);

		return spc;
	}

	private Specie venomoth() {
		Specie spc = new Specie();
		spc.setId("049");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Bug);
		spc.getTypes().add(Types.Poison);
		spc.setName("Venomoth");
		spc.setImage(R.drawable.p49);
		spc.setImageBack(R.drawable.b49);
		spc.setImagePremium(R.drawable.s49);
		spc.setImagePremiumBack(R.drawable.e49);
		spc.setImageBig(R.drawable.w49);
		spc.setPointCost(20000);
		spc.setMaxHP(343);
		spc.setMaxAttack(228);
		spc.setMaxDefense(218);
		spc.setMaxSpeed(278);
		spc.setMaxSpecial(278);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie digglet() {
		Specie spc = new Specie();
		spc.setId("050");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Ground);
		spc.setName("Diglet");
		spc.setImage(R.drawable.p50);
		spc.setImageBack(R.drawable.b50);
		spc.setImagePremium(R.drawable.s50);
		spc.setImagePremiumBack(R.drawable.e50);
		spc.setImageBig(R.drawable.w50);
		spc.setPointCost(2500);
		spc.setMaxHP(223);
		spc.setMaxAttack(208);
		spc.setMaxDefense(148);
		spc.setMaxSpeed(288);
		spc.setMaxSpecial(188);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("051");

		spc.setEvolutionLevel(26);

		return spc;
	}

	private Specie dugtrio() {
		Specie spc = new Specie();
		spc.setId("051");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Ground);
		spc.setName("Dugtrio");
		spc.setImage(R.drawable.p51);
		spc.setImageBack(R.drawable.b51);
		spc.setImagePremium(R.drawable.s51);
		spc.setImagePremiumBack(R.drawable.e51);
		spc.setImageBig(R.drawable.w51);
		spc.setPointCost(5000);
		spc.setMaxHP(273);
		spc.setMaxAttack(258);
		spc.setMaxDefense(198);
		spc.setMaxSpeed(338);
		spc.setMaxSpecial(238);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie meowth() {
		Specie spc = new Specie();
		spc.setId("052");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.setName("Meowth");
		spc.setImage(R.drawable.p52);
		spc.setImageBack(R.drawable.b52);
		spc.setImagePremium(R.drawable.s52);
		spc.setImagePremiumBack(R.drawable.e52);
		spc.setImageBig(R.drawable.w52);
		spc.setPointCost(5000);
		spc.setMaxHP(283);
		spc.setMaxAttack(188);
		spc.setMaxDefense(168);
		spc.setMaxSpeed(278);
		spc.setMaxSpecial(178);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("053");

		spc.setEvolutionLevel(28);

		return spc;
	}

	private Specie persian() {
		Specie spc = new Specie();
		spc.setId("053");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.setName("Persian");
		spc.setImage(R.drawable.p53);
		spc.setImageBack(R.drawable.b53);
		spc.setImagePremium(R.drawable.s53);
		spc.setImagePremiumBack(R.drawable.e53);
		spc.setImageBig(R.drawable.w53);
		spc.setPointCost(5000);
		spc.setMaxHP(333);
		spc.setMaxAttack(238);
		spc.setMaxDefense(218);
		spc.setMaxSpeed(328);
		spc.setMaxSpecial(228);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie psyduck() {
		Specie spc = new Specie();
		spc.setId("054");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.setName("Psyduck");
		spc.setImage(R.drawable.p54);
		spc.setImageBack(R.drawable.b54);
		spc.setImagePremium(R.drawable.s54);
		spc.setImagePremiumBack(R.drawable.e54);
		spc.setImageBig(R.drawable.w54);
		spc.setPointCost(5000);
		spc.setMaxHP(303);
		spc.setMaxAttack(202);
		spc.setMaxDefense(194);
		spc.setMaxSpeed(208);
		spc.setMaxSpecial(198);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("055");

		spc.setEvolutionLevel(33);

		return spc;
	}

	private Specie golduck() {
		Specie spc = new Specie();
		spc.setId("055");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.setName("Golduck");
		spc.setImage(R.drawable.p55);
		spc.setImageBack(R.drawable.b55);
		spc.setImagePremium(R.drawable.s55);
		spc.setImagePremiumBack(R.drawable.e55);
		spc.setImageBig(R.drawable.w55);
		spc.setPointCost(7500);
		spc.setMaxHP(363);
		spc.setMaxAttack(262);
		spc.setMaxDefense(254);
		spc.setMaxSpeed(268);
		spc.setMaxSpecial(258);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie mankey() {
		Specie spc = new Specie();
		spc.setId("056");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Fighting);
		spc.setName("Mankey");
		spc.setImage(R.drawable.p56);
		spc.setImageBack(R.drawable.b56);
		spc.setImagePremium(R.drawable.s56);
		spc.setImagePremiumBack(R.drawable.e56);
		spc.setImageBig(R.drawable.w56);
		spc.setPointCost(2500);
		spc.setMaxHP(283);
		spc.setMaxAttack(258);
		spc.setMaxDefense(168);
		spc.setMaxSpeed(238);
		spc.setMaxSpecial(168);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("057");

		spc.setEvolutionLevel(28);

		return spc;
	}

	private Specie primeape() {
		Specie spc = new Specie();
		spc.setId("057");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Fighting);
		spc.setName("Primeape");
		spc.setImage(R.drawable.p57);
		spc.setImageBack(R.drawable.b57);
		spc.setImagePremium(R.drawable.s57);
		spc.setImagePremiumBack(R.drawable.e57);
		spc.setImageBig(R.drawable.w57);
		spc.setPointCost(5000);
		spc.setMaxHP(333);
		spc.setMaxAttack(308);
		spc.setMaxDefense(218);
		spc.setMaxSpeed(288);
		spc.setMaxSpecial(218);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie growlithe() {
		Specie spc = new Specie();
		spc.setId("058");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Fire);
		spc.setName("Growlithe");
		spc.setImage(R.drawable.p58);
		spc.setImageBack(R.drawable.b58);
		spc.setImagePremium(R.drawable.s58);
		spc.setImagePremiumBack(R.drawable.e58);
		spc.setImageBig(R.drawable.w58);
		spc.setPointCost(5000);
		spc.setMaxHP(313);
		spc.setMaxAttack(238);
		spc.setMaxDefense(188);
		spc.setMaxSpeed(218);
		spc.setMaxSpecial(198);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("059");

		spc.setEvolutionLevel(-1);

		return spc;
	}

	private Specie arcanine() {
		Specie spc = new Specie();
		spc.setId("059");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Fire);
		spc.setName("Arcanine");
		spc.setImage(R.drawable.p59);
		spc.setImageBack(R.drawable.b59);
		spc.setImagePremium(R.drawable.s59);
		spc.setImagePremiumBack(R.drawable.e59);
		spc.setImageBig(R.drawable.w59);
		spc.setPointCost(1000);
		spc.setMaxHP(383);
		spc.setMaxAttack(318);
		spc.setMaxDefense(258);
		spc.setMaxSpeed(288);
		spc.setMaxSpecial(258);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie poliwag() {
		Specie spc = new Specie();
		spc.setId("060");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.setName("Poliwag");
		spc.setImage(R.drawable.p60);
		spc.setImageBack(R.drawable.b60);
		spc.setImagePremium(R.drawable.s60);
		spc.setImagePremiumBack(R.drawable.e60);
		spc.setImageBig(R.drawable.w60);
		spc.setPointCost(2500);
		spc.setMaxHP(283);
		spc.setMaxAttack(198);
		spc.setMaxDefense(178);
		spc.setMaxSpeed(278);
		spc.setMaxSpecial(178);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("061");

		spc.setEvolutionLevel(25);

		return spc;
	}

	private Specie poliwhirl() {
		Specie spc = new Specie();
		spc.setId("061");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.setName("Poliwhirl");
		spc.setImage(R.drawable.p61);
		spc.setImageBack(R.drawable.b61);
		spc.setImagePremium(R.drawable.s61);
		spc.setImagePremiumBack(R.drawable.e61);
		spc.setImageBig(R.drawable.w61);
		spc.setPointCost(5000);
		spc.setMaxHP(333);
		spc.setMaxAttack(228);
		spc.setMaxDefense(228);
		spc.setMaxSpeed(278);
		spc.setMaxSpecial(198);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("062");

		spc.setEvolutionLevel(-1);

		return spc;
	}

	private Specie poliwrath() {
		Specie spc = new Specie();
		spc.setId("062");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.getTypes().add(Types.Fighting);
		spc.setName("Poliwrath");
		spc.setImage(R.drawable.p62);
		spc.setImageBack(R.drawable.b62);
		spc.setImagePremium(R.drawable.s62);
		spc.setImagePremiumBack(R.drawable.e62);
		spc.setImageBig(R.drawable.w62);
		spc.setPointCost(1000);
		spc.setMaxHP(383);
		spc.setMaxAttack(268);
		spc.setMaxDefense(288);
		spc.setMaxSpeed(238);
		spc.setMaxSpecial(238);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie abra() {
		Specie spc = new Specie();
		spc.setId("063");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Psychic);
		spc.setName("Abra");
		spc.setImage(R.drawable.p63);
		spc.setImageBack(R.drawable.b63);
		spc.setImagePremium(R.drawable.s63);
		spc.setImagePremiumBack(R.drawable.e63);
		spc.setImageBig(R.drawable.w63);
		spc.setPointCost(1000);
		spc.setMaxHP(253);
		spc.setMaxAttack(138);
		spc.setMaxDefense(128);
		spc.setMaxSpeed(278);
		spc.setMaxSpecial(308);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("064");

		spc.setEvolutionLevel(16);

		return spc;
	}

	private Specie kadabra() {
		Specie spc = new Specie();
		spc.setId("064");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Psychic);
		spc.setName("Kadabra");
		spc.setImage(R.drawable.p64);
		spc.setImageBack(R.drawable.b64);
		spc.setImagePremium(R.drawable.s64);
		spc.setImagePremiumBack(R.drawable.e64);
		spc.setImageBig(R.drawable.w64);
		spc.setPointCost(5000);
		spc.setMaxHP(283);
		spc.setMaxAttack(168);
		spc.setMaxDefense(158);
		spc.setMaxSpeed(308);
		spc.setMaxSpecial(338);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("065");

		spc.setEvolutionLevel(-1);

		return spc;
	}

	private Specie alakazam() {
		Specie spc = new Specie();
		spc.setId("065");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Psychic);
		spc.setName("Alakazam");
		spc.setImage(R.drawable.p65);
		spc.setImageBack(R.drawable.b65);
		spc.setImagePremium(R.drawable.s65);
		spc.setImagePremiumBack(R.drawable.e65);
		spc.setImageBig(R.drawable.w65);
		spc.setPointCost(2000);
		spc.setMaxHP(313);
		spc.setMaxAttack(198);
		spc.setMaxDefense(188);
		spc.setMaxSpeed(338);
		spc.setMaxSpecial(368);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie machop() {
		Specie spc = new Specie();
		spc.setId("066");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Fighting);
		spc.setName("Machop");
		spc.setImage(R.drawable.p66);
		spc.setImageBack(R.drawable.b66);
		spc.setImagePremium(R.drawable.s66);
		spc.setImagePremiumBack(R.drawable.e66);
		spc.setImageBig(R.drawable.w66);
		spc.setPointCost(2500);
		spc.setMaxHP(343);
		spc.setMaxAttack(258);
		spc.setMaxDefense(198);
		spc.setMaxSpeed(168);
		spc.setMaxSpecial(168);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("067");

		spc.setEvolutionLevel(28);

		return spc;
	}

	private Specie machoke() {
		Specie spc = new Specie();
		spc.setId("067");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Fighting);
		spc.setName("Machoke");
		spc.setImage(R.drawable.p67);
		spc.setImageBack(R.drawable.b67);
		spc.setImagePremium(R.drawable.s67);
		spc.setImagePremiumBack(R.drawable.e67);
		spc.setImageBig(R.drawable.w67);
		spc.setPointCost(5000);
		spc.setMaxHP(363);
		spc.setMaxAttack(298);
		spc.setMaxDefense(238);
		spc.setMaxSpeed(188);
		spc.setMaxSpecial(198);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("068");

		spc.setEvolutionLevel(-1);

		return spc;
	}

	private Specie machamp() {
		Specie spc = new Specie();
		spc.setId("068");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Fighting);
		spc.setName("Machamp");
		spc.setImage(R.drawable.p68);
		spc.setImageBack(R.drawable.b68);
		spc.setImagePremium(R.drawable.s68);
		spc.setImagePremiumBack(R.drawable.e68);
		spc.setImageBig(R.drawable.w68);
		spc.setPointCost(10000);
		spc.setMaxHP(383);
		spc.setMaxAttack(358);
		spc.setMaxDefense(258);
		spc.setMaxSpeed(208);
		spc.setMaxSpecial(228);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie bellsprout() {
		Specie spc = new Specie();
		spc.setId("069");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Grass);
		spc.getTypes().add(Types.Poison);
		spc.setName("Bellsprout");
		spc.setImage(R.drawable.p69);
		spc.setImageBack(R.drawable.b69);
		spc.setImagePremium(R.drawable.s69);
		spc.setImagePremiumBack(R.drawable.e69);
		spc.setImageBig(R.drawable.w69);
		spc.setPointCost(2500);
		spc.setMaxHP(303);
		spc.setMaxAttack(248);
		spc.setMaxDefense(168);
		spc.setMaxSpeed(178);
		spc.setMaxSpecial(238);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("070");

		spc.setEvolutionLevel(21);

		return spc;
	}

	private Specie weepinbell() {
		Specie spc = new Specie();
		spc.setId("070");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Grass);
		spc.getTypes().add(Types.Poison);
		spc.setName("Weepinbell");
		spc.setImage(R.drawable.p70);
		spc.setImageBack(R.drawable.b70);
		spc.setImagePremium(R.drawable.s70);
		spc.setImagePremiumBack(R.drawable.e70);
		spc.setImageBig(R.drawable.w70);
		spc.setPointCost(5000);
		spc.setMaxHP(333);
		spc.setMaxAttack(278);
		spc.setMaxDefense(198);
		spc.setMaxSpeed(208);
		spc.setMaxSpecial(268);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("071");

		spc.setEvolutionLevel(-1);

		return spc;
	}

	private Specie victreebel() {
		Specie spc = new Specie();
		spc.setId("071");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Grass);
		spc.getTypes().add(Types.Poison);
		spc.setName("Victreebel");
		spc.setImage(R.drawable.p71);
		spc.setImageBack(R.drawable.b71);
		spc.setImagePremium(R.drawable.s71);
		spc.setImagePremiumBack(R.drawable.e71);
		spc.setImageBig(R.drawable.w71);
		spc.setPointCost(15000);
		spc.setMaxHP(363);
		spc.setMaxAttack(308);
		spc.setMaxDefense(228);
		spc.setMaxSpeed(238);
		spc.setMaxSpecial(298);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie tentacool() {
		Specie spc = new Specie();
		spc.setId("072");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.getTypes().add(Types.Poison);
		spc.setName("Tentacool");
		spc.setImage(R.drawable.p72);
		spc.setImageBack(R.drawable.b72);
		spc.setImagePremium(R.drawable.s72);
		spc.setImagePremiumBack(R.drawable.e72);
		spc.setImageBig(R.drawable.w72);
		spc.setPointCost(5000);
		spc.setMaxHP(283);
		spc.setMaxAttack(178);
		spc.setMaxDefense(168);
		spc.setMaxSpeed(238);
		spc.setMaxSpecial(298);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("073");

		spc.setEvolutionLevel(30);

		return spc;
	}

	private Specie tentacruel() {
		Specie spc = new Specie();
		spc.setId("073");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.getTypes().add(Types.Poison);
		spc.setName("Tentacruel");
		spc.setImage(R.drawable.p73);
		spc.setImageBack(R.drawable.b73);
		spc.setImagePremium(R.drawable.s73);
		spc.setImagePremiumBack(R.drawable.e73);
		spc.setImageBig(R.drawable.w73);
		spc.setPointCost(10000);
		spc.setMaxHP(363);
		spc.setMaxAttack(238);
		spc.setMaxDefense(228);
		spc.setMaxSpeed(298);
		spc.setMaxSpecial(338);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie geodude() {
		Specie spc = new Specie();
		spc.setId("074");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Ground);
		spc.getTypes().add(Types.Rock);
		spc.setName("Geodude");
		spc.setImage(R.drawable.p74);
		spc.setImageBack(R.drawable.b74);
		spc.setImagePremium(R.drawable.s74);
		spc.setImagePremiumBack(R.drawable.e74);
		spc.setImageBig(R.drawable.w74);
		spc.setPointCost(5000);
		spc.setMaxHP(283);
		spc.setMaxAttack(258);
		spc.setMaxDefense(298);
		spc.setMaxSpeed(138);
		spc.setMaxSpecial(158);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("075");

		spc.setEvolutionLevel(25);

		return spc;
	}

	private Specie graveler() {
		Specie spc = new Specie();
		spc.setId("075");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Ground);
		spc.getTypes().add(Types.Rock);
		spc.setName("Graveler");
		spc.setImage(R.drawable.p75);
		spc.setImageBack(R.drawable.b75);
		spc.setImagePremium(R.drawable.s75);
		spc.setImagePremiumBack(R.drawable.e75);
		spc.setImageBig(R.drawable.w75);
		spc.setPointCost(10000);
		spc.setMaxHP(313);
		spc.setMaxAttack(288);
		spc.setMaxDefense(328);
		spc.setMaxSpeed(168);
		spc.setMaxSpecial(188);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("076");

		spc.setEvolutionLevel(-1);

		return spc;
	}

	private Specie golem() {
		Specie spc = new Specie();
		spc.setId("076");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Ground);
		spc.getTypes().add(Types.Rock);
		spc.setName("Golem");
		spc.setImage(R.drawable.p76);
		spc.setImageBack(R.drawable.b76);
		spc.setImagePremium(R.drawable.s76);
		spc.setImagePremiumBack(R.drawable.e76);
		spc.setImageBig(R.drawable.w76);
		spc.setPointCost(15000);
		spc.setMaxHP(363);
		spc.setMaxAttack(318);
		spc.setMaxDefense(358);
		spc.setMaxSpeed(188);
		spc.setMaxSpecial(208);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie ponyta() {
		Specie spc = new Specie();
		spc.setId("077");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Fire);
		spc.setName("Ponyta");
		spc.setImage(R.drawable.p77);
		spc.setImageBack(R.drawable.b77);
		spc.setImagePremium(R.drawable.s77);
		spc.setImagePremiumBack(R.drawable.e77);
		spc.setImageBig(R.drawable.w77);
		spc.setPointCost(5000);
		spc.setMaxHP(303);
		spc.setMaxAttack(268);
		spc.setMaxDefense(208);
		spc.setMaxSpeed(278);
		spc.setMaxSpecial(228);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("077");

		spc.setEvolutionLevel(40);

		return spc;
	}

	private Specie rapidash() {
		Specie spc = new Specie();
		spc.setId("078");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Fire);
		spc.setName("Rapidash");
		spc.setImage(R.drawable.p78);
		spc.setImageBack(R.drawable.b78);
		spc.setImagePremium(R.drawable.s78);
		spc.setImagePremiumBack(R.drawable.e78);
		spc.setImageBig(R.drawable.w78);
		spc.setPointCost(20000);
		spc.setMaxHP(333);
		spc.setMaxAttack(298);
		spc.setMaxDefense(238);
		spc.setMaxSpeed(308);
		spc.setMaxSpecial(258);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie slowpoke() {
		Specie spc = new Specie();
		spc.setId("079");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.getTypes().add(Types.Psychic);
		spc.setName("Slowpoke");
		spc.setImage(R.drawable.p79);
		spc.setImageBack(R.drawable.b79);
		spc.setImagePremium(R.drawable.s79);
		spc.setImagePremiumBack(R.drawable.e79);
		spc.setImageBig(R.drawable.w79);
		spc.setPointCost(5000);
		spc.setMaxHP(383);
		spc.setMaxAttack(228);
		spc.setMaxDefense(228);
		spc.setMaxSpeed(128);
		spc.setMaxSpecial(178);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("080");

		spc.setEvolutionLevel(37);

		return spc;
	}

	private Specie slowbro() {
		Specie spc = new Specie();
		spc.setId("080");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.getTypes().add(Types.Psychic);
		spc.setName("Slowbro");
		spc.setImage(R.drawable.p80);
		spc.setImageBack(R.drawable.b80);
		spc.setImagePremium(R.drawable.s80);
		spc.setImagePremiumBack(R.drawable.e80);
		spc.setImageBig(R.drawable.w80);
		spc.setPointCost(10000);
		spc.setMaxHP(393);
		spc.setMaxAttack(248);
		spc.setMaxDefense(318);
		spc.setMaxSpeed(158);
		spc.setMaxSpecial(258);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie magnemite() {
		Specie spc = new Specie();
		spc.setId("081");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Electric);
		spc.setName("Magnemite");
		spc.setImage(R.drawable.p81);
		spc.setImageBack(R.drawable.b81);
		spc.setImagePremium(R.drawable.s81);
		spc.setImagePremiumBack(R.drawable.e81);
		spc.setImageBig(R.drawable.w81);
		spc.setPointCost(5000);
		spc.setMaxHP(253);
		spc.setMaxAttack(168);
		spc.setMaxDefense(238);
		spc.setMaxSpeed(188);
		spc.setMaxSpecial(288);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("081");

		spc.setEvolutionLevel(30);

		return spc;
	}

	private Specie magneton() {
		Specie spc = new Specie();
		spc.setId("082");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Electric);
		spc.setName("Magneton");
		spc.setImage(R.drawable.p82);
		spc.setImageBack(R.drawable.b82);
		spc.setImagePremium(R.drawable.s82);
		spc.setImagePremiumBack(R.drawable.e82);
		spc.setImageBig(R.drawable.w82);
		spc.setPointCost(10000);
		spc.setMaxHP(303);
		spc.setMaxAttack(218);
		spc.setMaxDefense(288);
		spc.setMaxSpeed(238);
		spc.setMaxSpecial(338);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie farfetchd() {
		Specie spc = new Specie();
		spc.setId("083");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.getTypes().add(Types.Flying);
		spc.setName("Farfetch'd");
		spc.setImage(R.drawable.p83);
		spc.setImageBack(R.drawable.b83);
		spc.setImagePremium(R.drawable.s83);
		spc.setImagePremiumBack(R.drawable.e83);
		spc.setImageBig(R.drawable.w83);
		spc.setPointCost(15000);
		spc.setMaxHP(307);
		spc.setMaxAttack(228);
		spc.setMaxDefense(208);
		spc.setMaxSpeed(218);
		spc.setMaxSpecial(214);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie doduo() {
		Specie spc = new Specie();
		spc.setId("084");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.getTypes().add(Types.Flying);
		spc.setName("Doduo");
		spc.setImage(R.drawable.p84);
		spc.setImageBack(R.drawable.b84);
		spc.setImagePremium(R.drawable.s84);
		spc.setImagePremiumBack(R.drawable.e84);
		spc.setImageBig(R.drawable.w84);
		spc.setPointCost(5000);
		spc.setMaxHP(273);
		spc.setMaxAttack(268);
		spc.setMaxDefense(188);
		spc.setMaxSpeed(248);
		spc.setMaxSpecial(168);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("085");

		spc.setEvolutionLevel(31);

		return spc;
	}

	private Specie dodrio() {
		Specie spc = new Specie();
		spc.setId("085");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.getTypes().add(Types.Flying);
		spc.setName("Dodrio");
		spc.setImage(R.drawable.p85);
		spc.setImageBack(R.drawable.b85);
		spc.setImagePremium(R.drawable.s85);
		spc.setImagePremiumBack(R.drawable.e85);
		spc.setImageBig(R.drawable.w85);
		spc.setPointCost(10000);
		spc.setMaxHP(323);
		spc.setMaxAttack(318);
		spc.setMaxDefense(238);
		spc.setMaxSpeed(298);
		spc.setMaxSpecial(218);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie seel() {
		Specie spc = new Specie();
		spc.setId("086");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.setName("Seel");
		spc.setImage(R.drawable.p86);
		spc.setImageBack(R.drawable.b86);
		spc.setImagePremium(R.drawable.s86);
		spc.setImagePremiumBack(R.drawable.e86);
		spc.setImageBig(R.drawable.w86);
		spc.setPointCost(10000);
		spc.setMaxHP(333);
		spc.setMaxAttack(188);
		spc.setMaxDefense(208);
		spc.setMaxSpeed(188);
		spc.setMaxSpecial(238);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("086");

		spc.setEvolutionLevel(34);

		return spc;
	}

	private Specie dewgong() {
		Specie spc = new Specie();
		spc.setId("087");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.getTypes().add(Types.Ice);
		spc.setName("Dewgong");
		spc.setImage(R.drawable.p87);
		spc.setImageBack(R.drawable.b87);
		spc.setImagePremium(R.drawable.s87);
		spc.setImagePremiumBack(R.drawable.e87);
		spc.setImageBig(R.drawable.w87);
		spc.setPointCost(20000);
		spc.setMaxHP(383);
		spc.setMaxAttack(238);
		spc.setMaxDefense(258);
		spc.setMaxSpeed(238);
		spc.setMaxSpecial(288);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie grimer() {
		Specie spc = new Specie();
		spc.setId("088");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Poison);
		spc.setName("Grimer");
		spc.setImage(R.drawable.p88);
		spc.setImageBack(R.drawable.b88);
		spc.setImagePremium(R.drawable.s88);
		spc.setImagePremiumBack(R.drawable.e88);
		spc.setImageBig(R.drawable.w88);
		spc.setPointCost(10000);
		spc.setMaxHP(363);
		spc.setMaxAttack(258);
		spc.setMaxDefense(198);
		spc.setMaxSpeed(148);
		spc.setMaxSpecial(178);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("089");

		spc.setEvolutionLevel(38);

		return spc;
	}

	private Specie muk() {
		Specie spc = new Specie();
		spc.setId("089");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Poison);
		spc.setName("Muk");
		spc.setImage(R.drawable.p89);
		spc.setImageBack(R.drawable.b89);
		spc.setImagePremium(R.drawable.s89);
		spc.setImagePremiumBack(R.drawable.e89);
		spc.setImageBig(R.drawable.w89);
		spc.setPointCost(20000);
		spc.setMaxHP(413);
		spc.setMaxAttack(308);
		spc.setMaxDefense(248);
		spc.setMaxSpeed(198);
		spc.setMaxSpecial(228);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie shellder() {
		Specie spc = new Specie();
		spc.setId("090");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.setName("Shellder");
		spc.setImage(R.drawable.p90);
		spc.setImageBack(R.drawable.b90);
		spc.setImagePremium(R.drawable.s90);
		spc.setImagePremiumBack(R.drawable.e90);
		spc.setImageBig(R.drawable.w90);
		spc.setPointCost(10000);
		spc.setMaxHP(263);
		spc.setMaxAttack(228);
		spc.setMaxDefense(298);
		spc.setMaxSpeed(178);
		spc.setMaxSpecial(188);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("091");

		spc.setEvolutionLevel(-1);

		return spc;
	}

	private Specie cloyster() {
		Specie spc = new Specie();
		spc.setId("091");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.getTypes().add(Types.Ice);
		spc.setName("Cloyster");
		spc.setImage(R.drawable.p91);
		spc.setImageBack(R.drawable.b91);
		spc.setImagePremium(R.drawable.s91);
		spc.setImagePremiumBack(R.drawable.e91);
		spc.setImageBig(R.drawable.w91);
		spc.setPointCost(20000);
		spc.setMaxHP(303);
		spc.setMaxAttack(288);
		spc.setMaxDefense(458);
		spc.setMaxSpeed(238);
		spc.setMaxSpecial(268);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie Gastly() {
		Specie spc = new Specie();
		spc.setId("092");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Ghost);
		spc.getTypes().add(Types.Poison);
		spc.setName("Gastly");
		spc.setImage(R.drawable.p92);
		spc.setImageBack(R.drawable.b92);
		spc.setImagePremium(R.drawable.s92);
		spc.setImagePremiumBack(R.drawable.e92);
		spc.setImageBig(R.drawable.w92);
		spc.setPointCost(10000);
		spc.setMaxHP(263);
		spc.setMaxAttack(168);
		spc.setMaxDefense(158);
		spc.setMaxSpeed(258);
		spc.setMaxSpecial(298);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("093");

		spc.setEvolutionLevel(25);

		return spc;
	}

	private Specie haunter() {
		Specie spc = new Specie();
		spc.setId("093");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Ghost);
		spc.getTypes().add(Types.Poison);
		spc.setName("Haunter");
		spc.setImage(R.drawable.p93);
		spc.setImageBack(R.drawable.b93);
		spc.setImagePremium(R.drawable.s93);
		spc.setImagePremiumBack(R.drawable.e93);
		spc.setImageBig(R.drawable.w93);
		spc.setPointCost(20000);
		spc.setMaxHP(293);
		spc.setMaxAttack(198);
		spc.setMaxDefense(188);
		spc.setMaxSpeed(288);
		spc.setMaxSpecial(328);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(2, Attacks.NightShade);
		spc.getMappedAttacks().put(1, Attacks.ConfuseRay);
		spc.getMappedAttacks().put(0, Attacks.Lick);

		spc.setEvolution("094");

		spc.setEvolutionLevel(-1);

		return spc;
	}

	private Specie gengar() {
		Specie spc = new Specie();
		spc.setId("094");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Ghost);
		spc.getTypes().add(Types.Poison);
		spc.setName("Gengar");
		spc.setImage(R.drawable.p94);
		spc.setImageBack(R.drawable.b94);
		spc.setImagePremium(R.drawable.s94);
		spc.setImagePremiumBack(R.drawable.e94);
		spc.setImageBig(R.drawable.w94);
		spc.setPointCost(25000);
		spc.setMaxHP(323);
		spc.setMaxAttack(228);
		spc.setMaxDefense(218);
		spc.setMaxSpeed(318);
		spc.setMaxSpecial(358);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(2, Attacks.NightShade);
		spc.getMappedAttacks().put(1, Attacks.ConfuseRay);
		spc.getMappedAttacks().put(0, Attacks.Lick);

		return spc;
	}

	private Specie onix() {
		Specie spc = new Specie();
		spc.setId("095");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Ground);
		spc.getTypes().add(Types.Rock);
		spc.setName("Onix");
		spc.setImage(R.drawable.p95);
		spc.setImageBack(R.drawable.b95);
		spc.setImagePremium(R.drawable.s95);
		spc.setImagePremiumBack(R.drawable.e95);
		spc.setImageBig(R.drawable.w95);
		spc.setPointCost(5000);
		spc.setMaxHP(273);
		spc.setMaxAttack(188);
		spc.setMaxDefense(418);
		spc.setMaxSpeed(238);
		spc.setMaxSpecial(158);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}

	private Specie drowzee() {
		Specie spc = new Specie();
		spc.setId("096");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Psychic);
		spc.setName("Drowzee");
		spc.setImage(R.drawable.p96);
		spc.setImageBack(R.drawable.b96);
		spc.setImagePremium(R.drawable.s96);
		spc.setImagePremiumBack(R.drawable.e96);
		spc.setImageBig(R.drawable.w96);
		spc.setPointCost(5000);
		spc.setMaxHP(323);
		spc.setMaxAttack(194);
		spc.setMaxDefense(188);
		spc.setMaxSpeed(182);
		spc.setMaxSpecial(278);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Pound);

		spc.setEvolution("097");

		spc.setEvolutionLevel(26);

		return spc;
	}

	private Specie hypno() {
		Specie spc = new Specie();
		spc.setId("097");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Psychic);
		spc.setName("Hypno");
		spc.setImage(R.drawable.p97);
		spc.setImageBack(R.drawable.b97);
		spc.setImagePremium(R.drawable.s97);
		spc.setImagePremiumBack(R.drawable.e97);
		spc.setImageBig(R.drawable.w97);
		spc.setPointCost(10000);
		spc.setMaxHP(373);
		spc.setMaxAttack(244);
		spc.setMaxDefense(238);
		spc.setMaxSpeed(232);
		spc.setMaxSpecial(328);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Pound);

		return spc;
	}

	private Specie krabby() {
		Specie spc = new Specie();
		spc.setId("098");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.setName("Krabby");
		spc.setImage(R.drawable.p98);
		spc.setImageBack(R.drawable.b98);
		spc.setImagePremium(R.drawable.s98);
		spc.setImagePremiumBack(R.drawable.e98);
		spc.setImageBig(R.drawable.w98);
		spc.setPointCost(5000);
		spc.setMaxHP(263);
		spc.setMaxAttack(308);
		spc.setMaxDefense(278);
		spc.setMaxSpeed(198);
		spc.setMaxSpecial(148);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Pound);

		spc.setEvolution("099");

		spc.setEvolutionLevel(28);

		return spc;
	}

	private Specie kingler() {
		Specie spc = new Specie();
		spc.setId("099");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.setName("Kingler");
		spc.setImage(R.drawable.p99);
		spc.setImageBack(R.drawable.b99);
		spc.setImagePremium(R.drawable.s99);
		spc.setImagePremiumBack(R.drawable.e99);
		spc.setImageBig(R.drawable.w99);
		spc.setPointCost(5000);
		spc.setMaxHP(313);
		spc.setMaxAttack(358);
		spc.setMaxDefense(328);
		spc.setMaxSpeed(248);
		spc.setMaxSpecial(198);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Pound);

		return spc;
	}

	private Specie voltorb() {
		Specie spc = new Specie();
		spc.setId("100");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Electric);
		spc.setName("Voltorb");
		spc.setImage(R.drawable.p100);
		spc.setImageBack(R.drawable.b100);
		spc.setImagePremium(R.drawable.s100);
		spc.setImagePremiumBack(R.drawable.e100);
		spc.setImageBig(R.drawable.w100);
		spc.setPointCost(5000);
		spc.setMaxHP(283);
		spc.setMaxAttack(158);
		spc.setMaxDefense(198);
		spc.setMaxSpeed(298);
		spc.setMaxSpecial(208);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		spc.setEvolution("101");

		spc.setEvolutionLevel(30);

		return spc;
	}

	private Specie electrode() {
		Specie spc = new Specie();
		spc.setId("101");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Electric);
		spc.setName("Electrode");
		spc.setImage(R.drawable.p101);
		spc.setImageBack(R.drawable.b101);
		spc.setImagePremium(R.drawable.s101);
		spc.setImagePremiumBack(R.drawable.e101);
		spc.setImageBig(R.drawable.w101);
		spc.setPointCost(10000);
		spc.setMaxHP(323);
		spc.setMaxAttack(198);
		spc.setMaxDefense(238);
		spc.setMaxSpeed(378);
		spc.setMaxSpecial(258);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}
	
	private Specie exeggcute() {
		Specie spc = new Specie();
		spc.setId("102");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Grass);
		spc.getTypes().add(Types.Psychic);
		spc.setName("Exeggcute");
		spc.setImage(R.drawable.p102);
		spc.setImageBack(R.drawable.b102);
		spc.setImagePremium(R.drawable.s102);
		spc.setImagePremiumBack(R.drawable.e102);
		spc.setImageBig(R.drawable.w102);
		spc.setPointCost(10000);
		spc.setMaxHP(323);
		spc.setMaxAttack(178);
		spc.setMaxDefense(258);
		spc.setMaxSpeed(178);
		spc.setMaxSpecial(218);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);
		
		spc.setEvolution("103");

		spc.setEvolutionLevel(-1);

		return spc;
	}
	
	private Specie exeggutor() {
		Specie spc = new Specie();
		spc.setId("103");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Grass);
		spc.getTypes().add(Types.Psychic);
		spc.setName("Exeggutor");
		spc.setImage(R.drawable.p103);
		spc.setImageBack(R.drawable.b103);
		spc.setImagePremium(R.drawable.s103);
		spc.setImagePremiumBack(R.drawable.e103);
		spc.setImageBig(R.drawable.w103);
		spc.setPointCost(10000);
		spc.setMaxHP(393);
		spc.setMaxAttack(288);
		spc.setMaxDefense(268);
		spc.setMaxSpeed(208);
		spc.setMaxSpecial(348);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}
	
	private Specie cubone() {
		Specie spc = new Specie();
		spc.setId("104");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Ground);
		spc.setName("Cubone");
		spc.setImage(R.drawable.p104);
		spc.setImageBack(R.drawable.b104);
		spc.setImagePremium(R.drawable.s104);
		spc.setImagePremiumBack(R.drawable.e104);
		spc.setImageBig(R.drawable.w104);
		spc.setPointCost(5000);
		spc.setMaxHP(303);
		spc.setMaxAttack(198);
		spc.setMaxDefense(288);
		spc.setMaxSpeed(168);
		spc.setMaxSpecial(178);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);
		
		spc.setEvolution("105");

		spc.setEvolutionLevel(28);

		return spc;
	}
	
	private Specie marowak() {
		Specie spc = new Specie();
		spc.setId("105");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Ground);
		spc.setName("Marowak");
		spc.setImage(R.drawable.p105);
		spc.setImageBack(R.drawable.b105);
		spc.setImagePremium(R.drawable.s105);
		spc.setImagePremiumBack(R.drawable.e105);
		spc.setImageBig(R.drawable.w105);
		spc.setPointCost(10000);
		spc.setMaxHP(323);
		spc.setMaxAttack(258);
		spc.setMaxDefense(318);
		spc.setMaxSpeed(188);
		spc.setMaxSpecial(198);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}
	
	private Specie hitmonlee() {
		Specie spc = new Specie();
		spc.setId("106");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Fighting);
		spc.setName("Hitmonlee");
		spc.setImage(R.drawable.p106);
		spc.setImageBack(R.drawable.b106);
		spc.setImagePremium(R.drawable.s106);
		spc.setImagePremiumBack(R.drawable.e106);
		spc.setImageBig(R.drawable.w106);
		spc.setPointCost(5000);
		spc.setMaxHP(303);
		spc.setMaxAttack(338);
		spc.setMaxDefense(204);
		spc.setMaxSpeed(272);
		spc.setMaxSpecial(168);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}
	
	private Specie hitmonchan() {
		Specie spc = new Specie();
		spc.setId("107");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Fighting);
		spc.setName("Hitmonchan");
		spc.setImage(R.drawable.p107);
		spc.setImageBack(R.drawable.b107);
		spc.setImagePremium(R.drawable.s107);
		spc.setImagePremiumBack(R.drawable.e107);
		spc.setImageBig(R.drawable.w107);
		spc.setPointCost(5000);
		spc.setMaxHP(303);
		spc.setMaxAttack(308);
		spc.setMaxDefense(256);
		spc.setMaxSpeed(250);
		spc.setMaxSpecial(168);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}
	
	private Specie lickitung() {
		Specie spc = new Specie();
		spc.setId("108");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.setName("Lickitung");
		spc.setImage(R.drawable.p108);
		spc.setImageBack(R.drawable.b108);
		spc.setImagePremium(R.drawable.s108);
		spc.setImagePremiumBack(R.drawable.e108);
		spc.setImageBig(R.drawable.w108);
		spc.setPointCost(5000);
		spc.setMaxHP(383);
		spc.setMaxAttack(208);
		spc.setMaxDefense(248);
		spc.setMaxSpeed(158);
		spc.setMaxSpecial(218);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}
	
	private Specie koffing() {
		Specie spc = new Specie();
		spc.setId("109");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Poison);
		spc.setName("Koffing");
		spc.setImage(R.drawable.p109);
		spc.setImageBack(R.drawable.b109);
		spc.setImagePremium(R.drawable.s109);
		spc.setImagePremiumBack(R.drawable.e109);
		spc.setImageBig(R.drawable.w109);
		spc.setPointCost(5000);
		spc.setMaxHP(283);
		spc.setMaxAttack(228);
		spc.setMaxDefense(288);
		spc.setMaxSpeed(168);
		spc.setMaxSpecial(218);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);
		
		spc.setEvolution("110");

		spc.setEvolutionLevel(35);

		return spc;
	}
	
	private Specie weezing() {
		Specie spc = new Specie();
		spc.setId("110");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Poison);
		spc.setName("Weezing");
		spc.setImage(R.drawable.p110);
		spc.setImageBack(R.drawable.b110);
		spc.setImagePremium(R.drawable.s110);
		spc.setImagePremiumBack(R.drawable.e110);
		spc.setImageBig(R.drawable.w110);
		spc.setPointCost(5000);
		spc.setMaxHP(333);
		spc.setMaxAttack(278);
		spc.setMaxDefense(338);
		spc.setMaxSpeed(218);
		spc.setMaxSpecial(268);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}
	
	private Specie rhyhorn() {
		Specie spc = new Specie();
		spc.setId("111");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Ground);
		spc.getTypes().add(Types.Rock);
		spc.setName("Rhyhorn");
		spc.setImage(R.drawable.p111);
		spc.setImageBack(R.drawable.b111);
		spc.setImagePremium(R.drawable.s111);
		spc.setImagePremiumBack(R.drawable.e111);
		spc.setImageBig(R.drawable.w111);
		spc.setPointCost(5000);
		spc.setMaxHP(363);
		spc.setMaxAttack(268);
		spc.setMaxDefense(288);
		spc.setMaxSpeed(148);
		spc.setMaxSpecial(158);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);
		
		spc.setEvolution("112");

		spc.setEvolutionLevel(42);

		return spc;
	}
	
	private Specie rhydon() {
		Specie spc = new Specie();
		spc.setId("112");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Ground);
		spc.getTypes().add(Types.Rock);
		spc.setName("Rhydon");
		spc.setImage(R.drawable.p112);
		spc.setImageBack(R.drawable.b112);
		spc.setImagePremium(R.drawable.s112);
		spc.setImagePremiumBack(R.drawable.e112);
		spc.setImageBig(R.drawable.w112);
		spc.setPointCost(5000);
		spc.setMaxHP(413);
		spc.setMaxAttack(358);
		spc.setMaxDefense(338);
		spc.setMaxSpeed(178);
		spc.setMaxSpecial(188);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);
		
		return spc;
	}
	
	private Specie chansey() {
		Specie spc = new Specie();
		spc.setId("113");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.setName("Chansey");
		spc.setImage(R.drawable.p113);
		spc.setImageBack(R.drawable.b113);
		spc.setImagePremium(R.drawable.s113);
		spc.setImagePremiumBack(R.drawable.e113);
		spc.setImageBig(R.drawable.w113);
		spc.setPointCost(5000);
		spc.setMaxHP(703);
		spc.setMaxAttack(108);
		spc.setMaxDefense(108);
		spc.setMaxSpeed(198);
		spc.setMaxSpecial(308);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Pound);
		
		return spc;
	}
	
	private Specie tangela() {
		Specie spc = new Specie();
		spc.setId("114");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Grass);
		spc.setName("Tangela");
		spc.setImage(R.drawable.p114);
		spc.setImageBack(R.drawable.b114);
		spc.setImagePremium(R.drawable.s114);
		spc.setImagePremiumBack(R.drawable.e114);
		spc.setImageBig(R.drawable.w114);
		spc.setPointCost(5000);
		spc.setMaxHP(333);
		spc.setMaxAttack(208);
		spc.setMaxDefense(328);
		spc.setMaxSpeed(218);
		spc.setMaxSpecial(298);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);
		
		return spc;
	}
	
	private Specie kangaskhan() {
		Specie spc = new Specie();
		spc.setId("115");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.setName("Kangaskhan");
		spc.setImage(R.drawable.p115);
		spc.setImageBack(R.drawable.b115);
		spc.setImagePremium(R.drawable.s115);
		spc.setImagePremiumBack(R.drawable.e115);
		spc.setImageBig(R.drawable.w115);
		spc.setPointCost(5000);
		spc.setMaxHP(413);
		spc.setMaxAttack(288);
		spc.setMaxDefense(258);
		spc.setMaxSpeed(278);
		spc.setMaxSpecial(178);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}
	
	private Specie horsea() {
		Specie spc = new Specie();
		spc.setId("116");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.setName("Horsea");
		spc.setImage(R.drawable.p116);
		spc.setImageBack(R.drawable.b116);
		spc.setImagePremium(R.drawable.s116);
		spc.setImagePremiumBack(R.drawable.e116);
		spc.setImageBig(R.drawable.w116);
		spc.setPointCost(5000);
		spc.setMaxHP(263);
		spc.setMaxAttack(178);
		spc.setMaxDefense(238);
		spc.setMaxSpeed(218);
		spc.setMaxSpecial(238);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Bubble);
		
		spc.setEvolution("117");

		spc.setEvolutionLevel(32);

		return spc;
	}
	
	private Specie seadra() {
		Specie spc = new Specie();
		spc.setId("117");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.setName("Seadra");
		spc.setImage(R.drawable.p117);
		spc.setImageBack(R.drawable.b117);
		spc.setImagePremium(R.drawable.s117);
		spc.setImagePremiumBack(R.drawable.e117);
		spc.setImageBig(R.drawable.w117);
		spc.setPointCost(5000);
		spc.setMaxHP(313);
		spc.setMaxAttack(228);
		spc.setMaxDefense(288);
		spc.setMaxSpeed(268);
		spc.setMaxSpecial(288);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Bubble);
		
		return spc;
	}
	
	private Specie goldeen() {
		Specie spc = new Specie();
		spc.setId("118");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.setName("Goldeen");
		spc.setImage(R.drawable.p118);
		spc.setImageBack(R.drawable.b118);
		spc.setImagePremium(R.drawable.s118);
		spc.setImagePremiumBack(R.drawable.e118);
		spc.setImageBig(R.drawable.w118);
		spc.setPointCost(5000);
		spc.setMaxHP(293);
		spc.setMaxAttack(232);
		spc.setMaxDefense(218);
		spc.setMaxSpeed(224);
		spc.setMaxSpecial(198);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);
		
		spc.setEvolution("119");

		spc.setEvolutionLevel(33);

		return spc;
	}
	
	private Specie seaking() {
		Specie spc = new Specie();
		spc.setId("119");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.setName("Seaking");
		spc.setImage(R.drawable.p119);
		spc.setImageBack(R.drawable.b119);
		spc.setImagePremium(R.drawable.s119);
		spc.setImagePremiumBack(R.drawable.e119);
		spc.setImageBig(R.drawable.w119);
		spc.setPointCost(5000);
		spc.setMaxHP(363);
		spc.setMaxAttack(282);
		spc.setMaxDefense(228);
		spc.setMaxSpeed(234);
		spc.setMaxSpecial(258);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);
		
		return spc;
	}
	
	private Specie staryu() {
		Specie spc = new Specie();
		spc.setId("120");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.setName("Staryu");
		spc.setImage(R.drawable.p120);
		spc.setImageBack(R.drawable.b120);
		spc.setImagePremium(R.drawable.s120);
		spc.setImagePremiumBack(R.drawable.e120);
		spc.setImageBig(R.drawable.w120);
		spc.setPointCost(5000);
		spc.setMaxHP(263);
		spc.setMaxAttack(188);
		spc.setMaxDefense(208);
		spc.setMaxSpeed(264);
		spc.setMaxSpecial(238);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(22, Attacks.Harden);
		spc.getMappedAttacks().put(17, Attacks.WaterGun);
		spc.getMappedAttacks().put(0, Attacks.Tackle);
		
		spc.setEvolution("121");

		spc.setEvolutionLevel(-1);

		return spc;
	}
	
	private Specie starmie() {
		Specie spc = new Specie();
		spc.setId("121");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.getTypes().add(Types.Psychic);
		spc.setName("Starmie");
		spc.setImage(R.drawable.p121);
		spc.setImageBack(R.drawable.b121);
		spc.setImagePremium(R.drawable.s121);
		spc.setImagePremiumBack(R.drawable.e121);
		spc.setImageBig(R.drawable.w121);
		spc.setPointCost(5000);
		spc.setMaxHP(323);
		spc.setMaxAttack(248);
		spc.setMaxDefense(268);
		spc.setMaxSpeed(328);
		spc.setMaxSpecial(298);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(2, Attacks.Harden);
		spc.getMappedAttacks().put(1, Attacks.WaterGun);
		spc.getMappedAttacks().put(0, Attacks.Tackle);
		

		return spc;
	}

	private Specie mrmime() {
		Specie spc = new Specie();
		spc.setId("122");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Psychic);
		spc.setName("Mr. Mime");
		spc.setImage(R.drawable.p122);
		spc.setImageBack(R.drawable.b122);
		spc.setImagePremium(R.drawable.s122);
		spc.setImagePremiumBack(R.drawable.e122);
		spc.setImageBig(R.drawable.w122);
		spc.setPointCost(5000);
		spc.setMaxHP(283);
		spc.setMaxAttack(188);
		spc.setMaxDefense(228);
		spc.setMaxSpeed(278);
		spc.setMaxSpecial(298);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(15, Attacks.Confusion);
		spc.getMappedAttacks().put(0, Attacks.Tackle);
		

		return spc;
	}
	
	private Specie scyther() {
		Specie spc = new Specie();
		spc.setId("123");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Bug);
		spc.setName("Scyther");
		spc.setImage(R.drawable.p123);
		spc.setImageBack(R.drawable.b123);
		spc.setImagePremium(R.drawable.s123);
		spc.setImagePremiumBack(R.drawable.e123);
		spc.setImageBig(R.drawable.w123);
		spc.setPointCost(5000);
		spc.setMaxHP(343);
		spc.setMaxAttack(318);
		spc.setMaxDefense(258);
		spc.setMaxSpeed(308);
		spc.setMaxSpecial(208);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}
	
	private Specie jynx() {
		Specie spc = new Specie();
		spc.setId("124");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Ice);
		spc.getTypes().add(Types.Psychic);
		spc.setName("Jynx");
		spc.setImage(R.drawable.p124);
		spc.setImageBack(R.drawable.b124);
		spc.setImagePremium(R.drawable.s124);
		spc.setImagePremiumBack(R.drawable.e124);
		spc.setImageBig(R.drawable.w124);
		spc.setPointCost(5000);
		spc.setMaxHP(333);
		spc.setMaxAttack(198);
		spc.setMaxDefense(168);
		spc.setMaxSpeed(288);
		spc.setMaxSpecial(288);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}
	
	private Specie electabuzz() {
		Specie spc = new Specie();
		spc.setId("125");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Electric);
		spc.setName("Electabuzz");
		spc.setImage(R.drawable.p125);
		spc.setImageBack(R.drawable.b125);
		spc.setImagePremium(R.drawable.s125);
		spc.setImagePremiumBack(R.drawable.e125);
		spc.setImageBig(R.drawable.w125);
		spc.setPointCost(5000);
		spc.setMaxHP(333);
		spc.setMaxAttack(268);
		spc.setMaxDefense(212);
		spc.setMaxSpeed(308);
		spc.setMaxSpecial(268);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}
	
	private Specie magmar() {
		Specie spc = new Specie();
		spc.setId("126");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Fire);
		spc.setName("Magmar");
		spc.setImage(R.drawable.p126);
		spc.setImageBack(R.drawable.b126);
		spc.setImagePremium(R.drawable.s126);
		spc.setImagePremiumBack(R.drawable.e126);
		spc.setImageBig(R.drawable.w126);
		spc.setPointCost(5000);
		spc.setMaxHP(333);
		spc.setMaxAttack(288);
		spc.setMaxDefense(212);
		spc.setMaxSpeed(284);
		spc.setMaxSpecial(268);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Ember);

		return spc;
	}
	
	private Specie pinsir() {
		Specie spc = new Specie();
		spc.setId("127");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Bug);
		spc.setName("Pinsir");
		spc.setImage(R.drawable.p127);
		spc.setImageBack(R.drawable.b127);
		spc.setImagePremium(R.drawable.s127);
		spc.setImagePremiumBack(R.drawable.e127);
		spc.setImageBig(R.drawable.w127);
		spc.setPointCost(5000);
		spc.setMaxHP(333);
		spc.setMaxAttack(348);
		spc.setMaxDefense(298);
		spc.setMaxSpeed(268);
		spc.setMaxSpecial(208);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}
	
	private Specie tauros() {
		Specie spc = new Specie();
		spc.setId("128");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.setName("Tauros");
		spc.setImage(R.drawable.p128);
		spc.setImageBack(R.drawable.b128);
		spc.setImagePremium(R.drawable.s128);
		spc.setImagePremiumBack(R.drawable.e128);
		spc.setImageBig(R.drawable.w128);
		spc.setPointCost(5000);
		spc.setMaxHP(353);
		spc.setMaxAttack(298);
		spc.setMaxDefense(288);
		spc.setMaxSpeed(318);
		spc.setMaxSpecial(238);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);

		return spc;
	}
	
	private Specie magikarp() {
		Specie spc = new Specie();
		spc.setId("129");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.setName("Magikarp");
		spc.setImage(R.drawable.p129);
		spc.setImageBack(R.drawable.b129);
		spc.setImagePremium(R.drawable.s129);
		spc.setImagePremiumBack(R.drawable.e129);
		spc.setImageBig(R.drawable.w129);
		spc.setPointCost(5000);
		spc.setMaxHP(243);
		spc.setMaxAttack(118);
		spc.setMaxDefense(208);
		spc.setMaxSpeed(258);
		spc.setMaxSpecial(138);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(15, Attacks.Tackle);
		spc.getMappedAttacks().put(0, Attacks.Splash);
		
		
		spc.setEvolution("130");

		spc.setEvolutionLevel(20);

		return spc;
	}
	
	private Specie gyarados() {
		Specie spc = new Specie();
		spc.setId("130");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.getTypes().add(Types.Flying);
		spc.setName("Gyarados");
		spc.setImage(R.drawable.p130);
		spc.setImageBack(R.drawable.b130);
		spc.setImagePremium(R.drawable.s130);
		spc.setImagePremiumBack(R.drawable.e130);
		spc.setImageBig(R.drawable.w130);
		spc.setPointCost(5000);
		spc.setMaxHP(393);
		spc.setMaxAttack(348);
		spc.setMaxDefense(256);
		spc.setMaxSpeed(260);
		spc.setMaxSpecial(298);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Bite);
		
		
		return spc;
	}
	
	private Specie lapras() {
		Specie spc = new Specie();
		spc.setId("131");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Water);
		spc.getTypes().add(Types.Ice);
		spc.setName("Lapras");
		spc.setImage(R.drawable.p131);
		spc.setImageBack(R.drawable.b131);
		spc.setImagePremium(R.drawable.s131);
		spc.setImagePremiumBack(R.drawable.e131);
		spc.setImageBig(R.drawable.w131);
		spc.setPointCost(5000);
		spc.setMaxHP(463);
		spc.setMaxAttack(268);
		spc.setMaxDefense(258);
		spc.setMaxSpeed(218);
		spc.setMaxSpecial(288);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.WaterGun);		
		
		return spc;
	}
	
	private Specie ditto() {
		Specie spc = new Specie();
		spc.setId("132");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.setName("Ditto");
		spc.setImage(R.drawable.p132);
		spc.setImageBack(R.drawable.b132);
		spc.setImagePremium(R.drawable.s132);
		spc.setImagePremiumBack(R.drawable.e132);
		spc.setImageBig(R.drawable.w132);
		spc.setPointCost(5000);
		spc.setMaxHP(299);
		spc.setMaxAttack(194);
		spc.setMaxDefense(194);
		spc.setMaxSpeed(194);
		spc.setMaxSpecial(194);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Transform);		
		
		return spc;
	}
	
	private Specie eevee() {
		Specie spc = new Specie();
		spc.setId("133");
		spc.setEffort(effortValue(spc.getId()));
		spc.setGrowth(Growth.Medium);
		spc.setTypes(new ArrayList<Types>(2));
		spc.getTypes().add(Types.Normal);
		spc.setName("Eevee");
		spc.setImage(R.drawable.p133);
		spc.setImageBack(R.drawable.b133);
		spc.setImagePremium(R.drawable.s133);
		spc.setImagePremiumBack(R.drawable.e133);
		spc.setImageBig(R.drawable.w133);
		spc.setPointCost(5000);
		spc.setMaxHP(313);
		spc.setMaxAttack(208);
		spc.setMaxDefense(198);
		spc.setMaxSpeed(208);
		spc.setMaxSpecial(228);

		spc.setMappedAttacks(new LinkedHashMap<Integer, Attacks>());
		spc.getMappedAttacks().put(0, Attacks.Tackle);		
		
		return spc;
	}
	

	public Specie getGenericSpecie(Types type, Integer maxEffort) {
		if (maxEffort == null)
			switch (type) {
			case Bug:
				return getGenericBug();
			case Ground:
				return getGenericGround();
			case Rock:
				return getGenericRock();
			case Grass:
				return getGenericGrass();
			case Fire:
				return getGenericFire();
			case Normal:
				return getGenericNormal();
			case Electric:
				return getGenericElectric();
			case Water:
				return getGenericWater();
			case Poison:
				return getGenericPoison();
			case Fighting:
				return getGenericFighting();
			default:
				return getGenericNormal();
			}
		else
			return getGenericNormal();
	}

	private Specie getGenericBug() {
		int key = randomGenerator.nextInt(12);
		switch (key) {
		case 0:
			return caterpie();
		case 1:
			return metapod();
		case 2:
			return butterfree();
		case 3:
			return weedle();
		case 4:
			return kakuna();
		case 5:
			return beedrill();
		case 6:
			return paras();
		case 7:
			return parasect();
		case 8:
			return venonat();
		case 9:
			return venomoth();
		case 10: 
			return pinsir();
		case 11: return scyther();
		default:
			return null;
		}
	}

	private Specie getGenericGrass() {
		int key = randomGenerator.nextInt(13);
		switch (key) {
		case 0:
			return bulbasaur();
		case 1:
			return ivysaur();
		case 2:
			return venusaur();
		case 3:
			return paras();
		case 4:
			return parasect();
		case 5:
			return bellsprout();			
		case 6:
			return weepinbell();			
		case 7:
			return victreebel();
		case 8:
			return oddish();			
		case 9:
			return gloom();
		case 10: return tangela();
		case 11: return exeggcute();
		case 12: return exeggutor();
		default:
			return null;
		}
	}
	
	private Specie getGenericFighting() {
		int key = randomGenerator.nextInt(7);
		switch (key) {
		case 0:
			return machop();
		case 1:
			return machoke();
		case 2:
			return machamp();
		case 3:
			return primeape();
		case 4:
			return mankey();
		case 5: return hitmonlee();
		case 6: return hitmonchan();
		default:
			return null;
		}
	}

	private Specie getGenericPoison() {
		int key = randomGenerator.nextInt(16);
		switch (key) {
		case 0:
			return bulbasaur();
		case 1:
			return ivysaur();
		case 2:
			return venusaur();
		case 3:
			return weedle();
		case 4:
			return kakuna();
		case 5:
			return beedrill();
		case 6:
			return nidoranm();
		case 7:
			return nidoranf();
		case 8:
			return nidorina();
		case 9:
			return nidorino();
		case 10:
			return nidoking();
		case 11:
			return nidoqueen();
		case 12:
			return ekans();
		case 13:
			return arbok();
		case 14: return koffing();
		case 15: return weezing();
		default:
			return null;
		}
	}

	private Specie getGenericNormal() {
		int key = randomGenerator.nextInt(16);
		switch (key) {
		case 0:
			return jigglypuff();
		case 1:
			return wigglytuff();
		case 2:
			return rattata();
		case 3:
			return raticate();
		case 4:
			return clefairy();
		case 5:
			return clefable();
		case 6:
			return spearow();
		case 7:
			return fearow();
		case 8:
			return pidgey();
		case 9:
			return pidgeotto();
		case 10:
			return pidgeot();
		case 11: return chansey();
		case 12: return kangaskhan();
		case 13: return tauros();
		case 14: return eevee();
		case 15: return lickitung();
		default:
			return null;
		}
	}

	private Specie getGenericFire() {
		int key = randomGenerator.nextInt(9);
		switch (key) {
		case 0:
			return charmander();
		case 1:
			return charmeleon();
		case 2:
			return charmander();
		case 3:
			return vulpix();
		case 4:
			return ninetales();
		case 5:
			return growlithe();
		case 6:
			return arcanine();
		case 7:
			return ponyta();
		case 8:
			return rapidash();
			
		case 9: return magmar();
		default:
			return null;
		}
	}

	private Specie getGenericElectric() {
		int key = randomGenerator.nextInt(7);
		switch (key) {
		case 0:
			return pikachu();
		case 1:
			return raichu();
		case 2:
			return magneton();
		case 3:
			return magnemite();
		case 4:
			return electabuzz();
		case 5: return electrode();
		case 6: return voltorb();
		default:
			return null;
		}
	}

	private Specie getGenericWater() {
		int key = randomGenerator.nextInt(25);
		switch (key) {
		case 0:
			return squirtle();
		case 1:
			return wartortle();
		case 2:
			return blastoise();
		case 3:
			return seel();
		case 4:
			return dewgong();
		case 5:
			return krabby();			
		case 6:
			return kingler();
		case 7:
			return poliwag();
		case 8: 	return poliwhirl();			
		case 9:  return poliwrath();
		case 10: return slowpoke();
		case 11: return slowbro();			
		case 12: return tentacool();
		case 13: return tentacruel();
		case 14: return psyduck();
		case 15: return golduck();
		case 16: return horsea();
		case 17: return seadra();
		case 18: return goldeen();
		case 19: return seaking();
		case 20: return staryu();
		case 21: return starmie();
		case 22: return gyarados();
		case 23: return magikarp();
		case 24: return lapras();

		default:
			return null;
		}
	}

	private Specie getGenericGround() {
		int key = randomGenerator.nextInt(9);
		switch (key) {
		case 0:	return sandshrew();
		case 1:	return sandslash();
		case 2:	return nidoking();
		case 3:	return nidoqueen();
		case 4:	return geodude();
		case 5:	return graveler();
		case 6:	return golem();
		case 7:	return digglet();
		case 8:	return dugtrio();
		default:
			return null;
		}
	}

	private Specie getGenericRock() {
		int key = randomGenerator.nextInt(6);
		switch (key) {
		case 0: return geodude();
		case 1: return graveler();
		case 2: return golem();
		case 3:	return onix();
		case 4: return rhyhorn();
		case 5: return rhydon();
		default: return null;
		}
	}
	
	
	
	private Integer effortValue(String id){
		int key = Integer.parseInt(id);
		
		switch (key) {
			case 1: return 64;	
			case 2: return 142;
			case 3: return 236;
			case 4: return 62;
			case 5: return 142;
			case 6: return 240;
			case 7: return 63;
			case 8: return 142;
			case 9: return 239;
			case 10: return 39;
			case 11: return 72;
			case 12: return 173;
			case 13: return 39;
			case 14: return 72;
			case 15: return 173;
			case 16: return 50;
			case 17: return 113;
			case 18: return 172;
			case 19: return 57;
			case 20: return 116;
			case 21: return 58;
			case 22: return 162;
			case 23: return 62;
			case 24: return 147;
			case 25: return 82;
			case 26: return 122;
			case 27: return 93;
			case 28: return 163;
			case 29: return 59;
			case 30: return 117;
			case 31: return 194;
			case 32: return 60;
			case 33: return 118;
			case 34: return 195;
			case 35: return 68;
			case 36: return 129;
			case 37: return 63;
			case 38: return 178;
			case 39: return 76;
			case 40: return 109;
			case 41: return 54;
			case 42: return 171;
			case 43: return 78;
			case 44: return 132;
			case 45: return 184;
			case 46: return 70;
			case 47: return 128;
			case 48: return 75;
			case 49: return 138;
			case 50: return 81;
			case 51: return 153;
			case 52: return 69;
			case 53: return 154;
			case 54: return 64;
			case 55: return 175;
			case 56: return 61;
			case 57: return 159;
			case 58: return 70;
			case 59: return 194;
			case 60: return 60;
			case 61: return 135;
			case 62: return 225;
			case 63: return 62;
			case 64: return 140;
			case 65: return 221;
			case 66: return 61;
			case 67: return 142;
			case 68: return 227;
			case 69: return 60;
			case 70: return 137;
			case 71: return 216;
			case 72: return 67;
			case 73: return 180;
			case 74: return 73;
			case 75: return 134;
			case 76: return 218;
			case 77: return 82;
			case 78: return 175;
			case 79: return 63;
			case 80: return 172;
			case 81: return 65;
			case 82: return 163;
			case 83: return 123;
			case 84: return 62;
			case 85: return 161;
			case 86: return 65;
			case 87: return 166;
			case 88: return 65;
			case 89: return 175;
			case 90: return 61;
			case 91: return 184;
			case 92: return 62;
			case 93: return 142;
			case 94: return 225;
			case 95: return 108;
			case 96: return 66;
			case 97: return 169;
			case 98: return 65;
			case 99: return 166;
			case 100: return 66;
			case 101: return 168;
			case 102: return 65;
			case 103: return 182;
			case 104: return 64;
			case 105: return 149;
			case 106: return 159;
			case 107: return 159;
			case 108: return 77;
			case 109: return 68;
			case 110: return 172;
			case 111: return 69;
			case 112: return 170;
			case 113: return 395;
			case 114: return 87;
			case 115: return 172;
			case 116: return 59;
			case 117: return 154;
			case 118: return 64;
			case 119: return 158;
			case 120: return 68;
			case 121: return 182;
			case 122: return 161;
			case 123: return 100;
			case 124: return 159;
			case 125: return 172;
			case 126: return 173;
			case 127: return 175;
			case 128: return 211;
			case 129: return 40;
			case 130: return 189;
			case 131: return 187;
			case 132: return 101;
			case 133: return 65;
			case 134: return 184;
			case 135: return 184;
			case 136: return 184;
			case 137: return 79;
			case 138: return 71;
			case 139: return 173;
			case 140: return 71;
			case 141: return 173;
			case 142: return 180;
			case 143: return 189;
			case 144: return 261;
			case 145: return 261;
			case 146: return 261;
			case 147: return 60;
			case 148: return 147;
			case 149: return 270;
			case 150: return 306;
			case 151: return 270;
			default: return 0;
		}
	}

}
