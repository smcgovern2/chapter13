package ch13.work.template;

import java.net.URL;

public class ReadfromFile extends BookReader{
        private FileInput input;

    @Override
    void initialize() {

        input = new FileInput("prideprejudice.txt");
    }

    @Override
    void startReading() {
        input.fileRead();
    }

    @Override
    void stopReading() {
        input.fileClose();
    }
}
