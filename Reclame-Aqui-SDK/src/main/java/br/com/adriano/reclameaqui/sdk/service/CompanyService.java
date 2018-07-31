package br.com.adriano.reclameaqui.sdk.service;

import java.util.ResourceBundle;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.adriano.reclameaqui.sdk.model.Companies;
import br.com.adriano.reclameaqui.sdk.model.Company;
import br.com.adriano.reclameaqui.sdk.model.CompanyDetails;
import br.com.adriano.reclameaqui.sdk.model.CompanyHistory;

public class CompanyService {
	
	private static String searchURL = ResourceBundle.getBundle("application").getString("reclameaqui.search-url");
	private static String baseURL = ResourceBundle.getBundle("application").getString("reclameaqui.base-url");
	private static String companyEndpoint 	= 	ResourceBundle.getBundle("application").getString("reclameaqui.companies-url");
	private static String companySearchUrl	= 	searchURL + ResourceBundle.getBundle("application").getString("reclameaqui.companies.path");
	
	
	private static RestTemplate restTemplate = new RestTemplate();
	

	public static ResponseEntity<CompanyDetails> getCompanyDetailsById(int companyId) {
		
		String url = companyEndpoint + companyId;
		
		return restTemplate.getForEntity(url, CompanyDetails.class);

	}
	
	public static ResponseEntity<Companies>listCompanyByName(String name){
		
		String url = companySearchUrl + name;
		
	  return restTemplate.getForEntity(url, Companies.class);
		
	}
	
	public static ResponseEntity<CompanyHistory> getCompanyYearHistory(int companyId){
		
		String url = baseURL + "/company/"+ companyId + "/indexevolution";
		
		return restTemplate.getForEntity(url, CompanyHistory.class);
		
	}

}
