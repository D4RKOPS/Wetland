package model;

public class Specie {
private String name;
private String cientificName;
private String migratorySpecie;
private String typeFlora;

    public Specie(String name,String cientificName,String migratorySpecie,String typeFlora){

        this.name=name;
        this.cientificName=cientificName;
        this.migratorySpecie=migratorySpecie;
        this.typeFlora=typeFlora;



    }
    public String getName(){
        return name;
    }
    public void set(String name){
        this.name=name;
    }
    
    public String getCientificName(){
        return cientificName;
    }
    public void setCientificName(String cientificName){
        this.cientificName=cientificName;
    }


    public String getMigratorySpecie(){
        return migratorySpecie;
    }
    public void setMigratorySpecie(String migratorySpecie){
        this.migratorySpecie=migratorySpecie;
    }


    public String getTypeFlora(){
        return typeFlora;
    }
    public void setTypeFlora(String typeFlora){
        this.typeFlora=typeFlora;
    }
	@Override
	public String toString() {
		return "Specie [name=" + name + ", cientificName=" + cientificName + ", migratorySpecie=" + migratorySpecie
				+ ", typeFlora=" + typeFlora + "]";
	}
    



    
}
