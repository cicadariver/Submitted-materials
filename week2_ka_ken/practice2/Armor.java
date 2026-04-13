package practice2;

public class Armor {
	 private String name;
	 private int defenceValue;
	
	 Armor(String name, int defenceValue) {
	        this.name = name;
	        this.defenceValue = defenceValue;
	 }
	        
	        String getName() {
	            return name;
	        }
	        int getDefenceValue() {
	            return defenceValue;
	        }
	        public void use() {
	            System.out.println(name + "を身に着けた");
	            System.out.println("守備力が" + defenceValue + "上がった");
	        }
	    }    