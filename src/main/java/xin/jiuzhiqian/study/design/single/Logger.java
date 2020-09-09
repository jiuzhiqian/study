package xin.jiuzhiqian.study.design.single;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author : feng
 */
public class Logger {
    private FileWriter writer;

    public Logger() throws IOException {
        File file = new File("~/tmp/log.txt");
        writer = new FileWriter(file, true);
    }

    public void log(String message) throws IOException {
        synchronized (Logger.class) {
            writer.write(message);
        }
    }
}