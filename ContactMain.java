public class ContactMain {
    public static void main(String[]args){
        Contact contact1 = new Contact("Aksedep", 771149031);
        Contact contact2 = new Contact("Amantur",771149019);
        Contact contact3 = new Contact("Bermet",557522357);
        Contact contact4 = new Contact("Iskhak",552010203);
        Contact [] contacts = {contact1,contact2,contact3,contact4};

        Phone phone1 = new Phone("iphone","14pro",110000,"Alina",contacts);
        Phone phone2 = new Phone("samsung","a 50",32000,"Gulnara",contacts);
        Phone [] phones = {phone1,phone2};

        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].getContactCount());
        }
    }
}
