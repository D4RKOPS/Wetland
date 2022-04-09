package model;
public class WetlandControler{
    
    private Wetland[] wetlands;

    public WetlandControler(){

        wetlands= new Wetland[80];

    }
    
    

	public String showWetlandsList() {

		String msg = "";

		for (int i = 0; i < wetlands.length; i++) {

			if (wetlands[i] != null) {

				msg += "\n" + wetlands[i].getId() + ". " + wetlands[i].getWetlandName();
			}
		}

		return msg;

	}


    public boolean registerWetland (String wetlandName,String ubicationZone, String ubicationType,String photo, Double numberKm,String protectedArea, String ubicationName) {

		boolean stopFlag = false;

		Wetland myWetland = new Wetland(wetlandName, ubicationZone, ubicationType, photo, numberKm,protectedArea,ubicationName);

		for (int i = 0; i < wetlands.length && !stopFlag; i++) {

			if (wetlands[i] == null) {

				myWetland.setId((i + 1) + "");
				wetlands[i] = myWetland;
				stopFlag = true;

			}

		}

	return stopFlag;

	}
    
    public boolean registerSpecie(String wetlandID,String name, String cientificName, String migratorySpecie, String typeFlora) {
		
    	boolean stopFlag = false;
    	for (int i = 0; i < wetlands.length && !stopFlag; i++) {

			if (wetlands[i] != null) {

				if ((i + 1 + "").equals(wetlandID)) {

					stopFlag = wetlands[i].addSpecie(name, cientificName, migratorySpecie, typeFlora);

				}

			}
    	
    	
    	
	}
    return stopFlag;
    }

    
    
    public int counterMaintenance(int maintenance) {
    	
    	maintenance++;
    	maintenance=maintenance-1;
    	 
    	 return maintenance;
    }
    
    
    
    
    
    public String showWetlands() {

		String msg = "";

		for (int i = 0; i < wetlands.length; i++) {

			if (wetlands[i] != null) {

				msg += "\n" + wetlands[i].toString();
			}
		}

		return msg;

	}



	public boolean registerEvent(String wetlandID,String typeEvent, String ownerEvent, double eventCost, String eventDescription, int year, int month, int day) {
		boolean stopFlag = false;
    	for (int i = 0; i < wetlands.length && !stopFlag; i++) {

			if (wetlands[i] != null) {

				if ((i + 1 + "").equals(wetlandID)) {

					stopFlag = wetlands[i].addEvent(typeEvent, ownerEvent, eventCost, eventDescription);

				}

			}
    		}
    	return stopFlag;
	}


	
		
	
	
	
	

	

}

