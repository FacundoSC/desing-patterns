package estructural.composite.v1;

import java.util.List;

public class CuentaComposite implements CuentaComponent {
  private List<CuentaComponent> cuentas;

  public CuentaComposite(List<CuentaComponent> cuentas) {
    this.cuentas = cuentas;
  }

  public void addCuenta(CuentaComponent cuenta) {
    cuentas.add(cuenta);
  }

  @Override
  public void showAccountName() {
    cuentas.forEach(CuentaComponent::showAccountName);
  }

  @Override
  public Double getAmount() {
    return cuentas.stream()
        .map(CuentaComponent::getAmount).reduce(Double::sum).orElse(0.0);
  }
}
