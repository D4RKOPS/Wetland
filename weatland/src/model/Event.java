package model;

public class Event {
	private Date eventDate;
    private String typeEvent;
    private String ownerEvent;
    private double eventCost;
    private String eventDescription;
    public int maintenance=0;
    
    public Event(String typeEvent,String ownerEvent,double eventCost,String eventDescription){
    this.typeEvent=typeEvent;
    this.ownerEvent=ownerEvent;
    this.eventCost=eventCost;
    this.eventDescription=eventDescription;

    }

    public String getTypeEvent(){
        return typeEvent;
    }
    public void setTypeEvent(String typeEvent){
        this.typeEvent=typeEvent;

    }
    public String getOwnerEvent(){
        return ownerEvent;
    }   
    public void setOwnerEvent(String ownerEvent){
        this.ownerEvent=ownerEvent;
    }
    public double getEventCost(){
        return eventCost;
    }
    public void setEventCost(double eventCost){
        this.eventCost=eventCost;
    }
    public String getEventDescription(){
        return eventDescription;
    }
    public void setEventDescription(String eventDescription){
        this.eventDescription=eventDescription;
    }

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(int day, int month, int year) {
		this.eventDate = new Date(day, month, year);
	}

	@Override
	public String toString() {
		return "Event [eventDate=" + eventDate + ", typeEvent=" + typeEvent + ", ownerEvent=" + ownerEvent
				+ ", eventCost=" + eventCost + ", eventDescription=" + eventDescription + "]";
	}

	
	

}
