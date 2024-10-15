package FacadePattern;

public class SmartHomeFacade {
    private SmartLight smartLight;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade(SmartLight smartLight, Thermostat thermostat, SecuritySystem securitySystem, EntertainmentSystem entertainmentSystem) {
        this.smartLight = smartLight;
        this.thermostat = thermostat;
        this.securitySystem = securitySystem;
        this.entertainmentSystem = entertainmentSystem;
    }

    public void leaveHome() {
        System.out.println("Leaving home...");
        smartLight.turnOff();
        thermostat.setTemperature(18);
        securitySystem.turnOnCameras();
        securitySystem.turnOnAlarm();
        entertainmentSystem.turnOffMovieMode();
    }

    public void arriveHome() {
        System.out.println("Arriving home...");
        smartLight.turnOn();
        thermostat.setTemperature(22);
        securitySystem.turnOffAlarm();
    }

    public void nightMode() {
        System.out.println("Setting night mode...");
        smartLight.turnOff();
        thermostat.setTemperature(20);
        securitySystem.turnOnAlarm();
    }

    public void movieMode() {
        System.out.println("Setting movie mode...");
        smartLight.turnOff();
        thermostat.setTemperature(22);
        securitySystem.turnOnAlarm();
        entertainmentSystem.turnOnMovieMode();
    }
}
