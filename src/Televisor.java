class Televisor {
    boolean isOn;

    void turnOn(){
        isOn=true;
    }

    void turnOff(){
        isOn=false;
    }

    void showStatus(){
        System.out.println("TV is On?: " +  isOn);
    }
}
