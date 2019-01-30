/**
 * 
 */
package com.home.ups.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

/**
 * @author Dinesh
 *
 */
public class ReturnLabelHttpPost {
	
	public static void printLabels(){
		printLabelMI();
		
	}
	
	public static void printLabelMI(){
		HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost("https://row.ups.com/Ship/LabelPost.aspx");
        try {
            /*List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
            nameValuePairs.add(new BasicNameValuePair("Company","Demo_MI1"));
            nameValuePairs.add(new BasicNameValuePair("LoginId","demo"));  
            nameValuePairs.add(new BasicNameValuePair("Password","demo"));
            nameValuePairs.add(new BasicNameValuePair("AcctNumb","A0T868"));            
            nameValuePairs.add(new BasicNameValuePair("PayAccount","KTSPx1051"));
            nameValuePairs.add(new BasicNameValuePair("PayInfo","P"));
            nameValuePairs.add(new BasicNameValuePair("UseNegotiatedRates","False"));
            
            nameValuePairs.add(new BasicNameValuePair("SFName","TEST ACCOUNT"));  
            nameValuePairs.add(new BasicNameValuePair("SFAddr1","140 CRESCENT DR"));
            nameValuePairs.add(new BasicNameValuePair("SFCity","COLLIERVILLE"));            
            nameValuePairs.add(new BasicNameValuePair("SFState","TN"));
            nameValuePairs.add(new BasicNameValuePair("SFZip","38017"));
            nameValuePairs.add(new BasicNameValuePair("SFCountry","US"));
            nameValuePairs.add(new BasicNameValuePair("SFEMail", "dinesh@orangeag.com"));
            
            nameValuePairs.add(new BasicNameValuePair("STName","The Juice Plus+ Company")); 
            nameValuePairs.add(new BasicNameValuePair("STAttn","USO89786526")); 
            nameValuePairs.add(new BasicNameValuePair("STAddr1","5585 E. Shelby Dr."));
            nameValuePairs.add(new BasicNameValuePair("STCity","Memphis"));            
            nameValuePairs.add(new BasicNameValuePair("STState","TN"));
            nameValuePairs.add(new BasicNameValuePair("STZip","381419998"));
            nameValuePairs.add(new BasicNameValuePair("STCountry","US"));
            nameValuePairs.add(new BasicNameValuePair("STEMail", null)); 
            nameValuePairs.add(new BasicNameValuePair("STResidental", "false")); 
            
            nameValuePairs.add(new BasicNameValuePair("LabelFormatROW","1G"));  
            nameValuePairs.add(new BasicNameValuePair("RSType","M7"));
            nameValuePairs.add(new BasicNameValuePair("ServiceCode","03"));            
            nameValuePairs.add(new BasicNameValuePair("DelMethodROW","4E"));
            nameValuePairs.add(new BasicNameValuePair("Desc","Apparel"));
            
            nameValuePairs.add(new BasicNameValuePair("SatDelivery","False"));  
            nameValuePairs.add(new BasicNameValuePair("DocsOnly","Only"));
            nameValuePairs.add(new BasicNameValuePair("NumberOfPackages","1"));            
            nameValuePairs.add(new BasicNameValuePair("PackageType","02"));
            nameValuePairs.add(new BasicNameValuePair("PackageWeight","7.7"));
            nameValuePairs.add(new BasicNameValuePair("PackageWeightUnit","LBS"));
            nameValuePairs.add(new BasicNameValuePair("PackageRef01",""));
            nameValuePairs.add(new BasicNameValuePair("PackageID","1111"));
            nameValuePairs.add(new BasicNameValuePair("CostCenter","1111"));*/
            
            
            
            post.setEntity(new UrlEncodedFormEntity(preparePOSTInput()));

            HttpResponse response = client.execute(post);
            BufferedReader rd = new BufferedReader(new InputStreamReader(
                    response.getEntity().getContent()));
            
            String line = "";
            String txt = "";
            boolean isSuccess = false;
            //line = rd.lines().collect(Collectors.joining());
            //System.out.println(line);
            int i = 1;
            while ((line = rd.readLine()) != null) {
            	System.out.println(line);
            	if (line.matches(".*StatusMessage.*") && line.split(":")[1].equals("Successful")) {
            		isSuccess = true;
            		System.out.println("Success:" +line);
            	}
            	else if(isSuccess && line.matches(".*TrackingNumber.*")){
            		System.out.println("Tracking number::" + line.split(":")[1]);
            	}
            }
            if(!isSuccess){
            	System.out.println("FAILURE");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	
	public static List<NameValuePair> preparePOSTInput() {
		List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
		
        nameValuePairs.add(new BasicNameValuePair("Company", "Demo_MI1"));
        nameValuePairs.add(new BasicNameValuePair("LoginId", "demo"));  
        nameValuePairs.add(new BasicNameValuePair("Password", "demo"));
        nameValuePairs.add(new BasicNameValuePair("AcctNumb", "A0T868"));            
        nameValuePairs.add(new BasicNameValuePair("PayAccount", "KTSPx1051"));
        nameValuePairs.add(new BasicNameValuePair("PayInfo", "P"));
        nameValuePairs.add(new BasicNameValuePair("UseNegotiatedRates", "True"));
        
        nameValuePairs.add(new BasicNameValuePair("SFName","TEST ACCOUNT"));  
        nameValuePairs.add(new BasicNameValuePair("SFAddr1","140 CRESCENT DR"));
        nameValuePairs.add(new BasicNameValuePair("SFCity","COLLIERVILLE"));            
        nameValuePairs.add(new BasicNameValuePair("SFState","TN"));
        nameValuePairs.add(new BasicNameValuePair("SFZip","38017"));
        nameValuePairs.add(new BasicNameValuePair("SFCountry","US"));
        nameValuePairs.add(new BasicNameValuePair("SFEMail", "dinesh@orangeag.com"));
                
        nameValuePairs.add(new BasicNameValuePair("STName","The Juice Plus+ Company")); 
        nameValuePairs.add(new BasicNameValuePair("STAttn","USO89786526")); 
        nameValuePairs.add(new BasicNameValuePair("STAddr1","5585 E. Shelby Dr."));
        nameValuePairs.add(new BasicNameValuePair("STCity","Memphis"));            
        nameValuePairs.add(new BasicNameValuePair("STState","TN"));
        nameValuePairs.add(new BasicNameValuePair("STZip","381419998"));
        nameValuePairs.add(new BasicNameValuePair("STCountry","US"));
        nameValuePairs.add(new BasicNameValuePair("STEMail", null)); 
        nameValuePairs.add(new BasicNameValuePair("STResidental", "False")); 
              
        nameValuePairs.add(new BasicNameValuePair("LabelFormatROW","1G"));  
        nameValuePairs.add(new BasicNameValuePair("RSType","M7"));
        nameValuePairs.add(new BasicNameValuePair("ServiceCode","03"));            
        nameValuePairs.add(new BasicNameValuePair("DelMethodROW","4E"));
        nameValuePairs.add(new BasicNameValuePair("Desc","JuicePlus Products")); //This must not be empty
        
        
        nameValuePairs.add(new BasicNameValuePair("SatDelivery", "false"));         
        nameValuePairs.add(new BasicNameValuePair("PackageType", "02"));
        nameValuePairs.add(new BasicNameValuePair("PackageWeight", "7.6460"));
        nameValuePairs.add(new BasicNameValuePair("PackageWeightUnit", "LBS"));
        nameValuePairs.add(new BasicNameValuePair("PackageRef01", "1234"));
        
        nameValuePairs.add(new BasicNameValuePair("PackageID", "1234" )); /*input.getPackageId()*/
        nameValuePairs.add(new BasicNameValuePair("CostCenter", "0000"));
        
        //nameValuePairs.add(new BasicNameValuePair("SatDelivery","false"));  
        //nameValuePairs.add(new BasicNameValuePair("DocsOnly","Only"));
        //nameValuePairs.add(new BasicNameValuePair("NumberOfPackages","1"));            
        /*nameValuePairs.add(new BasicNameValuePair("PackageType","02"));
        nameValuePairs.add(new BasicNameValuePair("PackageWeight","7.6460"));
        nameValuePairs.add(new BasicNameValuePair("PackageWeightUnit","LBS"));
        nameValuePairs.add(new BasicNameValuePair("PackageRef01",""));
        nameValuePairs.add(new BasicNameValuePair("PackageID","1234"));
        nameValuePairs.add(new BasicNameValuePair("CostCenter","0000"));*/
        
        

		return nameValuePairs;
	}
	
	
	
	
	
	public void validInput(){
		List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
		
        nameValuePairs.add(new BasicNameValuePair("Company", "Demo_MI1"));
        nameValuePairs.add(new BasicNameValuePair("LoginId", "demo"));  
        nameValuePairs.add(new BasicNameValuePair("Password", "demo"));
        nameValuePairs.add(new BasicNameValuePair("AcctNumb", "A0T868"));            
        nameValuePairs.add(new BasicNameValuePair("PayAccount", "KTSPx1051"));
        nameValuePairs.add(new BasicNameValuePair("PayInfo", "P"));
        nameValuePairs.add(new BasicNameValuePair("UseNegotiatedRates", "True"));
        
        nameValuePairs.add(new BasicNameValuePair("SFName","TEST ACCOUNT"));  
        nameValuePairs.add(new BasicNameValuePair("SFAddr1","140 CRESCENT DR"));
        nameValuePairs.add(new BasicNameValuePair("SFCity","COLLIERVILLE"));            
        nameValuePairs.add(new BasicNameValuePair("SFState","TN"));
        nameValuePairs.add(new BasicNameValuePair("SFZip","38017"));
        nameValuePairs.add(new BasicNameValuePair("SFCountry","US"));
        nameValuePairs.add(new BasicNameValuePair("SFEMail", "dinesh@orangeag.com"));
                
        nameValuePairs.add(new BasicNameValuePair("STName","The Juice Plus+ Company")); 
        nameValuePairs.add(new BasicNameValuePair("STAttn","USO89786526")); 
        nameValuePairs.add(new BasicNameValuePair("STAddr1","5585 E. Shelby Dr."));
        nameValuePairs.add(new BasicNameValuePair("STCity","Memphis"));            
        nameValuePairs.add(new BasicNameValuePair("STState","TN"));
        nameValuePairs.add(new BasicNameValuePair("STZip","381419998"));
        nameValuePairs.add(new BasicNameValuePair("STCountry","US"));
        nameValuePairs.add(new BasicNameValuePair("STEMail", null)); 
        nameValuePairs.add(new BasicNameValuePair("STResidental", "false")); 
              
        nameValuePairs.add(new BasicNameValuePair("LabelFormatROW","1G"));  
        nameValuePairs.add(new BasicNameValuePair("RSType","M7"));
        nameValuePairs.add(new BasicNameValuePair("ServiceCode","03"));            
        nameValuePairs.add(new BasicNameValuePair("DelMethodROW","4E"));
        nameValuePairs.add(new BasicNameValuePair("Desc","Apparel"));
        
        
        nameValuePairs.add(new BasicNameValuePair("SatDelivery", "false"));         
        nameValuePairs.add(new BasicNameValuePair("PackageType", "02"));
        nameValuePairs.add(new BasicNameValuePair("PackageWeight", "7.6460"));
        nameValuePairs.add(new BasicNameValuePair("PackageWeightUnit", "LBS"));
        nameValuePairs.add(new BasicNameValuePair("PackageRef01", "1234"));
        
        nameValuePairs.add(new BasicNameValuePair("PackageID", "1234" )); /*input.getPackageId()*/
        nameValuePairs.add(new BasicNameValuePair("CostCenter", "0000"));
	}

}
