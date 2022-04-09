package model;

import java.util.Arrays;

public class Wetland{
private String id;
private String protectedArea;
private String ubicationName;
private String wetlandName;
private String ubicationZone;
private String ubicationType;
private Double numberKm;
private String photo;
private Specie[]species;
private Event[]events;

 

	public Wetland(String wetlandName,String ubicationZone, String ubicationType,String photo, Double numberKm,String protectedArea,String ubicationName){

        this.setWetlandName(wetlandName);
        this.setUbicationType(ubicationType);
        this.setUbicationZone(ubicationZone);
        this.setNumberKm(numberKm);
        this.setPhoto(photo);
        this.setProtectedArea(protectedArea);
        this.setUbicationName(ubicationName);
        
        species=new Specie[15];
        events=new Event[4];


    }
    
	public String getUbicationType() {
		return ubicationType;
	}

	public void setUbicationType(String ubicationType) {
		this.ubicationType = ubicationType;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getWetlandName() {
		return wetlandName;
	}




	public void setWetlandName(String wetlandName) {
		this.wetlandName = wetlandName;
	}




	public String getUbicationZone() {
		return ubicationZone;
	}




	public void setUbicationZone(String ubicationZone) {
		this.ubicationZone = ubicationZone;
	}




	public Double getNumberKm() {
		return numberKm;
	}




	public void setNumberKm(Double numberKm) {
		this.numberKm = numberKm;
	}




	public String getPhoto() {
		return photo;
	}




	public void setPhoto(String photo) {
		this.photo = photo;
	}
	

	public String getProtectedArea() {
		return protectedArea;
	}

	public void setProtectedArea(String protectedArea) {
		this.protectedArea = protectedArea;
	}

	public String getUbicationName() {
		return ubicationName;
	}

	public void setUbicationName(String ubicationName) {
		this.ubicationName = ubicationName;
	}

	public Specie[] getSpecies() {
		return species;
	}

	public void setspecies(Specie[] species) {
		this.species = species;
	}
	

	public Event[] getevents() {
		return events;
	}

	public void setevents(Event[] events) {
		this.events = events;
	}




    
	

	public boolean addSpecie(String name, String cientificName, String migratorySpecie, String typeFlora) {
		
		boolean stopFlag = false;

		Specie mySpecie = new Specie(name, cientificName,  migratorySpecie, typeFlora);

		for (int i = 0; i < species.length && !stopFlag; i++) {

			if (species[i] == null) {

				species[i] = mySpecie;
				stopFlag = true;

			}

		}

		return stopFlag;

		
	}

	public boolean addEvent(String typeEvent, String ownerEvent, double eventCost, String eventDescription) {
		boolean stopFlag = false;

		Event myEvent = new Event(typeEvent, ownerEvent,  eventCost, eventDescription);

		for (int i = 0; i < events.length && !stopFlag; i++) {

			if (events[i] == null) {

				events[i] = myEvent;
				stopFlag = true;

			}

		}

		return stopFlag;

		}

	@Override
	public String toString() {
		return "the wetland is a protec" + protectedArea + ", ubicationName=" + ubicationName + "\n.the name of the wetland is:"
				+ wetlandName + ", ubicationZone=" + ubicationZone + ", ubicationType=" + ubicationType + ", numberKm="
				+ numberKm + ", photo=" + photo + ", species=" + Arrays.toString(species) + "]";
	}
	  
	

	
	








}




