interface vehicle{
    void sound();
}
class truck implements vehicle {
    public void sound() {
        System.out.println("too much");
    }}
class bike implements vehicle {
    public void sound() {
        System.out.println("Dhoom machale");
    }}

    class Car implements vehicle {
        public void sound() {
            System.out.println("brooooom");
        }}

        public class Interface {
            public static void main(String[] args) {
                vehicle obj = new Car();
                vehicle obj2 = new bike();
                vehicle obj3 = new truck();
                obj.sound();
                obj2.sound();
                obj3.sound();

            }
        }

