package visitor;

import java.util.Iterator;

public class WeightVisitor extends ComponentVisitor {
	private  String indent = "";
	
	public WeightVisitor() {}
	
	public void visit (Brick b) {
		
		System.out.println(indent + " Brick " + b.getPartNo() + ", weight " + b.getWeight() + ".");
	}
	
	public void visit (Unit u) {
		Iterator<Component> it = u.getComponents().iterator();
		indent = indent.concat("+");
		System.out.println("------------");
		System.out.println(indent + " Unit " + u.getPartNo() + ":");
		while (it.hasNext()) {
			it.next().accept(this);
		}
		System.out.println(indent + " Total weight of unit: " + u.getWeight() + "."); 
		System.out.println("------------");
		indent = indent.substring(0, indent.length()-1);

	}
}