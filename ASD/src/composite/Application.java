package composite;

public class Application {
public static void main(String []args){
	MenuComponent pancakeHouseMenu=new Menu("PancakeHouse","break fast");
	MenuComponent dinerMenu=new Menu("Diner","Lunch");
	MenuComponent cafeHouse=new Menu("Cafe","Dinner");
	
	MenuComponent allMenu=new Menu("AllHouse","AllMenu");
}
}
