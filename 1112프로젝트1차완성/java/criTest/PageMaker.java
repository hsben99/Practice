package criTest;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class PageMaker {
	private int sPage;
	private int ePage;
	private int hmiPage = 5;
	private int lastPage;
	private boolean next;
	private boolean prev;
	private SearchCri cri;

	public void setLastPage(int total) {
		lastPage = (int) Math.ceil(total / (double) cri.getCurrPageRow());
		calcData();
		
		
	}

	public void calcData() {
		sPage = ((cri.getCurrPage() - 1) / hmiPage) * hmiPage + 1;
		ePage = sPage + hmiPage - 1;
		
		if (ePage > lastPage) {
			ePage = lastPage;
		}
		prev= !((sPage - 1)<1);
		next = (ePage+1) < lastPage;
		

	}

	public String makeQuery(int currPage) {
		UriComponents uc = UriComponentsBuilder.newInstance().queryParam("currPage", currPage).build();
		return uc.toString();
	}

	public String searchQuery(int currPage) {
		UriComponents uc = UriComponentsBuilder.newInstance().queryParam("currPage",  currPage)
				.queryParam("searchType", cri.getSearchType()).queryParam("keyword", cri.getKeyword()).build();
		return uc.toString(); 
	}

	public int getsPage() {
		return sPage;
	}

	public void setsPage(int sPage) {
		this.sPage = sPage;
	}

	public int getePage() {
		return ePage;
	}

	public void setePage(int ePage) {
		this.ePage = ePage;
	}

	public int getLastPage() {
		return lastPage;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public SearchCri getCri() {
		return cri;
	}

	public void setCri(SearchCri cri) {
		this.cri = cri;
	}

	public int getHmiPage() {
		return hmiPage;
	}

	public void setHmiPage(int hmiPage) {
		this.hmiPage = hmiPage;
	}

}
