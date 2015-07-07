package util;

import java.util.ArrayList;

import model.Attack;
import model.Pokemon;
import enums.Attacks;
import enums.Base;
import enums.Modifier;
import enums.Status;
import enums.Types;

public class GenerateAttack {

	public Attack getAttack(Attacks id) {
		if (id == null) {
			return null;
		}
		switch (id) {
		//grass
		case LeechSeed:
			return leechSeed();
		case VineWhip:
			return vineWhip();
		case RazorLeaf:
			return razorLeaf();
			
		//poison
		case Poisonpowder:
			return poisonPowder();
		case PoisonSting:
			return poisonSting();
		case Acid:
			return acid();
		case PoisonGas:
			return poisonGas();			
		case Sludge:
			return sludge();
		case Smog:
			return smog();
		case Toxic:
			return toxic();
			
		//water
		case Bubble:
			return bubble();
		case WaterGun:
			return waterGun();
		case Bubblebeam:
			return bubbleBeam();
		case Waterfall:
			return waterFall();
		case Clamp:
			return clamp();
		case Crabhammer:
			return Crabhammer();
		case HydroPump:
			return hydroPump();
		case Surf:
			return surf();
			
		//normal	
		case Growl:
			return growl();
		case Tackle:
			return tackle();
		case Bite:
			return bite();
		case Scratch:
			return scratch();
		case QuickAttack:
			return quickAttack();
		case Pound:
			return pound();
		case Gust:
			return gust();
			
		//fire
		case Ember:
			return ember();
			
		//electric
		case Thundershock:
			return thundershock();
			
		//ghost
		case Lick:
			return lick();
		
		//ground
		case BoneClub:
			return boneClub();
		case Bonemerang:
			return bonemerang();
		case Dig:
			return dig();
		case Earthquake:
			return earthquake();
		case Fissure:
			return fissure();
			
		//ice
		case AuroraBeam:
			return auroraBeam();
		case Blizzard:
			return blizzard();
		case IceBeam:
			return iceBeam();
		case IcePunch:
			return icePunch();
		
		//rock slide
		case RockSlide:
			return rockSlide();
		case RockThrow:
			return rockThrow();
	
		default:
			return notMapped();
		}
		
	}
	
