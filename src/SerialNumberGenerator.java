
// participant: Singleton

public class SerialNumberGenerator {
    
    private int serialNumber;
    
    // 'static': created before any 'thread' is created, thread-safe
    private static final SerialNumberGenerator singleObject =
            new SerialNumberGenerator();
    
    // 'private': no public access to this contructor
    private SerialNumberGenerator() {
        serialNumber = 0;
    }
    
    public static SerialNumberGenerator getInstance() {
        return singleObject;
    }
    
    // 'synchronized' for multi-thread environment
    public synchronized int getNextSerialNumber() {
        return serialNumber++;
    }
    
}
