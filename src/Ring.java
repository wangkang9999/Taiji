import java.util.ArrayList;

public class Ring {
	int[] node;
	ArrayList record=new ArrayList();
	
	
	public Ring() {}
	
	
	public Ring(int[] x) {
		node=x;
	}
	
	public Ring copy() {
		Ring re=new Ring();
		re.node=node.clone();
		re.record=(ArrayList) record.clone();
		return re;
	}
}
