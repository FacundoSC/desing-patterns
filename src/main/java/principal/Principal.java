package principal;


import construccion.abstract_factory.AbstractFactory;
import construccion.abstract_factory.ConcretFactory;
import construccion.abstract_factory.FAnimal.IAnimal;
import construccion.abstract_factory.FColor.IColor;
import construccion.abstract_factory.enumeration.Animal;
import construccion.abstract_factory.enumeration.Color;
import construccion.abstract_factory.enumeration.Factory;
import construccion.builder.v1.Motor;
import construccion.factorymethod.Button;
import construccion.factorymethod.ButtonFactory;
import construccion.factorymethod.TypeButton;
import construccion.prototype.Circle;
import construccion.prototype.PrototypeFactory;
import construccion.prototype.PrototypeShapes;
import estructural.adapter.v2.RoundHole;
import estructural.adapter.v2.RoundPeg;
import estructural.adapter.v2.SquarePeg;
import estructural.adapter.v2.SquarePegAdapter;
import estructural.bridge.v2.AdvancedRemote;
import estructural.bridge.v2.BasicRemote;
import estructural.bridge.v2.Device;
import estructural.bridge.v2.Radio;
import estructural.bridge.v2.TV;
import estructural.composite.v1.CuentaAhorro;
import estructural.composite.v1.CuentaComponent;
import estructural.composite.v1.CuentaComposite;
import estructural.composite.v1.CuentaCorriente;
import estructural.decorator.CompressionDecorator;
import estructural.decorator.DataSource;
import estructural.decorator.DataSourceDecorator;
import estructural.decorator.EncryptionDecorator;
import estructural.decorator.FileDataSource;
import estructural.facade.VideoConversionFacade;
import estructural.proxy.ThirdPartyYouTubeClass;
import estructural.proxy.YouTubeCacheProxy;
import estructural.proxy.YouTubeDownloader;
import java.io.File;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
      //TODO: CREACIONALES
      //proveSingleton();
      //provePrototype();
      //proveBuilder();
      //proveFactoryMethod();
      //proveAbstractFactory();
      //proveFactoryMethod();

      //TODO: ESTRUCTURALES
      //proveAdapter();
      //proveBridge();
      //proveFacade();
      proveProxy();
      // proveComposite();
      // proveDecorator();




      //TODO: COMPORTAMIENTO
      //proveChainOfResponsability();
      //proveCommand();
      //proveIterator();
      //proveMediator();
      //proveMemento();
      // proveObserver();
      //proveState();
      // proveInterpreter();
      //proveStrategy();
      //proveTemplateMethod();
      //proveVisitor();


    }

  //TODO: CREACIONALES
  private static void proveFactoryMethod() {
    Button button = ButtonFactory.createButton(TypeButton.HTML);
    button.onClick();
  }
  private static void proveAbstractFactory(){
      AbstractFactory abstractFactory = ConcretFactory.getFactory(Factory.ANIMAL);
      IAnimal p = (IAnimal) abstractFactory.crear(Animal.PATO);
      System.out.println(p.getTipo());
      abstractFactory = ConcretFactory.getFactory(Factory.COLOR);
      IColor crear = (IColor) abstractFactory.crear(Color.AZUL);
      System.out.println(crear.getColor());
  }
  private static void proveSingleton() {
    System.out.println("Inicio de la prueba del patron Singleton");
    construccion.singleton.Card card = construccion.singleton.Card.getInstance();
    construccion.singleton.Card card2 = construccion.singleton.Card.getInstance();
    System.out.println("Card = " + card);
    System.out.println("card2 = " + card2);
    System.out.println(card.equals(card2));
    System.out.println("Fin de la prueba del patron Singleton");
  }
  private static void provePrototype()  {
    System.out.println("Inicio de la prueba del patron Prototype");
    PrototypeFactory.loadCache();

    try {
      PrototypeShapes circle = PrototypeFactory.getShape(PrototypeFactory.ShapesType.CIRCLE);
      Circle circle2 = (Circle) PrototypeFactory.getShape(PrototypeFactory.ShapesType.CIRCLE);
      System.out.println(circle);
      System.out.println(circle2);
      circle2.setRadius("20");
      System.out.println(circle2);
    }
    catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
  }
  private static void proveBuilder(){
    System.out.println("Inicio de la prueba del patron Builder como lo tienen builder loombok");
    Motor motor = Motor.builder().estado(true).kilometraje(100).volumen(2.0).build();
    System.out.println(motor);
  }


  //TODO: ESTRUCTURALES
  private static void proveAdapter() {
    RoundHole roundHole = new RoundHole(5);
    RoundPeg roundPeg = new RoundPeg(7);
    SquarePeg squareSmallPeg = new SquarePeg(5);
    SquarePeg squareLargePeg = new SquarePeg(10);

    SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squareSmallPeg);

    if (roundHole.fits(roundPeg)) {
      System.out.println("El agujero es lo suficientemente grande para el objeto redondo");
    } else {
      System.out.println("El agujero no es lo suficientemente grande para el objeto redondo");
    }
    if (roundHole.fits(squarePegAdapter)) {
      System.out.println("El agujero es lo suficientemente grande para el objeto cuadrado");
    } else {
      System.out.println("El agujero no es lo suficientemente grande para el objeto cuadrado");
    }
    squarePegAdapter = new SquarePegAdapter(squareLargePeg);

    if (roundHole.fits(squarePegAdapter)) {
      System.out.println("El agujero es lo suficientemente grande para el objeto cuadrado");
    } else {
      System.out.println("El agujero no es lo suficientemente grande para el objeto cuadrado");
    }


  }

  private static void proveBridge() {
    Device device = new Radio();
    System.out.println("Tests with basic remote.");
    BasicRemote basicRemote = new BasicRemote(device);
    basicRemote.power();
    device.printStatus();

    device = new TV();
    System.out.println("Tests with advanced remote.");
    AdvancedRemote advancedRemote = new AdvancedRemote(device);
    advancedRemote.power();
    advancedRemote.mute();
    device.printStatus();
  }

  private static void proveFacade() {
    VideoConversionFacade converter = new VideoConversionFacade();
    File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
  }

  private static void proveProxy() {
    YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
    YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());
    long naive = test(naiveDownloader);
    long smart = test(smartDownloader);
    System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");
  }

  private static long test(YouTubeDownloader downloader) {
    long startTime = System.currentTimeMillis();

    // User behavior in our app:
    downloader.renderPopularVideos();
    downloader.renderVideoPage("catzzzzzzzzz");
    downloader.renderPopularVideos();
    downloader.renderVideoPage("dancesvideoo");
    // Users might visit the same page quite often.
    downloader.renderVideoPage("catzzzzzzzzz");
    downloader.renderVideoPage("someothervid");

    long estimatedTime = System.currentTimeMillis() - startTime;
    System.out.print("Time elapsed: " + estimatedTime + "ms\n");
    return estimatedTime;
  }

  private static void proveComposite() {
    //TODO VENTAJAS permite tratar objetos compuestos y simples de la misma manera
    //TODO VENTAJAS permite agregar y quitar objetos en tiempo de ejecucion
    //TODO VENTAJAS permite que los clientes ignoren la diferencia entre objetos primitivos y compuestos
    //TODO DESVENTAJAS puede hacer que el diseño sea mas complejo

    CuentaComponent cuentaAhorro = new CuentaAhorro(100.0, "CA");
    CuentaComponent cuentaAhorro2 = new CuentaCorriente(200.0, "CC");
    CuentaComposite cuentaComposite = new CuentaComposite(List.of());
    CuentaComposite composite = new CuentaComposite(List.of(cuentaAhorro, cuentaAhorro2, cuentaComposite));
    composite.showAccountName();
    System.out.println(composite.getAmount());

  }

  private static void proveDecorator() {
    String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

    DataSourceDecorator encoded = new CompressionDecorator(
        new EncryptionDecorator(
            new FileDataSource("out/OutputDemo.txt")));
    encoded.writeData(salaryRecords);
    DataSource plain = new FileDataSource("out/OutputDemo.txt");
    System.out.println("- Input ----------------");
    System.out.println(salaryRecords);
    System.out.println("- Encoded --------------");
    System.out.println(plain.readData());
    System.out.println("- Decoded --------------");
    System.out.println(encoded.readData());

  }

  private static void proveFlyweight() {
    //TODO VENTAJAS permite ahorrar memoria al compartir objetos que son similares
    //TODO VENTAJAS permite que los objetos compartan informacion que no cambia
    //TODO VENTAJAS permite que los objetos compartan informacion que no cambia
    //TODO VENTAJAS permite que los objetos compartan informacion que no cambia
    //TODO DESVENTAJAS puede hacer que el codigo sea mas complejo
    //TODO DESVENTAJAS puede hacer que el codigo sea mas dificil de entender
    //TODO DESVENTAJAS puede hacer que el codigo sea mas dificil de mantener
    //TODO DESVENTAJAS puede hacer que el codigo sea mas dificil de probar
  }





