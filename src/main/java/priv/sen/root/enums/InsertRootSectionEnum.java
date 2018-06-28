package priv.sen.root.enums;

/**
 * 添加板块的数据字典
 * @author sen
 * 2018年5月9日
 * 下午6:02:07
 * TODO
 */
public enum InsertRootSectionEnum {

	SUCCESS(1, "添加成功"), NO_USER(0,"添加失败"),REPEAT_USER(-1, "重复添加"),INNER_ERROR(-2, "系统异常");
	
	private int state;// 信息代码
	private String stateInfo;// 信息说明
	
	private InsertRootSectionEnum(int state,String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
	
	public static InsertRootSectionEnum stateOf(int index) {
		for(InsertRootSectionEnum state : values()) {
			if(state.getState() == index) {
				return state;
			}
		}
		return null;
	}
}
