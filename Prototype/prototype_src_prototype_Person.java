package prototype;


public class Person implements ILiving {
	
	private int armNum;
	private int armLong;
	private int legNum;
	private int legLong;
	private String skinColor;
	private String headType;
	
	 
	public Person (int armNum, int armLong, int legNum, int legLong, String skinColor, String headType) {
		this.armNum = armNum;
		this.armLong = armLong;
		this.legNum = legNum;
		this.legLong = legLong;
		this.skinColor = skinColor;
		this.headType =headType;
	}

	@Override
	// klon yapailmek isin kurulan yapi
	public ILiving clone() {
		try {
			return (ILiving) super.clone(); 
	    } catch (CloneNotSupportedException e) {
	        throw new RuntimeException("Clone not supported");
	    }
	}
	 
	public int getArmNum() {
		return armNum;
	}
	
	public void setArmNum(int armNum) {
		this.armNum = armNum;
	}
	
	public int getArmLong() {
		return armLong;
	}
	
	public void setArmLong(int armLong) {
		this.armLong = armLong;
	}

	public int getLegNum() {
		return legNum;
	}

	public void setLegNum(int legNum) {
		this.legNum = legNum;
	}
	
	public int getLegLong() {
		return legLong;
	}

	public void setLegLong(int legLong) {
		this.legLong = legLong;
	}

	public String getSkinColor() {
		return skinColor;
	}

	public void setSkinColor(String skinColor) {
		this.skinColor = skinColor;
	}

	public String getHeadType() {
		return headType;
	}

	public void setHeadType(String headType) {
		this.headType = headType;
	}


	@Override
	public String toString() {
		return "Person [armNum=" + armNum + ", armLong=" + armLong + ", legNum=" + legNum + ", legLong=" + legLong
				+ ", skinColor=" + skinColor + ", headType=" + headType + "]";
	}
	
	
}
