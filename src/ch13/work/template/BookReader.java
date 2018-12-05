package ch13.work.template;

public abstract class BookReader {
    abstract void initialize();
    abstract void startReading();
    abstract void stopReading();

    public boolean isInteractive(){return false;}

    public final void readBook() {
        initialize();
        startReading();
        if(!this.isInteractive()) {
            stopReading();
        }
    }
}
