package org.recap.ims.model;

import org.junit.Test;
import org.recap.BaseTestCaseUT;

import java.util.Arrays;
import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * Created by hemalathas on 13/7/17.
 */
public class TtitemEDDResponseUT extends BaseTestCaseUT {

    @Test
    public void testTtitemEDDResponse() {

        TtitemEDDResponse ttitemEDDResponse = new TtitemEDDResponse();
        TtitemEDDResponse ttitemEDDResponse1 = new TtitemEDDResponse();
        ttitemEDDResponse.setItemBarcode("332445645758458");
        ttitemEDDResponse.setCustomerCode("AD");
        ttitemEDDResponse.setRequestId(1);
        ttitemEDDResponse.setRequestor("Test");
        ttitemEDDResponse.setRequestorFirstName("test");
        ttitemEDDResponse.setRequestorLastName("test");
        ttitemEDDResponse.setRequestorMiddleName("test");
        ttitemEDDResponse.setRequestorEmail("test@email.com");
        ttitemEDDResponse.setRequestorOther("test");
        ttitemEDDResponse.setBiblioTitle("test");
        ttitemEDDResponse.setBiblioLocation("Discovery");
        ttitemEDDResponse.setBiblioAuthor("John");
        ttitemEDDResponse.setBiblioVolume("V1");
        ttitemEDDResponse.setBiblioCode("A1");
        ttitemEDDResponse.setArticleTitle("Title");
        ttitemEDDResponse.setArticleDate(new Date().toString());
        ttitemEDDResponse.setArticleAuthor("john");
        ttitemEDDResponse.setArticleIssue("Test");
        ttitemEDDResponse.setArticleVolume("V1");
        ttitemEDDResponse.setStartPage("1");
        ttitemEDDResponse.setEndPage("10");
        ttitemEDDResponse.setPages("9");
        ttitemEDDResponse.setOther("test");
        ttitemEDDResponse.setPriority("test");
        ttitemEDDResponse.setNotes("notes");
        ttitemEDDResponse.setRequestDate(new Date().toString());
        ttitemEDDResponse.setRequestTime("06:05:00");
        ttitemEDDResponse.setErrorCode("test");
        ttitemEDDResponse.setErrorNote("test");
        ttitemEDDResponse.equals(ttitemEDDResponse);
        ttitemEDDResponse1.equals(ttitemEDDResponse);
        ttitemEDDResponse.equals(ttitemEDDResponse1);
        ttitemEDDResponse.hashCode();
        ttitemEDDResponse1.hashCode();


        RetrieveItemEDDRequest retrieveItemEDDRequest = new RetrieveItemEDDRequest();
        retrieveItemEDDRequest.setTtitem(Arrays.asList(ttitemEDDResponse));

        GFARetrieveEDDItemRequest gfaRetrieveEDDItemRequest = new GFARetrieveEDDItemRequest();
        gfaRetrieveEDDItemRequest.setDsitem(retrieveItemEDDRequest);

        GFAEddItemResponse gfaEddItemResponse = new GFAEddItemResponse();
        gfaEddItemResponse.setDsitem(retrieveItemEDDRequest);
        gfaEddItemResponse.setScreenMessage("Success");
        gfaEddItemResponse.setSuccess(true);
        gfaEddItemResponse.equals(gfaEddItemResponse);
        gfaEddItemResponse.hashCode();

        assertNotNull(ttitemEDDResponse.getItemBarcode());
        assertNotNull(ttitemEDDResponse.getCustomerCode());
        assertNotNull(ttitemEDDResponse.getRequestor());
        assertNotNull(ttitemEDDResponse.getRequestorFirstName());
        assertNotNull(ttitemEDDResponse.getRequestorLastName());
        assertNotNull(ttitemEDDResponse.getRequestorMiddleName());
        assertNotNull(ttitemEDDResponse.getRequestorEmail());
        assertNotNull(ttitemEDDResponse.getRequestorOther());
        assertNotNull(ttitemEDDResponse.getBiblioTitle());
        assertNotNull(ttitemEDDResponse.getBiblioLocation());
        assertNotNull(ttitemEDDResponse.getBiblioAuthor());
        assertNotNull(ttitemEDDResponse.getBiblioVolume());
        assertNotNull(ttitemEDDResponse.getBiblioCode());
        assertNotNull(ttitemEDDResponse.getArticleTitle());
        assertNotNull(ttitemEDDResponse.getArticleAuthor());
        assertNotNull(ttitemEDDResponse.getArticleVolume());
        assertNotNull(ttitemEDDResponse.getArticleIssue());
        assertNotNull(ttitemEDDResponse.getArticleDate());
        assertNotNull(ttitemEDDResponse.getStartPage());
        assertNotNull(ttitemEDDResponse.getEndPage());
        assertNotNull(ttitemEDDResponse.getPages());
        assertNotNull(ttitemEDDResponse.getOther());
        assertNotNull(ttitemEDDResponse.getPriority());
        assertNotNull(ttitemEDDResponse.getNotes());
        assertNotNull(ttitemEDDResponse.getRequestDate());
        assertNotNull(ttitemEDDResponse.getRequestTime());
        assertNotNull(ttitemEDDResponse.getErrorCode());
        assertNotNull(ttitemEDDResponse.getErrorNote());
        assertNotNull(ttitemEDDResponse.getRequestId());
        assertNotNull(retrieveItemEDDRequest.getTtitem());
        assertNotNull(gfaEddItemResponse.getScreenMessage());
        assertNotNull(gfaEddItemResponse.getDsitem());
        assertNotNull(gfaEddItemResponse.isSuccess());
        assertNotNull(gfaRetrieveEDDItemRequest.getDsitem());
    }

}