import application.Application;
import developer.MobileDeveloper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClass {

    public static void main(String[] args) throws IOException {
        String applicationType = getApplicationType();
        MobileDeveloper developer = new MobileDeveloper();
        Application application = developer.createApplication(applicationType);

        application.install();
        application.run();
    }

    private static String getApplicationType() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String applicationType = bufferedReader.readLine();
        bufferedReader.close();
        return applicationType;
    }
}
