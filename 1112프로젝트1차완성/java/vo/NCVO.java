package vo;

public class NCVO {

	private int seq;
	private String studentId;
	private String contents;
	private String regDate;
	private String root;

	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "NCVO [seq=" + seq + ", studentId=" + studentId + ", contents=" + contents + ", regDate=" + regDate + ", getSeq()=" + getSeq() + ", getStudentId()=" + getStudentId() + ", getContents()=" + getContents() + ", getRegDate()="
				+ getRegDate() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
