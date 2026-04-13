package practice2;

public class Buki {
	private String name;
	private int attackValue;
	
	Buki(String name, int attackValue) {
		this.name = name;
		this.attackValue = attackValue;
	}
		String getName() {
			return name;
		}
		int getattackValue() {
			return attackValue;
		}
		void use() {
		System.out.println(name + "でこうげき!");
        System.out.println("敵に" + attackValue + "のダメージ!");	
	}
}