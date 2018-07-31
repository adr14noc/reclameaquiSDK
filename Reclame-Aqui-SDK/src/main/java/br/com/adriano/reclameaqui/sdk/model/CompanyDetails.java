package br.com.adriano.reclameaqui.sdk.model;

public class CompanyDetails {
	private String name;
	private String logoUrl;
	private Boolean hasMediaKit;
	private Boolean hasWidget;
	private CompanyCategory category;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}
	public Boolean getHasMediaKit() {
		return hasMediaKit;
	}
	public void setHasMediaKit(Boolean hasMediaKit) {
		this.hasMediaKit = hasMediaKit;
	}
	public Boolean getHasWidget() {
		return hasWidget;
	}
	public void setHasWidget(Boolean hasWidget) {
		this.hasWidget = hasWidget;
	}
	public CompanyCategory getCategory() {
		return category;
	}
	public void setCategory(CompanyCategory category) {
		this.category = category;
	}
	
	
	

}
