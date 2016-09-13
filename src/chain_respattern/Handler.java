package chain_respattern;

public abstract class Handler {

	private Handler nexthandler;
	@SuppressWarnings("unused")
	private int handletype;
	
//	public Handler(int handletype){
//		this.handletype=handletype;
//	}

	
	
	public void setnext(Handler nexthandler){
		this.nexthandler = nexthandler;
	} 
	
	public void handle(Plane plane){
		if(this.gethandletype()==plane.getType()){
			this.respose(plane);
		}else if(nexthandler==null){
			System.out.println("这是什么鬼飞机，等等，我还不知道怎么处理");
		}else{
			nexthandler.handle(plane);
		}
	}
	
	public abstract void respose(Plane plane);
	
	public abstract  int gethandletype() ;
}
