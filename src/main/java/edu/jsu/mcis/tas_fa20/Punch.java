package edu.jsu.mcis.tas_fa20;

public class Punch {
    private int terminalid
	private int punchtypeid;
	private int id;
	private String adjustmenttype
	private Long originaltimestamp;
    private String badgeid;

    public Punch(int id, int terminalid, String badgeid, Long originaltimestamp, int punchtypeid, String adjustmenttype){
		
        this.terminalid = terminalid;
        this.badgeid = badgeid;
		this.id = id;
		this.adjustmenttype = adjustmenttype;
        this.originaltimestamp = originaltimestamp;
        this.punchtypeid = punchtypeid;
    }
    public int getTerminalID(){
        return terminalid;
    }
    public String getBadgeID(){
        return badgeid;
    }
    public int getID(){
        return id;
    }
    public String getAdjustmentType(){
        return adjustmenttype;
    }
    public Long getOriginalTimeStamp(){
        return originaltimestamp;
    }
    public int getPunchTypeID(){
        return punchtypeid;
    }
}