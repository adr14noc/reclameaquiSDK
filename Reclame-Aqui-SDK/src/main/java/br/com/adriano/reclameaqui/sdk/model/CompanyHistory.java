package br.com.adriano.reclameaqui.sdk.model;

import java.util.List;

public class CompanyHistory {
	
    private List<CompanySnapshot> snapshots ;
    private String date ;
    private long companyId;
    private boolean deleted;
    private String created;
    private String ip;
    private String legacyId;
    private String modified;
    private String id ;
	public List<CompanySnapshot> getSnapshots() {
		return snapshots;
	}
	public void setSnapshots(List<CompanySnapshot> snapshots) {
		this.snapshots = snapshots;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getLegacyId() {
		return legacyId;
	}
	public void setLegacyId(String legacyId) {
		this.legacyId = legacyId;
	}
	public String getModified() {
		return modified;
	}
	public void setModified(String modified) {
		this.modified = modified;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
    
    
    
    
    
    
    
    
	

}
