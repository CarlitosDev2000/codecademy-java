package codecademy.java.conditionalcotrolflow.conditionalpérator.exercisefour;

public class ExerciseFour {

        int guestCount;
        int restaurantCapacity;
        boolean isRestaurantOpen;
        boolean isConfirmed;

        public ExerciseFour(int count, int capacity, boolean open) {
            if (count < 1 || count > 8) {
                System.out.println("Invalid reservation!");
            }
            guestCount = count;
            restaurantCapacity = capacity;
            isRestaurantOpen = open;
        }

        public void confirmReservation() {
            if (restaurantCapacity >= guestCount && isRestaurantOpen) {
                System.out.println("Reservation confirmed");
                isConfirmed = true;
            } else {
                System.out.println("Reservation denied");
                isConfirmed = false;
            }
        }

        public void informUser() {
            // Write conditional here
            if (!isConfirmed) {
                System.out.println("Unable to confirm reservation, please contact restaurant.");
            } else {
                System.out.println("Please enjoy your meal!");
            }
        }
}
