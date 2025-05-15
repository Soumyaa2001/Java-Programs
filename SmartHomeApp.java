 interface Switchable 
{
    void turnOn();
    void turnOff();
}

 interface StatusCheckable 
{
    String getStatus();
}

 class Light implements Switchable, StatusCheckable 
{
    private boolean isOn = false;

    @Override
    public void turnOn() 
    {
        isOn = true;
        System.out.println("Light is turned ON.");
    }

    @Override
    public void turnOff() 
    {
        isOn = false;
        System.out.println("Light is turned OFF.");
    }

    @Override
    public String getStatus() 
    {
        return " Status = Light is " + (isOn ? "ON" : "OFF");
    }
}


 class Fan implements Switchable, StatusCheckable 
{
    private boolean isOn = false;

    @Override
    public void turnOn() 
    {
        isOn = true;
        System.out.println("Fan is turned ON.");
    }

    @Override
    public void turnOff() 
    {
        isOn = false;
        System.out.println("Fan is turned OFF.");
    }

    @Override
    public String getStatus() 
    {
        return " Status = Fan is " + (isOn ? "ON" : "OFF");
    }
}

 class SmartHomeController 
{

    public void activateDevice(Switchable sw) 
    {
        sw.turnOn();
    }

    public void deactivateDevice(Switchable sw) 
    {
        sw.turnOff();
    }

    public void showStatus(StatusCheckable sw) 
    {
        System.out.println(sw.getStatus());
    }
}

 class SmartHomeApp {
    public static void main(String[] args) 
    {
        Light l = new Light();
        Fan f = new Fan();

        SmartHomeController s = new SmartHomeController();

        s.activateDevice(l);
        s.showStatus(l);
        System.out.println("-----------");

        s.activateDevice(f);
        s.showStatus(f);
        System.out.println("-----------");

        s.deactivateDevice(l);
        s.showStatus(l);
        System.out.println("-----------");

        s.deactivateDevice(f);
        s.showStatus(f);
    }
}