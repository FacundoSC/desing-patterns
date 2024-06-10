package structural.composite;

import java.util.List;

public class CuentaComposite implements CuentaComponent {
  private List<CuentaComponent> cuentas;

  public CuentaComposite(List<CuentaComponent> cuentas) {
    this.cuentas = cuentas;
  }

  @Override
  public void showAccountName() {

  }

  @Override
  public Double getAmount() {
    return null;
  }
}
