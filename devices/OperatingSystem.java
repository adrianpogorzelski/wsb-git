package devices;

public enum OperatingSystem {
    IOS("iOS"),
    ANDROID("Android"),
    WINDOWSMOBILE("Windows Mobile");

    final public String systemName;

    OperatingSystem(String systemName) {
        this.systemName = systemName;
    }

}
