package unisa.pf.assign02;
import unisa.pf.assign02.resources.*;


/**
 * Supplied code.   This code must compile and run without modification.
 * If you can't get a feature working create dummy methods so that this class functions.
 * 
 * @author gsa
 *
 */
public class TestDriver {

  public static void main(String[] args) {
    Table craftingTable = new Table();
    Resource[] list = new Resource[13];
    int counter=0;

    
    
    
    System.out.println("\n\n\n");
    System.out.println("Testing out toStrings");
    System.out.println("*********************");

    Dirt dirtBag = new Dirt(); //name was intentional:) 
    list[counter++] = dirtBag;
    list[counter-1].increaseResources(2);
    System.out.println("Should be {Dirt number Remaining=2}");
    System.out.println("          {" + list[counter-1]+"}");

    Iron ironBag = new Iron();
    list[counter++] = ironBag;
    list[counter-1].increaseResources(1);
    System.out.println("Should be {Iron Metal, number Remaining=1 enchanted=false}");
    System.out.println("          {" + list[counter-1]+"}");

    Sand sandBag = new Sand();
    list[counter++] = sandBag;
    list[counter-1].increaseResources(2);
    System.out.println("Should be {Sand number Remaining=2}");
    System.out.println("          {" + list[counter-1]+"}");

    Seed seedBag = new Seed();
    list[counter++] = seedBag;
    list[counter-1].increaseResources(2);
    System.out.println("Should be {Seed number Remaining=2}");
    System.out.println("          {" + list[counter-1]+"}");

    Steel steelBag = new Steel();
    list[counter++] = steelBag;
    list[counter-1].increaseResources(2);
    System.out.println("Should be {Steel Metal, number Remaining=2 enchanted=false}");
    System.out.println("          {" + list[counter-1]+"}");

    Sword swordBag = new Sword();
    list[counter++] = swordBag;
    list[counter-1].increaseResources(2);
    System.out.println("Should be {Sword Weapon, number Remaining 2 damageMin=8.0, damageMax=15.0}");
    System.out.println("          {" + list[counter-1]+"}");

    Oak oakBag = new Oak();
    list[counter++] = oakBag;
    list[counter-1].increaseResources(2);
    System.out.println("Should be {Oak Tree number Remaining=2}");
    System.out.println("          {" + list[counter-1]+"}");

    Wood woodBag = new Wood();
    list[counter++] = woodBag;
    list[counter-1].increaseResources(3);
    System.out.println("Should be {Wood number Remaining=3}");
    System.out.println("          {" + list[counter-1]+"}");

    Dagger daggerBag = new Dagger();
    list[counter++] = daggerBag;
    list[counter-1].increaseResources(2);
    System.out.println("Should be {Dagger Weapon, number Remaining 2 damageMin=2.0, damageMax=5.0}");
    System.out.println("          {" + list[counter-1]+"}");

    EnchantedPoleArm poleArmBag = new EnchantedPoleArm();
    list[counter++] = poleArmBag;
    list[counter-1].increaseResources(2);
    System.out.println("Should be {EnchangedPoleArm Weapon, number Remaining 2 damageMin=20.0, damageMax=50.0}");
    System.out.println("          {" + list[counter-1]+"}");

    Water waterBag = new Water();
    list[counter++] = waterBag;
    list[counter-1].increaseResources(2);
    System.out.println("Should be {Water number Remaining=2}");
    System.out.println("          {" + list[counter-1]+"}");

    Anduril andurilBag = new Anduril();
    list[counter++] = andurilBag;
    list[counter-1].increaseResources(2);
    System.out.println("Should be {Anduril Weapon, number Remaining 1 damageMin=30.0, damageMax=80.0}");
    System.out.println("          {" + list[counter-1]+"}");

    Javelin javelinBag = new Javelin();
    list[counter++] = javelinBag;
    list[counter-1].increaseResources(2);
    System.out.println("Should be {Javelin Weapon, number Remaining 2 damageMin=5.0, damageMax=10.0}");
    System.out.println("          {" + list[counter-1]+"}");
    
    
    
    
    System.out.println("\n\n\n");
    System.out.println("Testing out Crafting");
    System.out.println("********************");
    try {
      craftingTable.craft(swordBag,ironBag,woodBag);
      craftingTable.craft(swordBag,ironBag,woodBag);
    } catch (Exception ex) {
      System.out.println("Crafting New Sword Failed Resource Exhausted");
      System.out.println("Should crash on the second one because not enough resources");
    }
    list[counter-1].increaseResources(3);
    try {
      Table table2 = new Table();
      craftingTable.craft(table2, ironBag, sandBag, steelBag, woodBag);
    } catch (Exception ex) {
      System.out.println("Crafting New Table Failed Resource Exhausted");
    }
    try {
      craftingTable.craft(woodBag, oakBag);
    } catch (Exception ex) {
      System.out.println("Crafting New Wood Failed Resource Exhausted");
    }
    try {
      Table table2 = new Table();
      craftingTable.craft(oakBag, dirtBag, seedBag, waterBag);
    } catch (Exception ex) {
      System.out.println("Crafting New Oak Tree Failed Resource Exhausted");
    }
    try {
      craftingTable.craft(poleArmBag, ironBag, swordBag);
    } catch (Exception ex) {
      System.out.println("Crafting New PoleArm Failed Resource Exhausted");
    }    
    try {
      craftingTable.craft(poleArmBag, steelBag, swordBag);
    } catch (Exception ex) {
      System.out.println("Crafting New PoleArm Failed Resource Exhausted");
    }
    
    
    System.out.println("\n\n\n");
    System.out.println("Testing Get Description");
    System.out.println("**************************");
    for (int i=0;i<list.length;i++) {
      System.out.println(""+(i+1)+" "+list[i].getDescription());
    }

    
    System.out.println("\n\n\n");
    System.out.println("Testing out Random Methods");
    System.out.println("**************************");
    //Random method calls to ensure the design is correct.  This is not testing of methods 
    //just structural testing
    Sword sword1 = new Sword();
    Dagger dagger1 = new Dagger();
    System.out.println("Check which weapon is better should say true->"+sword1.isStronger(dagger1));
    System.out.println("Check how many daggers are in the bag, should be 0 ->"+dagger1.getNumber());
    System.out.println("Daggers Name >"+dagger1.getName());
    dagger1.increaseResources(2);
    System.out.println("Check how many daggers are in the bag, should now be 2 ->"+dagger1.getNumber());
    //Weapon w1 = new Weapon("Custom",1,2);//shouldnt be compilable because it is abstract
    Weapon w1 = new Dagger();
    Resource r1 = new Dagger();
    Resource r2 = new Sword();
    Weapon w2 = sword1;
    System.out.println("Swords Available (Should be false)-> "+sword1.resourceAvailable());
    sword1.increaseResources(1);
    System.out.println("Swords Available (Should be true)-> "+sword1.resourceAvailable());
    System.out.println("Sword Min Damage (Should be 8)->"+sword1.getDamageMin());
    System.out.println("Sword Max Damage (Should be 15)->"+sword1.getDamageMax());
    Tree oak = new Oak();
    System.out.println("Should be Oak->"+oak.getName());
    Resource r3 = new Oak();
    Metal m1 = new Iron(true);
    System.out.println("Should be Iron->"+m1);
    System.out.println("Should be Enchanted (True)->"+m1.isEnchanted());
    Iron i1 = new Iron();
    System.out.println("Should not be Enchanted (False)->"+i1.isEnchanted());
    Resource r4 = new Sand();
    System.out.println("Should be (Sand number Remaining=0)->"+r4);

    
    
    
    System.out.println("\n\n\n");
    System.out.println("Testing out File IO");
    System.out.println("*******************");
    System.out.println("Next time lines are identical");
    //check to see if sword can be written to disk and read back
    sword1.increaseResources(923);
    System.out.println(sword1);
    sword1.saveToDisk("sword.bin");
    Sword sword2 = (Sword) Resource.readFromDisk("sword.bin");
    System.out.println(sword2);


    
    
    System.out.println("\n\n\n");
    System.out.println("Testing out Advanced Features");
    System.out.println("*****************************");
    //check to see if the final module is working.
    ironBag.increaseResources(2);
    if (craftingTable.advancedAttempted()) {
      System.out.println("Testing Advanced Method");
      System.out.print("Should be Javelin ->");
      System.out.println(craftingTable.findBestCraftableWeapon(woodBag));
      System.out.print("Should be Dagger ->");
      System.out.println(craftingTable.findBestCraftableWeapon(steelBag));
      System.out.print("Should be Sword ->");
      System.out.println(craftingTable.findBestCraftableWeapon(woodBag, waterBag, ironBag, dirtBag, steelBag));
      System.out.print("Should be Javelin ->");
      System.out.println(craftingTable.findBestCraftableWeapon(woodBag, waterBag, dirtBag, steelBag));
      System.out.print("Should be None ->");
      //For some reason a buck of muddy water cannot be a weapon
      System.out.println(craftingTable.findBestCraftableWeapon(waterBag, dirtBag)); 
      System.out.print("Should be Dagger (Not EnchantedPoleArm Because the metal is not Enchanted) ->");
      System.out.println(craftingTable.findBestCraftableWeapon(swordBag, waterBag, seedBag, steelBag));
      System.out.print("Should be Enchanted Pole Arm (using enchanted steel)->");
      Steel enchantedSteel = new Steel(true,3);
      System.out.println(craftingTable.findBestCraftableWeapon(swordBag, waterBag, seedBag, enchantedSteel));
      System.out.print("Should be Enchanted Pole Arm (using enchanted iron) ->");
      Iron enchantedIron = new Iron(true,3);
      System.out.println(craftingTable.findBestCraftableWeapon(swordBag, waterBag, seedBag, enchantedIron));
    }
  }
}
