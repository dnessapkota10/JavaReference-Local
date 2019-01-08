package come.home.longtype;

public class LongComparision {

	public void compareTwoLong(){
		final String[] companies = {"49","99","6"};
    	Long vendorNumber = 0L;  
    	
    	for(String company: companies){
    		final Long answer = Long.parseLong(company);
    		vendorNumber = vendorNumber.compareTo(answer) < 0L ? answer : vendorNumber;
    		
    	}    
    	if (vendorNumber==0L)
    		System.out.println("ERROR");
    	System.out.println(vendorNumber);
	}
}
