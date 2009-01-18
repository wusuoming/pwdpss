package com.elongway.pss.util;

import com.elongway.pss.bl.facade.BLCalPowerFeeCustomFacade;

import junit.framework.TestCase;

public class PowerFeeCalTest extends TestCase {

//	public void testCalTransferLoss() {
//		double P0 = 4.69;
//		double T=720;
//		double t=600;
//		double Pk = 28;
//		double Se = 4000;
//		double AP = 1059960;
//		double AQ = 589500;
//		System.out.println(PowerFeeCal.calTransferLoss(P0, T, t, Pk, Se, AP, AQ));
//	}

	public void testCalLineLoss() {
		double R = 0.46;
		double L = 9.116;
		double Ve = 35;
		double t =720;
		double AP = 3268440;
		double AQ = 2908550;
	System.out.println(PowerFeeCal.calLineLoss(R, L, Ve, t, AP, AQ));
	}

}