	private Attack notMapped() {
		Attack att = new Attack();
		att.setId(Attacks.NaoMapeado);
		att.setName("Não Mapeado Ainda");
		att.setType(Types.Normal);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.None);
		att.setPower(35);
		att.setPp(35);
		att.setAccuracy(945);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}

	private Attack tackle() {
		Attack att = new Attack();
		att.setId(Attacks.Tackle);
		att.setName("Tackle");
		att.setType(Types.Normal);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.None);
		att.setPower(35);
		att.setPp(35);
		att.setAccuracy(945);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}

	private Attack lick() {
		Attack att = new Attack();
		att.setId(Attacks.Lick);
		att.setName("Lick");
		att.setType(Types.Ghost);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.None);
		att.setPower(35); // Original 20
		att.setPp(20);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.Paralyzed);
		att.setStatusChangeMeter(30);
		return att;
	}

	private Attack leechSeed() {
		Attack att = new Attack() {

			@Override
			public void effect(Pokemon attacker, Pokemon defender, boolean criticalHit) {
				// TODO Auto-generated method stub

			}
		};
		att.setId(Attacks.LeechSeed);
		att.setName("Leech Seed");
		att.setType(Types.Grass);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Saps);
		att.setModifier(Modifier.None);
		att.setPower(16);
		att.setPp(10);
		att.setAccuracy(895);
		att.setCritical(false);
		att.setStatusChange(Status.Sapping);
		att.setStatusChangeMeter(100);
		return att;
	}

	private Attack growl() {
		Attack att = new Attack() {

			@Override
			public void effect(Pokemon attacker, Pokemon defender, boolean criticalHit) {
				// TODO Auto-generated method stub

			}
		};
		att.setId(Attacks.Growl);
		att.setName("Growl");
		att.setType(Types.Normal);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Modifier);
		att.setModifier(Modifier.None);
		att.setModifier(Modifier.EnemyAttack);
		att.setPower(-1);
		att.setPp(40);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}

	private Attack vineWhip() {
		Attack att = new Attack();
		att.setId(Attacks.VineWhip);
		att.setName("Vine Whip");
		att.setType(Types.Grass);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Special);
		att.setModifier(Modifier.None);
		att.setPower(35);
		att.setPp(10);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}

	private Attack razorLeaf() {
		Attack att = new Attack();
		att.setId(Attacks.RazorLeaf);
		att.setName("Razor Leaf");
		att.setType(Types.Grass);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Special);
		att.setModifier(Modifier.None);
		att.setPower(55);
		att.setPp(10);
		att.setAccuracy(945);
		att.setCritical(true);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}

	private Attack bite() {
		Attack att = new Attack();
		att.setId(Attacks.Bite);
		att.setName("Bite");
		att.setType(Types.Normal);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.None);
		att.setPower(60);
		att.setPp(25);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.Flinch);
		att.setStatusChangeMeter(10);
		return att;
	}

	private Attack scratch() {
		Attack att = new Attack();
		att.setId(Attacks.Scratch);
		att.setName("Scratch");
		att.setType(Types.Normal);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.None);
		att.setPower(40);
		att.setPp(35);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}

	private Attack ember() {
		Attack att = new Attack();
		att.setId(Attacks.Ember);
		att.setName("Ember");
		att.setType(Types.Fire);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Special);
		att.setModifier(Modifier.None);
		att.setPower(40);
		att.setPp(25);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.Burn);
		att.setStatusChangeMeter(10);
		return att;
	}

	private Attack thundershock() {
		Attack att = new Attack();
		att.setId(Attacks.Thundershock);
		att.setName("Thundershock");
		att.setType(Types.Electric);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Special);
		att.setModifier(Modifier.None);
		att.setPower(40);
		att.setPp(30);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.Paralyzed);
		att.setStatusChangeMeter(10);
		return att;
	}

	private Attack quickAttack() {
		Attack att = new Attack();
		att.setId(Attacks.QuickAttack);
		att.setName("Quick Attack");
		att.setType(Types.Normal);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.None);
		att.setPower(40);
		att.setPp(30);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}

	private Attack gust() {
		Attack att = new Attack();
		att.setId(Attacks.Gust);
		att.setName("Gust");
		att.setType(Types.Normal);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.None);
		att.setPower(40);
		att.setPp(35);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}

	private Attack pound() {
		Attack att = new Attack();
		att.setId(Attacks.Pound);
		att.setName("Pound");
		att.setType(Types.Normal);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.None);
		att.setPower(40);
		att.setPp(35);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}
	
	private Attack auroraBeam() {
		Attack att = new Attack();
		att.setId(Attacks.AuroraBeam);
		att.setName("Aurora Beam");
		att.setType(Types.Ice);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Special);
		att.setModifier(Modifier.EnemyDefense);
		att.setPower(65);
		att.setPp(20);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}
	
	
	/**************************  ICE START ***********************************/
	
	private Attack blizzard() {
		Attack att = new Attack();
		att.setId(Attacks.Blizzard);
		att.setName("Blizzard");
		att.setType(Types.Ice);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Special);
		att.setModifier(Modifier.None);
		att.setPower(120);
		att.setPp(5);
		att.setAccuracy(895);
		att.setCritical(false);
		att.setStatusChange(Status.Frozen);
		att.setStatusChangeMeter(10);
		return att;
	}
	
	private Attack iceBeam() {
		Attack att = new Attack();
		att.setId(Attacks.IceBeam);
		att.setName("Ice Beam");
		att.setType(Types.Ice);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Special);
		att.setModifier(Modifier.None);
		att.setPower(95);
		att.setPp(10);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.Frozen);
		att.setStatusChangeMeter(10);
		return att;
	}
	
	private Attack icePunch() {
		Attack att = new Attack();
		att.setId(Attacks.IcePunch);
		att.setName("Ice Punch");
		att.setType(Types.Ice);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Special);
		att.setModifier(Modifier.None);
		att.setPower(75);
		att.setPp(15);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.Frozen);
		att.setStatusChangeMeter(10);
		return att;
	}
	
	
	/**************************  ICE END ***********************************/	
	
	/**************************  GROUND START ******************************/
	
	private Attack boneClub() {
		Attack att = new Attack();
		att.setId(Attacks.BoneClub);
		att.setName("Bone Club");
		att.setType(Types.Ground);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.Flinch);
		att.setPower(65);
		att.setPp(20);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}
	
	private Attack bonemerang() {
		Attack att = new Attack();
		att.setId(Attacks.Bonemerang);
		att.setName("Bonemerang");
		att.setType(Types.Ground);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.HitTwice);
		att.setPower(50);
		att.setPp(10);
		att.setAccuracy(895);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}
	
	private Attack dig() {
		Attack att = new Attack();
		att.setId(Attacks.Dig);
		att.setName("Dig");
		att.setType(Types.Ground);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.HideAndHit);
		att.setPower(100);
		att.setPp(10);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}
	
	private Attack earthquake() {
		Attack att = new Attack();
		att.setId(Attacks.Earthquake);
		att.setName("Earthquake");
		att.setType(Types.Ground);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.None);
		att.setPower(100);
		att.setPp(10);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}
	
	private Attack fissure() {
		Attack att = new Attack(){
			@Override
			public void effect(Pokemon attacker, Pokemon defender,
					boolean criticalHit) {
				//One Hit-KO
				//super.effect(attacker, defender, criticalHit);
			}
		};
		att.setId(Attacks.Fissure);
		att.setName("Fissure");
		att.setType(Types.Ground);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.None);
		att.setPower(10000);
		att.setPp(5);
		att.setAccuracy(297);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}
	
	/**************************  GROUND END ***********************************/
	
	/**************************  POISON START ***********************************/
	
	private Attack acid() {
		Attack att = new Attack();
		att.setId(Attacks.Acid);
		att.setName("Acid");
		att.setType(Types.Poison);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.EnemyDefense);
		att.setPower(40);
		att.setPp(30);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}
	
	private Attack poisonGas() {
		Attack att = new Attack();
		att.setId(Attacks.PoisonGas);
		att.setName("Poison Gas");
		att.setType(Types.Poison);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.None);
		att.setPower(0);
		att.setPp(40);
		att.setAccuracy(547);
		att.setCritical(false);
		att.setStatusChange(Status.Poison);
		att.setStatusChangeMeter(100);
		return att;
	}
	
	private Attack poisonSting() {
		Attack att = new Attack();
		att.setId(Attacks.PoisonSting);
		att.setName("Poison Sting");
		att.setType(Types.Poison);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.None);
		att.setPower(15);
		att.setPp(35);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.Poison);
		att.setStatusChangeMeter(20);
		return att;
	}
	
	private Attack poisonPowder() {
		Attack att = new Attack();
		att.setId(Attacks.Poisonpowder);
		att.setName("Poisonpowder");
		att.setType(Types.Poison);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.None);
		att.setPower(0);
		att.setPp(35);
		att.setAccuracy(746);
		att.setCritical(false);
		att.setStatusChange(Status.Poison);
		att.setStatusChangeMeter(100);
		return att;
	}
	
	private Attack sludge() {
		Attack att = new Attack();
		att.setId(Attacks.Sludge);
		att.setName("Sludge");
		att.setType(Types.Poison);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.None);
		att.setPower(65);
		att.setPp(20);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.Poison);
		att.setStatusChangeMeter(36);
		return att;
	}
	
	private Attack smog() {
		Attack att = new Attack();
		att.setId(Attacks.Sludge);
		att.setName("Smog");
		att.setType(Types.Poison);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.None);
		att.setPower(20);
		att.setPp(20);
		att.setAccuracy(695);
		att.setCritical(false);
		att.setStatusChange(Status.Poison);
		att.setStatusChangeMeter(36);
		return att;
	}
	
	private Attack toxic() {
		Attack att = new Attack(){
			@Override
			public void effect(Pokemon attacker, Pokemon defender,
					boolean criticalHit) {
				// TODO Auto-generated method stub
				super.effect(attacker, defender, criticalHit);
			}
		};
		att.setId(Attacks.Toxic);
		att.setName("Toxic");
		att.setType(Types.Poison);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.None);
		att.setPower(0);
		att.setPp(10);
		att.setAccuracy(844);
		att.setCritical(false);
		att.setStatusChange(Status.Poison);
		att.setStatusChangeMeter(100);
		return att;
	}
	
	/**************************  POISON END ***********************************/
	
	/**************************  ROCK START ***********************************/
	
	private Attack rockSlide() {
		Attack att = new Attack();
		att.setId(Attacks.RockSlide);
		att.setName("Rock Slide");
		att.setType(Types.Rock);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.None);
		att.setPower(75);
		att.setPp(10);
		att.setAccuracy(895);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}
	
	
	private Attack rockThrow() {
		Attack att = new Attack();
		att.setId(Attacks.RockThrow);
		att.setName("Rock Throw");
		att.setType(Types.Rock);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Physical);
		att.setModifier(Modifier.None);
		att.setPower(50);
		att.setPp(15);
		att.setAccuracy(645);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}
	
	/**************************  ROCK END ***********************************/
	
	/**************************  WATER START ***********************************/
	
	private Attack bubble() {
		Attack att = new Attack();
		att.setId(Attacks.Bubble);
		att.setName("Bubble");
		att.setType(Types.Water);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Special);
		att.setModifier(Modifier.EnemySpeed);
		att.setPower(20);
		att.setPp(30);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}
	
	private Attack bubbleBeam() {
		Attack att = new Attack();
		att.setId(Attacks.Bubblebeam);
		att.setName("Bubblebeam");
		att.setType(Types.Water);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Special);
		att.setModifier(Modifier.EnemySpeed);
		att.setPower(65);
		att.setPp(20);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}
	
	private Attack clamp() {
		Attack att = new Attack();
		att.setId(Attacks.Clamp);
		att.setName("Clamp");
		att.setType(Types.Water);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Special);
		att.setModifier(Modifier.MultiHit);
		att.setPower(35);
		att.setPp(10);
		att.setAccuracy(746);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}
	
	private Attack Crabhammer() {
		Attack att = new Attack();
		att.setId(Attacks.Crabhammer);
		att.setName("Crabhammer");
		att.setType(Types.Water);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Special);
		att.setModifier(Modifier.None);
		att.setPower(90);
		att.setPp(10);
		att.setAccuracy(844);
		att.setCritical(true);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}
	
	private Attack hydroPump() {
		Attack att = new Attack();
		att.setId(Attacks.HydroPump);
		att.setName("Hydro Pump");
		att.setType(Types.Water);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Special);
		att.setModifier(Modifier.None);
		att.setPower(120);
		att.setPp(5);
		att.setAccuracy(797);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}
	
	private Attack surf() {
		Attack att = new Attack();
		att.setId(Attacks.Surf);
		att.setName("Surf");
		att.setType(Types.Water);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Special);
		att.setModifier(Modifier.None);
		att.setPower(95);
		att.setPp(15);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}
	
	private Attack waterGun() {
		Attack att = new Attack();
		att.setId(Attacks.WaterGun);
		att.setName("Water Gun");
		att.setType(Types.Water);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Special);
		att.setModifier(Modifier.None);
		att.setPower(40);
		att.setPp(25);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}
	
	private Attack waterFall() {
		Attack att = new Attack();
		att.setId(Attacks.Waterfall);
		att.setName("Waterfall");
		att.setType(Types.Water);
		att.setInnefectiveAggainst(getInnefectiveList(att.getType()));
		att.setWeakAggainst(getWeakList(att.getType()));
		att.setStrongAggainst(getStrongList(att.getType()));
		att.setBase(Base.Special);
		att.setModifier(Modifier.None);
		att.setPower(80);
		att.setPp(15);
		att.setAccuracy(996);
		att.setCritical(false);
		att.setStatusChange(Status.None);
		att.setStatusChangeMeter(0);
		return att;
	}
	
	
	/**************************  WATER END ***********************************/
	
	
	

	private ArrayList<Types> getStrongList(Types type) {
		ArrayList<Types> list = new ArrayList<Types>();

		switch (type) {
		case Bug:
			list.add(Types.Grass);
			list.add(Types.Psychic);
			break;
		case Dragon:
			list.add(Types.Dragon);
			break;
		case Electric:
			list.add(Types.Water);
			list.add(Types.Flying);
			break;
		case Fighting:
			list.add(Types.Normal);
			list.add(Types.Rock);
			list.add(Types.Ice);
			break;
		case Fire:
			list.add(Types.Grass);
			list.add(Types.Bug);
			list.add(Types.Ice);
			break;
		case Flying:
			list.add(Types.Grass);
			list.add(Types.Fighting);
			list.add(Types.Bug);
			break;
		case Ground:
			list.add(Types.Fire);
			list.add(Types.Electric);
			list.add(Types.Rock);
			break;
		case Ice:
			list.add(Types.Grass);
			list.add(Types.Flying);
			list.add(Types.Ground);
			list.add(Types.Dragon);
			break;
		case Poison:
			list.add(Types.Grass);
			list.add(Types.Bug);
			break;
		case Psychic:
			list.add(Types.Fighting);
			list.add(Types.Poison);
			break;
		case Rock:
			list.add(Types.Fire);
			list.add(Types.Ice);
			list.add(Types.Flying);
			list.add(Types.Bug);
			break;
		case Water:
			list.add(Types.Fire);
			list.add(Types.Ground);
			list.add(Types.Rock);
			break;
		case Ghost:
			list.add(Types.Ghost);
			list.add(Types.Psychic);
			break;
		case Grass:
			list.add(Types.Rock);
			list.add(Types.Ground);
			list.add(Types.Water);
			break;
		case Normal:
			break;
		default:
			break;
		}

		return list;
	}

	private ArrayList<Types> getWeakList(Types type) {
		ArrayList<Types> list = new ArrayList<Types>();
		switch (type) {
		case Bug:
			list.add(Types.Fire);
			list.add(Types.Flying);
			list.add(Types.Fighting);
			break;
		case Dragon:
			break;
		case Electric:
			list.add(Types.Grass);
			list.add(Types.Electric);
			list.add(Types.Dragon);
			break;
		case Fighting:
			list.add(Types.Poison);
			list.add(Types.Flying);
			list.add(Types.Bug);
			list.add(Types.Psychic);			
			break;
		case Fire:
			list.add(Types.Fire);
			list.add(Types.Water);
			list.add(Types.Rock);
			list.add(Types.Dragon);
			break;
		case Flying:
			list.add(Types.Electric);
			list.add(Types.Rock);
			break;
		case Ground:
			list.add(Types.Grass);
			list.add(Types.Bug);
			break;
		case Ice:
			list.add(Types.Water);
			list.add(Types.Ice);
			break;
		case Normal:
			list.add(Types.Rock);
			break;
		case Poison:
			list.add(Types.Ghost);
			list.add(Types.Poison);
			list.add(Types.Ground);
			list.add(Types.Rock);
			break;
		case Psychic:
			list.add(Types.Psychic);
			break;
		case Rock:
			list.add(Types.Fighting);
			list.add(Types.Ground);
			break;
		case Ghost:
			break;
		case Grass:
			list.add(Types.Bug);
			list.add(Types.Dragon);
			list.add(Types.Fire);
			list.add(Types.Flying);
			list.add(Types.Grass);
			list.add(Types.Poison);
			break;
		case Water:
			list.add(Types.Water);
			list.add(Types.Grass);
			list.add(Types.Dragon);
			break;
			
		default:
			
			break;
		}

		return list;
	}

	private ArrayList<Types> getInnefectiveList(Types type) {
		ArrayList<Types> list = new ArrayList<Types>();
		switch (type) {
		case Bug:
			break;
		case Dragon:
			break;
		case Electric:
			list.add(Types.Ground);
			break;
		case Fighting:
			list.add(Types.Ghost);
			break;
		case Fire:
			break;
		case Flying:
			break;
		case Ground:
			list.add(Types.Flying);
			break;
		case Ice:
			break;
		case Normal:
			list.add(Types.Ghost);
			break;
		case Ghost:
			list.add(Types.Psychic);
			list.add(Types.Normal);
			break;
		default:
			break;
		}

		return list;
	}

}
