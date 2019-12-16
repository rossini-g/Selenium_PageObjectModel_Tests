package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Set;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.*;

/**
 * @author Rossini Higgins
 *
 */
public class ApiTests {

	void verifySocialAccounts(String twitter, String instagram) {
		SoftAssert softAssert = new SoftAssert();
		HttpUriRequest request = new HttpGet( "https://marketingapi.wheelsup.com/api/initial-data/" );
		HttpResponse response;
		
		try {
			response = HttpClientBuilder.create().build().execute( request );
			int statusCode = response.getStatusLine().getStatusCode(); 
			softAssert.assertEquals(statusCode, 200);
			
			JSONObject finalResult = new JSONObject(EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8));
			
			softAssert.assertEquals(finalResult.getJSONObject("keys").getString("twitter"),twitter);
			softAssert.assertEquals(finalResult.getJSONObject("keys").getString("instagram"),instagram);
			
		} catch (ClientProtocolException e) {
			Assert.fail(e.getMessage());
		} catch (IOException e) {
			Assert.fail(e.getMessage());
		}catch (JSONException err){
			Assert.fail(err.toString());
		}
		
		softAssert.assertAll();
		
	}
	
	@Test(groups = { "T1" })
    public void test1() {
        System.out.println("Wheels Up Exercise 3");
        String twitter = "https://twitter.com/WheelsUp";
        String instagram = "http://instagram.com/wheelsup8760";
        verifySocialAccounts(twitter, instagram);

    }
}
