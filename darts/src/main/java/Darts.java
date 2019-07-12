class Darts {
    double radius;

    Darts(double x, double y) {
        radius = Math.sqrt(x * x + y * y);
    }

    int score() {
        if (radius <= 1.0) {
            return 10;
        } else if (radius <= 5.0) {
            return 5;
        } else if (radius <= 10.0) {
            return 1;
        } else {
            return 0;
        }
    }

}


