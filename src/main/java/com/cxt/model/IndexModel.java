package com.cxt.model;

import java.util.Date;

/**
 * @version 2019年12月23日 下午4:45:16
 */
public class IndexModel
{
    private String staff;
    
    private String identificationCard;
    
    private String penaltyName;
    
    private String penaltiesInstrumentNo;
    
    private String penaltyType;
    
    private String punishmentInstitution;
    
    private Date decisionDate;
    
    private String status;
    
    public IndexModel()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public String getStaff()
    {
        return staff;
    }
    
    public void setStaff(String staff)
    {
        this.staff = staff;
    }
    
    public String getIdentificationCard()
    {
        return identificationCard;
    }
    
    public void setIdentificationCard(String identificationCard)
    {
        this.identificationCard = identificationCard;
    }
    
    public String getPenaltyName()
    {
        return penaltyName;
    }
    
    public void setPenaltyName(String penaltyName)
    {
        this.penaltyName = penaltyName;
    }
    
    public String getPenaltiesInstrumentNo()
    {
        return penaltiesInstrumentNo;
    }
    
    public void setPenaltiesInstrumentNo(String penaltiesInstrumentNo)
    {
        this.penaltiesInstrumentNo = penaltiesInstrumentNo;
    }
    
    public String getPenaltyType()
    {
        return penaltyType;
    }
    
    public void setPenaltyType(String penaltyType)
    {
        this.penaltyType = penaltyType;
    }
    
    public String getPunishmentInstitution()
    {
        return punishmentInstitution;
    }
    
    public void setPunishmentInstitution(String punishmentInstitution)
    {
        this.punishmentInstitution = punishmentInstitution;
    }
    
    public Date getDecisionDate()
    {
        return decisionDate;
    }
    
    public void setDecisionDate(Date decisionDate)
    {
        this.decisionDate = decisionDate;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    public IndexModel(String staff, String identificationCard, String penaltyName, String penaltiesInstrumentNo,
        String penaltyType, String punishmentInstitution, Date decisionDate, String status)
    {
        super();
        this.staff = staff;
        this.identificationCard = identificationCard;
        this.penaltyName = penaltyName;
        this.penaltiesInstrumentNo = penaltiesInstrumentNo;
        this.penaltyType = penaltyType;
        this.punishmentInstitution = punishmentInstitution;
        this.decisionDate = decisionDate;
        this.status = status;
    }
    
}
