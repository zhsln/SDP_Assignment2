package FacadePattern;

public class SmartHomeApp {
    public static void main(String[] args) {
        SmartLight smartLight = new SmartLight();
        Thermostat thermostat = new Thermostat();
        SecuritySystem securitySystem = new SecuritySystem();
        EntertainmentSystem entertainmentSystem = new EntertainmentSystem();

        SmartHomeFacade smartHomeFacade = new SmartHomeFacade(smartLight, thermostat, securitySystem, entertainmentSystem);

        // Demonstration
        smartHomeFacade.leaveHome();
        System.out.println();
        smartHomeFacade.arriveHome();
        System.out.println();
        smartHomeFacade.nightMode();
        System.out.println();
        smartHomeFacade.movieMode();
    }
}