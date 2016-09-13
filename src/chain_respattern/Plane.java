package chain_respattern;

public class Plane {

	private int type = 2;

	public void setType(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

	private String down = "";

	public void fly() {
		System.out.println("---------飞啦飞啊---------");
		switch (type) {
		case 1:
			down = "大飞机要降落，请出你们的老大";
			break;
		case 2:
			down = "747机要降落，清理旁边的小鸟";
			break;
		case 3:
			down = "军机要来了，快进地道";
			break;
		case 4:
			down = "小飞机来了，大家准备打它";
			break;
		}
		System.out.println(down);
		System.out.println("--------看处理：-------");
	};
}
