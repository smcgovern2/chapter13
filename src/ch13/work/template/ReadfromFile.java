package ch13.work.template;

import java.net.URL;

public class ReadfromFile extends BookReader{
        private FileInput input;

    @Override
    void initialize() {
        URL url = getClass().getResource("prideprejudice.txt");
        input = new FileInput(url.getPath());


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
