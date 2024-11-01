package week3.day1.HomeAssignments;

public class APIClient {
	
	public void sendRequest(String endpoint)
	{
		System.out.println("Send Request method with 1 argument");
		System.out.println("Endpoint :"+endpoint);
	}
	
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus)
	{
		System.out.println("Send Request method with 3 arguments");
		System.out.println("Endpoint:"+endpoint);
		System.out.println("Request Body:"+requestBody);
		System.out.println("Request Status:"+requestStatus);
	}

	public static void main(String[] args) {
		
		String endpoint = "http://www.w3.org/";
		String requestBody = "Sample Request";
		boolean requestStatus = true;
		APIClient client = new APIClient();
		client.sendRequest("https://wwww.seleniumqa.org");
		client.sendRequest(endpoint,requestBody,requestStatus);

	}

}
