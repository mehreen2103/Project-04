package in.co.rays.proj4.bean;

public class MarksheetBean extends BaseBean{

	private String roolNo;
	private long studentId;
	private String name;
	private Integer physics;
	private Integer chemistry;
	private Integer maths;
	public String getRoolNo() {
		return roolNo;
	}
	public long getStudentId() {
		return studentId;
	}
	public String getName() {
		return name;
	}
	public Integer getPhysics() {
		return physics;
	}
	public Integer getChemistry() {
		return chemistry;
	}
	public Integer getMaths() {
		return maths;
	}
	public void setRoolNo(String roolNo) {
		this.roolNo = roolNo;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhysics(Integer physics) {
		this.physics = physics;
	}
	public void setChemistry(Integer chemistry) {
		this.chemistry = chemistry;
	}
	public void setMaths(Integer maths) {
		this.maths = maths;
	}
	
	
}
