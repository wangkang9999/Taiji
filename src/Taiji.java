
public class Taiji {
	int l1,l2,deep,max;
	int[] temp,round,change;
	Ring r;
	
	public Taiji (int[] in , int[] u) {
		r=new Ring(in);
		l1=in.length;
		l2=u.length;	
		round=in;
		change=u;
		temp=in.clone();
	}
		
	// use recursion depth of 100
	public void run() {
		for (int i=0;i<100;i++) {
			deep=i;
			degree(r,0);
		}
	}

	//recursion function 
	public void degree(Ring x,int d) {
		int start;
		if (d>deep) {
			return;
		}
		 else if (check(x.node)) {
			System.out.printf("find! ======== %d\n",d);
			show(x);
			System.exit(0);
		}
		else {
			if (x.record.size()==0) {
				start=0;
			}else {
				start=(int)x.record.get(x.record.size()-1);
			}
			for (int i=start;i<l1;i++) {
				Ring xxx=doit(x,i);
				degree(xxx,d+1);
			}
		}
	}
	
	
	// change on nodes  by modle  1 time
	public Ring doit(Ring x ,int key) {
		Ring xx=x.copy();
		int index;
		xx.record.add(key);
		for (int i=0;i<l2;i++) {
			index=key+i;
			if (index>=l1) {index=index-l1;}
			if (change[i]==1){
				if (xx.node[index]==0) { 
					xx.node[index]=1;
					} 
				else {
					xx.node[index]=0;
					}
			}
		}
		return xx;
	}
	
	
	//check nodes 
	public boolean check(int[] y) {
		boolean re=true;
		for (int i=1;i<l1;i++) {
			re=re && (y[0]==y[i]);
			if (!re) {return re;};
		}
		return re;
	}
	
	//show the way to get resule
	public void show(Ring x) {
		for (int i=0;i<x.record.size();i++) {
			System.out.printf("%d  ",x.record.get(i));
		}	
		System.out.println();
	}
}
