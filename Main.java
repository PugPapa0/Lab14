// YOUR NAME: Travis Becker
// COLLABORATORS:
// LAST MODIFIED DATE:

class Main {
  public static void main(String[] args) {
    double[] co2Levels = {
            371.32, 373.45, 375.98, 377.70, 379.98,
            382.09, 384.03, 385.83, 387.64, 390.10,
            391.85, 394.06, 396.74, 398.87, 401.01,
            404.41, 406.76, 408.72, 411.66, 414.24
    };

    int[] years = new int[20];

    for (int i = 0; i < years.length; i++) {
      years[i] = 2001 + i;
    }

    System.out.println("Data displayed for each year begins at 360 ppm.");
    System.out.println("Each additional oil drum (🛢) represents an additional 1 ppm.");
    System.out.println();
    System.out.println("Year                CO₂ in Atmosphere (ppm)");

    printGraph(co2Levels, years);
  }

  public static void printBar(double value) {
    int drums = (int)(value - 360);

    for (int i = 0; i < drums; i++) {
      System.out.print("🛢");
    }

    System.out.printf(" %.2f", value);
  }

  public static void printGraph(double[] co2Levels, int[] years) {
    for (int i = 0; i < co2Levels.length; i++) {
      System.out.print(years[i] + " ");
      printBar(co2Levels[i]);
      System.out.println();
    }
    double growth = co2Levels[co2Levels.length - 1] - co2Levels[0];

    System.out.printf(
            "From 2001 to 202, the average atmospheric CO₂ levels across the globe has grown %.2f ppm.%n",
            growth
    );
  }
}