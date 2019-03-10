/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BodyPartsInfo.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author deodh
 */
public class BodyPartsInfoWorkQueue {
    private ArrayList<BodyPartsInfoWorkRequest> bodyPartsInfoWorkRequestList;

    public BodyPartsInfoWorkQueue() {
        bodyPartsInfoWorkRequestList = new ArrayList();
    }

    public ArrayList<BodyPartsInfoWorkRequest> getBodyPartsInfoWorkRequestList() {
        return bodyPartsInfoWorkRequestList;
    }
}
