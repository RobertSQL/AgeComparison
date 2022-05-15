public class Main {
    public static void main(String[] args) {
        int vasyaAge = 20;
        int katyaAge = 50;
        int mishaAge = 36;

        int min = -1;
        int middle = -1;
        int max = -1;
        int maxNew = -1;

        int retro2 = -1000;
 int retro3 = -1000;
        int retro = 1000;

        boolean booMaxV = false;
        boolean booMaxK = false;
        boolean booMaxM = false;

        boolean booMinV = false;
        boolean booMinK = false;
        boolean booMinM = false;

        boolean booMiddleV = false;
        boolean booMiddleK = false;
        boolean booMiddleM = false;

        boolean booMiddleVKmin = false;
        boolean booMiddleVMmin = false;
        boolean booMiddleKMmin = false;

        boolean booMiddleVKmax = false;
        boolean booMiddleVMmax = false;
        boolean booMiddleKMmax = false;

        booMaxV = vasyaAge >= katyaAge && vasyaAge >= mishaAge;
        booMaxK = katyaAge >= vasyaAge && katyaAge >= mishaAge;
        booMaxM = mishaAge >= vasyaAge && mishaAge >= katyaAge;

        if (booMaxV) {
            max = vasyaAge;
        }
        if (booMaxK) {
            max = katyaAge;
        }
        if (booMaxM) {
            max = mishaAge;
        }

        booMinV = vasyaAge <= katyaAge && vasyaAge <= mishaAge;
        booMinK = katyaAge <= vasyaAge && katyaAge <= mishaAge;
        booMinM = mishaAge <= vasyaAge && mishaAge <= katyaAge;

        if (booMinV) {
            min = vasyaAge;
        }
        if (booMinK) {
            min = katyaAge;
        }
        if (booMinM) {
            min = mishaAge;
        }

        booMiddleV = !booMaxV && !booMinV;
        booMiddleK = !booMaxK && !booMinK;
        booMiddleM = !booMaxM && !booMinM;

        if (booMiddleV) {
            middle = vasyaAge;
        }
        if (booMiddleK) {
            middle = katyaAge;
        }
        if (booMiddleM) {
            middle = mishaAge;
        }
        booMiddleVKmin = booMinV && booMinK;
        booMiddleVMmin = booMinV && booMinM;
        booMiddleKMmin = booMinK && booMinM;

        if (booMiddleVKmin) {
            middle = vasyaAge;
        }
        if (booMiddleVMmin) {
            middle = vasyaAge;
        }
        if (booMiddleKMmin) {
            middle = mishaAge;
        }
        booMiddleVKmax = booMaxV && booMaxK;
        booMiddleVMmax = booMaxV && booMaxM;
        booMiddleKMmax = booMaxK && booMaxM;

        if (booMiddleVKmax) {
            middle = vasyaAge;
        }
        if (booMiddleVMmax) {
            middle = vasyaAge;
        }
        if (booMiddleKMmax) {
            middle = mishaAge;
        }

        if (vasyaAge == katyaAge && vasyaAge == mishaAge) {
            min=vasyaAge;
            middle=vasyaAge;
            max=vasyaAge;
        }

        System.out.println("Minimal age : " + min);
        System.out.println("Middle age : " + middle);
        System.out.println("Maximum age : " + max);

    }
}
