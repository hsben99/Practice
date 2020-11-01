package criTest;

public class Criteria {

	private int currPage = 1;
	private int sno;
	private int eno;
	private	int currPageRow = 10;


	public void setCurrPage(int currPage) {
		if (currPage > 1) {
			this.currPage = currPage;
		} else {
			this.currPage = 1;
		}
	}

	public void setSnoEno() {
		sno = (currPage - 1) * currPageRow + 1;
		eno = sno + currPageRow - 1;
	}

	public int getSno() {
		return sno;
	}

	public int getEno() {
		return eno;
	}

	public int getCurrPageRow() {
		return currPageRow;
	}

	public void setCurrPageRow(int currPageRow) {
		this.currPageRow = currPageRow;
	}
	public int getCurrPage() {
		return currPage;
	}

}
