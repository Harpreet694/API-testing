package APICALLS;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Apitesting
{
@Test(priority=1)
void HTTPGet_fetchingdetailsofallpeople()
{
	
	RestAssured.baseURI="https://swapi.dev/";
	
	//Step 2 create request object for type of request
	
	RequestSpecification httprequest=RestAssured.given();
	
	//Step 3 Create response object
	
	Response httpresponse=httprequest.request(Method.GET,"/api/people/");
	
	String response=httpresponse.getBody().asString();
	System.out.println(response);
	
	//Validate Status code
int Code=httpresponse.getStatusCode(); //200
System.out.println(Code);
//Insert asserts
Assert.assertEquals(Code, 200);
String statusline=httpresponse.getStatusLine();
System.out.println(statusline);

}

@Test(priority=2)
void HTTPGet_fetchingdetailsofspecifiedcharcter()
{
	
	RestAssured.baseURI="https://swapi.dev/";
	
	//Step 2 create request object for type of request
	
	RequestSpecification httprequest=RestAssured.given();
	
	//Step 3 Create response object
	
	Response httpresponse=httprequest.request(Method.GET,"/api/people/1/");
	
	String response=httpresponse.getBody().asString();
	System.out.println(response);
	
	//Validate Status code
int Code=httpresponse.getStatusCode(); //200
System.out.println(Code);
//Insert asserts
Assert.assertEquals(Code, 200);
String statusline=httpresponse.getStatusLine();
System.out.println(statusline);

}

@Test(priority=3)
void HTTPGet_fetchingdetailsofallthestarwarplanetsindetail()
{
	
	RestAssured.baseURI="https://swapi.dev/";
	
	//Step 2 create request object for type of request
	
	RequestSpecification httprequest=RestAssured.given();
	
	//Step 3 Create response object
	
	Response httpresponse=httprequest.request(Method.GET,"/api/planets/");
	
	String response=httpresponse.getBody().asString();
	System.out.println(response);
	
	//Validate Status code
int Code=httpresponse.getStatusCode(); //200
System.out.println(Code);
//Insert asserts
Assert.assertEquals(Code, 200);
String statusline=httpresponse.getStatusLine();
System.out.println(statusline);

}


@Test(priority=4)
void HTTPGet_fetchingdetailofaspecifiedplanet()
{
	
	RestAssured.baseURI="https://swapi.dev/";
	
	//Step 2 create request object for type of request
	
	RequestSpecification httprequest=RestAssured.given();
	
	//Step 3 Create response object
	
	Response httpresponse=httprequest.request(Method.GET,"/api/planets/3/");
	
	String response=httpresponse.getBody().asString();
	System.out.println(response);
	
	//Validate Status code
int Code=httpresponse.getStatusCode(); //200
System.out.println(Code);
//Insert asserts
Assert.assertEquals(Code, 200);
String statusline=httpresponse.getStatusLine();
System.out.println(statusline);

}



@Test(priority=5)
void HTTPGet_fetchingdetailofaspecifiedplanetorcharacter()
{
	
	RestAssured.baseURI="https://swapi.dev/";
	
	//Step 2 create request object for type of request
	
	RequestSpecification httprequest=RestAssured.given();
	
	//Step 3 Create response object
	
	Response httpresponse=httprequest.request(Method.GET,"/api/planets/4/ or people/1/");
	
	String response=httpresponse.getBody().asString();
	System.out.println(response);
	
	//Validate Status code
int Code=httpresponse.getStatusCode(); //200
System.out.println(Code);
//Insert asserts
Assert.assertEquals(Code, 404);
String statusline=httpresponse.getStatusLine();
System.out.println(statusline);

}

@Test(priority=6)
void HTTPGet_fetchingdetailofaspecifiedchracterusingname()
{
	
	RestAssured.baseURI="https://swapi.dev/";
	
	//Step 2 create request object for type of request
	
	RequestSpecification httprequest=RestAssured.given();
	
	//Step 3 Create response object
	
	Response httpresponse=httprequest.request(Method.GET,"/api/Luke Skywalker/");
	
	String response=httpresponse.getBody().asString();
	System.out.println(response);
	
	//Validate Status code
int Code=httpresponse.getStatusCode(); //200
System.out.println(Code);
//Insert asserts
Assert.assertEquals(Code, 200);
String statusline=httpresponse.getStatusLine();
System.out.println(statusline);

}

@Test(priority=7)
void HTTPGet_fetchingdetailusingkeywordfilms()
{
	
	RestAssured.baseURI="https://swapi.dev/";
	
	//Step 2 create request object for type of request
	
	RequestSpecification httprequest=RestAssured.given();
	
	//Step 3 Create response object
	
	Response httpresponse=httprequest.request(Method.GET,"/api/films/");
	
	String response=httpresponse.getBody().asString();
	System.out.println(response);
	
	//Validate Status code
int Code=httpresponse.getStatusCode(); //200
System.out.println(Code);
//Insert asserts
Assert.assertEquals(Code, 200);
String statusline=httpresponse.getStatusLine();
System.out.println(statusline);

}
}
