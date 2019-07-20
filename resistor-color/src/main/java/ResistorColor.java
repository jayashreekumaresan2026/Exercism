import java.util.HashMap;
class ResistorColor {
    String[] resistorColours = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};


    int colorCode(String color) {
        int index = -1;
        for (int i = 0; i < resistorColours.length; i++) {
            if (resistorColours[i].equals(color)) {
                index = i;
                break;
            }
        }
        return index;
    }

    String[] colors() {
        return resistorColours;
    }
}


