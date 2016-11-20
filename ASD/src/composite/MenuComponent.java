package composite;

public abstract class MenuComponent {
public String getName(){
	throw new UnsupportedOperationException();
}
public String getDescription(){
	throw new UnsupportedOperationException();
}
public Double getPrice(){
	throw new UnsupportedOperationException();
}
public boolean isVegiterain(){
	throw new UnsupportedOperationException();
}
public void remove(MenuComponent component){
	throw new UnsupportedOperationException();
}
public MenuComponent getChild(int i){
	throw new UnsupportedOperationException();
}
public abstract void print();
}
