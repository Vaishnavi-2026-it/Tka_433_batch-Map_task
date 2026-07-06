package com.tka.dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tka.entity.IplPlayer;
	public class Ipl3_Dao {
	
	    Map<String, List<IplPlayer>> ipl2026_DB = new HashMap<>();

	    public Ipl3_Dao() {

	        //=================== RCB ===================

	        List<IplPlayer> rcb = new ArrayList<>();

	        rcb.add(new IplPlayer(18,"Virat Kohli","RCB",8897,4));
	        rcb.add(new IplPlayer(97,"Rajat Patidar","RCB",2500,0));
	        rcb.add(new IplPlayer(32,"Phil Salt","RCB",1800,0));
	        rcb.add(new IplPlayer(19,"Josh Hazlewood","RCB",120,95));
	        rcb.add(new IplPlayer(45,"Jitesh Sharma","RCB",1700,0));
	        rcb.add(new IplPlayer(99,"Liam Livingstone","RCB",3000,40));
	        rcb.add(new IplPlayer(25,"Tim David","RCB",1900,0));
	        rcb.add(new IplPlayer(8,"Krunal Pandya","RCB",1800,80));
	        rcb.add(new IplPlayer(3,"Yash Dayal","RCB",100,45));
	        rcb.add(new IplPlayer(11,"Bhuvneshwar Kumar","RCB",500,185));
	        rcb.add(new IplPlayer(13,"Suyash Sharma","RCB",60,35));

	        //=================== GT ===================

	        List<IplPlayer> gt = new ArrayList<>();

	        gt.add(new IplPlayer(77,"Shubman Gill","GT",4200,0));
	        gt.add(new IplPlayer(63,"Sai Sudharsan","GT",2100,0));
	        gt.add(new IplPlayer(33,"Jos Buttler","GT",4500,0));
	        gt.add(new IplPlayer(99,"Rashid Khan","GT",700,180));
	        gt.add(new IplPlayer(9,"Mohammed Siraj","GT",300,110));
	        gt.add(new IplPlayer(5,"Rahul Tewatia","GT",1600,35));
	        gt.add(new IplPlayer(23,"Washington Sundar","GT",1500,70));
	        gt.add(new IplPlayer(17,"Kagiso Rabada","GT",250,130));
	        gt.add(new IplPlayer(88,"Sherfane Rutherford","GT",1200,0));
	        gt.add(new IplPlayer(14,"Sai Kishore","GT",100,60));
	        gt.add(new IplPlayer(29,"Prasidh Krishna","GT",50,85));

	        //=================== RR ===================

	        List<IplPlayer> rr = new ArrayList<>();

	        rr.add(new IplPlayer(63,"Sanju Samson","RR",4500,0));
	        rr.add(new IplPlayer(19,"Yashasvi Jaiswal","RR",3200,0));
	        rr.add(new IplPlayer(17,"Riyan Parag","RR",2300,12));
	        rr.add(new IplPlayer(25,"Shimron Hetmyer","RR",1800,0));
	        rr.add(new IplPlayer(11,"Dhruv Jurel","RR",1000,0));
	        rr.add(new IplPlayer(99,"Jofra Archer","RR",200,100));
	        rr.add(new IplPlayer(44,"Wanindu Hasaranga","RR",900,115));
	        rr.add(new IplPlayer(18,"Sandeep Sharma","RR",150,120));
	        rr.add(new IplPlayer(21,"Maheesh Theekshana","RR",100,75));
	        rr.add(new IplPlayer(3,"Tushar Deshpande","RR",90,65));
	        rr.add(new IplPlayer(7,"Nitish Rana","RR",2600,10));

	        //=================== SRH ===================

	        List<IplPlayer> srh = new ArrayList<>();

	        srh.add(new IplPlayer(9,"Pat Cummins","SRH",800,90));
	        srh.add(new IplPlayer(19,"Travis Head","SRH",2500,5));
	        srh.add(new IplPlayer(8,"Abhishek Sharma","SRH",2200,20));
	        srh.add(new IplPlayer(5,"Heinrich Klaasen","SRH",2700,0));
	        srh.add(new IplPlayer(14,"Ishan Kishan","SRH",3000,0));
	        srh.add(new IplPlayer(23,"Nitish Kumar Reddy","SRH",1200,18));
	        srh.add(new IplPlayer(18,"Mohammed Shami","SRH",300,135));
	        srh.add(new IplPlayer(99,"Harshal Patel","SRH",350,150));
	        srh.add(new IplPlayer(17,"Rahul Chahar","SRH",150,75));
	        srh.add(new IplPlayer(10,"Adam Zampa","SRH",100,95));
	        srh.add(new IplPlayer(45,"Kamindu Mendis","SRH",700,20));

	        //=================== MAP ===================

	        ipl2026_DB.put("RCB", rcb);
	        ipl2026_DB.put("GT", gt);
	        ipl2026_DB.put("RR", rr);
	        ipl2026_DB.put("SRH", srh);
	    }

	    // Return Complete Database
	    public Map<String, List<IplPlayer>> getIPLDB() {
	        return ipl2026_DB;
	    }

	}
