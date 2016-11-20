package composite;

public class MenuItem extends MenuComponent {
private String name;
private String description;
private double price;
private boolean vegiterian;

public MenuItem(String n, String d, double p, boolean v){
	name=n;
	description=d;
	price=p;
	vegiterian=v;
}
	@Override
	public void print() {
		System.out.println(name+" "+description+" "+price+" "+vegiterian);

	}
	public String getName(){
		return name;
	}
	public String getDescription(){
		return description;
	}
	public Double getPrice(){
		return price;
	}
	public boolean isVegiterain(){
		return vegiterian;
	}

}
