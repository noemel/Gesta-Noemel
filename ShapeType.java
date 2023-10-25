enum ShapeType {
    CIRCLE(3.0), // Radius
    SQUARE(4.0), // Side length
    TRIANGLE(5.0, 12.0, 13.0); // Sides a, b, and c

    private double[] parameters;

    ShapeType(double... parameters) {
        this.parameters = parameters;
    }

    public double calculateArea() {
        switch (this) {
            case CIRCLE:
                return Math.PI * Math.pow(parameters[0], 2);
            case SQUARE:
                return Math.pow(parameters[0], 2);
            case TRIANGLE:
                double s = (parameters[0] + parameters[1] + parameters[2]) / 2;
                return Math.sqrt(s * (s - parameters[0]) * (s - parameters[1]) * (s - parameters[2]));
            default:
                return 0.0;
        }
    }

    public double calculatePerimeter() {
        switch (this) {
            case CIRCLE:
                return 2 * Math.PI * parameters[0];
            case SQUARE:
                return 4 * parameters[0];
            case TRIANGLE:
                return parameters[0] + parameters[1] + parameters[2];
            default:
                return 0.0;
        }
    }
}


