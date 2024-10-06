
package animal;

abstract class Animal {
    protected String sonido;
    protected String alimentacion;
    protected String habitat;
    protected String nombreCientifico;

    public Animal(String sonido, String alimentacion, String habitat, String nombreCientifico) {
        this.sonido = sonido;
        this.alimentacion = alimentacion;
        this.habitat = habitat;
        this.nombreCientifico = nombreCientifico;
    }

    public abstract void mostrarInfo();

    public void imprimirSeparador() {
        System.out.println("-------------------------------");
    }
}

abstract class Canidos extends Animal {

    public Canidos(String sonido, String alimentacion, String habitat, String nombreCientifico) {
        super(sonido, alimentacion, habitat, nombreCientifico);
    }

    @Override
    public abstract void mostrarInfo();
}

class Lobo extends Canidos {

    public Lobo() {
        super("Aullido", "Carnívoro", "Bosques y montañas", "Canis lupus");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Especie: " + nombreCientifico);
        System.out.println("Sonido: " + sonido);
        System.out.println("Alimentación: " + alimentacion);
        System.out.println("Hábitat: " + habitat);
        imprimirSeparador();
    }
}

class Perro extends Canidos {

    public Perro() {
        super("Ladrido", "Omnívoro", "Doméstico", "Canis lupus familiaris");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Especie: " + nombreCientifico);
        System.out.println("Sonido: " + sonido);
        System.out.println("Alimentación: " + alimentacion);
        System.out.println("Hábitat: " + habitat);
        imprimirSeparador();
    }
}

abstract class Felinos extends Animal {

    public Felinos(String sonido, String alimentacion, String habitat, String nombreCientifico) {
        super(sonido, alimentacion, habitat, nombreCientifico);
    }

    @Override
    public abstract void mostrarInfo();
}

class Gato extends Felinos {

    public Gato() {
        super("Maullido", "Carnívoro", "Doméstico", "Felis catus");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Especie: " + nombreCientifico);
        System.out.println("Sonido: " + sonido);
        System.out.println("Alimentación: " + alimentacion);
        System.out.println("Hábitat: " + habitat);
        imprimirSeparador();
    }
}

class Leon extends Felinos {

    public Leon() {
        super("Rugido", "Carnívoro", "Sabanas", "Panthera leo");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Especie: " + nombreCientifico);
        System.out.println("Sonido: " + sonido);
        System.out.println("Alimentación: " + alimentacion);
        System.out.println("Hábitat: " + habitat);
        imprimirSeparador();
    }
}

class Main {
    public static void main(String[] args) {
        Lobo lobo = new Lobo();
        lobo.mostrarInfo();

        Perro perro = new Perro();
        perro.mostrarInfo();

        Gato gato = new Gato();
        gato.mostrarInfo();

        Leon leon = new Leon();
        leon.mostrarInfo();
    }
}
