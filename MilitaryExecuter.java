
class MilitaryExecuter{
	public static void main(String args[]){
		Military m = new Military();

		boolean added = m.addWeapon("Rifle");
		System.out.println(added);
		added = m.addWeapon("Pistol");
		System.out.println(added);
		added = m.addWeapon("Machine Gun");
		System.out.println(added);
		added = m.addWeapon("Sniper");
		System.out.println(added);
		added = m.addWeapon("Grenade");
		System.out.println(added);
		added = m.addWeapon("Rocket Launcher");
		System.out.println(added);
		added = m.addWeapon("Missile");
		System.out.println(added);
		added = m.addWeapon("Tank");
		System.out.println(added);
		added = m.addWeapon("Fighter Jet");
		System.out.println(added);
		added = m.addWeapon("Submarine");
		System.out.println(added);
		added = m.addWeapon("Warship");
		System.out.println(added);
		added = m.addWeapon("Drone");
		System.out.println(added);
		added = m.addWeapon("Artillery");
		System.out.println(added);
		added = m.addWeapon("Mortar");
		System.out.println(added);
		added = m.addWeapon("Bazooka");
		System.out.println(added);
		added = m.addWeapon("Flamethrower");
		System.out.println(added);
		added = m.addWeapon("Combat Knife");
		System.out.println(added);
		added = m.addWeapon("Torpedo");
		System.out.println(added);
		added = m.addWeapon("Helicopter Gunship");
		System.out.println(added);
		added = m.addWeapon("Ballistic Missile");
		System.out.println(added);
		added = m.addWeapon("Anti-Aircraft Gun");
		System.out.println(added);

		m.getWeapons();
	}
}