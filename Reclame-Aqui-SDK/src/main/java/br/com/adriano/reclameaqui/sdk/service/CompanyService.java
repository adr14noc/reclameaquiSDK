package br.com.adriano.reclameaqui.sdk.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.adriano.reclameaqui.sdk.model.Company;

public class CompanyService {
	
	@Value("${reclameaqui.companies-url}")
	private String companyEndpoint;
	RestTemplate restTemplate = new RestTemplate();
	
	
	public ResponseEntity<Company> getCompanyDetailsById() {
		
		String url = companyEndpoint + "";
		
		ResponseEntity<Company> response = restTemplate.getForEntity(url, Company.class);
		
		
		return response;
		
	}

}
