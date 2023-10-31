package com.sdetlabs;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RestfulWSTest {
	
	@BeforeTest
	  public void beforeTest() {
		  RestfulWS.setup();
	  }

	  @Test
	  public void DeleteRequestTest() {
		  Assert.assertEquals(RestfulWS.DeleteRequestStatusCode(),200);
	  }

	  @Test
	  public void GetRequestTest() {
		  Assert.assertEquals(RestfulWS.GetRequestStatusCode(),200);
	  }

	  @Test
	  public void PatchRequestTest() {
		  Assert.assertEquals(RestfulWS.PatchRequestStatusCode(),200);
	  }

	  @Test
	  public void PostRequestTest() {
		  Assert.assertEquals(RestfulWS.PostRequestStatusCode(),201);
	  }

	  @Test
	  public void PutRequestTest() {
		  Assert.assertEquals(RestfulWS.PutRequestStatusCode(),200);
	  }

}
