package TestLayer;

import BaseLayer.BaseClass;
import PageLayer.CreateIRCTCID;

public class CreateIRCTCIDTest extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		BaseClass.initialization();
		
		CreateIRCTCID createIRCTCID = new CreateIRCTCID();
		createIRCTCID.personalDetails("Dipti Jadhav", "Sep", "2005", "24", "Female");

	}

}
