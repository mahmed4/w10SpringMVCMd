package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class ClassItems {
	private String className;
	private String preRequisite;
	private String classType;
	private String classSize;
	
	public ClassItems() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClassItems(String className, String preRequisite, String classType, String classSize) {
		super();
		this.className = className;
		this.preRequisite = preRequisite;
		this.classType = classType;
		this.classSize = classSize;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getPreRequisite() {
		return preRequisite;
	}
	public void setPreRequisite(String preRequisite) {
		this.preRequisite = preRequisite;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	public String getClassSize() {
		return classSize;
	}
	public void setClassSize(String classSize) {
		this.classSize = classSize;
	}
	@Override
	public String toString() {
		return "ClassItems [className=" + className + ", preRequisite=" + preRequisite + ", classType=" + classType
				+ ", classSize=" + classSize + "]";
	}
	
	

}
