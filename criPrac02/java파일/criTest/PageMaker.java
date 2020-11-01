package criTest;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class PageMaker {

	private Criteria cri;
	private int sPage;
	private int ePage;
	private int lastPage;
	private int perPage = 2;
	private boolean prev;
	private boolean next;

	public void setLastPage(int total) {
		this.lastPage = (int) Math.ceil(total / (double) cri.getCurrPageRow());
		System.out.println(lastPage); 
		calcData();
	}

	public String makeQuery(int currPage) {
		cri.setCurrPage(currPage);
		UriComponents uricomponents = UriComponentsBuilder.newInstance().queryParam("currPage", cri.getCurrPage())
				.build();
		return uricomponents.toString();
	}

	public void calcData() {
		ePage = (int) Math.ceil(cri.getCurrPage() / (double) perPage) * perPage;
		sPage = ((cri.getCurrPage() - 1) / perPage) * perPage + 1;

		if (ePage > lastPage) {
			ePage = lastPage;
		}
		prev = sPage == 1 ? false : true;
		next = ePage == lastPage ? false : true;

	}

	public Criteria getCri() {
		return cri;
	}

	public void setCri(Criteria cri) {
		this.cri = cri;
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

	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

}
