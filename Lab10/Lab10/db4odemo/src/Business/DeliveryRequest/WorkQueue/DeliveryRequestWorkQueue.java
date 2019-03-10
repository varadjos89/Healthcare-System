/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryRequest.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author varad
 */
public class DeliveryRequestWorkQueue {
    private ArrayList<DeliveryRequestWorkRequest> deliveryRequestWorkRequests;

    public DeliveryRequestWorkQueue() {
        deliveryRequestWorkRequests = new ArrayList();
    }

    public ArrayList<DeliveryRequestWorkRequest> getDeliveryRequestWorkRequests() {
        return deliveryRequestWorkRequests;
    }

   
}
