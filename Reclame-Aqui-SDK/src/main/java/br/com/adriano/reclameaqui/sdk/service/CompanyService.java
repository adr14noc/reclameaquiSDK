package br.com.adriano.reclameaqui.sdk.service;

import java.util.ResourceBundle;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.adriano.reclameaqui.sdk.model.Company;

public class CompanyService {
	
	private static String companyEndpoint = ResourceBundle.getBundle("application").getString("reclameaqui.companies-url"); 
	private static RestTemplate restTemplate = new RestTemplate();
	

	public static ResponseEntity<Company> getCompanyDetailsById(int companyId) {
		
		String url = companyEndpoint + companyId;
		
		return restTemplate.getForEntity(url, Company.class);

	}

}
