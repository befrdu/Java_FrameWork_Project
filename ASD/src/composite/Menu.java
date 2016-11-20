package composite;
import java.util.*;
public class Menu extends MenuComponent {
String name;
String description;
public Menu(String n, String d){
	name=n;
	description=d;
}
List<MenuComponent>menuList=new ArrayList<>();

public String getName(){
 return name;
}
public String getDescription(){
	return description;
}
public void remove(MenuComponent component){
	menuList.remove(component);
}
public MenuComponent getChild(int i){
	return menuList.get(i);
}

	@Override
	public void print() {
		System.out.println(name+" "+description);
		
		Iterator i=menuList.iterator();
		while(i.hasNext()){
			MenuComponent menucomponent=(MenuComponent)i.next();
			menucomponent.print();
		}

	}

}
