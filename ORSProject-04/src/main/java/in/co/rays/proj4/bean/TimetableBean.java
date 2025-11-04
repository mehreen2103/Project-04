package in.co.rays.proj4.bean;

import java.util.Date;

public class TimetableBean extends BaseBean {
	
	private String semester;
	private String description;
	private Date examDate;
	private String examTime;
	private long courseId;
	private String courseName;
	private long subjectId;
	private String subjectName;
	public String getSemester() {
		return semester;
	}
	public String getDescription() {
		return description;
	}
	public Date getExamDate() {
		return examDate;
	}
	public String getExamTime() {
		return examTime;
	}
	public long getCourseId() {
		return courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public long getSubjectId() {
		return subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}
	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}
	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	
	
	

}
