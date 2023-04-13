public class Telephone {
     String brand;
     double screen_size;
     String number;

    public Telephone(String brand, double screen_size, String number) {
        this.brand = brand;
        this.screen_size = screen_size;
        this.number = number;
    }

    public void sendSMS(String recipient_number, String message) {
        System.out.println("Wysyłam wiadomość " + message + " na numer " + recipient_number);
    }
    public static void main(String[] args) {
        Telephone myPhone = new Telephone("Nokia", 2.0, "123456789");
        myPhone.sendSMS("987654321", "Cześć, jak się masz?");
    }

}
