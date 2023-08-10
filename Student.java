public class Student {
    private String fullName;
    private int age;
    private String address;
    private int id;
    private String group;

    public Student(String fullName, int age, String address, int id, String group) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.id = id;
        this.group = group;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setGroup(String group){
        this.group = group;
    }
    public String getGroup(){
        return group;
    }

    @Override
    public String toString() {
        return "Student " +
                "fullName= " + fullName +
                ", dateOfBirth=" + age +
                ", address= " + address +
                ", id=" + id + ", group="+group+"\n";
    }
}
