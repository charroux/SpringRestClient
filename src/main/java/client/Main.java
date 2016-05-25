package client;

import org.springframework.web.client.RestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

public class Main {

	public static void main(String[] args) {	
		
		RestTemplate template = new RestTemplate();
		
		Integer j = template.getForObject("http://localhost:8080/webServiceUrl", Integer.class);
		System.out.println(j);
		
		/*for(int i=0; i<200; i++){
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<Integer> entity = new HttpEntity<Integer>(i, headers);
			ResponseEntity<Integer> response = template.exchange("http://localhost:8181/orchestratorEventUrl", HttpMethod.PUT, entity, Integer.class);
			Integer result = response.getBody();
			System.out.println(result);
		}*/


	}

}
