package progChal;

public class PitCoin {
    private Person person;
    private int Id;
    private float pc;
    private float value;
    private boolean isActive;

    public PitCoin(Person person, int Id,float pc, float value, boolean isActive) {
        this.person = person;
        this.Id = Id;
        this.pc=pc;
        this.value = value;
        this.isActive = isActive;
    }
    
    public void setId(int Id) {
        this.Id = Id;
    }

    public float getPc() {
        return this.pc;
    }

    public void setPc(float pc) {
        this.pc = pc;
    }
    

    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getId() {
        return this.Id;
    }

    public float getValue() {
        return this.value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public void setCurrentValue(float marketValue) {

        this.value=marketValue;
    }
    public float getCurrentValue() {
        return value*pc;
    }



    public boolean isIsActive() {
        return this.isActive;
    }

    public boolean getIsActive() {
        return this.isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "{" +
            " person='" + getPerson() + "'" +
            ", Id='" + getId() + "'" +
            ", pc='" + getPc() + "'" +
            ", value='" + getValue() + "'" +
            ", isActive='" + isIsActive() + "'" +
            "}";
    }

    

    
    
    public static void main(String[] args) {
        PitCoin pitCoin1 = new PitCoin(new Person("Sean", "Andres", "seanandres@ciic.net"), 545238,50_000, 1, true);
        PitCoin pitCoin2 = new PitCoin(new Person("Rich", "Sigan", "richsigan@pagocore.hkn"), 985673,70_000, 1, true);
        System.out.println(pitCoin1);
        System.out.println(pitCoin2);

        pitCoin1.setCurrentValue(1.2f);
        pitCoin1.setCurrentValue(1.2f);

        System.out.println(pitCoin1.getCurrentValue());
        System.out.println(pitCoin2.getCurrentValue());
    }
}

class Person{
    private String firstName; 
    private String lastName;
    private String email;

    public Person(String firstName,String lastName,String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;    
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public static void main(String[] args) {
        Person p1 = new Person("Marc","Yim","marcyim@funonlinegaming.com");
        p1.firstName = "merc";
    }

}
