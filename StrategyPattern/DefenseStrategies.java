public class DefenseStrategies {
    
    public static class Shield implements Defense {
        public void defend() {
            System.out.println("Shield up!");
        }
    }

    public static class Dodge implements Defense {
        public void defend() {
            System.out.println("Dodging!");
        }
    }

    public static class CreateMagicBarrier implements Defense {
        public void defend() {
            System.out.println("Magic barrier!");
        }
    }
}