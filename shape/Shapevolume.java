package shape;
public class Shapevolume {
    double volume(double L){
        double vol;
        vol = L*L*L;
        return vol;
    }

    double volume(double L, double W, double H){
        double vol;
        vol = L*W*H;
        return vol;
    }

    public static void main(String[] args) {
        double cube, rec, Len = 5, Wid = 7, Heg = 9;
        Shapevolume ob = new Shapevolume();
        cube = ob.volume(Len);
        rec = ob.volume(Len, Wid, Heg);
        System.out.println("volume cube = " + cube);
        System.out.println("volume rectangle = " + rec);
    }
}