/*
  private static void proveChainOfResponsability() {
    System.out.println("Inicio de la prueba del patron Chain of Responsability");
    Card tarjeta = new Card();
    tarjeta.creditCardRequest(50001);
  }

  private static void proveCommand() {
    System.out.println("Inicio de la prueba del patron Command");
    CreditCard creditCard = new CreditCard();
    creditCard.setFirstName("Juan");
    CreditCardInvoker creditCardInvoker = new CreditCardInvoker();
    creditCardInvoker.setCommand(new CreditCardActivateCommand(creditCard));
    creditCardInvoker.run();
    creditCardInvoker.setCommand(new CreditCardDesactivateCommand(creditCard));
    creditCardInvoker.run();

    //TODO
    System.out.println("Fin de la prueba del patron Command");
  }

  private static void proveIterator() {
    //TODO VENTAJAS podemos acceder a los elementos de la lista sin conocer la estructura interna de los objetos
    //TODO VENTAJAS podemos recorrer la lista en cualquier dirección si creamos mas de un iterator
    //TODO VENTAJAS las clases iteratores no simplifican el codigo que tiene que haber en las colecciones
    //TODO VENTAJAS podemos tener varios iteradores sobre la misma lista
    //TODO VENTAJAS los recorridos estan en los iteratores y no en las colecciones

    //TODO DESVENTAJAS no podemos recorrer la lista en dos direcciones al mismo tiempo
    //TODO DESVENTAJAS java ya nos ofrece colleciones e iteradores

    comportamiento.iterator.Card[] cards = new comportamiento.iterator.Card[5];
    cards[0] = new comportamiento.iterator.Card("VISA");
    cards[1] = new comportamiento.iterator.Card("MasterCard");
    cards[2] = new comportamiento.iterator.Card("American Express");
    cards[3] = new comportamiento.iterator.Card("Diners");
    cards[4] = new comportamiento.iterator.Card("Discover");
    List list = new CardList(cards);
    Iterator iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

  }

  private static void proveMediator() {
    //TODO VENTAJAS desacopla los objetos  usuarios,  usando el mediador se encarga de la comunicacion entre ellos
    //TODO DESVENTAJAS el mediador puede volverse muy complejo si hay muchos objetos usuarios y muchos mensajes que manejar
    ConcreteMediator mediator = new ConcreteMediator();
    ConcreteColleageOne user1 = new ConcreteColleageOne(mediator);
    ConcreteColleageTwo user2 = new ConcreteColleageTwo(mediator);

    mediator.setUser1(user1);
    mediator.setUser2(user2);

    user1.send("Hi, I am user1");
    user2.send("Hi, I am user2");
  }


  private static void proveMemento() {
    //TODO VENTAJAS permite guardar el estado de un objeto en un momento dado, para poder restaurarlo posteriormente si es necesario
    //TODO VENTAJAS permite implementar la funcionalidad de deshacer y rehacer
    //TODO VENTAJAS permite implementar checkpoints en una aplicacion
    //TODO VENTAJAS permite implementar la funcionalidad de guardar y cargar
    //TODO DESVENTAJAS puede aumentar el consumo de memoria si se guardan muchos estados
    //TODO DESVENTAJAS puede aumentar la complejidad del codigo si se guardan muchos estados
    Carataker carataker = new Carataker();
    Article article = new Article("Facundo", "Memento es una pelicula ");
    article.setText(article.getText() + " protagonizada por Tom Holland y Zendaya");
    System.out.println(article.getText());
    carataker.addMemento(article.createMemento());

    article.setText(article.getText() + " y Leonardo DiCaprio y Jennifer Lawrence.");
    System.out.println(article.getText());
    carataker.addMemento(article.createMemento());


    ArticleMemento mementoOne = carataker.getMemento(0);
    ArticleMemento mementoTwo = carataker.getMemento(1);
    System.out.println(mementoOne.getText());
    System.out.println(mementoTwo.getText());
  }

  private static void proveObserver() {
    Coche coche = new Coche();
    Peaton peaton = new Peaton();
    MessagePublisher messagePublisher = new MessagePublisher();
    messagePublisher.attach(coche);
    messagePublisher.attach(peaton);
    messagePublisher.notifyUpdate(new Semaforo("Rojo"));
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    messagePublisher.notifyUpdate(new Semaforo("Verde"));


  }

  private static void proveState() {
    MobileAlertStateContext context = new MobileAlertStateContext();
    context.alert();
    context.alert();
    context.setState(new Vibration());
    context.alert();
    context.alert();
    context.setState(new Silent());
    context.alert();
    context.alert();
  }

  private static void proveInterpreter() {
    Expression cero = new TerminalExpression("0");
    Expression uno = new TerminalExpression("1");
    Expression orBoolean = new OrExpression(cero, uno);
    System.out.println(orBoolean.interpret("0"));
    System.out.println(orBoolean.interpret("1"));
    Expression andBoolean = new AndExpression(cero, uno);
    System.out.println(andBoolean.interpret("0"));
    System.out.println(andBoolean.interpret("1"));
    System.out.println(andBoolean.interpret("0 1"));
  }

  private static void proveStrategy() {
    //TODO VENTAJAS permite cambiar el comportamiento de un objeto en tiempo de ejecucion
    Context context = new Context(new StrategyTextFormatLower());
    System.out.println(context.format("Facundo"));
    context = new Context(new StrategyTextFormatUpper());
    System.out.println(context.format("Facundo"));
  }

  private static void proveTemplateMethod() {
    //TODO VENTAJAS permite definir el esqueleto de un algoritmo en una clase base, dejando que las subclases implementen los detalles
    //TODO VENTAJAS permite reutilizar codigo comun en varias subclases
    //TODO VENTAJAS permite que las subclases puedan extender o sobrescribir partes del algoritmo sin cambiar su estructura basica
    //TODO VENTAJAS permite aplicar el principio de inversion de dependencias, ya que las subclases dependen de la clase base y no al reves
    //TODO DESVENTAJAS puede ser dificil de entender si se abusa de la herencia y se crean muchas subclases
    //TODO DESVENTAJAS puede ser dificil de mantener si se cambia la estructura del algoritmo en la clase base
    //TODO DESVENTAJAS puede ser dificil de probar si se tienen muchas subclases con diferentes implementaciones
    Payment payment = new Visa();
    payment.makePayment();
  }
  private static void proveVisitor() {
    OfertaElement element = new OfertaGasolina();
    element.accept(new ClassicCreditCardVisitor());
    element = new OfertaVuelos();
    element.accept(new ClassicCreditCardVisitor());
  }


 */


}
