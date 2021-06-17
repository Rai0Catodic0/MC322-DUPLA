package Recursos;

public  class Recursos {
    //descobrir oq fazer com isso :)
    public  Recursos(){
    }
    public String getType(){
        if(this instanceof Combustivel){
            return "combustivel";
        }
        else if(this instanceof  Mineral){
            return "Mineral";
        }
        return "Municao";
    }

}
