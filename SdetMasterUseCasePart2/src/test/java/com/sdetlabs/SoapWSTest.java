package com.sdetlabs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoapWSTest {

  @Test
  public void GetRequestTest() {
	  Assert.assertEquals(SoapWS.GetRequestStatusCode(),200);
  }

  @Test
  public void PostRequestTest() {
	  Assert.assertEquals(SoapWS.PostRequestStatusCode(),201);
  }
}
