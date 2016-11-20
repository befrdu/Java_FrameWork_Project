package composite;

public class Waiter {
MenuComponent allMenu;

public Waiter(MenuComponent allMenu){
	this.allMenu=allMenu;
}
public void print(){
	allMenu.print();
}
}
