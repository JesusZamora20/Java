public class Doctor {
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    /*Doctor(String name){
        this.name = name;
        System.out.println("Building the Doctor Object:" + name);
    }*/

    Doctor(){
        id ++;
    }

    //behaviours
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
}
