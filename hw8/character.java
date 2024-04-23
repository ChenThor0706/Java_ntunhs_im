package hw8;


public abstract class character{

protected String name;
protected int health;
protected int attackPower;

public character(String name, int health, int attackPower) {
this.name = name;
this.health = health;
this.attackPower = attackPower;

}
public void attack(character other) {
other.takeDamage(attackPower);
}
public void takeDamage(int damage) {
health -= damage;
System.out.println(name+"受到"+damage+"傷害，剩餘血量："+health);
	}
public void display() {
	// TODO Auto-generated method stub
	
}	
}