package practice3;

public class Main {
	public static void main(String[] args) {
		FullTimeEmployee tanaka = new FullTimeEmployee("田中", 300000);
        PartTimeEmployee sato = new PartTimeEmployee("佐藤", 1200, 80);
        PartTimeEmployee suzuki = new PartTimeEmployee("鈴木", 1000, 60);
		
        System.out.println(tanaka.getName() + " の給与: " + tanaka.calculateSalary() + "円");
        System.out.println(sato.getName() + " の給与: " + sato.calculateSalary() + "円");
        System.out.println(suzuki.getName() + " の給与: " + suzuki.calculateSalary() + "円");
	}

}
