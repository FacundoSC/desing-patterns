package estructural.adapter.v2;

public class SquarePegAdapter extends RoundPeg{
  private SquarePeg squarePeg;

  public SquarePegAdapter(SquarePeg squarePeg) {
    super((squarePeg.getWidth() * Math.sqrt(2) / 2));
    this.squarePeg = squarePeg;
  }

  @Override
  public double getRadius() {
    return (squarePeg.getWidth() * Math.sqrt(2) / 2);
  }


}
