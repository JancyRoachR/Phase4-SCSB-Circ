package org.recap.ims.model;

import org.junit.Test;
import org.recap.BaseTestCaseUT;

import java.util.Arrays;

public class GFAItemStatusCheckRequestUT extends BaseTestCaseUT {

    @Test
    public void getGFAItemStatusCheckRequest(){
        GFAItemStatusCheckRequest gfaItemStatusCheckRequest = new GFAItemStatusCheckRequest();
        GFAItemStatusCheckRequest gfaItemStatusCheckRequest1 = new GFAItemStatusCheckRequest();
        gfaItemStatusCheckRequest.setItemStatus(Arrays.asList(new GFAItemStatus()));
        gfaItemStatusCheckRequest.equals(gfaItemStatusCheckRequest);
        gfaItemStatusCheckRequest.equals(gfaItemStatusCheckRequest1);
        gfaItemStatusCheckRequest1.equals(gfaItemStatusCheckRequest);
        gfaItemStatusCheckRequest.hashCode();
        gfaItemStatusCheckRequest1.hashCode();
        gfaItemStatusCheckRequest.toString();

    }
}
