public class javaside {

    private String firstName;
    private String lastName;

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setName(String name) {
        String nameArray[] = name.split(" ");
        firstName = nameArray[0];
        lastName = nameArray[1];
    }

    public static void main(String args[]){
        javaside  obj = new javaside();
        obj.setName("Shivakumar Burugu");
        System.out.println("");

    }

}
