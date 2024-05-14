//Use one block of code and changing which version of that code we're using depending on the inputs given
package polymorphism;

class Bird {

    public void sing() {
        System.out.println("tweet tweet tweet");
    }
}

class Robin extends Bird {

    public void sing() {
        System.out.println("twiddledeedee");
    }
}

class Pelican extends Bird {

    public void sing() {
        System.out.println("KWAAH KWAHAH KWAHA");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Bird b0 = new Bird();
        Bird b1 = new Robin();
        Bird b2 = new Pelican();

        System.out.println("Bird: ");
        b0.sing();
        System.out.println("Robin: ");
        b1.sing();
        System.out.println("Pelican: ");
        b2.sing();
    }

}

//Sauce: Polymorphism In Java Tutorial #92 Ft88V_rDO4I
