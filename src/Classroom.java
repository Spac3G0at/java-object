public class Classroom {
    public static void main(String[] args) {
        Wilder victor = new Wilder("Victor", true);
        System.out.println(victor.whoAmI());

        Wilder jeanJaques = new Wilder("Jean-Jacques", false);
        System.out.println(jeanJaques.whoAmI());
    }
}
