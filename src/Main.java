//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            Phone phone1 = new Phone("+7-999-123-45-98","TECNO",180.0);
            Phone phone2 = new Phone("+7-800-555-35-35","iPhone",150.0);
            Phone phone3 = new Phone("+7-962-859-60-12","Pixel",160.0);
            System.out.println(phone1.toString());
            System.out.println(phone2.toString());
            System.out.println(phone3.toString());
            System.out.println(phone1.getReceiveCall(phone1.getName()));
            System.out.println(phone2.getReceiveCall(phone2.getName(), phone2.getNumber()));
        }
    }
