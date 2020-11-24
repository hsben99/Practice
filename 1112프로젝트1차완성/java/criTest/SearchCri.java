package criTest;

public class SearchCri {

	private int sno;
	private int eno;
	private int currPage = 1;
	private int currPageRow = 15;
	private String searchType;
	private String keyword="";

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

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public int getCurrPageRow() {
		return currPageRow;
	}

	
	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

}
