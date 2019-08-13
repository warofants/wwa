package io;


import java.io.File;

public class AboutUsAssets {

    private String aboutUs;
    private FileReader reader;
    private static final File file = new File("path/to/assetsfile.txt");

    public AboutUsAssets() {
        reader = new FileReader(file);
    }

    public void setAboutUs() {
        this.aboutUs = reader.read();
    }

    public String getAboutUs() {
        return aboutUs;
    }
}
