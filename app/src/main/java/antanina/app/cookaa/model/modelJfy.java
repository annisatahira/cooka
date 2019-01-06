package antanina.app.cookaa.model;

/**
 * Created by annisatahira on 06/01/19.
 */

public class modelJfy {

    private int image;
    private String judul;

    public modelJfy (int image, String judul) {
        this.image = image;
        this.judul = judul;
    }

    public int getImage() {
        return image;
    }

    public String getJudul() {
        return judul;
    }
}
